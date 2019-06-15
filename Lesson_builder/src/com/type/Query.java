package com.type;

public class Query {

	private Bool bool;

	public Query() {

	}

	public Bool getBool() {

		if (this.bool == null) {
			this.bool = new Bool();
		}
		
		return this.bool;
	}

}
