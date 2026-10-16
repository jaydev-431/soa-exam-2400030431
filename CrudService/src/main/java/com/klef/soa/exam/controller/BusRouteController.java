package com.klef.soa.exam.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.BusRoute;
import com.klef.soa.exam.service.BusRouteService;

@RestController
@RequestMapping("/crudservice")
public class BusRouteController {

	@Autowired
	public BusRouteService service ;
	
	@GetMapping("/")
	public String test() {
		return "CRUD service is running";
	}
	
	@PostMapping("/add")
	public ResponseEntity<BusRoute> add(@RequestBody BusRoute request) {
		BusRoute response = service.addRoute(request);
		return ResponseEntity.status(201).body(response);
	}
	
	@GetMapping("/displayall")
	public ResponseEntity<List<BusRoute>> displayAll() {
		List<BusRoute> routes = service.displayAll();
		return ResponseEntity.ok(routes);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		String response = service.delete(id);
		return ResponseEntity.ok(response);
	}
	
}
