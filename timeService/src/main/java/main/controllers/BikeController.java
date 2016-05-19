package main.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import kraftbike.domain.model.Bike;

@RestController
public class BikeController {
	
	public Bike get(UUID id) {
		return null;
	}
}
