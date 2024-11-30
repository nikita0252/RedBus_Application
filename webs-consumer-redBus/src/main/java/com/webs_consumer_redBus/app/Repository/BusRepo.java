package com.webs_consumer_redBus.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webs_consumer_redBus.app.Model.Bus;

@Repository
public interface BusRepo extends CrudRepository<Bus, Integer>{

}
