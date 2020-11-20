package org.sample;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Facebook extends LibGlobal{
	@Test(groups="E2E")
	private void email() {
	getDriver();
	enterUrl("https://www.facebook.com/");
	WebElement txtEmail=driver.findElement(By.id("email"));
	txtEmail.sendKeys("abc@gmail.com");
	}
	@Test(groups="E2E")
	private void password() {
	WebElement txtPwd=driver.findElement(By.id("pass"));
	txtPwd.sendKeys("1234");
	}
	@Test(groups="Reg")
	private void loginBtn() {
	driver.findElement(By.id("u_0_b")).click();
	}
}



