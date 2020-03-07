package com.ebin.enterprise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Employee {
    private static final Logger logger=LoggerFactory.getLogger(Employee.class);
	@AuditLogging
	public String printEmployee(String firstName,String lastName) {
		logger.info("hi");
		logger.info(firstName);
		return firstName+lastName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empObj=new Employee();
		System.out.println(empObj.printEmployee("Kevin", "Matthew"));

	}

}
