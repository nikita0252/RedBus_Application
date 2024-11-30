package com.webs_producer_gitaTravles.app.ServiceI;

import java.util.List;

import com.webs_producer_gitaTravles.app.Model.Bus;

	public interface BusServiceI {

	public Bus addBuses(Bus b);

	public List<Bus> getAllData(String fromLocation, String toLocation);

}
