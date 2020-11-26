package com.atc.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
		Set<Entry<Integer, Boolean>> entrySet = runwayAvailable.entrySet();
		for(Entry eachRunway:entrySet) {
			Boolean value =(Boolean) eachRunway.getValue();
			if(value) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void land() {
		//occpy runway and 
		
		Set<Entry<Integer, Boolean>> entrySet = runwayAvailable.entrySet();
		for(Entry eachRunway:entrySet) {
			Boolean value =(Boolean) eachRunway.getValue();
			if(value) {
				eachRunway.setValue(false);
			}
		}
		
	}

}
