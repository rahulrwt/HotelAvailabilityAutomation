package TripAdvisor.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HotelBookingImplementation implements HotelBooking {
	private WebDriver driver;
	private WebElement element;

	public Properties prop;

	public int NoOfHotelUnderBudget() {
		int count = 0;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String noOfHotels = driver.findElement(By.xpath(prop.getProperty("noOfHotels"))).getAttribute("innerHTML");
		String[] Res = noOfHotels.split(" ");
		System.out.println(Res[0]);
//		driver.close();
		return count;

	}

	public void setLocation(String location) {

		element = driver
				.findElement(By.xpath(prop.getProperty("location")));
		
		element.sendKeys(location);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element = driver.findElement(By.xpath(prop.getProperty("hotelButton")));
		element.click();
	}

	public void setBudget(int startPrice, int endPrice) {
//		element = driver.findElement(
//				By.xpath("//*[@id=\"component_10\"]/div/div[2]/div[3]/div[2]/div/div[1]/div[2]/div/div[2]"));
		Actions action = new Actions(driver);
		WebElement Slider = driver.findElement(
				By.xpath(prop.getProperty("sliderMin")));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		action.dragAndDropBy(Slider, 27, 0).build().perform();

		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Actions action1 = new Actions(driver);
		WebElement Slider1 = driver.findElement(By.xpath(prop.getProperty("sliderMax")));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		action1.dragAndDropBy(Slider1, -172, 0).build().perform();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//        
	}

	@Override
	public void setDates(Date day1, Date day2) {
		driver.findElement(By.xpath(prop.getProperty("checkIn"))).click();
		
	}

	//setup WebDriver and Open WebSite
	public void openWebSite(String Url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91950\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		this.driver = driver;
		driver.get(prop.getProperty("website"));
		driver.manage().window().maximize();
	}

	//setup property File
	public void setPropertyType(ArrayList<String> list) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		element = driver
				.findElement(By.xpath(prop.getProperty("calander")));
		if (element.isEnabled()) {
			element.click();
		}

		driver.findElement(By.xpath(prop.getProperty("seeMore"))).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String s : list) {
			if (s.equals("Hotels")) {

				driver.findElement(
						By.xpath(prop.getProperty("hotelCheckBox")))
						.click();
			} else if (s.equals("Guest Houses")) {

			} else if (s.equals("Speciality lodgings")) {

			}
		}

	}

	@Override
	public void setupPropertyFile(String fileLocation) {
		File file = new File(fileLocation);

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();

		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
