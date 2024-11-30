package com.webs_producer_gitaTravles.app.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webs_producer_gitaTravles.app.Model.Bus;

@Repository
public interface BusRepository extends CrudRepository<Bus, Integer>
{

	List<Bus> findByFromLocationAndToLocation(String fromLocation, String toLocation);

}
