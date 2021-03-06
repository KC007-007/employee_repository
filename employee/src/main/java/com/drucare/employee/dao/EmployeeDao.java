package com.drucare.employee.dao;

import java.util.List;

import com.drucare.employee.DeleteEmployeeBean;
import com.drucare.employee.EmployeeBean;
import com.drucare.employee.FetchEmployeeBean;
import com.drucare.employee.InsertEmployeeBean;
import com.drucare.employee.UpdateEmployeeBean;

public interface EmployeeDao {

	public Boolean insertEmployeeDetail(InsertEmployeeBean insertEmployeeReq);

	public Boolean deleteEmployeeDetailById(DeleteEmployeeBean deleteEmployeeReq);

	public Boolean updateEmployeeDetail(UpdateEmployeeBean updateEmployeeReq);

	public FetchEmployeeBean fetchEmployeeDetailById(FetchEmployeeBean fetchEmployeeReq);

	public List<FetchEmployeeBean> fetchEmployeeDetails(FetchEmployeeBean fetchEmployeeReq);
	
	public Boolean batchInsertEmployeeDetails(List<InsertEmployeeBean> queryForBatchInsertReq);
	
	public Boolean batchUpdateEmployeeDetails(List<UpdateEmployeeBean> employeeBatchUpdateReq) ;
}
