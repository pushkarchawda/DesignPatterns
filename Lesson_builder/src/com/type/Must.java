package com.type;
import java.util.ArrayList;
import java.util.List;

public class Must implements Types{
	
	Bool bool;
	List<Match> matches;
	
	Must()
	{
		this.matches = new ArrayList();
	}

	public Types mustMatch(String name, String value) {
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
