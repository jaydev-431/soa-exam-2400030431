package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.BusRoute;

public interface BusRouteService {

	BusRoute addRoute(BusRoute request);
	
	List<BusRoute> displayAll();
	
	String delete(Long id);
	
}
