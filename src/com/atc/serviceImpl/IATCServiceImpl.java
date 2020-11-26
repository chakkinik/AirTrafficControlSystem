package com.atc.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.atc.model.Flight;
import com.atc.model.Runway;
import com.atc.service.IATCService;

public class IATCServiceImpl implements IATCService{

	Map<String,Flight> flightRepo = new HashMap<String,Flight>();
	List<Runway> runwayRepo = new ArrayList<Runway>();
	Map<Integer,Boolean> runwayAvailable = new HashMap<>(); 
	
	@Override
	public void registerFlight(Flight flight) {
		 flightRepo.put(flight.flightNo, flight);
	}

	@Override
	public void registerRunway(Runway runway) {
		runwayRepo.add(runway);
		runwayAvailable.put(runway.runwayNo, true);
	}

	@Override
	public boolean isLandinOk() {
	 // check if tunway available 
		return false;
	}

	@Override
	public void land() {
		//occpy runway and 
	}

}
