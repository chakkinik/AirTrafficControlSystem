package com.atc.model;

public class Runway {

	public int runwayNo;
	public Flight flight;
	public boolean isLandSafe;
	
	public Runway(int runwayNo) {
		this.runwayNo=runwayNo;
		this.isLandSafe=true;
		this.flight=null;
	}

}
