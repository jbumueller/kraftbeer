package kraftbike.domain.service;

import java.util.UUID;
import kraftbike.domain.model.Message;

public interface MessageService {

	Message get(UUID messageId);

}
