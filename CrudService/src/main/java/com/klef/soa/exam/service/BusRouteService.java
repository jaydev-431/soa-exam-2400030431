package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.dto.BusRouteDto;
import com.klef.soa.exam.entity.BusRoute;

public interface BusRouteService {

	BusRoute addRoute(BusRouteDto request);
	
	List<BusRoute> displayAll();
	
	String delete(Long id);
	
	BusRoute update(BusRouteDto route , Long id) ;
	
	BusRoute displayById(Long id);
	
}
