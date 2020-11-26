package com.atc.model;

import com.atc.service.Command;
import com.atc.service.IATCService;

public class Flight implements Command {

	public IATCService atcService;

	public Flight(String flightNo){
		this.flightNo=flightNo;
	}
	
	public String flightNo;

	public String source;

	public String destination;

	@Override
	public boolean land() {
		if(atcService.isLandinOk()) {
			atcService.land();
			return true;
		}
		return false;
	}

}
