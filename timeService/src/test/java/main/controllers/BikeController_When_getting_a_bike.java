package main.controllers;

import static org.mockito.Mockito.when;

import java.util.UUID;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kraftbike.domain.model.Bike;
import kraftbike.domain.model.BikeBuilder;
import kraftbike.domain.service.BikeService;

@RunWith(SpringJUnit4ClassRunner.class)
public class BikeController_When_getting_a_bike {

	@Mock
	private BikeService bikeService;
	
	@InjectMocks
	private BikeController controllerUnderTest;
	
	@Test
	public void If_an_existing_bike_is_requested_Then_a_valid_bike_is_returned() throws Exception {
		// Arrange
		UUID bikeId = UUID.randomUUID();
		BikeBuilder bikeBuilder = BikeBuilder.create();
		bikeBuilder.withId(bikeId);		
		when(bikeService.get(bikeId)).thenReturn(new Bike());
		
		// Act
		Bike bike = controllerUnderTest.get(bikeId);
		
		// Assert
		Assertions.assertThat(bike.getId()).isEqualTo(bikeId);
	}
}