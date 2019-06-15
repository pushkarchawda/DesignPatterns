package com.type;

public class Bool implements Types{

	private Must must;
	private Should should;
	private Types present;

	Bool() {
	}

	public Bool mustMatch(String name, String value) {
		if (this.must == null) {
			this.must = new Must();
			this.present = this.must;
		}
		must.mustMatch(name, value);
		
		return this;
	}

	public Bool shouldMatch(String name, String value) {
		if (this.should == null) {
			this.should = new Should();
			this.present = this.should;
		}
		should.shouldMatch(name, value);
		return this;
	}

	public Must getMust() {
		return must;
	}

	public Should getShould() {
		return should;
	}

	@Override
	public Bool bool() {
		return this.present.bool();
	}

}
