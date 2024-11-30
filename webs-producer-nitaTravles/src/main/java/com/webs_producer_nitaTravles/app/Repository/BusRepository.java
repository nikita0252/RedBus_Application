package com.webs_producer_nitaTravles.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webs_producer_nitaTravles.app.Model.Bus;

@Repository
public interface BusRepository extends CrudRepository<Bus, Integer>{

	List<Bus> findByFromLocationAndToLocation(String fromLocation, String toLocation);

	

}
