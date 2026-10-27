package com.klef.soa.exam.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.dto.BusRouteDto;
import com.klef.soa.exam.entity.BusRoute;
import com.klef.soa.exam.service.BusRouteService;

@RestController
@RequestMapping("/crudservice")
@CrossOrigin(origins = "http://localhost:5173")
public class BusRouteController {

	@Autowired
	public BusRouteService service ;
	
	@GetMapping("/")
	public String test() {
		return "CRUD service is running";
	}
	
	@PostMapping("/add")
	public ResponseEntity<BusRoute> add(@RequestBody BusRouteDto request) {
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
	
	@PutMapping("/update/{id}")
	public ResponseEntity<BusRoute> update(@RequestBody BusRouteDto request , @PathVariable long id ) {
		BusRoute response = service.update(request, id);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/display/{id}")
	public ResponseEntity<?> displayById(@PathVariable Long id) {
		BusRoute response = service.displayById(id);
		if(response==null) {
			return ResponseEntity.status(404).body("Not found");
		}
		return ResponseEntity.ok(response);
	}
	
	
	
	
}
