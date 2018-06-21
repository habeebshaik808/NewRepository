import org.codehaus.jackson.map.ObjectMapper;

import com.sathya.spring.model.Location;

public class Test 
{
public static void main1(String[] args) 
{
		Location location=new Location();
		location.setLocationId(100);
		location.setLocationName("Hyderabad");
		location.setLocationType("Urban");
		location.setSupervisorName("karthik");
		location.setAdviserName("ravi");
		location.setState("ap");
		location.setCountry("india");
		location.setPinCode(510000);
		try 
		{
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(location);
			System.out.println(json);
		} catch (Exception e) 
		{
			System.out.println(e);
		}	
	}
	public static void main(String[] args) 
	{
		String json="{\"locationId\":55,\"locationName\":\"AA\",\"locationType\":\"Rural\",\"supervisorName\":\"habeeb\",\"advisorName\":\"ravi\",\"state\":\"ap\",\"country\":\"india\",\"pinCode\":501222}";
		try 
		{
			ObjectMapper om=new ObjectMapper();
			Location location=om.readValue(json, Location.class);
			System.out.println(location);	
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}
