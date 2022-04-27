import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Scenario2 extends Reusable_Annotations {

    @Test()
    public void Scenario2() throws InterruptedException {
        logger.log(LogStatus.INFO, "Navigate to Automation Practice");
        driver.navigate().to("http://automationpractice.com");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@id='block_top_menu']/ul/li[3]/a",logger,"T-Shirts");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,600)");
        Reusable_Actions_Logger.mouseHover(driver,"//*[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']",logger,"MouseHover");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@title='Add to cart']",logger,"Proceed to checkout");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@title='Proceed to checkout']",logger,"Proceed to checkout");
        Reusable_Actions_Logger.clickMethod(driver,"//*[@title='Delete']",logger,"Delete");

        //open : http://automationpractice.com
        //Tap T-Shirts
        //ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line
        //Tap Add to Cart
        //Proceed to Checkout
        //Verify the count and delete the Item
    }
}
