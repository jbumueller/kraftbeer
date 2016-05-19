package kraftbike.domain.model;

import java.util.UUID;

import org.joda.time.DateTime;

public class Message {

	private UUID id;
	private User sender;
	private Offer offer;
	private String content;
	private DateTime timestamp;

	public Message(UUID id, User sender, Offer offer, String content, DateTime timestamp) {
		this.id = id;
		this.sender = sender;
		this.offer = offer;
		this.content = content;
		this.timestamp = timestamp;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public DateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(DateTime timestamp) {
		this.timestamp = timestamp;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

}
