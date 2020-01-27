package com.accolite.repos;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


import com.accolite.repos.Employee;

@WebService
@SOAPBinding(style=Style.RPC)
public interface EmployeeService {
	
	@WebMethod 
	Employee getUsers(String id);
	
	@WebMethod
	void addUsers(Employee emp);
	
	@WebMethod
	List<Employee> getAllUser();
	
	@WebMethod
	Boolean editUsers(String id , Employee empObj); 
	
	@WebMethod
	void deleteUsers(String id);

}




