package com.drucare.employee.service;

import java.util.List;

import com.drucare.employee.DeleteEmployeeBean;
import com.drucare.employee.EmployeeBean;
import com.drucare.employee.FetchEmployeeBean;
import com.drucare.employee.InsertEmployeeBean;
import com.drucare.employee.UpdateEmployeeBean;

public interface EmployeeService {

	public Boolean insertEmployee(InsertEmployeeBean insertEmployeeReq);

	public Boolean deleteEmployeeById(DeleteEmployeeBean deleteEmployeeReq);

	public Boolean updateEmployee(UpdateEmployeeBean updateEmployeeReq);

	public FetchEmployeeBean fetchEmployeeById(FetchEmployeeBean fetchEmployeeReq);

	public List<FetchEmployeeBean> fetchALLEmployee(FetchEmployeeBean fetchEmployeeReq);
	
    public Boolean batchInsertEmployeeDetails(List<InsertEmployeeBean> queryForBatchInsertReq);
	
	public Boolean batchUpdateEmployeeDetails(List<UpdateEmployeeBean> employeeBatchUpdateReq) ;

	
}
