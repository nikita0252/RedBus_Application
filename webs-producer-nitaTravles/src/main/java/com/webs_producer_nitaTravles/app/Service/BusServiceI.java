package com.webs_producer_nitaTravles.app.Service;

import java.util.List;

import com.webs_producer_nitaTravles.app.Model.Bus;

public interface BusServiceI
{

	public Bus addBus(Bus b);

	public List<Bus> getAllData(String fromLocation, String toLocation);

}
