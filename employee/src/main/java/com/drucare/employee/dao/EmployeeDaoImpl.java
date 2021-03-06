package com.drucare.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;

import com.drucare.employee.DeleteEmployeeBean;
import com.drucare.employee.EmployeeBean;
import com.drucare.employee.FetchEmployeeBean;
import com.drucare.employee.InsertEmployeeBean;
import com.drucare.employee.UpdateEmployeeBean;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//	class EmployeeRowMapper implements RowMapper<EmployeeBean> {
//
//		@Override
//		public EmployeeBean mapRow(ResultSet rs, int rowNum) throws SQLException {
//			// TODO Auto-generated method stub
//			EmployeeBean employee = new EmployeeBean();
//			employee.setEmpId(rs.getInt("id"));
//			employee.setFirstNm(rs.getString("first_nm"));
//			employee.setMiddleNm(rs.getString("middle_nm"));
//			employee.setLastNm(rs.getString("last_nm"));
//			employee.setMobileNo(rs.getString("mobile_no"));
//			employee.setAddressLine1(rs.getString("address_line1"));
//			employee.setAddressLine2(rs.getString("address_line2"));
//			employee.setEmail(rs.getString("email_id"));
//			return employee;
//		}
//	}

	@Override
	public Boolean insertEmployeeDetail(InsertEmployeeBean insertEmployeeReq) {
		// TODO Auto-generated method stub

		String queryForInsertEmployeeDetails = "INSERT INTO employee_info_ref (id,first_nm,middle_nm,last_nm,mobile_no,address_line1,address_line2,email_id) VALUES (:empId,:firstNm,:middleNm,:lastNm,:mobileNo,:addressLine1,:addressLine2,:email)";

//		Map<String, Object> parameters = new HashMap<>();
//
//		parameters.put("empId", insertEmployeeReq.getEmpId());
//		parameters.put("firstNm", insertEmployeeReq.getFirstNm());
//		parameters.put("middleNm", insertEmployeeReq.getMiddleNm());
//		parameters.put("lastNm", insertEmployeeReq.getLastNm());
//		parameters.put("mobileNo", insertEmployeeReq.getMobileNo());
//		parameters.put("addressLine1", insertEmployeeReq.getAddressLine1());
//		parameters.put("addressLine2", insertEmployeeReq.getAddressLine2());
//		parameters.put("email", insertEmployeeReq.getEmail());

		int count = namedParameterJdbcTemplate.update(queryForInsertEmployeeDetails,
				new BeanPropertySqlParameterSource(insertEmployeeReq));
		return count > 0;
	}

	@Override
	public Boolean updateEmployeeDetail(UpdateEmployeeBean updateEmployeeReq) {
		// TODO Auto-generated method stub
		String queryForUpdateEmployeeDetails = "UPDATE employee_info_ref set first_nm=:firstNm,middle_nm=:middleNm,last_nm =:lastNm ,mobile_no= :mobileNo ,address_line1 = :addressLine1 ,address_line2= :addressLine2 ,email_id = :email where id=:empId ";

//		Map<String, Object> parameters = new HashMap<>();
//
//		parameters.put("empId", updateEmployeeReq.getEmpId());
//		parameters.put("firstNm", updateEmployeeReq.getFirstNm());
//		parameters.put("middleNm", updateEmployeeReq.getMiddleNm());
//		parameters.put("lastNm", updateEmployeeReq.getLastNm());
//		parameters.put("mobileNo", updateEmployeeReq.getMobileNo());
//		parameters.put("addressLine1", updateEmployeeReq.getAddressLine1());
//		parameters.put("addressLine2", updateEmployeeReq.getAddressLine2());
//		parameters.put("email", updateEmployeeReq.getEmail());

		int count = namedParameterJdbcTemplate.update(queryForUpdateEmployeeDetails,
				new BeanPropertySqlParameterSource(updateEmployeeReq));
		return count > 0;

	}

	@Override
	public FetchEmployeeBean fetchEmployeeDetailById(FetchEmployeeBean fetchEmployeeReq) {
		// TODO Auto-generated method stub

		String queryForFetchEmployeeDetails = "select id as empId, first_nm, middle_nm, last_nm, mobile_no, address_line1, address_line2, email_id as email from employee_info_ref where id=:empId";
//		Map<String, Object> parameters = new HashMap<>();
//
//		FetchEmployeeBean fetchEmployeeObj = new FetchEmployeeBean();
//		parameters.put("empId", fetchEmployeeObj.getEmpId());
//		Map<String, Object> map = namedParameterJdbcTemplate.queryForMap(queryForFetchEmployeeDetails,
//				new BeanPropertySqlParameterSource(fetchEmployeeReq));
//		fetchEmployeeObj.setEmpId((Integer) map.get("id"));
//		fetchEmployeeObj.setFirstNm((String) map.get("first_nm"));
//		fetchEmployeeObj.setMiddleNm((String) map.get("middle_nm"));
//		fetchEmployeeObj.setLastNm((String) map.get("last_nm"));
//		fetchEmployeeObj.setMobileNo((String) map.get("mobile_no"));
//		fetchEmployeeObj.setAddressLine1((String) map.get("address_Line1"));
//		fetchEmployeeObj.setAddressLine2((String) map.get("address_Line2"));
//		fetchEmployeeObj.setEmail((String) map.get("email_id"));

		// return fetchEmployeeObj;
		return namedParameterJdbcTemplate.queryForObject(queryForFetchEmployeeDetails,
				new BeanPropertySqlParameterSource(fetchEmployeeReq),
				new BeanPropertyRowMapper<FetchEmployeeBean>(FetchEmployeeBean.class));

	}

	@Override
	public List<FetchEmployeeBean> fetchEmployeeDetails(FetchEmployeeBean fetchEmployeeReq) {
		// TODO Auto-generated method stub

		String queryForFetchEmployeeDetails = "select id as empId, first_nm , middle_nm, last_nm, mobile_no, address_line1, address_line2, email_id as email from employee_info_ref ";

//		List<FetchEmployeeBean> employeeList = new ArrayList<>();
//
//		List<Map<String, Object>> map = namedParameterJdbcTemplate.queryForList(queryForFetchEmployeeDetails,
//				new BeanPropertySqlParameterSource(fetchEmployeeReq));
//
//		
//		for (Map<String, Object> row : map) {
//			FetchEmployeeBean fetchEmployeeObj = new FetchEmployeeBean();
//			fetchEmployeeObj.setEmpId((Integer) row.get("id"));
//			fetchEmployeeObj.setFirstNm((String) row.get("first_nm"));
//			fetchEmployeeObj.setMiddleNm((String) row.get("middle_nm"));
//			fetchEmployeeObj.setLastNm((String) row.get("last_nm"));
//			fetchEmployeeObj.setMobileNo((String) row.get("mobile_no"));
//			fetchEmployeeObj.setAddressLine1((String) row.get("address_Line1"));
//			fetchEmployeeObj.setAddressLine2((String) row.get("address_Line2"));
//			fetchEmployeeObj.setEmail((String) row.get("email_id"));
//			employeeList.add(fetchEmployeeObj);
//
//		}
		return namedParameterJdbcTemplate.query(queryForFetchEmployeeDetails,
				new BeanPropertySqlParameterSource(fetchEmployeeReq),
				new BeanPropertyRowMapper<FetchEmployeeBean>(FetchEmployeeBean.class));

	}

	@Override
	public Boolean deleteEmployeeDetailById(DeleteEmployeeBean deleteEmployeeReq) {
		// TODO Auto-generated method stub

		String quryForDeleteEmployeeDetails = "delete from employee_info_ref where id=:empId";
//		Map<String, Object> deleteParameters = new HashMap<>();
//		DeleteEmployeeBean deleteEmployeeObj = new DeleteEmployeeBean();
//		deleteParameters.put("empId", deleteEmployeeObj.getEmpId());

		int count = namedParameterJdbcTemplate.update(quryForDeleteEmployeeDetails,
				new BeanPropertySqlParameterSource(deleteEmployeeReq));
		return count > 0;

	}

	@Override
	public Boolean batchInsertEmployeeDetails(List<InsertEmployeeBean> employeeBatchInsertReq) {
		// TODO Auto-generated method stub

		String queryForBatchInsert = "insert into employee_info_ref (id,first_nm,middle_nm,last_nm,mobile_no,address_line1,address_line2,email_id) VALUES (:empId,:firstNm,:middleNm,:lastNm,:mobileNo,:addressLine1,:addressLine2,:email)";

		//        List<SqlParameterSource> parameters =new ArrayList<>();
//        for(InsertEmployeeBean insertEmployee : employeeBatchInsertReq)
//        {
//        	parameters.add(new BeanPropertySqlParameterSource(insertEmployee));
//        	
//        }
//        SqlParameterSource[] sqlParameterSourceArray =parameters.toArray(new SqlParameterSource[0]);
//       int[] rows =namedParameterJdbcTemplate.batchUpdate(queryForBatchInsert,sqlParameterSourceArray );
		
		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(employeeBatchInsertReq);
		int[] rows = namedParameterJdbcTemplate.batchUpdate(queryForBatchInsert, batch);

		return rows.length > 0;
	}

	@Override
	public Boolean batchUpdateEmployeeDetails(List<UpdateEmployeeBean> employeeBatchUpdateReq) {
		// TODO Auto-generated method stub

		String queryForBatchUpdate = "update employee_info_ref set first_nm=:firstNm, middle_nm=:middleNm, last_nm=:lastNm, mobile_no=:mobileNo, address_line1=:addressLine1, address_line2=:addressLine2, email_id=:email where id=:empId";

		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(employeeBatchUpdateReq);
		int[] rows = namedParameterJdbcTemplate.batchUpdate(queryForBatchUpdate, batch);

		return rows.length > 0;
	}

}
