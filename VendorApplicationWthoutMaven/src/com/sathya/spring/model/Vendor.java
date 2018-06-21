

package com.sathya.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vendor_tab")
public class Vendor implements Comparable<Vendor>
{
	@Id
	@Column(name="vid")
	private int vendorId;
	@Column(name="vname",length=10)
	private String vendorName;
	@Column(name="email")
	private String vendorEmail;
	@ManyToOne
	@JoinColumn(name="locationId_Fk")
	private Location location;
	
	public Location getLocation() 
	{
		return location;
	}
	public void setLocation(Location location) 
	{
		this.location = location;
	}
	public Vendor() 
	{
		super();
	}
	public Vendor(int vendorId) 
	{
		super();
		this.vendorId = vendorId;
	}
	public Vendor(int vendorId, String vendorName, String vendorEmail) 
	{
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorEmail = vendorEmail;
	}
	public int getVendorId()
	{
		return vendorId;
	}
	public void setVendorId(int vendorId) 
	{
		this.vendorId = vendorId;
	}
	public String getVendorName() 
	{
		return vendorName;
	}
	public void setVendorName(String vendorName) 
	{
		this.vendorName = vendorName;
	}
   public String getVendorEmail() 
   {
		return vendorEmail;
	}
	public void setVendorEmail(String vendorEmail) 
	{
		this.vendorEmail = vendorEmail;
	}
	@Override
	public String toString() 
	{
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName+ ", vendorEmail=" + vendorEmail + "]";
	}
	@Override
	public int compareTo(Vendor vendor) 
	{
		return  vendorId-vendor.vendorId;
	}
	

}
