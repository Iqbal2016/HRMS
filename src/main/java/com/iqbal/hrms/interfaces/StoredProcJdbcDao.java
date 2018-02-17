package com.iqbal.hrms.interfaces;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import com.iqbal.hrms.exception.StoredProcException;

public interface StoredProcJdbcDao {
	
public Map<String, Object> callStoredProc(String procName, MapSqlParameterSource mapSqlParameterSource) throws StoredProcException;
	
	public ResultSet callStoredProcForList(String procCallSql,List<String> values) throws StoredProcException;


}
