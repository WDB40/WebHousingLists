package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school_district")

public class SchoolDistrict {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "DistrictName")
	private String districtName;
	@Column(name = "Rating")
	private double rating;

	public SchoolDistrict() {
		super();
	}

	public SchoolDistrict(String districtName, double rating) {
		super();
		this.districtName = districtName;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "SchoolDistrict [id=" + id + ", districtName=" + districtName + ", rating=" + rating + "]";
	}

}