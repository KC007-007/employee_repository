package com.drucare.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drucare.employee.DeleteEmployeeBean;
import com.drucare.employee.EmployeeBean;
import com.drucare.employee.FetchEmployeeBean;
import com.drucare.employee.InsertEmployeeBean;
import com.drucare.employee.UpdateEmployeeBean;
import com.drucare.employee.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Boolean insertEmployee(InsertEmployeeBean insertEmployeeReq) {
		// TODO Auto-generated method stub

		return employeeDao.insertEmployeeDetail(insertEmployeeReq);
	}

	@Override
	public Boolean deleteEmployeeById(DeleteEmployeeBean deleteEmployeeReq) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployeeDetailById(deleteEmployeeReq);
	}

	@Override
	public Boolean updateEmployee(UpdateEmployeeBean updateEmployeeReq) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployeeDetail(updateEmployeeReq);
	}

	@Override
	public FetchEmployeeBean fetchEmployeeById(FetchEmployeeBean fetchEmployeeReq) {
		// TODO Auto-generated method stub
		return employeeDao.fetchEmployeeDetailById(fetchEmployeeReq);
	}

	@Override
	public List<FetchEmployeeBean> fetchALLEmployee(FetchEmployeeBean fetchEmployeeReq) {
		// TODO Auto-generated method stub

		return employeeDao.fetchEmployeeDetails(fetchEmployeeReq);

	}

	@Override
	public Boolean batchInsertEmployeeDetails(List<InsertEmployeeBean> employeeBatchInsertReq) {
		// TODO Auto-generated method stub
		return employeeDao.batchInsertEmployeeDetails(employeeBatchInsertReq) ;
	}

	@Override
	public Boolean batchUpdateEmployeeDetails(List<UpdateEmployeeBean> employeeBatchUpdateReq) {
		// TODO Auto-generated method stub
		return employeeDao.batchUpdateEmployeeDetails(employeeBatchUpdateReq);
	}

}
