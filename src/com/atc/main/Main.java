package com.atc.main;

import com.atc.model.Flight;
import com.atc.model.Runway;
import com.atc.service.IATCService;
import com.atc.serviceImpl.IATCServiceImpl;

public class Main {

	public static void main(String args[]) {
		
		IATCService atcService = new IATCServiceImpl();
		
		
		Flight flight1 = new Flight("F001");
		flight1.atcService=atcService;
		Flight flight2  = new Flight("F002");
		flight2.atcService=atcService;
		Runway runway1 = new Runway(1);
		
		atcService.registerFlight(flight1);
		atcService.registerFlight(flight2);
		atcService.registerRunway(runway1);
		
		
		boolean flightStatus = flight1.land();
		
		System.out.println("status::>>>"+flightStatus);
		
		System.out.println("status 2 flight>>"+flight2.land());
		
		
		
	}

}
