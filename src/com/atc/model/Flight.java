package com.atc.model;

import com.atc.service.Command;
import com.atc.service.IATCService;

public class Flight implements Command {

	public IATCService atcService;

	public String flightNo;

	public String source;

	public String destination;

	@Override
	public void land() {

	}

}
