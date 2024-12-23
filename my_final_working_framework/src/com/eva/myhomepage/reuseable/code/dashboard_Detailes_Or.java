package com.eva.myhomepage.reuseable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;
@Getter
public class dashboard_Detailes_Or {

	public dashboard_Detailes_Or(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}

	@CacheLookup
	@FindBy(id = "stufftitle_id")
	private WebElement windowTitleTB;

	@CacheLookup
	@FindBy(id = "seldashbd_id")
	private WebElement dashboardNameDD;

	@CacheLookup
	@FindBy(id = "seldashtype_id")
	private WebElement dashboardTypeDD;

	@CacheLookup
	@FindBy(xpath  = "(//input[@id='savebtn'])[1]")
	private WebElement saveBT;

	@CacheLookup
	@FindBy(xpath =  "(//input[@id='savebtn'])[1]/parent::td/parent::tr/child::td[2]/input[@name='cancel']")
	private WebElement cancelBT;

	@CacheLookup
	@FindBy(xpath = "//td[@id='divHeader']/parent::tr/child::td[2]/a/img[@src='themes/images/close.gif']")
	private WebElement cutBT;
}