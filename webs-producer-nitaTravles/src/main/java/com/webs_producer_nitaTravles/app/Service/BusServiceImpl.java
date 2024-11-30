package com.webs_producer_nitaTravles.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webs_producer_nitaTravles.app.Model.Bus;
import com.webs_producer_nitaTravles.app.Repository.BusRepository;

@Service
public class BusServiceImpl implements BusServiceI
{
	@Autowired
	BusRepository br;
	
	@Override
	public Bus addBus(Bus b) 
	{
		Bus bus = br.save(b);
		return bus;
	}

	@Override
	public List<Bus> getAllData(String fromLocation, String toLocation) 
	{
		List<Bus> list = br.findByFromLocationAndToLocation(fromLocation,toLocation);
		
		return list;
	}

	
}
