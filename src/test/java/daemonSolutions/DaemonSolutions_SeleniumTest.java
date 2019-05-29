package daemonSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DaemonSolutions_SeleniumTest {

	public WebDriver webDriver;
	public String result;
	MyConnection connection = new MyConnection();

	@BeforeTest(description = "Anything annotated with the annotation @BeforeTest will run first")
	public void login() {

		//System.setProperty("webdriver.chrome.driver", "/Users/shahinahmed/Downloads/chromedriver");
		webDriver = new HtmlUnitDriver();
		webDriver.get("https://www.daemonsolutions.com/");
		connection.startConnection();
	}

	@Test(priority = 0, description = "Locating elements and the test logic goes here.")
	public void check_availability() {
		try {

			WebElement element = webDriver.findElement(By.xpath("//li[@class='menu_item']/a[text()='Contact us']"));
			result = element.getText().toLowerCase();
			System.out.println(result);

			Assert.assertEquals(result, "contact us");
			/*
			 * compare the actual title of the page with the expected one and print the
			 * result as "Passed" or "Failed"
			 */

			if (result.toLowerCase().contains("contact us")) {
				// the Database logic will go here
				connection.createRecord("Home Page", "Home Page Availability", "Pass");
			} else {
				// the Database logic will go here
				connection.createRecord("Home Page", "Home Page Availability", "Failed");
			}
		} catch (Exception ex) {
			System.out.println("Test Failed, see the reason below. \n " + ex.getMessage());
		}
	}

	@Test(priority = 1, description = "The the elements and the test logic goes here.")
	public void check_careers() {
		try {

			WebElement careers = webDriver.findElement(By.xpath("//li[@class='menu_item']/a[text()='Careers']"));
			careers.click();
			WebElement positions = webDriver.findElement(By.xpath("//*[@id=\"current-openings\"]/h2"));
			result = positions.getText().toLowerCase();
			System.out.println(result);
			Assert.assertEquals(result, "current openings");

			if (result.toLowerCase().contains("current openings")) {
				// the Database logic will go here
				connection.createRecord("Career Page", "Career Page Availability", "Pass");
			} else {
				// the Database logic will go here
				connection.createRecord("Career Page", "Career Page Availability", "Failed");
			}

		} catch (Exception ex) {
			System.out.println("Test Failed, see the reason below.\n" + ex.getMessage());
		}
	}

	@Test(priority = 2, description = "Checking the DevOps practise pages")
	public void check_DevOps() {
		try {

			webDriver.get("https://www.daemonsolutions.com/solutions/devops/");
			WebElement verify = webDriver
					.findElement(By.xpath("//div[@class='column']/h3[text()='DevOps Assessment']"));
			result = verify.getText().toLowerCase();
			System.out.println(result);
			Assert.assertEquals(result, "devops assessment");
			// Thread.sleep(1000);

			if (result.toLowerCase().contains("devops assessment")) {
				// the Database logic will go here
				connection.createRecord("Practise Page", "DevOps Page Availability", "Pass");
			} else {
				// the Database logic will go here
				connection.createRecord("Practise Page", "DevOps Page Availability", "Failed");
			}

		} catch (Exception ex) {
			System.out.println("Test Failed, see the reason below.\n" + ex.getMessage());
		}

	}

	@Test(priority = 3, description = "Checking the Cloud Practise pages")
	public void check_Cloud() {
		try {
			webDriver.get("https://www.daemonsolutions.com/solutions/cloud/");
			WebElement verify = webDriver.findElement(By.xpath("//div[@class='column']/h3[text()='Advisory']"));
			result = verify.getText().toLowerCase();
			System.out.println(result);
			Assert.assertEquals(result, "advisory");

			if (result.toLowerCase().contains("advisory")) {
				// the Database logic will go here
				connection.createRecord("Practise Page", "Cloud Page Availability", "Pass");
			} else {
				// the Database logic will go here
				connection.createRecord("Practise Page", "Cloud Page Availability", "Failed");
			}

		} catch (Exception ex) {
			System.out.println("Test Failed, see the reason below.\n" + ex.getMessage());
		}

	}

	@Test(priority = 4, description = "Checking the PE practise pages")
	public void check_Performance_Engineering() {
		try {
			webDriver.get("https://www.daemonsolutions.com/solutions/performance-engineering/");
			WebElement verify = webDriver.findElement(By.xpath("//div[@class='hero__label']"));
			result = verify.getText().toLowerCase();
			System.out.println(result);
			Assert.assertEquals(result, "performance engineering");

			if (result.toLowerCase().contains("performance engineering")) {
				// the Database logic will go here
				connection.createRecord("Practise Page", "PE Page Availability", "Pass");
			} else {
				// the Database logic will go here
				connection.createRecord("Practise Page", "PE Page Availability", "Failed");
			}
		} catch (Exception ex) {
			System.out.println("Test Failed, see the reason below.\n" + ex.getMessage());
		}

	}

	@Test(priority = 5, description = "Checking the MI/AI practise pages")
	public void check_MI_AI() {
		try {
			webDriver.get("https://www.daemonsolutions.com/solutions/machine-learning/");
			WebElement verify = webDriver.findElement(By.xpath("//h3[text()='Prove it']"));
			result = verify.getText().toLowerCase();
			System.out.println(result);
			Assert.assertEquals(result, "prove it");
			if (result.toLowerCase().contains("prove it")) {
				// the Database logic will go here
				connection.createRecord("Practise Page", "MI/AI Page Availability", "Pass");
			} else {
				// the Database logic will go here
				connection.createRecord("Practise Page", "MI/AI Page Availability", "Failed");
			}

		} catch (Exception ex) {
			System.out.println("Test Failed, see the reason below.\n" + ex.getMessage());
		}

	}

	@Test(priority = 6, description = "Checking the DE practise pages")
	public void check_Digital_engineering() {
		try {
			webDriver.get("https://www.daemonsolutions.com/solutions/digital-engineering/");
			WebElement verify = webDriver.findElement(By.xpath("//div[@class='hero__label']"));
			result = verify.getText().toLowerCase();
			System.out.println(result);
			Assert.assertEquals(result, "digital engineering");

			if (result.toLowerCase().contains("digital engineering")) {
				// the Database logic will go here
				connection.createRecord("Practise Page", "Digital Engineering Page Availability", "Pass");
			} else {
				// the Database logic will go here
				connection.createRecord("Practise Page", "Digital Engineering Page Availability", "Failed");
			}

		} catch (Exception ex) {
			System.out.println("Test Failed, see the reason below.\n" + ex.getMessage());
		}

	}

	@Test(priority = 7, description = "Checking the Technical Delivery practise pages")
	public void check_Technical_delivery() {
		try {
			webDriver.get(" https://www.daemonsolutions.com/solutions/technical-delivery/");
			WebElement verify = webDriver.findElement(By.xpath("//div[@class='hero__label']"));
			result = verify.getText().toLowerCase();
			System.out.println(result);
			Assert.assertEquals(result, "technical delivery");

			if (result.toLowerCase().contains("technical delivery")) {
				// the Database logic will go here
				connection.createRecord("Practise Page", "Technical Delivery Page Availability", "Pass");
			} else {
				// the Database logic will go here
				connection.createRecord("Practise Page", "Technical Delivery Page Availability", "Failed");
			}
		} catch (Exception ex) {
			System.out.println("Test Failed, see the reason below.\n" + ex.getMessage());
		}
	}

	@Test(priority = 8, description = "Checking the Design Thinking practise pages")
	public void check_design_thinking() {
		try {
			webDriver.get("https://www.daemonsolutions.com/solutions/design-thinking/");
			WebElement verify = webDriver.findElement(By.xpath("//div[@class='hero__label']"));
			result = verify.getText().toLowerCase();
			System.out.println(result);
			Assert.assertEquals(result, "design thinking");
			// Thread.sleep(1000);

			if (result.toLowerCase().contains("design thinking")) {
				// the Database logic will go here
				connection.createRecord("Practise Page", "Design Thinking Page Availability", "Pass");
			} else {
				// the Database logic will go here
				connection.createRecord("Practise Page", "Design Thinking Page Availability", "Failed");
			}
		} catch (Exception ex) {
			System.out.println("Test Failed, see the reason below.\n" + ex.getMessage());
		}
	}

	@Test(priority = 9, description = "Checking the blog page")
	public void check_blog_page() {
		try {
			webDriver.get("https://medium.com/daemonthinking");
			WebElement verify = webDriver.findElement(By.xpath("//h1[text()='Daemon Thinking']"));
			result = verify.getText().toLowerCase();
			System.out.println(result);
			Assert.assertEquals(result, "daemon thinking");

			if (result.toLowerCase().contains("daemon thinking")) {
				// the Database logic will go here
				connection.createRecord("Blog Page", "Blog Page Availability", "Pass");
			} else {
				// the Database logic will go here
				connection.createRecord("Blog Page", "Blog Page Availability", "Failed");
			}
		} catch (Exception ex) {
			System.out.println("Test Failed, see the reason below.\n" + ex.getMessage());
		}
	}

	@AfterTest(description = "This will kill the driver.")
	public void quite_Browser() {
		// webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			webDriver.quit();
			connection.closeConnection();
		} catch (Exception ex) {
			System.out.println("Failed to stop the driver.  \n" + ex.getMessage());
		}
	}

}
