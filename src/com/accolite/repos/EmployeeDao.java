package com.accolite.repos;
import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class EmployeeDao {
	
	
	HashMap<String,Employee> employee_data = new HashMap<String,Employee>();
	public EmployeeDao(){
		Employee emp = new Employee("jatin", "Ceo", 10000000 , "E01");
		Employee emp1 = new Employee("j", "HR", 1000 , "E02");
		Employee emp2 = new Employee("ja", "Manager", 10000 , "E03");
		Employee emp3 = new Employee("jat", "Vp", 100000 , "E04");
		
		employee_data.put("E01", emp);
		employee_data.put("E02", emp1);
		employee_data.put("E03", emp2);
		employee_data.put("E04", emp3);
	}	
	
	
	public List<Employee> getAllUser(){
		List<Employee> emp_list = new ArrayList<Employee>();
		
        
        for (Employee empo : employee_data.values())  
            emp_list.add((Employee)empo);
		
		return emp_list;
	}
	
	
	public Employee getUsers(String id) {
		return employee_data.get(id);
	}
	
	
	public void addUsers(Employee emp) {
		employee_data.put(emp.getId(), emp);
	}
	
	
	
	public Boolean editUsers(String id , Employee empObj) {
		try {
		Employee emp_obj = (Employee)employee_data.get(id);
		emp_obj.setName(empObj.getName());
		emp_obj.setPosition(empObj.getPosition());
		emp_obj.setSalary(empObj.getSalary());
		return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public void deleteUsers(String id) {
		employee_data.remove(id);
	}
}
