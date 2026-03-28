package com.stars.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stars.sbeans.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	@Autowired
	private DataSource ds;
	
	
	private static final String GET_EMP_QUERY="SELECT * FROM EMPLOYEE WHERE employee_role=?";

	@Override
	public List<Employee> showEmployeeListByRole(String role) throws SQLException {
		List<Employee> list=new ArrayList<>();
		
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_EMP_QUERY);
				
				){
			
			ps.setString(1, role);
			
			try(ResultSet rs=ps.executeQuery()){
				
				while(rs.next()) {
					Employee emp=new Employee();
					
					// set the employee values 
					emp.setEmployeeFirstName(rs.getString(1));
					emp.setEmployeeMiddleName(rs.getString(2));
					emp.setEmployeeLastName(rs.getString(3));
					emp.setEmployeeSalary(rs.getDouble(4));
					emp.setEmployeeRole(rs.getString(5));
					emp.setEmployeeSpecialRole(rs.getString(6));
					
					// add Employee class object to List Collection
					list.add(emp);
					
				    emp=null;
				}
				
			}
			
		}catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}

}
