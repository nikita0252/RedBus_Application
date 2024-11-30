package com.webs_producer_nitaTravles.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webs_producer_nitaTravles.app.Model.Bus;
import com.webs_producer_nitaTravles.app.Service.BusServiceI;

@RestController
@RequestMapping("/api/bus")
public class BusController 
{
	@Autowired
	BusServiceI bsi;
	
	@PostMapping(value = "/addBuses")
	public Bus addBus(@RequestBody Bus b)
	{
		Bus bb = bsi.addBus(b);
		return bb;
	}
	
	@GetMapping(value = "/getALLBuses/{fromLocation}/{toLocation}")
	public List<Bus> getAllNitaTravles(@PathVariable("fromLocation") String fromLocation, @PathVariable("toLocation") String toLocation)
	{
		List<Bus> list = bsi.getAllData(fromLocation,toLocation);
		return list;		
	}

}
