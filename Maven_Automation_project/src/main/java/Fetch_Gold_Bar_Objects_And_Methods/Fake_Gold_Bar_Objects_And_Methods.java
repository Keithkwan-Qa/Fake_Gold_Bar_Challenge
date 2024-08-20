package Fetch_Gold_Bar_Objects_And_Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Hello Fetch Team, I hope the week has been well to you so far! Just some notes on what tools and frameworks I chose to tackle this challenge with:
// Selenium WebDriver and Java language
// POM design pattern with the TestNG testing framework.
// Maven for dependencies and project structure.
// Extents report and logger for logging and reporting.
public class Fake_Gold_Bar_Objects_And_Methods {

    //Initialize and create a constructor for WebDriver
    private static WebDriver driver;

    public Fake_Gold_Bar_Objects_And_Methods(WebDriver driver) {
        this.driver = driver;
    }
    /*_______________________________________________________________________________________________
    Below are objects and methods that pertain to the fake gold bar challenge webpage that was provided
    Identifier values pertaining to more than one UI element will have their indexes denoted above */

    /*Locator for reset AND reset button. Although they have the same identifier values, we will create a method to select appropriate index.
    Result is index of 0
    Reset is index of 1 */
    static By resetAndResultButton = By.xpath("(//*[@id='reset'])");

    //Locator for weigh button
    static By weighButton = By.xpath("//*[@id='weigh']");

    //Locator for Weighing
    static By weighing = By.xpath("//*[@class='game-info']");

    //_______________________________________________________________________________________________ LOCATORS FOR NUMBERED GOLD BARS

    //Locator for GOLD BAR 0
    static By goldBar0 = By.xpath("//*[@id='coin_0']");

    //Locator for GOLD BAR 1
    static By goldBar1 = By.xpath("//*[@id='coin_1']");

    //Locator for GOLD BAR 2
    static By goldBar2 = By.xpath("//*[@id='coin_2']");

    //Locator for GOLD BAR 3
    static By goldBar3 = By.xpath("//*[@id='coin_3']");

    //Locator for GOLD BAR 4
    static By goldBar4 = By.xpath("//*[@id='coin_4']");

    //Locator for GOLD BAR 5
    static By goldBar5 = By.xpath("//*[@id='coin_5']");

    //Locator for GOLD BAR 6
    static By goldBar6 = By.xpath("//*[@id='coin_6']");

    //Locator for GOLD BAR 7
    static By goldBar7 = By.xpath("//*[@id='coin_7']");

    //Locator for GOLD BAR 8
    static By goldBar8 = By.xpath("//*[@id='coin_8']");

    //_______________________________________________________________________________________________ LOCATORS FOR LEFT SIDE BOWL SLOTS

    //Locator for LEFT BOWL slot 0
    static By leftBowlSlot0 = By.xpath("//*[@id='left_0']");

    //Locator for LEFT BOWL slot 1
    static By leftBowlSlot1 = By.xpath("//*[@id='left_1']");

    //Locator for LEFT BOWL slot 2
    static By leftBowlSlot2 = By.xpath("//*[@id='left_2']");

    //Locator for LEFT BOWL slot 3
    static By leftBowlSlot3 = By.xpath("//*[@id='left_3']");

    //Locator for LEFT BOWL slot 4
    static By leftBowlSlot4 = By.xpath("//*[@id='left_4']");

    //Locator for LEFT BOWL slot 5
    static By leftBowlSlot5 = By.xpath("//*[@id='left_5']");

    //Locator for LEFT BOWL slot 6
    static By leftBowlSlot6 = By.xpath("//*[@id='left_6']");

    //Locator for LEFT BOWL slot 7
    static By leftBowlSlot7 = By.xpath("//*[@id='left_7']");

    //Locator for LEFT BOWL slot 8
    static By leftBowlSlot8 = By.xpath("//*[@id='left_8']");

    //_______________________________________________________________________________________________ LOCATORS FOR RIGHT SIDE BOWL SLOTS

    //Locator for RIGHT BOWL slot 0
    static By rightBowlSlot0 = By.xpath("//*[@id='right_0']");

    //Locator for RIGHT BOWL slot 1
    static By rightBowlSlot1 = By.xpath("//*[@id='right_1']");

    //Locator for RIGHT BOWL slot 2
    static By rightBowlSlot2 = By.xpath("//*[@id='right_2']");

    //Locator for RIGHT BOWL slot 3
    static By rightBowlSlot3 = By.xpath("//*[@id='right_3']");

    //Locator for RIGHT BOWL slot 4
    static By rightBowlSlot4 = By.xpath("//*[@id='right_4']");

    //Locator for RIGHT BOWL slot 5
    static By rightBowlSlot5 = By.xpath("//*[@id='right_5']");

    //Locator for RIGHT BOWL slot 6
    static By rightBowlSlot6 = By.xpath("//*[@id='right_6']");

    //Locator for RIGHT BOWL slot 7
    static By rightBowlSlot7 = By.xpath("//*[@id='right_7']");

    //Locator for RIGHT BOWL slot 8
    static By rightBowlSlot8 = By.xpath("//*[@id='right_8']");

/*_______________________________________________________________________________________________ METHODS
    Below are methods that we will use to interact with WebElements on the page  */

    // This method will allow us to select between indexes of By locators
    public static WebElement multipleElementToIdentifierSelector(By objects, int index) {
        WebElement selectedElement = driver.findElements(objects).get(index);
        return selectedElement;
    }

    // This method will allow us to capture the result displayed after weighing
    public static String captureResult() {
        String result = multipleElementToIdentifierSelector(resetAndResultButton, 0).getText();
        return result;
    }

    // This method allows us to click on the reset button
    public static void clickOnReset() {
        multipleElementToIdentifierSelector(resetAndResultButton, 1).click();
    }

    // This method allows us to click on the weigh button
    public static void clickOnWeigh() {
        driver.findElement(weighButton).click();
    }

    // This method will capture what was weighed
    public static void captureWeighing() {
        String weighings = driver.findElement(weighing).getText();
        System.out.println(weighings);
    }


    // This method will allow us to capture the message of whether we are correct or incorrect and close the alert
    public static void captureMessage() {
        Alert alert = driver.switchTo().alert();
        String capturedmessage = alert.getText();
        System.out.println(capturedmessage);
        alert.accept();
    }
    //_______________________________________________________________________________________________

    //These method allows us to send numbers to the bowls

    public static void sendKeysToLeftBowlSlot0(String string) {
        driver.findElement(leftBowlSlot0).sendKeys(string);
    }

    public static void sendKeysToLeftBowlSlot1(String string) {
        driver.findElement(leftBowlSlot1).sendKeys(string);
    }

    public static void sendKeysToLeftBowlSlot2(String string) {
        driver.findElement(leftBowlSlot2).sendKeys(string);
    }

    public static void sendKeysToLeftBowlSlot3(String string) {
        driver.findElement(leftBowlSlot3).sendKeys(string);
    }

    public static void sendKeysToLeftBowlSlot4(String string) {
        driver.findElement(leftBowlSlot4).sendKeys(string);
    }

    public static void sendKeysToLeftBowlSlot5(String string) {
        driver.findElement(leftBowlSlot5).sendKeys(string);
    }

    public static void sendKeysToLeftBowlSlot6(String string) {
        driver.findElement(leftBowlSlot6).sendKeys(string);
    }

    public static void sendKeysToLeftBowlSlot7(String string) {
        driver.findElement(leftBowlSlot7).sendKeys(string);
    }

    public static void sendKeysToLeftBowlSlot8(String string) {
        driver.findElement(leftBowlSlot8).sendKeys(string);
    }

    public static void sendKeysToRightBowlSlot0(String string) {
        driver.findElement(rightBowlSlot0).sendKeys(string);
    }

    public static void sendKeysToRightBowlSlot1(String string) {
        driver.findElement(rightBowlSlot1).sendKeys(string);
    }

    public static void sendKeysToRightBowlSlot2(String string) {
        driver.findElement(rightBowlSlot2).sendKeys(string);
    }

    public static void sendKeysToRightBowlSlot3(String string) {
        driver.findElement(rightBowlSlot3).sendKeys(string);
    }

    public static void sendKeysToRightBowlSlot4(String string) {
        driver.findElement(rightBowlSlot4).sendKeys(string);
    }

    public static void sendKeysToRightBowlSlot5(String string) {
        driver.findElement(rightBowlSlot5).sendKeys(string);
    }

    public static void sendKeysToRightBowlSlot6(String string) {
        driver.findElement(rightBowlSlot6).sendKeys(string);
    }

    public static void sendKeysToRightBowlSlot7(String string) {
        driver.findElement(rightBowlSlot7).sendKeys(string);
    }

    public static void sendKeysToRightBowlSlot8(String string) {
        driver.findElement(rightBowlSlot8).sendKeys(string);
    }

    //_______________________________________________________________________________________________
    //These methods will allow us to click on the numbered gold bar that we think is fake
    public static void clickOnGoldBar0() {
        driver.findElement(goldBar0).click();
    }

    public static void clickOnGoldBar1() {
        driver.findElement(goldBar1).click();

    }

    public static void clickOnGoldBar2() {
        driver.findElement(goldBar2).click();

    }

    public static void clickOnGoldBar3() {
        driver.findElement(goldBar3).click();

    }

    public static void clickOnGoldBar4() {
        driver.findElement(goldBar4).click();

    }

    public static void clickOnGoldBar5() {
        driver.findElement(goldBar5).click();

    }

    public static void clickOnGoldBar6() {
        driver.findElement(goldBar6).click();

    }

    public static void clickOnGoldBar7() {
        driver.findElement(goldBar7).click();

    }

    public static void clickOnGoldBar8() {
        driver.findElement(goldBar8).click();

    }
}
