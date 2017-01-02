package kraftbike.domain.model;

import java.util.UUID;

import kraftbike.domain.model.Bike;

public class BikeBuilder {
	private UUID id = UUID.randomUUID();

	public static BikeBuilder create() {
		return new BikeBuilder();
	}

	private BikeBuilder() {

	}

	public BikeBuilder withId(UUID id) {
		this.id = id;
		return this;
	}
	
	public Bike build() {
		return new Bike(id);
	}
}
