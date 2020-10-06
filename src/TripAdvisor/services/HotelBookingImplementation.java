package TripAdvisor.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelBookingImplementation implements HotelBooking {
	private String location;
	private WebDriver driver;
	private WebElement element;
	private Date day1, day2;

	public int NoOfHotelUnderBudget() {
		int count = 0;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String res=driver.findElement(By.xpath("//*[@id=\"component_13\"]/div[2]/div[1]/span/span/span[1]")).getAttribute("innerHTML");
		String[] Res=res.split(" ");
		System.out.println(Res[0]);
		return count;
	}

	public void setLocation(String location) {
		
		
		this.location = location;
		element=driver.findElement(By.xpath("//*[@id=\"lithium-root\"]/main/div[2]/div/div/div[2]/div[2]/div/form/input[1]"));
		driver.manage().window().maximize();
		element.sendKeys("Mumbai");
		
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
		element=driver.findElement(By.xpath("//*[@id=\"lithium-root\"]/main/div[2]/div/div/div[1]/a"));
		element.click();
	}
	
	public void setBudget(int startPrice, int endPrice) {
		element=driver.findElement(By.xpath("//*[@id=\"component_10\"]/div/div[2]/div[3]/div[2]/div/div[1]/div[2]/div/div[2]"));
		Actions dragAndDropBy = Actions.dragAndDropBy(element,238,515);
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

	public void setPropertyType(ArrayList<String> list) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		element=driver.findElement(By.xpath("//*[@id=\"PERSISTENT_TRIP_SEARCH_BAR\"]/div[1]/div[1]/div/div[1]/button[1]"));
				if (element.isEnabled())
				{
					element.click();
				}
				   
				
		driver.findElement(By.xpath("//*[@id=\"component_10\"]/div/div[2]/div[5]/div[2]/div[5]/span[2]")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String s:list)
		{
			if(s.equals("Hotels"))
			{
				
				driver.findElement(By.xpath("//*[@id=\"component_10\"]/div/div[2]/div[5]/div[2]/div[1]/div/label/div/span[1]/a")).click();
			}
			else if(s.equals("Guest Houses"))
			{
				
			}
			else if(s.equals("Speciality lodgings"))
			{
				
			}
		}
		
	}



}
