package TripAdvisor;


import java.util.ArrayList;

import TripAdvisor.services.HotelBookingImplementation;

public class TripAdvisor {

	
	public static void main(String[] args) {
		String fileLocation="C:\\Users\\91950\\eclipse-workspace\\Hotel Availability Automation\\projectConfig.properties";
		 HotelBookingImplementation tripAdvisor=new HotelBookingImplementation();
		 	tripAdvisor.setupPropertyFile(fileLocation);
		   tripAdvisor.openWebSite("https://www.tripadvisor.in");
		   tripAdvisor.setLocation("Mumbai");
		   String str="Hotels";
		   ArrayList<String> list=new ArrayList<>();
		   list.add(str);
		   tripAdvisor.setPropertyType(list);
		   tripAdvisor.setBudget(2000, 3000);
		   tripAdvisor.setDates();
		   tripAdvisor.NoOfHotelUnderBudget();
		    }

		}