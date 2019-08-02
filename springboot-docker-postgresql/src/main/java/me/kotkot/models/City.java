package me.kotkot.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City implements Serializable {
	private static final long serialVersionUID = -2343243243242432341L;

	@Id
	Integer id;
	@Column(name = "country_code")
	String name;
	@Column(name = "district")
	String district;
	@Column(name = "population")
	Integer population;

	@ManyToOne
	@JoinColumn
	private Country countryCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Country getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Country countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", district=" + district + ", population=" + population + "]";
	}

}
