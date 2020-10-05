package TripAdvisor.services;

import java.util.Date;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelBookingImplementation implements HotelBooking {
	private String location;
	private WebDriver driver;
	private WebElement element;
	private int startPrice, endPrice;
	private Date day1, day2;

	public int NoOfHotelUnderBudget() {
		int count = 0;

		return count;
	}

	public void setLocation(String location) {
		
		
		this.location = location;
		element=driver.findElement(By.xpath("//*[@id=\"lithium-root\"]/main/div[2]/div/div/div[2]/div[2]/div/form/input[1]"));
		
		element.sendKeys("Mumbai");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element=driver.findElement(By.xpath(""));
		element.click();
		
		element=driver.findElement(By.xpath("//*[@id=\"lithium-root\"]/main/div[2]/div/div/div[1]/a"));
		element.click();
	}
	public void setBudget(int startPrice, int endPrice) {

	}

	public void sortByBudget() {

	}

	public void setDate() {

	}

	@Override
	public void setDates(Date day1, Date day2) {
		this.day1 = day1;
		this.day2 = day2;

	}

	public void openWebSite(String Url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91950\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		this.driver=driver;
		driver.get("https://www.tripadvisor.in/");
	}

	public boolean verifyPage(String title)
	{
		if(driver.getTitle().equals(title))
				{
			return true;
				}
		return false;
	}

}
