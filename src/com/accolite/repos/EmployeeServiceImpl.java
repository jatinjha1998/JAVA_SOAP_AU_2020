package com.accolite.repos;
import java.util.ArrayList; 
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.accolite.repos.Employee;
import com.accolite.repos.EmployeeDao;


@WebService(endpointInterface = "com.accolite.repos.EmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDao ed;
	public EmployeeServiceImpl() {
		ed = new EmployeeDao();
	}

	@Override
	@WebMethod 
	public Employee getUsers(String id) {
		return ed.getUsers(id);
	}
	
	@Override
	@WebMethod
	public void addUsers(Employee emp) {
		ed.addUsers(emp);
	}
	
	@Override
	@WebMethod
	
	//public List<Employee> getAllUser(){
	public String getAllUser(){
		return ed.getAllUser();
	}
	
	@Override
	@WebMethod
	public Boolean editUsers(String id , Employee empObj) {
		return ed.editUsers(id, empObj);
	}
	
	@Override
	@WebMethod
	public void deleteUsers(String id) {
		ed.deleteUsers(id);
	}
}
