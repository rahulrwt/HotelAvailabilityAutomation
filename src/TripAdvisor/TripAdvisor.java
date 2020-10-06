package TripAdvisor;


import java.util.ArrayList;

import TripAdvisor.services.HotelBookingImplementation;

public class TripAdvisor {

	
	public static void main(String[] args) {
		
		 HotelBookingImplementation tripAdvisor=new HotelBookingImplementation();
		   tripAdvisor.openWebSite("https://www.tripadvisor.in");
		   tripAdvisor.setLocation("Mumbai");
		   tripAdvisor.setBudget(2000, 3000);
		   String str="Hotels";
		   ArrayList<String> list=new ArrayList<>();
		   list.add(str);
		   tripAdvisor.setPropertyType(list);
		   tripAdvisor.NoOfHotelUnderBudget();
		    }

		}