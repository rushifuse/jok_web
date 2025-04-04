package com.demo.model;

public class JokApi
{
	private String setup;
	private String punchline;
	@Override
	public String toString() {
		return "JokApi [setup=" + setup + ", punchline=" + punchline + "]";
	}
	public String getSetup() {
		return setup;
	}
	public void setSetup(String setup) {
		this.setup = setup;
	}
	public String getPunchline() {
		return punchline;
	}
	public void setPunchline(String punchline) {
		this.punchline = punchline;
	}
}
