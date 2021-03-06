package com.drucare.employee.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.employee.DeleteEmployeeBean;
import com.drucare.employee.EmployeeBean;
import com.drucare.employee.FetchEmployeeBean;
import com.drucare.employee.InsertEmployeeBean;
import com.drucare.employee.UpdateEmployeeBean;
import com.drucare.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/get")
	public FetchEmployeeBean getEmployeebyId(@RequestBody FetchEmployeeBean fetchEmployeeReq)
	{
		return employeeService.fetchEmployeeById(fetchEmployeeReq);
	}
	
	@GetMapping("/getAll")
	public List<FetchEmployeeBean> getEmployeeDetails(@RequestBody FetchEmployeeBean fetchEmployeeReq)
	{
		return employeeService.fetchALLEmployee(fetchEmployeeReq);
	}
	
	@PostMapping("/post")
	public Boolean postEmployee(@RequestBody InsertEmployeeBean insertEmployeeReq)
	{
		return employeeService.insertEmployee(insertEmployeeReq);
	}
	
	@PutMapping("/put")
	public Boolean updateEmployeebyId(@RequestBody UpdateEmployeeBean updateEmployeeReq)
	{
		return employeeService.updateEmployee(updateEmployeeReq);
	}
	
	@DeleteMapping("/delete")
	public Boolean deleteEmployeebyId(@RequestBody DeleteEmployeeBean deleteEmployeeReq)
	{
		return employeeService.deleteEmployeeById(deleteEmployeeReq);
	}
	
	@PostMapping("/batchInsert")
	public Boolean batchInsertEmployeeDetails(@RequestBody List<InsertEmployeeBean> employeeBatchInsertReq)
	{
		return employeeService.batchInsertEmployeeDetails(employeeBatchInsertReq);
	}
	
	@PutMapping("/batchUpdate")
	public Boolean batchUpdateEmployeeDetails(@RequestBody List<UpdateEmployeeBean> employeeBatchUpdateReq)
	{
		return employeeService.batchUpdateEmployeeDetails(employeeBatchUpdateReq);
	}

}
