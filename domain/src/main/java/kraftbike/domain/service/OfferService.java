package kraftbike.domain.service;

import java.util.UUID;
import kraftbike.domain.model.Offer;

public interface OfferService {

	Offer get(UUID offerId);
	
}
