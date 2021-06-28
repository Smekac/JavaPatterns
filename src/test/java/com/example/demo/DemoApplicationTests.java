package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class DemoApplicationTests {



	@Test
	void contextLoads() {
		System.out.printf("Testtt !!");

		// Arrange
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions().addArguments("start-fullscreen");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://sr.wikipedia.org/wiki/%D0%9F%D0%B5%D0%BA%D0%B8%D0%BD%D0%B3");

		//Act
		String naslov = driver.findElement(By.className("firstHeading")).getText();
		System.out.printf(naslov);
		// Assert
		Assertions.assertEquals("Пекинг",naslov);
		driver.close();
	}

	@Test
	void reportRightClick() {
		// Arrange
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions().addArguments("start-fullscreen");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("https://sr.wikipedia.org/wiki/%D0%9F%D0%B5%D0%BA%D0%B8%D0%BD%D0%B3");

		//Act
		String repo = "/wiki/%D0%93%D0%BB%D0%B0%D0%B2%D0%BD%D0%B8_%D0%B3%D1%80%D0%B0%D0%B4";

		WebElement element =  driver.findElement(By.linkText(repo));
		element.click();

		System.out.println("Kliknuoo !!!");
		//Assert
		Assertions.assertEquals(repo,driver.getCurrentUrl());
		driver.close();


	}

}
