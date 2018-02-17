package com.iqbal.hrms.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

//import com.endpoint.manager.common.HtmlUtil;




import com.iqbal.hrms.exception.StoredProcException;
import com.iqbal.hrms.interfaces.StoredProcJdbcDao;

public class StoredProcJdbcDaoImpl implements StoredProcJdbcDao {
	
private JdbcTemplate jdbcTemplate;
	
	@Override
	public Map<String, Object> callStoredProc(String procName,
			MapSqlParameterSource mapSqlParameterSource)
			throws StoredProcException {
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withProcedureName(procName);
		//mapSqlParameterSource = HtmlUtil.escapeValues(mapSqlParameterSource);
		Map<String, Object> simpleJdbcCallResult = simpleJdbcCall.execute(mapSqlParameterSource);
		System.out.println(simpleJdbcCallResult);
		return simpleJdbcCallResult;
		
	}
	
	
	public ResultSet callStoredProcForList(String procCallSql,List<String> values) throws StoredProcException
	{
		Connection dbConnection = null;
		CallableStatement callableStatement = null;
		ResultSet rs = null;
			try {
				dbConnection = jdbcTemplate.getDataSource().getConnection();
				callableStatement = dbConnection.prepareCall(procCallSql);
				int i =1;
				for (String value : values) {
					callableStatement.setString(i, value);
					i++;
			}

	 		rs = callableStatement.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return rs;
	}

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
