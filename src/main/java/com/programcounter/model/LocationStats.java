package com.programcounter.model;

public class LocationStats {
	
	private String state;
	private String country;
	private Integer totalCases;
	private Integer diff;
	
	public Integer getDiff() {
		return diff;
	}
	public void setDiff(Integer diff) {
		this.diff = diff;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getTotalCases() {
		return totalCases;
	}
	public void setTotalCases(Integer totalCases) {
		this.totalCases = totalCases;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", totalCases=" + totalCases + "]";
	}
	
	
	
}
