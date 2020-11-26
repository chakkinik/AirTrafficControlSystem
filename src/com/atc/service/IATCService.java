package com.atc.service;

import com.atc.model.Flight;
import com.atc.model.Runway;

public interface IATCService {
	
	public void registerFlight(Flight flight);
	
	public void registerRunway(Runway runway);
	
	public boolean isLandinOk();
	
	public void land();
	

}
