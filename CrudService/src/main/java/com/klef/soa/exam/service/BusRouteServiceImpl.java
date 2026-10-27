package com.klef.soa.exam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.dto.BusRouteDto;
import com.klef.soa.exam.entity.BusRoute;
import com.klef.soa.exam.repository.CrudServiceRepository;

@Service
public class BusRouteServiceImpl implements BusRouteService {

	@Autowired
	public CrudServiceRepository repo ;
	
	@Override
	public BusRoute addRoute(BusRouteDto request) {
		BusRoute route = new BusRoute();
		route.setDistanceKm(request.getDistanceKm());
		route.setRouteNumber(request.getRouteNumber());
		route.setEndPoint(request.getEndPoint());
		route.setStartPoint(request.getStartPoint());
		BusRoute saved =  repo.save(route);
		
		return saved ;
	}
	

	@Override
	public List<BusRoute> displayAll() {
		List<BusRoute> routes = repo.findAll();
		
		return routes ;
	}

	@Override
	public String delete(Long id) {
		Optional<BusRoute> container = repo.findById(id);
		if(container.isEmpty()) {
			return "Cannot delete , doesn't exists";
		}else {
			BusRoute del = container.get();
			repo.delete(del);
			return "Deleted Successfully";
		}
//		return null;
	}

	@Override
	public BusRoute update(BusRouteDto route, Long id) {
		Optional<BusRoute> container = repo.findById(id);
		if(container.isEmpty()) {
			return null ;
		}
			BusRoute obj = container.get();
			obj.setDistanceKm(route.getDistanceKm());
			obj.setEndPoint(route.getEndPoint());
			obj.setRouteNumber(route.getRouteNumber());
			obj.setStartPoint(route.getStartPoint());
		 BusRoute object =	repo.save(obj);
		return object ;
}


	@Override
	public BusRoute displayById(Long id) {
	  Optional<BusRoute> container =  repo.findById(id);
	  if(container.isPresent()) {
		  return container.get();
	  }
		return null;
	}
	
	
	

}