package com.arangodb;

import java.util.Map;

import com.arangodb.entity.CursorEntity;
import com.arangodb.entity.DefaultEntity;
import com.arangodb.impl.BaseDriverInterface;

/**
 * Created by fbartels on 10/27/14.
 * 
 * @Deprecated As of release 2.5.4, replaced by
 *             {@link InternalCursorDocumentDriver}
 *
 */
public interface InternalCursorDriver extends BaseDriverInterface {

	@Deprecated
	CursorEntity<?> validateQuery(String database, String query) throws ArangoException;

	@Deprecated
	<T> CursorEntity<T> executeQuery(
		String database,
		String query,
		Map<String, Object> bindVars,
		Class<T> clazz,
		Boolean calcCount,
		Integer batchSize,
		Boolean fullCount) throws ArangoException;

	@Deprecated
	<T> CursorEntity<T> executeQuery(
		String database,
		String query,
		Map<String, Object> bindVars,
		Class<T> clazz,
		Boolean calcCount,
		Integer batchSize) throws ArangoException;

	@Deprecated
	<T> CursorEntity<T> continueQuery(String database, long cursorId, Class<?>... clazz) throws ArangoException;

	@Deprecated
	DefaultEntity finishQuery(String database, long cursorId) throws ArangoException;

	@Deprecated
	<T> CursorResultSet<T> executeQueryWithResultSet(
		String database,
		String query,
		Map<String, Object> bindVars,
		Class<T> clazz,
		Boolean calcCount,
		Integer batchSize,
		Boolean fullCount) throws ArangoException;

	@Deprecated
	<T> CursorResultSet<T> executeQueryWithResultSet(
		String database,
		String query,
		Map<String, Object> bindVars,
		Class<T> clazz,
		Boolean calcCount,
		Integer batchSize) throws ArangoException;
}
