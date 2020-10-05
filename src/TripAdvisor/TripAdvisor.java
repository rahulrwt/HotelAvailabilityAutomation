package TripAdvisor;


import TripAdvisor.services.HotelBookingImplementation;

public class TripAdvisor {

	
	public static void main(String[] args) {
		
		 HotelBookingImplementation tripAdvisor=new HotelBookingImplementation();
		   tripAdvisor.openWebSite("https://www.tripadvisor.in");
		   tripAdvisor.setLocation("Mumbai");
		    }

		}