package kraftbike.domain.model;

import java.util.Currency;
import java.util.List;

import org.joda.time.DateTime;

public class Offer {

	private String ownerId;
	private Currency price;
	private String description;
	private List<String> tags;
	private List<String> pictures;
	private Bike bike;
	private DateTime timestamp;

	public Offer(String ownerId, Currency price, String description, List<String> tags, List<String> pictures,
			Bike bike, DateTime timestamp) {
		super();
		this.ownerId = ownerId;
		this.price = price;
		this.description = description;
		this.tags = tags;
		this.pictures = pictures;
		this.bike = bike;
		this.timestamp = timestamp;
	}

	public Offer() {
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Currency getPrice() {
		return price;
	}

	public void setPrice(Currency price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getPictures() {
		return pictures;
	}

	public void setPictures(List<String> pictures) {
		this.pictures = pictures;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}
}
