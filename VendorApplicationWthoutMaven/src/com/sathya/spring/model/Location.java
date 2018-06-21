package com.sathya.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Location_tab")
public class Location  implements Serializable,Comparable<Location>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="locId")
	private int locationId;
	@Column(name="locName",length=20)
	private String locationName;
	@Column(name="locType",length=10)
	private String locationType;
	@Column(name="sname",length=15)
	private String supervisorName;
	@Column(name="aname",length=15)
	private String adviserName;
	@Column(name="state",length=20)
	private String state;
	@Column(name="country",length=20)
	private String country;
	@Column(name="pin",length=10)
	private int pinCode;
	
	public Location() 
	{
	}
	public Location(int locationId) 
	{
		this.locationId = locationId;
	}
	public Location(int locationId, String locationName, String locationType, String supervisorName, String adviserName,
			String state, String country, int pinCode) 
	{
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.locationType = locationType;
		this.supervisorName = supervisorName;
		this.adviserName = adviserName;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}
	@Override
	public int compareTo(Location location) 
	{	
		return locationId-location.locationId;
	}
	@Override
	public String toString() 
	{
		return "Location [locationId=" + locationId + ", locationName=" + locationName + ", locationType="
				+ locationType + ", supervisorName=" + supervisorName + ", adviserName=" + adviserName + ", state="
				+ state + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
	public int getLocationId() 
	{
		return locationId;
	}
	public void setLocationId(int locationId)
	{
		this.locationId = locationId;
	}
	public String getLocationName() 
	{
		return locationName;
	}
	public void setLocationName(String locationName) 
	{
		this.locationName = locationName;
	}
	public String getLocationType() 
	{
		return locationType;
	}
	public void setLocationType(String locationType) 
	{
		this.locationType = locationType;
	}
	public String getSupervisorName() 
	{
		return supervisorName;
	}
	public void setSupervisorName(String supervisorName) 
	{
		this.supervisorName = supervisorName;
	}
	public String getAdviserName() 
	{
		return adviserName;
	}
	public void setAdviserName(String adviserName) 
	{
		this.adviserName = adviserName;
	}
	public String getState() 
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public String getCountry() 
	{
		return country;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}
	public int getPinCode() 
	{
		return pinCode;
	}
	public void setPinCode(int pinCode) 
	{
		this.pinCode = pinCode;
	}
	
}
