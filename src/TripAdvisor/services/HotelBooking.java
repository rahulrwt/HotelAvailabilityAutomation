package TripAdvisor.services;

import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface HotelBooking {
	
	public void openWebSite(String Url);
	public void setupPropertyFile(String fileLocation);

	public int NoOfHotelUnderBudget();
	public void setBudget(int startPrice,int endPrice);
	public void setLocation(String location);
	public void setDates(Date day1,Date day2);
	public void setPropertyType(ArrayList<String> type);
}
