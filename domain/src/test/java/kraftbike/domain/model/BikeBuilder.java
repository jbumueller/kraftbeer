package kraftbike.domain.model;

import java.util.UUID;

import kraftbike.domain.model.Bike;

public class BikeBuilder {
	private UUID id;

	public static BikeBuilder create() {
		return new BikeBuilder();
	}

	private BikeBuilder() {

	}

	public void withId(UUID id) {
		this.id = id;
	}
	
	public Bike build() {
		return new Bike(id);
	}
}
