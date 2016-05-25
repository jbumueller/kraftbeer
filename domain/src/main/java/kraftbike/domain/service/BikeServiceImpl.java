package kraftbike.domain.service;



import java.util.UUID;

import org.springframework.stereotype.Service;
import com.google.common.base.Preconditions;
import kraftbike.domain.model.Bike;

@Service
public class BikeServiceImpl implements BikeService {

	public Bike get(UUID id) {
		Preconditions.checkNotNull(id);
		return new Bike(id);
	}

}
