package com.klef.soa.exam.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class BusRouteDto {


	@NotBlank(message = "Route number is required")
	@Size(max = 20, message = "Route number cannot exceed 20 characters")
	private String routeNumber;

	@NotBlank(message = "Start point is required")
	@Size(max = 100, message = "Start point cannot exceed 100 characters")
	private String startPoint;

	@NotBlank(message = "End point is required")
	@Size(max = 100, message = "End point cannot exceed 100 characters")
	private String endPoint;

	@Positive(message = "Distance must be greater than zero")
	private double distanceKm;


	


	public String getRouteNumber() {
		return routeNumber;
	}


	public void setRouteNumber(String routeNumber) {
		this.routeNumber = routeNumber;
	}


	public String getStartPoint() {
		return startPoint;
	}


	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}


	public String getEndPoint() {
		return endPoint;
	}


	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}


	public double getDistanceKm() {
		return distanceKm;
	}


	public void setDistanceKm(double distanceKm) {
		this.distanceKm = distanceKm;
	}

	
	
}
