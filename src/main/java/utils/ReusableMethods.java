package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class ReusableMethods extends BasePage {

	public void enhancedClick(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		actions.moveToElement(element).click(element).build().perform();
	}

	public void enhancedSendKeys(WebElement element, CharSequence... charSequences) {
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		actions.moveToElement(element).sendKeys(element, charSequences).build().perform();
	}

}
