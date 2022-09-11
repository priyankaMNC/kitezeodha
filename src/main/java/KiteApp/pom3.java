package KiteApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom3 {
	//Declaration
@FindBy(xpath = "//span[text()='Orders']")private WebElement ELEMENT;
	
	//initiliazation
	public pom3(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//implementation
	public void verifyELEMENT() {
		String expELE = "Orders";
		String actELE = ELEMENT.getText();
		if (expELE.equals(actELE)){
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
}
}