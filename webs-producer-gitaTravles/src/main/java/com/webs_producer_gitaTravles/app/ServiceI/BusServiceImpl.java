package com.webs_producer_gitaTravles.app.ServiceI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.webs_producer_gitaTravles.app.Model.Bus;
import com.webs_producer_gitaTravles.app.Repository.BusRepository;

@Service
public class BusServiceImpl implements BusServiceI 
{
	@Autowired
	BusRepository br;
	
	@Override

	public Bus addBuses(Bus b) 
	{
		Bus bus = br.save(b);
		
		return bus;
	}

	@Override
	public List<Bus> getAllData(String fromLocation, String toLocation) 
	{
		List<Bus> bus = br.findByFromLocationAndToLocation(fromLocation,toLocation);
		
		return bus;
	}
	
	
	
}
