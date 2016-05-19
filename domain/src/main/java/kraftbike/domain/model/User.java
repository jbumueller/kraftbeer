package kraftbike.domain.model;

import java.util.UUID;

public class User {

	private UUID id;
	private String name;
	private String firstname;

	public User(UUID id, String name, String firstname) {
		this.id = id;
		this.name = name;
		this.firstname = firstname;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

}
