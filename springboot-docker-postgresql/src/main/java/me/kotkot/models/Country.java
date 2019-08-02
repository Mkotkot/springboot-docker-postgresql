package me.kotkot.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country implements Serializable {
	private static final long serialVersionUID = -2343243243242432341L;

	public Country() {
	}

	@Id
	@Column(name = "code")
	String code;
	@Column(name = "name")
	String name;
	@Column(name = "continent")
	String continent;
	@Column(name = "region")
	String region;
	@Column(name = "surface_area")
	String surface_area;
	@Column(name = "indep_year")
	Integer indep_year;
	@Column(name = "population")
	Integer population;
	@Column(name = "life_expectancy")
	String life_expectancy;
	@Column(name = "gnp")
	Integer gnp;
	@Column(name = "gnp_old")
	Integer gnp_old;
	@Column(name = "local_name")
	String local_name;
	@Column(name = "government_form")
	String government_form;
	@Column(name = "head_of_state")
	String head_of_state;
	@Column(name = "capital")
	Integer capital;
	@Column(name = "code2")
	String code2;

	@OneToMany(mappedBy = "countryCode", cascade = CascadeType.ALL)
	private Set<City> city;

	@OneToOne(mappedBy = "country", cascade = CascadeType.ALL)
	private CountryLanguage language;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSurface_area() {
		return surface_area;
	}

	public void setSurface_area(String surface_area) {
		this.surface_area = surface_area;
	}

	public Integer getIndep_year() {
		return indep_year;
	}

	public void setIndep_year(Integer indep_year) {
		this.indep_year = indep_year;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public String getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(String life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public Integer getGnp() {
		return gnp;
	}

	public void setGnp(Integer gnp) {
		this.gnp = gnp;
	}

	public Integer getGnp_old() {
		return gnp_old;
	}

	public void setGnp_old(Integer gnp_old) {
		this.gnp_old = gnp_old;
	}

	public String getLocal_name() {
		return local_name;
	}

	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}

	public String getGovernment_form() {
		return government_form;
	}

	public void setGovernment_form(String government_form) {
		this.government_form = government_form;
	}

	public String getHead_of_state() {
		return head_of_state;
	}

	public void setHead_of_state(String head_of_state) {
		this.head_of_state = head_of_state;
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public Set<City> getCity() {
		return city;
	}

	public void setCity(Set<City> city) {
		this.city = city;
	}

	public CountryLanguage getLanguage() {
		return language;
	}

	public void setLanguage(CountryLanguage language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", continent=" + continent + ", region=" + region
				+ ", surface_area=" + surface_area + ", indep_year=" + indep_year + ", population=" + population
				+ ", life_expectancy=" + life_expectancy + ", gnp=" + gnp + ", gnp_old=" + gnp_old + ", local_name="
				+ local_name + ", government_form=" + government_form + ", head_of_state=" + head_of_state
				+ ", capital=" + capital + ", code2=" + code2 + ", city=" + city + ", language=" + language + "]";
	}

}
