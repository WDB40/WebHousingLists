package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "neighborhood")
public class Neighborhood {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "NeighborName")
	private String neighborName;
	@JoinColumn(name = "SchoolDistrictID")
	private int schoolDistrictId;

	public Neighborhood() {
		super();
	}

	public Neighborhood(String neighborName, int schoolDistrictId) {
		super();
		this.neighborName = neighborName;
		this.schoolDistrictId = schoolDistrictId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNeighborName() {
		return neighborName;
	}

	public void setNeighborName(String neighborName) {
		this.neighborName = neighborName;
	}

	public int getSchoolDistrictId() {
		return schoolDistrictId;
	}

	public void setSchoolDistrictId(int schoolDistrictId) {
		this.schoolDistrictId = schoolDistrictId;
	}

	@Override
	public String toString() {
		return "Neighborhood [id=" + id + ", neighborName=" + neighborName + ", schoolDistrictId=" + schoolDistrictId
				+ "]";
	}

}
