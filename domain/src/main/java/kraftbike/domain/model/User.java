package kraftbike.domain.model;

public class User {

	private String name;
	private String firstname;
	private String userId;

	public User(String name, String firstname, String userId) {
		super();
		this.name = name;
		this.firstname = firstname;
		this.userId = userId;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
