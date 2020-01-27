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

// interface for five function that is to be implement
@WebService
@SOAPBinding(style=Style.RPC)
public interface EmployeeService {
	
	// get user from map
	@WebMethod 
	Employee getUsers(String id);
	
	// add user to map
	@WebMethod
	void addUsers(Employee emp);
	

	// List is not supported and it is giving some nullPointer exception 
	//List<Employee> getAllUser();
	// that's why i am using String to get all users
	@WebMethod 
	String getAllUser();
	
	// return true if edit is successfull otherwise exception will be handled and false is returned
	@WebMethod
	Boolean editUsers(String id , Employee empObj); 
	
	// to delete user from map
	@WebMethod
	void deleteUsers(String id);

}




