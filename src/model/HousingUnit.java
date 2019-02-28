package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="HOUSING_UNIT")
public class HousingUnit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="STREET_NUMBER")
	private int streetNumber;
	
	@Column(name="STREET_NAME")
	private String streetName;
	
	@Column(name="UNIT_NUMBER")
	private int unitNumber;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="ZIPCODE")
	private int zipcode;
	
	@Column(name="STATE")
	private String state;
	
	@ManyToOne(cascade= CascadeType.MERGE)
	@JoinColumn(name="NEIGHBORHOOD")
	private Neighborhood neighborhood;
	
	public HousingUnit() {
		super();
	}
	
	public HousingUnit(int streetNumber, String streetName, int unitNumber, String city, int zipcode, String state) {
		super();
		this.streetNumber = streetNumber;
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
	
	public int getStreetNumber() {
		return streetNumber;
	}
	
	public void setStreetNumber(int streetNumner) {
		this.streetNumber = streetNumner;
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
		return "HousingUnit [id=" + id + ", streetNumber=" + streetNumber + ", streetName=" + streetName
				+ ", unitNumber=" + unitNumber + ", city=" + city + ", zipcode=" + zipcode + ", state=" + state + "]";
	}

}
