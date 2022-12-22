package com.amazon.stepdefenition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.objectrepository.AmazonMobilePage;
import com.amazon.resources.commonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonMobiles extends commonActions {

	commonActions ca = new commonActions();
	AmazonMobilePage mp = new AmazonMobilePage();
	
	@Given("launch amazon")
	public void launch_amazon() throws IOException {
		System.out.println("browser launched");
	}

	@Then("login to amazon")
	public void login_to_amazon() throws InterruptedException {
		Thread.sleep(3000);
		a.click(mp.getSignIn());
		Thread.sleep(2000); 
		a.sendKeys(mp.getLoginuser(), "s.rameshkumar1988@gmail.com");
		a.click(mp.getMailclick());
		Thread.sleep(2000);
		a.sendKeys(mp.getLoginpass(), "Ramesh");
		a.click(mp.getPassclick());
		
	}

	@Given("search the mobile")
	public void search_the_mobile() throws Throwable {
		Thread.sleep(2000);
		ca.inserttext(mp.getSearchbox(),"samsung mobiles");
		a.click(mp.getMobilesearch());
		Thread.sleep(5000);
	}

	@When("select the first mobile")
	public void select_the_first_mobile() {
		a.click(mp.getSelectmobile());
	}

	@Then("search the mobile by using oneD list")
	public void search_the_mobile_by_using_oneD_list(io.cucumber.datatable.DataTable dataTable) throws InterruptedException{
			Thread.sleep(3000);
			List <String> datas = dataTable.asList();
			  String input = datas.get(1);
			  ca.inserttext(mp.getSearchbox(),"samsung mobiles");
				a.click(mp.getMobilesearch());
				Thread.sleep(5000);	  
		
	}
	@Then("select the buynow")
	public void select_the_buynow() {
		ca.windowsHandling();
		ca.clickElement(mp.getSelectbuynow());
	}

	@Then("validate the selected mobile name")
	public void validate_the_selected_mobile_name() {
		

	}
	
}
