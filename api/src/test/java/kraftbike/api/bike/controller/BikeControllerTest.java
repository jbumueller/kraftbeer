package kraftbike.api.bike.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import configuration.DomainConfiguration;
import kraftbike.api.bike.controller.BikeController;
import kraftbike.domain.model.Bike;
import kraftbike.domain.model.BikeBuilder;
import kraftbike.domain.service.BikeService;

@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = DomainConfiguration.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class BikeControllerTest {

	@Mock
	private BikeService bikeService;

	@InjectMocks
	private BikeController bikeController;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void If_an_existing_bike_is_requested_Then_a_valid_bike_is_returned() throws Exception {
		// Arrange
		UUID bikeId = UUID.randomUUID();
		when(bikeService.get(bikeId)).thenReturn(BikeBuilder.create().withId(bikeId).build());

		// Act
		Bike bike = (Bike) bikeController.get(bikeId).getResult();

		// Assert
		assertThat(bike.getId()).isEqualTo(bikeId);
	}

	@Test
	public void If_a_new_bike_is_put_Then_the_bike_is_stored() throws Exception {
		// Arrange
		
		// Act
		
		// Assert
	}
}