package com.sathya.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.spring.model.Location;

@Repository
@Transactional
public class LocationDaoImpl implements LocationDao
{
	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int insertLocation(Location location) 
	{
		int x=(Integer)ht.save(location);
		return x;
	}
	@Override
	public List<Location> getAllLocations() 
	{
		List<Location> list=ht.loadAll(Location.class);
		return list;
	}
	@Override
	public Location getLocationById(int locationId) 
	{
		Location location=ht.get(Location.class,locationId);
		return location;
	}
	@Override
	public void updateLocation(Location location) 
	{
	    ht.update(location);
	}
	@Override
	public void deleteLocation(Location location) 
	{
		ht.delete(location);
	}
	@Override//validation
	public Location getLocationByName(String locationName) 
	{
		Location location=null;
		String hql=" from "+Location.class.getName()+" where locationName=?";
		@SuppressWarnings("unchecked")
		List<Location>  list=(List<Location>)ht.find(hql,locationName);
		if(list!=null && list.size()>0)
		{
			location=list.get(0);
		}
		return location;
	}
	@Override//Charts
	public List<Object[]> getLocationwiseCount() 
	{
		String hql="select locationType,count(locationType) from "+Location.class.getName()+" group by locationType";
		@SuppressWarnings("unchecked")
		List<Object[]> data=(List<Object[]>) ht.find(hql);
		return data;
	}
	
}
