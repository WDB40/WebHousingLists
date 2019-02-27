package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="TEST_LISTING")
public class Listing {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@JoinColumn(name="UNIT_ID")
	private HousingUnit housingUnit;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="LIST_DATE")
	private LocalDate listDate;
	
	public Listing() {
		super();
	}
	
	public Listing(HousingUnit housingUnit, double price, LocalDate listDate) {
		super();
		this.housingUnit = housingUnit;
		this.price = price;
		this.listDate = listDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HousingUnit getHousingUnit() {
		return housingUnit;
	}

	public void setHousingUnit(HousingUnit housingUnit) {
		this.housingUnit = housingUnit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getListDate() {
		return listDate;
	}

	public void setListDate(LocalDate listDate) {
		this.listDate = listDate;
	}

	@Override
	public String toString() {
		return "Listing [id=" + id + ", housingUnit=" + housingUnit + ", price=" + price + ", listDate=" + listDate
				+ "]";
	}
	
}
