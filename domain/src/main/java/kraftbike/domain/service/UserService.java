package kraftbike.domain.service;

import java.util.UUID;
import kraftbike.domain.model.User;

public interface UserService {

	User get(UUID userId);
	
}
