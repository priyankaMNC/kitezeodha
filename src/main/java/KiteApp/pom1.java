package KiteApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
//Declaration
@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement LOGINBTN;
//step2 initialization
public pom1(WebDriver driver) {
PageFactory.initElements(driver, this);
}
// step3 utilization
public void enterUN(String username) {
	UN.sendKeys(username);
}
public void enterPWD(String password) {
	PWD.sendKeys(password);
}
public void clickLOGINBTN() {
	LOGINBTN.click();
}
}

