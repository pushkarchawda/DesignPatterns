package com.builder;
import com.type.Bool;
import com.type.Query;

public class QueryBuilder {

	private static Query query;

	public QueryBuilder() {
		
	}

	public Query getQuery() {
		
		if(QueryBuilder.query == null)
		{
			QueryBuilder.query = new Query();
		}
		return QueryBuilder.query;
	}

	
	public Bool bool()
	{
		return this.getQuery().getBool();
	}

}
