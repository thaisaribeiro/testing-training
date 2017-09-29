package com.wipro.testing.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.springframework.stereotype.Component;

public class SearchPage extends AbstractPage{
	
	@FindBy(id = "lst-ib")
	private WebElement searchField;
	
	@FindBy(name = "btnK") 
	private WebElement searchBtn;
	
	@FindBy(partialLinkText = "https://stackoverflow.com/questions/36882225/junit-runner-class-unable-to-locate-step-definition-file")
	private WebElement searchUrl;

	public SearchPage() {
		super();
		PageFactory.initElements(getDriver(), this);
	}
	
	public void typeSearchText(String searchText){
		searchField.sendKeys(searchText);
	}
	
	public void clickSearchButton() {
		searchBtn.click();
	}
	
	public void enterFirstLink() {
		searchUrl.sendKeys();
	}
	
	public void navigateToPage2 (){
		getDriver().get("https://stackoverflow.com/questions/36882225/junit-runner-class-unable-to-locate-step-definition-file");
	}	
	
	public void navigateToPage (){
		getDriver().get("https://www.google.com");
	}

	
}


