//package TripAdvisor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class FirstSeleniumTest {
//
//
//    public static void main(String[] args) {
//        // declaration and instantiation of objects/variables
//    	
//		//comment the above 2 lines and uncomment below 2 lines to use Chrome
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\Desktop\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//    	
//        String baseUrl = "https://www.tripadvisor.in/";
//        String expectedTitle = "Tripadvisor Official Site‎";
//        String actualTitle = "";
//
//        // launch Fire fox and direct it to the Base URL
//        driver.get(baseUrl);
//
//        // get the actual value of the title
//        actualTitle = driver.getTitle();
//
//        
//        if (actualTitle.contentEquals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//        	System.out.println("asd"+actualTitle);
//            
//        }
//       
//        //close Fire fox
//        driver.close();
//       
//    }
//
//}