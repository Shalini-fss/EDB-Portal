package com.MOFplugin;
import com.MOF.constants.Plugin_URL;
import com.MOF.constants.Plugin_payload;
import com.MOFapi.MOFapi;
import com.MOFutility.ExcelUtilities;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.lang.reflect.Method;
import java.time.Duration;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TimeoutException;

//import static com.sun.jna.ELFAnalyser.ArmAeabiAttributesTag.File;

public class MOF_Plugin extends Screenshot {


    private WebDriver driver;
    private ExtentTest test;
    private static ExtentReports reports;
    FileWriter file;
    // Setup Extent Report once before all tests
    @BeforeSuite
    public static void setupClass() {
        Date date = new Date();
        String fileName = date.toString().replace(":", "_").replace(" ", "_") + ".html";
        String directory = "D:\\Desktop backup\\Desktop backup\\Automation\\API\\Plugin Report\\";

        // Create directory if it doesn't exist
        File dir = new File(directory);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String reportPath = directory + fileName;
        reports = new ExtentReports(reportPath);
        System.out.println("Report initialized: " + reportPath);
    }


    // Setup WebDriver before each test
    @BeforeMethod
    public void setup(Method method) {
        test = reports.startTest(method.getName());
        WebDriverManager.chromedriver().clearResolutionCache().driverVersion("137.0.7151.69").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Browser opened.");
        test.log(LogStatus.INFO, "Browser session started.");
    }


    // Test 2: Enter payload and submit form
    @Test(enabled = true, priority = 1)
    public void SuccessTxn() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
            submitButton.click();
            driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
            driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
            validmonth();
            year();
            driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
            WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
            proceedButton.click();
            Thread.sleep(3000);
        try {
            // Capture screenshot for verification
            String successTxnScreenshot = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");

            if (successTxnScreenshot != null) {
                // Convert screenshot to Base64 for embedding in Extent report
                String base64Image = encodeImageToBase64(successTxnScreenshot);
                String imgTag = "<img src='data:image/png;base64," + base64Image + "' alt='Transaction Screenshot' width='500' height='200' />";

                // Log successful transaction with screenshot
                test.log(LogStatus.PASS, "Transaction successful. " + imgTag);
            } else {
                test.log(LogStatus.FAIL, "Transaction failed.");
            }
        } catch (Exception e) {
            System.out.println("Error detected on the page. Closing driver.");
        }
    }




    @Test(enabled = true, priority = 2)
    public void Invalid_username() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Invalidusername_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();
        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
        Thread.sleep(3000);
        try {
            // Capture screenshot for verification
            String successTxnScreenshot = Screenshot.captureScreenShot(driver, "Invalid username");

            if (successTxnScreenshot != null) {
                // Convert screenshot to Base64 for embedding in Extent report
                String base64Image = encodeImageToBase64(successTxnScreenshot);
                String imgTag = "<img src='data:image/png;base64," + base64Image + "' alt='Transaction Screenshot' width='500' height='200' />";

                // Log successful transaction with screenshot
                test.log(LogStatus.PASS, "Transaction successful. " + imgTag);
            } else {
                test.log(LogStatus.FAIL, "Transaction failed.");
            }
        } catch (Exception e) {
            System.out.println("Error detected on the page. Closing driver.");
        }
    }

    @Test(enabled = true, priority = 3)
    public void Blank_username() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Blankusername_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();
        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
        Thread.sleep(3000);
        try {
            // Capture screenshot for verification
            String successTxnScreenshot = Screenshot.captureScreenShot(driver, "Blank Username");

            if (successTxnScreenshot != null) {
                // Convert screenshot to Base64 for embedding in Extent report
                String base64Image = encodeImageToBase64(successTxnScreenshot);
                String imgTag = "<img src='data:image/png;base64," + base64Image + "' alt='Transaction Screenshot' width='500' height='200' />";

                // Log successful transaction with screenshot
                test.log(LogStatus.PASS, "Transaction successful. " + imgTag);
            } else {
                test.log(LogStatus.FAIL, "Transaction failed.");
            }
        } catch (Exception e) {
            System.out.println("Error detected on the page. Closing driver.");
        }
    }

    @Test(enabled = true, priority = 4)
    public void invalid_password() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.InvalidPassword_Payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();
        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
        Thread.sleep(3000);
        try {
            // Capture screenshot for verification
            String successTxnScreenshot = Screenshot.captureScreenShot(driver, "Invalid Password");

            if (successTxnScreenshot != null) {
                // Convert screenshot to Base64 for embedding in Extent report
                String base64Image = encodeImageToBase64(successTxnScreenshot);
                String imgTag = "<img src='data:image/png;base64," + base64Image + "' alt='Transaction Screenshot' width='500' height='200' />";

                // Log successful transaction with screenshot
                test.log(LogStatus.PASS, "Transaction successful. " + imgTag);
            } else {
                test.log(LogStatus.FAIL, "Transaction failed.");
            }
        } catch (Exception e) {
            System.out.println("Error detected on the page. Closing driver.");
        }
    }

    @Test(enabled = true, priority = 5)
    public void Blank_password() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.BlankPassword_Payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();
        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
        Thread.sleep(3000);
        try {
            // Capture screenshot for verification
            String successTxnScreenshot = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");

            if (successTxnScreenshot != null) {
                // Convert screenshot to Base64 for embedding in Extent report
                String base64Image = encodeImageToBase64(successTxnScreenshot);
                String imgTag = "<img src='data:image/png;base64," + base64Image + "' alt='Transaction Screenshot' width='500' height='200' />";

                // Log successful transaction with screenshot
                test.log(LogStatus.PASS, "Transaction successful. " + imgTag);
            } else {
                test.log(LogStatus.FAIL, "Transaction failed.");
            }
        } catch (Exception e) {
            System.out.println("Error detected on the page. Closing driver.");
        }
    }

    @Test(enabled = true, priority = 7)
    public void processBlankOrderNumberTransaction() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Enter JSON payload
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Blankordernumber_Payload);
        test.log(LogStatus.PASS, "Entered payload in 'jsonRequest' textarea.");

        // Click Process button
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");

        try {
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
            System.out.println("Show price details page reached");
            submitButton.click();

            // Enter card details
            driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
            driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
            validmonth();
            year();
            driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);

            // Proceed with transaction
            WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
            proceedButton.click();
        } catch (Exception e) {
            System.out.println("Error page spotted, quitting driver.");
            driver.quit();
            return;
        }

        try {
            // Capture screenshot for verification
            String successTxnScreenshot = Screenshot.captureScreenShot(driver, "Invalid Ordernumber");

            if (successTxnScreenshot != null) {
                // Convert screenshot to Base64 for embedding in Extent report
                String base64Image = encodeImageToBase64(successTxnScreenshot);
                String imgTag = "<img src='data:image/png;base64," + base64Image + "' alt='Transaction Screenshot' width='500' height='200' />";

                // Log successful transaction with screenshot
                test.log(LogStatus.PASS, "Transaction successful. " + imgTag);
            } else {
                test.log(LogStatus.FAIL, "Transaction failed.");
            }
        } catch (Exception e) {
            System.out.println("Error detected on the page. Closing driver.");
        }
    }


    @Test(enabled = true, priority = 7)
    public void Blank_OrderNumber() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Enter JSON payload
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Blankordernumber_Payload);
        test.log(LogStatus.PASS, "Entered payload in 'jsonRequest' textarea.");

        // Click Process button
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");

        try {
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
            System.out.println("Show price details page reached");
            submitButton.click();

            // Enter card details
            driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
            driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
            validmonth();
            year();
            driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);

            // Proceed with transaction
            WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
            proceedButton.click();
        } catch (Exception e) {
            System.out.println("Error page spotted, quitting driver.");
            driver.quit();
            return;
        }

        try {
            // Capture screenshot for verification
            String successTxnScreenshot = Screenshot.captureScreenShot(driver, "Invalid Ordernumber");

            if (successTxnScreenshot != null) {
                // Convert screenshot to Base64 for embedding in Extent report
                String base64Image = encodeImageToBase64(successTxnScreenshot);
                String imgTag = "<img src='data:image/png;base64," + base64Image + "' alt='Transaction Screenshot' width='500' height='200' />";

                // Log successful transaction with screenshot
                test.log(LogStatus.PASS, "Transaction successful. " + imgTag);
            } else {
                test.log(LogStatus.FAIL, "Transaction failed.");
            }
        } catch (Exception e) {
            System.out.println("Error detected on the page. Closing driver.");
        }
    }





    @Test(enabled = true, priority = 8)
    public void Minordernumber() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Minordernumber_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();
        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
        Thread.sleep(3000);
        try {
            // Capture screenshot for verification
            String successTxnScreenshot = Screenshot.captureScreenShot(driver, "Minimum ordernumber");

            if (successTxnScreenshot != null) {
                // Convert screenshot to Base64 for embedding in Extent report
                String base64Image = encodeImageToBase64(successTxnScreenshot);
                String imgTag = "<img src='data:image/png;base64," + base64Image + "' alt='Transaction Screenshot' width='500' height='200' />";

                // Log successful transaction with screenshot
                test.log(LogStatus.PASS, "Transaction successful. " + imgTag);
            } else {
                test.log(LogStatus.FAIL, "Transaction failed.");
            }
        } catch (Exception e) {
            System.out.println("Error detected on the page. Closing driver.");
        }
    }
    @Test(enabled = true, priority = 9)
    public void maxordernumber() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Maxordernumber_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 10)
    public void specialcharordernumber() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.specialchar_ordernumber_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 11)
    public void Alphanumericoardernumber() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Alphanumeric_ordernumber_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();
        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
        Thread.sleep(3000);
        try {
            // Capture screenshot for verification
            String successTxnScreenshot = Screenshot.captureScreenShot(driver, "Alphanumeric ordernumber");

            if (successTxnScreenshot != null) {
                // Convert screenshot to Base64 for embedding in Extent report
                String base64Image = encodeImageToBase64(successTxnScreenshot);
                String imgTag = "<img src='data:image/png;base64," + base64Image + "' alt='Transaction Screenshot' width='500' height='200' />";

                // Log successful transaction with screenshot
                test.log(LogStatus.PASS, "Transaction successful. " + imgTag);
            } else {
                test.log(LogStatus.FAIL, "Transaction failed.");
            }
        } catch (Exception e) {
            System.out.println("Error detected on the page. Closing driver.");
        }
    }

    @Test(enabled = true, priority = 12)
    public void decimalordernumber() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Decimalordernumber_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 13)
    public void invalidlanguage() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Invalidlanguage_Payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Entered Invalid language . Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();
        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 14)
    public void Blanklanguage() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Blanklanguage_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();
        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
        Thread.sleep(3000);
        try {
            // Capture screenshot for verification
            String successTxnScreenshot = Screenshot.captureScreenShot(driver, "Blank language");

            if (successTxnScreenshot != null) {
                // Convert screenshot to Base64 for embedding in Extent report
                String base64Image = encodeImageToBase64(successTxnScreenshot);
                String imgTag = "<img src='data:image/png;base64," + base64Image + "' alt='Transaction Screenshot' width='500' height='200' />";

                // Log successful transaction with screenshot
                test.log(LogStatus.PASS, "Transaction successful. " + imgTag);
            } else {
                test.log(LogStatus.FAIL, "Transaction failed.");
            }
        } catch (Exception e) {
            System.out.println("Error detected on the page. Closing driver.");
        }
    }


    @Test(enabled = true, priority = 15)
    public void InvalidServicecode() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Invalidservicecode_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }


    @Test(enabled = true, priority = 16)
    public void Blankservicecode() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Blankservicecode_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 17)
    public void Minservicecode() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Minservicecode_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }


    @Test(enabled = true, priority = 18)
    public void maxservicecode() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Maxservicecode_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 19)
    public void Alphanumericservicecode() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Alphanumericservicecode_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 20)
    public void Decimalservicecode() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Decimalservicecode_Payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 21)
    public void Invalidquantity() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Invalidquantity_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 22)
    public void blankquantity() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Blankquantity_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 23)
    public void minquantity() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Minquantity_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 24)
    public void Maxquantity() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Maxquantity_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 25)
    public void Specialcharquantity() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Specialcharquantity_Payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 26)
    public void Alphanumericquantity() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.alphanumericquantity_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 27)
    public void Decimalquantity() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Decimalquantity_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 28)
    public void Invalidamount() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Invalidamount_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 29)
    public void blankamount() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Blankamount_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 30)
    public void minamount() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Minamount_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 31)
    public void maxamount() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Maxamount_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 32)
    public void Specialcharamount() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Specialcharamount_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }
    @Test(enabled = true, priority = 33)
    public void alphanumericamount() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.alphanumericamount_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 34)
    public void decimalamount() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.Decimalamount_payload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 35)
    public void invalidcardname() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.InValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 36)
    public void blankcardname() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.BlankcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 37)
    public void specialcharcardname1() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.SpecialCharactercardname);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 38)
    public void invalidcardnumber() throws Exception {
        driver.get(Plugin_URL.url);
        Thread.sleep(3000); // Wait for the page to fully load
    WebElement jsonRequestTextarea = driver.findElement(By.name("jsonRequest"));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Entered payload into 'jsonRequest' textarea.");
        driver.findElement(By.name("process")).click();
        test.log(LogStatus.PASS, "Clicked the 'Process' button.");
    String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        driver.findElement(By.name("sbmt")).click();
        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.InValidcardnumber);
    validmonth();
    year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(2000);

        if (screenshotPath != null) {
        System.out.println("Screenshot saved: " + screenshotPath);
        test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
    } else {
        System.out.println("Screenshot failed.");
        test.log(LogStatus.FAIL, "Screenshot capture failed.");
    }}

    @Test(enabled = true, priority = 39)
    public void blankcardnumber() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.BlankcardNumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 40)
    public void Specialcharcardnumber() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.SpecialCharactercardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 41)
    public void invalidcvv() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.InValidcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }
    @Test(enabled = true, priority = 42)
    public void blankcvv() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Blankcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 43)
    public void Decimalcvv() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Decimalcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 44)
    public void specialcharcvv() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.SpecialCharactercvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 45)
    public void invalidmonth() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        incorrectmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 46)
    public void blankdmonth() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        Blankmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 47)
    public void Invalidyear() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        InvalidYear();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 48)
    public void Blankyear() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.requestPayload);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement errorElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Whitelabel Error Page']")));
            System.out.println("Error page detected. Quitting driver.");
            driver.quit();
            return; // Exit the method
        } catch (TimeoutException e) {
            System.out.println("Error page not detected. Proceeding...");
        }
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();

        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        blankyear1();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
    }

    @Test(enabled = true, priority = 49)
        public void InvalidChannel() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.invalidchannel);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
            submitButton.click();
            driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
            driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
            validmonth();
            year();
            driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
            WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
            proceedButton.click();

        } catch (TimeoutException e) {
            System.out.println("Error page detected. Quitting driver.");
        }
    }

    @Test(enabled = true, priority = 50)
    public void BlankChannel() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.blankchannel);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
            submitButton.click();
            driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
            driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
            validmonth();
            year();
            driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
            WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
            proceedButton.click();

        } catch (TimeoutException e) {
            System.out.println("Error page detected. Quitting driver.");
        }
    }
    @Test(enabled = true, priority = 51)
    public void Invalid_governmentServices() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.invalidgovernmentServices);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
            submitButton.click();
            driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
            driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
            validmonth();
            year();
            driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
            WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
            proceedButton.click();

        } catch (TimeoutException e) {
            System.out.println("Error page detected. Quitting driver.");
        }
    }
    @Test(enabled = true, priority = 52)
    public void Blank_governmentServices() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.blankgovernmentServices);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
            submitButton.click();
            driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
            driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
            validmonth();
            year();
            driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
            WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
            proceedButton.click();

        } catch (TimeoutException e) {
            System.out.println("Error page detected. Quitting driver.");
        }
    }
    @Test(enabled = true, priority = 53)
    public void Invalid_addTransactionFeesOnTop() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.invalidaddTransactionFeesOnTop);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
            submitButton.click();
            driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
            driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
            validmonth();
            year();
            driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
            WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
            proceedButton.click();

        } catch (TimeoutException e) {
            System.out.println("Error page detected. Quitting driver.");
        }
    }

    @Test(enabled = true, priority = 54)
    public void Invalid_Currency() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.invalidcurrency);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
            submitButton.click();
            driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
            driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
            validmonth();
            year();
            driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
            WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
            proceedButton.click();

        } catch (TimeoutException e) {
            System.out.println("Error page detected. Quitting driver.");
        }
    }

    @Test(enabled = true, priority = 55)
    public void Blank_Currency() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.blankcurrency);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
            submitButton.click();
            driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
            driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
            validmonth();
            year();
            driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
            WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
            proceedButton.click();

        } catch (TimeoutException e) {
            System.out.println("Error page detected. Quitting driver.");
        }
    }
    @Test(enabled = true, priority = 56)
    public void blank_addTransactionFeesOnTop() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.blankaddTransactionFeesOnTop);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
            submitButton.click();
            driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
            driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
            validmonth();
            year();
            driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
            WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
            proceedButton.click();

        } catch (TimeoutException e) {
            System.out.println("Error page detected. Quitting driver.");
        }
    }

   
    @Test(enabled = true, priority = 57)
    public void Invalid_merchantSiteURL() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.invalidmerchantSideURL);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
        submitButton.click();
        driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
        driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
        validmonth();
        year();
        driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
        WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
        proceedButton.click();
        Thread.sleep(3000);
        try {
            // Capture screenshot for verification
            String successTxnScreenshot = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");

            if (successTxnScreenshot != null) {
                // Convert screenshot to Base64 for embedding in Extent report
                String base64Image = encodeImageToBase64(successTxnScreenshot);
                String imgTag = "<img src='data:image/png;base64," + base64Image + "' alt='Transaction Screenshot' width='500' height='200' />";

                // Log successful transaction with screenshot
                test.log(LogStatus.PASS, "Transaction successful. " + imgTag);
            } else {
                test.log(LogStatus.FAIL, "Transaction failed.");
            }
        } catch (Exception e) {
            System.out.println("Error detected on the page. Closing driver.");
        }
    }

    @Test(enabled = true, priority = 58)
    public void Blank_merchantSiteURL() throws Exception {
        driver.get(Plugin_URL.url);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement jsonRequestTextarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jsonRequest")));
        jsonRequestTextarea.clear();
        jsonRequestTextarea.sendKeys(Plugin_payload.blankmerchantSideURL);
        test.log(LogStatus.PASS, "Payload entered in 'jsonRequest' textarea.");
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("process")));
        processButton.click();
        test.log(LogStatus.PASS, "Clicked 'Process' button.");
        String screenshotPath = Screenshot.captureScreenShot(driver, "Verifying_Loaded_Page");
        if (screenshotPath != null) {
            test.log(LogStatus.PASS, "Screenshot captured: " + screenshotPath);
        } else {
            test.log(LogStatus.FAIL, "Screenshot capture failed.");
        }
        try {
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("sbmt")));
            submitButton.click();
            driver.findElement(By.name("cardholderName")).sendKeys(Plugin_URL.ValidcardName);
            driver.findElement(By.name("cardNumber")).sendKeys(Plugin_URL.Validcardnumber);
            validmonth();
            year();
            driver.findElement(By.name("cardCvv")).sendKeys(Plugin_URL.Validcvv);
            WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("proceed")));
            proceedButton.click();

        } catch (TimeoutException e) {
            System.out.println("Error page detected. Quitting driver.");
        }
    }


    public void validmonth() throws Exception{
        Select Month = new Select(driver.findElement(By.name("ExpMonthSelect")));
        Month.selectByVisibleText(Plugin_URL.Validmonth);
        Thread.sleep(3000);}


    public void incorrectmonth() throws Exception{
        Select Invalidmonth = new Select(driver.findElement(By.name("ExpMonthSelect")));
        Invalidmonth.selectByVisibleText(Plugin_URL.InValidmonth);
        Thread.sleep(3000);}


    public void Blankmonth() throws Exception{
        Select BlankMonth = new Select(driver.findElement(By.name("ExpMonthSelect")));
        BlankMonth.selectByVisibleText(Plugin_URL.Blankmonth);
        Thread.sleep(3000);}



public void year() throws Exception{
    Select Year = new Select(driver.findElement(By.name("ExpYearSelect")));
    Year.selectByVisibleText(Plugin_URL.Validyear);
    Thread.sleep(3000);
}

    public void InvalidYear() throws Exception{
        Select invalidYear = new Select(driver.findElement(By.name("ExpYearSelect")));
        invalidYear.selectByVisibleText(Plugin_URL.InValidyear);
        Thread.sleep(3000);
    }


    public void blankyear1() throws Exception{
        Select blankYear = new Select(driver.findElement(By.name("ExpYearSelect")));
        blankYear.selectByVisibleText(Plugin_URL.Blankyear);
        Thread.sleep(3000);
    }
    
    @AfterSuite
    public void SaveResponseFileclose() throws Exception {
        if (test != null) {
            reports.endTest(test);
        }

        // Flush the report only if it's not null
        if (reports != null) {
            reports.flush();
            System.out.println("Extent Report flushed.");
        }

        // Close file writer if it's not null
        if (file != null) {
            file.flush();
            file.close();
            System.out.println("File flushed and closed.");
        }
    }
    
 // Main method to run tests
    /*public static void main(String[] args) throws Exception {
        MOF_Plugin ma = new MOF_Plugin();


        ma.SuccessTxn();
        ma.Invalid_username();
        ma.Blank_username();
        ma.invalid_password();
        ma.Blank_password();
        ma.processBlankOrderNumberTransaction();
        ma.Blank_OrderNumber();
        ma.Minordernumber();
        ma.maxordernumber();

        ma.specialcharordernumber();
        ma.Alphanumericoardernumber();
        ma.decimalordernumber();
        ma.invalidlanguage();
        ma.Blanklanguage();
        ma.InvalidServicecode();
        ma.Blankservicecode();
        ma.Minservicecode();

        ma.maxservicecode();
        ma.Alphanumericservicecode();
        ma.Decimalservicecode();
        ma.Invalidquantity();
        ma.blankquantity();
        ma.minquantity();
        ma.Maxquantity();
        ma.Specialcharquantity();

        ma.Alphanumericquantity();
        ma.Decimalquantity();
        ma.Invalidamount();
        ma.blankamount();
        ma.minamount();
        ma.maxamount();
        ma.Specialcharamount();

        ma.alphanumericamount();

        ma.decimalamount();
        ma.invalidcardname();
        ma.blankcardname();
        ma.specialcharcardname1();
        ma.invalidcardnumber();
        ma.blankcardnumber();
        ma.Specialcharcardnumber();


        ma.invalidcvv();
        ma.blankcvv();
        ma.Decimalcvv();
        ma.specialcharcvv();
        ma.invalidmonth();
        ma.blankdmonth();
        ma.Invalidyear();
        ma.Blankyear();

        ma.InvalidChannel();
        ma.BlankChannel();
        ma.Invalid_governmentServices();
        ma.Blank_governmentServices();
        ma.Invalid_addTransactionFeesOnTop();
        ma.Invalid_Currency();
        ma.Blank_Currency();
        ma.blank_addTransactionFeesOnTop();

        ma.Invalid_merchantSiteURL();
        ma.Blank_merchantSiteURL();
        ma.validmonth();
        ma.incorrectmonth();
        ma.Blankmonth();
        ma.year();
        ma.InvalidYear();
        ma.blankyear1();


      
        ma.SaveResponseFileclose();

    }
    //quit browser
    @AfterMethod
    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }*/

    // Tear down after each test
// Remove driver.quit() from @AfterTest since it's already done in @AfterMethod
    @AfterTest
    public void tearDown() {
        // Remove driver.quit() here
        test.log(LogStatus.PASS, ExcelUtilities.testCaseDesritpioncolumnvalue);
        reports.endTest(test);
        reports.flush();  // You can keep flush here if you want intermediate flushes
    }}

    




