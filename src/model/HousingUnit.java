package model;

public class HousingUnit {
	
	private int id;
	private int streetNumner;
	private String streetName;
	private int unitNumber;
	private String city;
	private int zipcode;
	private String state;
	//private Neighborhood neighborhood;
	
	public HousingUnit() {
		super();
	}
	
	public HousingUnit(int streetNumner, String streetName, int unitNumber, String city, int zipcode, String state) {
		super();
		this.streetNumner = streetNumner;
		this.streetName = streetName;
		this.unitNumber = unitNumber;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getStreetNumner() {
		return streetNumner;
	}
	
	public void setStreetNumner(int streetNumner) {
		this.streetNumner = streetNumner;
	}
	
	public String getStreetName() {
		return streetName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public int getUnitNumber() {
		return unitNumber;
	}
	
	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "HousingUnit [id=" + id + ", streetNumner=" + streetNumner + ", streetName=" + streetName
				+ ", unitNumber=" + unitNumber + ", city=" + city + ", zipcode=" + zipcode + ", state=" + state + "]";
	}

}
