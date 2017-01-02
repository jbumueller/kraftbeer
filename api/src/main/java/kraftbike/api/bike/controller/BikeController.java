package kraftbike.api.bike.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import kraftbike.domain.model.Bike;
import kraftbike.domain.service.BikeService;
import rx.Observable;

@RestController
public class BikeController {

	@Autowired
	private BikeService bikeService;
	
	@RequestMapping( path="/api/bike/{bikeId}", method=RequestMethod.GET)
	public DeferredResult<Bike> get(@PathVariable UUID bikeId) {
		
		Observable<Bike> getBikeObservable = Observable.just(bikeService.get(bikeId));
		DeferredResult<Bike> bike = new DeferredResult<>();
		getBikeObservable.subscribe(result -> bike.setResult(result), error -> bike.setErrorResult(error));
		return bike;
	}
}
