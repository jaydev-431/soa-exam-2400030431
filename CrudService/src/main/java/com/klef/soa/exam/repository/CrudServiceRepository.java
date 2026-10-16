package com.klef.soa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.soa.exam.entity.BusRoute;

public interface CrudServiceRepository extends JpaRepository<BusRoute, Long> {

	
}
