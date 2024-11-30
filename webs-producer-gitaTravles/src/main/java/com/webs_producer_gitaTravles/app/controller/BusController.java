package com.webs_producer_gitaTravles.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webs_producer_gitaTravles.app.Model.Bus;
import com.webs_producer_gitaTravles.app.ServiceI.BusServiceI;

@RestController
@RequestMapping("/api/buses")
public class BusController 
{
	@Autowired
	BusServiceI bsi;
	
	@PostMapping(value = "/addBus")
	public Bus addBus(@RequestBody Bus b)
	{
		Bus bus = bsi.addBuses(b);
		return bus;
	}
	
	@GetMapping(value = "/getAllBuses/{fromLocation}/{toLocation}")
	public List<Bus> getAllNitaTravles(@PathVariable("fromLocation") String fromLocation, @PathVariable("toLocation") String toLocation)
	{
		List<Bus> list = bsi.getAllData(fromLocation,toLocation);
		return list;		
	}


}
