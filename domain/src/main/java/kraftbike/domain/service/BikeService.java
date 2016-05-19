package kraftbike.domain.service;

import java.util.UUID;

import kraftbike.domain.model.Bike;

public interface BikeService {

	Bike get(UUID bikeId);
	
}
