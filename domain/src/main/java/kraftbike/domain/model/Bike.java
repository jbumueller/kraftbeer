package kraftbike.domain.model;

import java.util.UUID;

public class Bike {

	private UUID id;
	private int year;
	private String frame;
	private int size;
	private String shiftingSystem;
	private String fork;
	private String wheels;
	private String crankSet;
	private String saddle;
	private String handlebar;
	private String pedals;
	private String brakes;

	public Bike(UUID id, int year, String frame, int size, String shiftingSystem, String fork, String wheels,
			String crankSet, String saddle, String handlebar, String pedals, String brakes) {
		this.setId(id);
		this.year = year;
		this.frame = frame;
		this.size = size;
		this.shiftingSystem = shiftingSystem;
		this.fork = fork;
		this.wheels = wheels;
		this.crankSet = crankSet;
		this.saddle = saddle;
		this.handlebar = handlebar;
		this.pedals = pedals;
		this.brakes = brakes;
	}

	public Bike() {
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFrame() {
		return frame;
	}

	public void setFrame(String frame) {
		this.frame = frame;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getShiftingSystem() {
		return shiftingSystem;
	}

	public void setShiftingSystem(String shiftingSystem) {
		this.shiftingSystem = shiftingSystem;
	}

	public String getFork() {
		return fork;
	}

	public void setFork(String fork) {
		this.fork = fork;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public String getCrankSet() {
		return crankSet;
	}

	public void setCrankSet(String crankSet) {
		this.crankSet = crankSet;
	}

	public String getSaddle() {
		return saddle;
	}

	public void setSaddle(String saddle) {
		this.saddle = saddle;
	}

	public String getHandlebar() {
		return handlebar;
	}

	public void setHandlebar(String handlebar) {
		this.handlebar = handlebar;
	}

	public String getPedals() {
		return pedals;
	}

	public void setPedals(String pedals) {
		this.pedals = pedals;
	}

	public String getBrakes() {
		return brakes;
	}

	public void setBrakes(String brakes) {
		this.brakes = brakes;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
}
