package kraftbike.api.bike.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kraftbike.domain.model.Bike;
import kraftbike.domain.service.BikeService;

@RestController
public class BikeController {

	@Autowired
	private BikeService bikeService;
	
	@RequestMapping( path="/api/bike/{bikeId}", method=RequestMethod.GET)
	public Bike get(@PathVariable UUID bikeId) {
		
		return bikeService.get(bikeId);
	}
	
//	@RequestMapping( path="/api/bike", method=RequestMethod.POST)
//	public void post(@ModelAttribute("bike") BikeModel bikeModel) {
//		
//	}
}
