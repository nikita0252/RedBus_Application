package com.webs_consumer_redBus.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.webs_consumer_redBus.app.Model.Bus;
import com.webs_consumer_redBus.app.Service.BusServiceI;

@RestController
@RequestMapping("/api/redbus")
public class RedBusController 
{
	@Autowired
	RestTemplate rt;
	
	@Autowired
	BusServiceI bsi;
	
	@GetMapping(value = "/getAllRedBus")
	public List<List<Bus>> getAllBuses()
	{
		String url_1 = "http://localhost:8080/api/bus/getALLBuses/Pune/Nagpur";
		List<Bus> nita = rt.getForObject(url_1, List.class);
		
		String url_2 = "http://localhost:8081/api/buses/getAllBuses/Nagar/Delhi";
		List<Bus> gita = rt.getForObject(url_2, List.class);
		
		List<List<Bus>> list = new ArrayList<List<Bus>>();
		list.add(nita);
		list.add(gita);
		
		return list;
	}
	
	

	
}
