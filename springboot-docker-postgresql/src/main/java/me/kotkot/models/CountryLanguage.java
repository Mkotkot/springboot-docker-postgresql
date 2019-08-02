package me.kotkot.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "country_language")
public class CountryLanguage implements Serializable {
	private static final long serialVersionUID = -2343243243242432341L;

	public CountryLanguage() {
	}

	@Column(name = "country_code")
	String countryCode;
	@Column(name = "language")
	String language;
	@Column(name = "is_official")
	boolean isOfficial;
	@Column(name = "percentage")
	String percentage;
	@OneToOne
	@MapsId
	private Country country;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isOfficial() {
		return isOfficial;
	}

	public void setOfficial(boolean isOfficial) {
		this.isOfficial = isOfficial;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "CountryLanguage [countryCode=" + countryCode + ", language=" + language + ", isOfficial=" + isOfficial
				+ ", percentage=" + percentage + ", country=" + country + "]";
	}

}
