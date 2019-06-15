package com.type;
import java.util.ArrayList;
import java.util.List;

public class Should implements Types{
	
	Bool bool;
	List<Match> matches;
	
	Should()
	{
		this.matches = new ArrayList();
	}

	
	public Should shouldMatch(String name, String value) {
		Match match = new Match(name, value);
		matches.add(match);
		return this;
	}
	
	public Bool bool() {
		this.bool = new Bool();
		return this.bool;
	}

	public Bool getBool() {
		return bool;
	}

	public List<Match> getMatches() {
		return matches;
	}

}
