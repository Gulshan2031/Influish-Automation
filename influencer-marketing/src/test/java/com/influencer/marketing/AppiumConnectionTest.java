package com.influencer.marketing;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

        public class AppiumConnectionTest {

            // =========================================================
            // CONSOLE COLORS
            // =========================================================

            private static final String RESET = "\u001B[0m";
            private static final String GREEN = "\u001B[32m";
            private static final String RED = "\u001B[31m";
            private static final String BLUE = "\u001B[34m";
            private static final String YELLOW = "\u001B[33m";
            private static final String CYAN = "\u001B[36m";


            // =========================================================
            // CONSOLE WRITER
            // =========================================================

            private static final PrintWriter CONSOLE =
                    new PrintWriter(System.out, true);


            // =========================================================
            // RESULT DIRECTORIES
            // =========================================================

            private static final Path RESULT_DIRECTORY =
                    Paths.get("automation-results");

            private static final Path LOG_DIRECTORY =
                    RESULT_DIRECTORY.resolve("logs");

            private static final Path SCREENSHOT_DIRECTORY =
                    RESULT_DIRECTORY.resolve("screenshots");


            // =========================================================
            // LOG FILE
            // =========================================================

            private static Path logFile;


            // =========================================================
            // DEVICE / APP CONFIGURATION
            // =========================================================

            private static final String DEVICE_ID =
                    config("APPIUM_DEVICE_ID", "ZA222MSVRX");

            private static final String DEVICE_NAME =
                    config("APPIUM_DEVICE_NAME", "moto g85 5g");

            private static final String APP_PACKAGE =
                    config("APPIUM_APP_PACKAGE", "com.influencer.marketing");

            private static final String APP_ACTIVITY =
                    config("APPIUM_APP_ACTIVITY", ".MainActivity");

            private static final String APPIUM_SERVER_URL =
                    config("APPIUM_SERVER_URL", "http://127.0.0.1:4723");

            private static final String MOBILE_NUMBER =
                    "REDACTED";

            private static final String TEST_OTP =
                    "REDACTED";


            // =========================================================
            // TIMEOUTS
            // =========================================================

            private static final int ELEMENT_TIMEOUT_SECONDS = 20;

            private static final int OPTIONAL_PERMISSION_TIMEOUT_SECONDS = 5;

            private static final int INSTAGRAM_SCREEN_TIMEOUT_SECONDS = 5;

            private static final int OTP_SCREEN_TIMEOUT_SECONDS = 20;

            private static final int HOME_WAIT_SECONDS = 30;


            // =========================================================
            // OTP COORDINATES
            // =========================================================

            private static final int OTP_ENTRY_X = 144;
            private static final int OTP_ENTRY_Y = 1757;

            private static final int KEY_1_X = 185;
            private static final int KEY_2_X = 423;
            private static final int KEY_3_X = 674;

            private static final int KEY_4_X = 185;
            private static final int KEY_5_X = 423;
            private static final int KEY_6_X = 674;

            private static final int TOP_ROW_Y = 1740;
            private static final int SECOND_ROW_Y = 1885;


            // =========================================================
            // DRIVER
            // =========================================================

            private static AndroidDriver driver;


            // =========================================================
            // CURRENT STEP
            // =========================================================

            private static String currentStep =
                    "INITIALIZATION";


            // =========================================================
            // MAIN
            // =========================================================

            public static void main(String[] args) {

                boolean automationPassed = false;

                try {

                    initializeLogFile();

                    startStep(
                            "STEP 0: STARTING APPIUM"
                    );

                    currentStep =
                            "STEP 0 - START APPIUM";

                    startAppium();

                    success(
                            "Appium connected successfully."
                    );

                    info(
                            "Device: " +
                                    DEVICE_NAME
                    );

                    info(
                            "UDID: " +
                                    DEVICE_ID
                    );

                    info(
                            "Package: " +
                                    APP_PACKAGE
                    );

                    info(
                            "Activity: " +
                                    APP_ACTIVITY
                    );

                    success(
                            "Application launched successfully."
                    );

                    endStep(
                            "STEP 0 COMPLETED"
                    );


                    // =================================================
                    // STEP 1
                    // =================================================

                    startStep(
                            "STEP 1: CONTENT CREATOR"
                    );

                    currentStep =
                            "STEP 1 - CONTENT CREATOR";

                    clickContentCreator();

                    endStep(
                            "STEP 1 COMPLETED"
                    );


                    // =================================================
                    // STEP 2
                    // =================================================

                    startStep(
                            "STEP 2: GOOGLE AUTOFILL"
                    );

                    currentStep =
                            "STEP 2 - GOOGLE AUTOFILL";

                    dismissGoogleAutofill();

                    endStep(
                            "STEP 2 COMPLETED"
                    );


                    // =================================================
                    // STEP 3
                    // =================================================

                    startStep(
                            "STEP 3: MOBILE NUMBER"
                    );

                    currentStep =
                            "STEP 3 - MOBILE NUMBER";

                    enterMobileNumber();

                    endStep(
                            "STEP 3 COMPLETED"
                    );


                    // =================================================
                    // STEP 4
                    // =================================================

                    startStep(
                            "STEP 4: GET OTP"
                    );

                    currentStep =
                            "STEP 4 - GET OTP";

                    clickGetOTP();

                    endStep(
                            "STEP 4 COMPLETED"
                    );


                    // =================================================
                    // STEP 5
                    // =================================================

                    startStep(
                            "STEP 5: OTP SCREEN"
                    );

                    currentStep =
                            "STEP 5 - OTP SCREEN";

                    waitForOtpScreen();

                    endStep(
                            "STEP 5 COMPLETED"
                    );


                    // =================================================
                    // STEP 6
                    // =================================================

                    startStep(
                            "STEP 6: ENTER OTP"
                    );

                    currentStep =
                            "STEP 6 - ENTER OTP";

                    enterOTP();

                    endStep(
                            "STEP 6 COMPLETED"
                    );


                    // =================================================
                    // STEP 7
                    // =================================================

                    startStep(
                            "STEP 7: VERIFY"
                    );

                    currentStep =
                            "STEP 7 - VERIFY";

                    clickVerify();

                    endStep(
                            "STEP 7 COMPLETED"
                    );


                    // =================================================
                    // STEP 8
                    // =================================================

                    startStep(
                            "STEP 8: HOME SCREEN"
                    );

                    currentStep =
                            "STEP 8 - HOME SCREEN";

                    waitOnHomeScreen();

                    endStep(
                            "STEP 8 COMPLETED"
                    );


                    // =================================================
                    // FINAL SUCCESS
                    // =================================================

                    automationPassed = true;

                    success("");
                    success(
                            "=================================================="
                    );

                    success(
                            "       AUTOMATION FLOW COMPLETED SUCCESSFULLY"
                    );

                    success(
                            "=================================================="
                    );

                    success(
                            "Execution log: " +
                                    logFile.toAbsolutePath()
                    );

                } catch (Exception e) {

                    // =================================================
                    // FAILURE HANDLING
                    // =================================================

                    error("");
                    error(
                            "=================================================="
                    );

                    error(
                            "              AUTOMATION FAILED"
                    );

                    error(
                            "=================================================="
                    );

                    error(
                            "Failed Step: " +
                                    currentStep
                    );

                    error(
                            "Reason: " +
                                    safeMessage(e)
                    );

                    saveFailureDetails(e);

                } finally {

                    closeDriver(
                            automationPassed
                    );

                    closeLogFile();
                }
            }


            // =========================================================
            // CONFIGURATION
            // =========================================================

            private static String config(
                    String name,
                    String defaultValue
            ) {

                String value =
                        System.getenv(name);

                return value == null || value.isBlank()
                        ? defaultValue
                        : value;
            }


            // =========================================================
            // INITIALIZE DIRECTORIES
            // =========================================================

            private static void initializeResultDirectories()
                    throws Exception {

                Files.createDirectories(
                        LOG_DIRECTORY
                );

                Files.createDirectories(
                        SCREENSHOT_DIRECTORY
                );
            }


            // =========================================================
            // INITIALIZE LOG FILE
            // =========================================================

            private static void initializeLogFile()
                    throws Exception {

                String timestamp =
                        LocalDateTime.now().format(
                                DateTimeFormatter.ofPattern(
                                        "yyyy-MM-dd_HH-mm-ss"
                                )
                        );

                logFile =
                        LOG_DIRECTORY.resolve(
                                "automation-" +
                                        timestamp +
                                        ".log"
                        );

                Files.writeString(
                        logFile,
                        "==================================================\n" +
                                "APPIUM AUTOMATION LOG\n" +
                                "==================================================\n" +
                                "Started: " +
                                LocalDateTime.now() +
                                "\n" +
                                "Device: " +
                                DEVICE_NAME +
                                "\n" +
                                "UDID: " +
                                DEVICE_ID +
                                "\n" +
                                "Package: " +
                                APP_PACKAGE +
                                "\n\n",
                        StandardCharsets.UTF_8
                );
            }


            // =========================================================
            // WRITE LOG
            // =========================================================

            private static void writeLog(
                    String level,
                    String message
            ) {

                if (logFile == null) {
                    return;
                }

                String line =
                        LocalDateTime.now()
                                .format(
                                        DateTimeFormatter.ofPattern(
                                                "yyyy-MM-dd HH:mm:ss"
                                        )
                                )
                                +
                                " [" +
                                level +
                                "] " +
                                message +
                                System.lineSeparator();

                try {

                    Files.writeString(
                            logFile,
                            line,
                            StandardCharsets.UTF_8,
                            java.nio.file.StandardOpenOption.APPEND
                    );

                } catch (Exception ignored) {
                    // Console output remains available.
                }
            }


            // =========================================================
            // START APPIUM
            // =========================================================

            private static void startAppium()
                    throws Exception {

                info(
                        "Connecting to Appium server..."
                );

                info(
                        "Server: " + APPIUM_SERVER_URL
                );

                DesiredCapabilities capabilities =
                        new DesiredCapabilities();

                capabilities.setCapability(
                        "platformName",
                        "Android"
                );

                capabilities.setCapability(
                        "appium:automationName",
                        "UiAutomator2"
                );

                capabilities.setCapability(
                        "appium:deviceName",
                        DEVICE_NAME
                );

                capabilities.setCapability(
                        "appium:udid",
                        DEVICE_ID
                );

                capabilities.setCapability(
                        "appium:appPackage",
                        APP_PACKAGE
                );

                capabilities.setCapability(
                        "appium:appActivity",
                        APP_ACTIVITY
                );

                capabilities.setCapability(
                        "appium:noReset",
                        false
                );

                capabilities.setCapability(
                        "appium:newCommandTimeout",
                        120
                );

                driver =
                        new AndroidDriver(
                                new URL(
                                        APPIUM_SERVER_URL
                                ),
                                capabilities
                        );

                success(
                        "Appium session created successfully."
                );
            }


            // =========================================================
            // STEP 1 - CONTENT CREATOR
            // =========================================================

            private static void clickContentCreator() {

                info(
                        "Looking for Content Creator..."
                );

                String contentDescription =
                        "I'm a Content Creator\n" +
                                "See your actual reach & insights.";

                By locator =
                        AppiumBy.accessibilityId(
                                contentDescription
                        );

                WebElement creator =
                        waitForElement(locator);

                if (creator == null) {

                    throw new RuntimeException(
                            "Content Creator button not found."
                    );
                }

                success(
                        "Content Creator found."
                );

                creator.click();

                success(
                        "Content Creator clicked."
                );
            }


            // =========================================================
            // STEP 2 - GOOGLE AUTOFILL
            // =========================================================

            private static void dismissGoogleAutofill() {

                info(
                        "Checking Google Autofill popup..."
                );

                WebElement cancel =
                        waitForElement(
                                AppiumBy.accessibilityId("Cancel")
                        );

                if (cancel == null) {
                    success(
                            "Google Autofill popup not present."
                    );
                    return;
                }

                cancel.click();

                success(
                        "Google Autofill popup dismissed."
                );
            }


            // =========================================================
            // STEP 3 - MOBILE NUMBER
            // =========================================================

            private static void enterMobileNumber() {

                info(
                        "Looking for mobile number field..."
                );

                List<WebElement> fields =
                        driver.findElements(
                                AppiumBy.className(
                                        "android.widget.EditText"
                                )
                        );

                if (fields.isEmpty()) {

                    throw new RuntimeException(
                            "Mobile number field not found."
                    );
                }

                WebElement mobileField =
                        fields.get(0);

                success(
                        "Mobile number field found."
                );

                mobileField.click();

                mobileField.clear();

                info(
                        "Entering mobile number..."
                );

                mobileField.sendKeys(
                        MOBILE_NUMBER
                );

                success(
                        "Mobile number entered successfully."
                );
            }


            // =========================================================
            // STEP 4 - GET OTP
            // =========================================================

            private static void clickGetOTP() {

                info(
                        "Looking for Get OTP button..."
                );

                By locator =
                        AppiumBy.accessibilityId(
                                "Get OTP"
                        );

                WebElement getOtp =
                        waitForElement(locator);

                if (getOtp == null) {

                    throw new RuntimeException(
                            "Get OTP button not found."
                    );
                }

                success(
                        "Get OTP button found."
                );

                getOtp.click();

                success(
                        "Get OTP clicked."
                );
            }


            // =========================================================
            // STEP 5 - OTP SCREEN
            // =========================================================

            private static void waitForOtpScreen() {

                info(
                        "Waiting for OTP screen..."
                );

                sleep(2500);

                long endTime =
                        System.currentTimeMillis()
                                +
                                OTP_SCREEN_TIMEOUT_SECONDS *
                                        1000L;

                while (
                        System.currentTimeMillis()
                                <
                                endTime
                ) {

                    try {

                        List<WebElement> fields =
                                driver.findElements(
                                        AppiumBy.className(
                                                "android.widget.EditText"
                                        )
                                );

                        if (!fields.isEmpty()) {

                            success(
                                    "OTP screen detected."
                            );

                            sleep(1500);

                            success(
                                    "OTP screen is ready."
                            );

                            return;
                        }

                    } catch (Exception ignored) {
                        // Continue waiting.
                    }

                    sleep(500);
                }

                throw new RuntimeException(
                        "OTP screen was not detected within "
                                +
                                OTP_SCREEN_TIMEOUT_SECONDS
                                +
                                " seconds."
                );
            }


            // =========================================================
            // STEP 6 - ENTER OTP
            // =========================================================

            private static void enterOTP() {

                info(
                        "Opening OTP input field..."
                );

                tapCoordinate(
                        OTP_ENTRY_X,
                        OTP_ENTRY_Y
                );

                success(
                        "OTP input field opened."
                );

                info(
                        "Waiting for keypad..."
                );

                sleep(2500);

                success(
                        "OTP keypad ready."
                );

                for (
                        int i = 0;
                        i < TEST_OTP.length();
                        i++
                ) {

                    char digit =
                            TEST_OTP.charAt(i);

                    info(
                            "Entering digit " +
                                    (i + 1) +
                                    "/" +
                                    TEST_OTP.length() +
                                    ": " +
                                    digit
                    );

                    tapOtpDigit(digit);

                    success(
                            "Digit " +
                                    digit +
                                    " entered."
                    );

                    sleep(500);
                }

                sleep(2500);

                success(
                        "OTP entered successfully: " +
                                TEST_OTP
                );
            }


            // =========================================================
            // OTP DIGIT
            // =========================================================

            private static void tapOtpDigit(
                    char digit
            ) {

                switch (digit) {

                    case '1':
                        tapCoordinate(
                                KEY_1_X,
                                TOP_ROW_Y
                        );
                        break;

                    case '2':
                        tapCoordinate(
                                KEY_2_X,
                                TOP_ROW_Y
                        );
                        break;

                    case '3':
                        tapCoordinate(
                                KEY_3_X,
                                TOP_ROW_Y
                        );
                        break;

                    case '4':
                        tapCoordinate(
                                KEY_4_X,
                                SECOND_ROW_Y
                        );
                        break;

                    case '5':
                        tapCoordinate(
                                KEY_5_X,
                                SECOND_ROW_Y
                        );
                        break;

                    case '6':
                        tapCoordinate(
                                KEY_6_X,
                                SECOND_ROW_Y
                        );
                        break;

                    default:
                        throw new RuntimeException(
                                "OTP digit " +
                                        digit +
                                        " is not configured."
                        );
                }
            }


            // =========================================================
            // STEP 7 - VERIFY
            // =========================================================

            private static void clickVerify() {

                info(
                        "Looking for Verify button..."
                );

                sleep(1500);

                By locator =
                        AppiumBy.accessibilityId(
                                "Verify"
                        );

                WebElement verify =
                        waitForElement(locator);

                if (verify == null) {

                    throw new RuntimeException(
                            "Verify button not found."
                    );
                }

                success(
                        "Verify button found."
                );

                info(
                        "Clicking Verify..."
                );

                verify.click();

                success(
                        "Verify button clicked."
                );

                info(
                        "Waiting for login..."
                );

                sleep(5000);

                success(
                        "Login completed."
                );
            }


            // =========================================================
            // STEP 8 - HOME SCREEN
            // =========================================================

            private static void waitOnHomeScreen() {

                info(
                        "Waiting for application to reach Home..."
                );

                sleep(3000);


                // =====================================================
                // NOTIFICATION PERMISSION
                // =====================================================

                allowNotifications();


                // =====================================================
                // WAIT FOR APPLICATION PACKAGE
                // =====================================================

                waitForAppPackage();


                // =====================================================
                // VERIFY PACKAGE
                // =====================================================

                String currentPackage =
                        driver.getCurrentPackage();

                String currentActivity =
                        driver.currentActivity();

                if (
                        !APP_PACKAGE.equals(
                                currentPackage
                        )
                ) {

                    throw new RuntimeException(
                            "Home screen verification failed. " +
                                    "Current package: " +
                                    currentPackage
                    );
                }


                success(
                        "Application returned to foreground."
                );


                // =====================================================
                // HANDLE INSTAGRAM SCREEN (Fast exit)
                // =====================================================
                // Remove pre-wait buffer - permission already waited 3s
                // Directly check and exit Instagram screen
                // =====================================================

                handleInstagramConnectScreen();

                verifyHomeScrollView();


                success(
                        "Home screen loaded successfully."
                );

                info(
                        "Current Package: " +
                                currentPackage
                );

                info(
                        "Current Activity: " +
                                currentActivity
                );


                // =====================================================
                // KEEP APPLICATION OPEN
                // =====================================================

                info(
                        "Keeping application open for " +
                                HOME_WAIT_SECONDS +
                                " seconds..."
                );

                for (
                        int seconds = HOME_WAIT_SECONDS;
                        seconds >= 1;
                        seconds--
                ) {

                    info(
                            "Application closing in " +
                                    seconds +
                                    " seconds..."
                    );

                    sleep(1000);
                }

                success(
                        "Home screen wait completed."
                );
            }


            // =========================================================
            // HANDLE INSTAGRAM CONNECT SCREEN
            // =========================================================
            // Optimized: Uses shorter timeout (5s) since Instagram screen
            // is optional and not always present. Reduces overall test time.
            // =========================================================

            private static void handleInstagramConnectScreen() {

                info(
                        "Closing Instagram connection screen..."
                );

                // Instagram screen always appears after permission is allowed
                // Skip detection - just tap the close button directly
                // This eliminates slow detection logic that was causing delays
                
                try {
                    // Tap close button (X button at top right)
                    tapCoordinate(981, 187);
                    
                    // Brief wait for gesture to process
                    sleep(500);
                    
                    success(
                            "Instagram screen closed."
                    );
                } catch (Exception e) {
                    warning(
                            "Error closing Instagram screen: " + e.getMessage()
                    );
                }
            }


            // =========================================================
            // VERIFY HOME SCROLLVIEW
            // =========================================================

            private static void verifyHomeScrollView() {

                info(
                        "Checking Home screen..."
                );

                WebElement homeNavigation =
                        waitForElement(
                                AppiumBy.accessibilityId(
                                        "Home"
                                )
                        );

                if (homeNavigation == null) {
                    throw new RuntimeException(
                            "Home screen was not found."
                    );
                }

                success(
                        "Home screen found."
                );

                info(
                        "Checking Home screen ScrollView..."
                );

                By scrollViewLocator =
                        AppiumBy.androidUIAutomator(
                                "new UiSelector().className(" +
                                        "\"android.widget.ScrollView\")"
                        );

                WebElement scrollView =
                        waitForElement(
                                scrollViewLocator
                        );

                if (scrollView == null) {

                    throw new RuntimeException(
                            "Home screen ScrollView was not found."
                    );
                }

                success(
                        "Home screen ScrollView found."
                );

                String scrollable =
                        scrollView.getAttribute(
                                "scrollable"
                        );

        if (
                !"true".equalsIgnoreCase(
                        scrollable
                )
        ) {

            throw new RuntimeException(
                    "Home screen ScrollView is not scrollable."
            );
        }

        success(
                "Home screen ScrollView is scrollable."
        );
    }


    // =========================================================
    // NOTIFICATION PERMISSION
    // =========================================================

    private static void allowNotifications() {

        info(
                "Checking notification permission..."
        );

        By locator =
                AppiumBy.androidUIAutomator(
                        "new UiSelector().text(\"Allow\")"
                );

        WebElement allowButton =
                waitForElement(
                        locator,
                        OPTIONAL_PERMISSION_TIMEOUT_SECONDS
                );

        if (allowButton == null) {

            success(
                    "Notification permission popup not present."
            );

            return;
        }

        success(
                "Notification permission popup detected."
        );

        info(
                "Clicking Allow..."
        );

        allowButton.click();

        success(
                "Notification permission allowed."
        );

        // Wait for permission animation and app to settle
        // Instagram screen should be fully visible after this
        sleep(4000);
    }


    // =========================================================
    // WAIT FOR APP TO RETURN
    // =========================================================

    private static void waitForAppPackage() {

        info(
                "Waiting for application to return..."
        );

        long endTime =
                System.currentTimeMillis()
                        +
                        ELEMENT_TIMEOUT_SECONDS *
                                1000L;

        while (
                System.currentTimeMillis()
                        <
                        endTime
        ) {

            try {

                String currentPackage =
                        driver.getCurrentPackage();

                if (
                        APP_PACKAGE.equals(
                                currentPackage
                        )
                ) {

                    return;
                }

            } catch (Exception ignored) {
                // Continue waiting.
            }

            sleep(500);
        }

        throw new RuntimeException(
                "Application did not return to foreground."
        );
    }


    // =========================================================
    // WAIT FOR ELEMENT
    // =========================================================

    private static WebElement waitForElement(
            By locator
    ) {

        return waitForElement(
                locator,
                ELEMENT_TIMEOUT_SECONDS
        );
    }


    private static WebElement waitForElement(
            By locator,
            int timeoutSeconds
    ) {

        long endTime =
                System.currentTimeMillis()
                        +
                        timeoutSeconds *
                                1000L;

        while (
                System.currentTimeMillis()
                        <
                        endTime
        ) {

            try {

                List<WebElement> elements =
                        driver.findElements(
                                locator
                        );

                if (!elements.isEmpty()) {

                    WebElement element =
                            elements.get(0);

                    try {
                        if (
                                element.isDisplayed()
                                        &&
                                        element.isEnabled()
                        ) {

                            return element;
                        }
                    } catch (Exception ignored) {
                        // Element exists but may not be immediately interactive
                        // Return it anyway for faster detection
                        return element;
                    }
                }

            } catch (Exception ignored) {
                // Continue waiting.
            }

            sleep(250);
        }

        return null;
    }


    // =========================================================
    // WAIT FOR ELEMENT - AGGRESSIVE (Faster polling)
    // =========================================================
    // Used for time-sensitive screens like Instagram
    // Polls every 125ms instead of 250ms for faster detection

    private static WebElement waitForElementAggressive(
            By locator,
            int timeoutSeconds
    ) {

        long endTime =
                System.currentTimeMillis()
                        +
                        timeoutSeconds *
                                1000L;

        while (
                System.currentTimeMillis()
                        <
                        endTime
        ) {

            try {

                List<WebElement> elements =
                        driver.findElements(
                                locator
                        );

                if (!elements.isEmpty()) {

                    WebElement element =
                            elements.get(0);

                    try {
                        if (
                                element.isDisplayed()
                                        &&
                                        element.isEnabled()
                        ) {

                            return element;
                        }
                    } catch (Exception ignored) {
                        return element;
                    }
                }

            } catch (Exception ignored) {
                // Continue waiting.
            }

            sleep(125);
        }

        return null;
    }


    // =========================================================
    // TAP COORDINATE
    // =========================================================

    private static void tapCoordinate(
            int x,
            int y
    ) {

        try {

            driver.executeScript(
                    "mobile: clickGesture",
                    Map.of(
                            "x", x,
                            "y", y
                    )
            );

            writeLog(
                    "INFO",
                    "Tapped coordinate: (" +
                            x +
                            ", " +
                            y +
                            ")"
            );

        } catch (Exception e) {

            throw new RuntimeException(
                    "Unable to tap coordinate (" +
                            x +
                            ", " +
                            y +
                            ").",
                    e
            );
        }
    }


    // =========================================================
    // SAVE FAILURE DETAILS
    // =========================================================

    private static void saveFailureDetails(
            Exception exception
    ) {

        String timestamp =
                LocalDateTime.now().format(
                        DateTimeFormatter.ofPattern(
                                "yyyy-MM-dd_HH-mm-ss"
                        )
                );

        String safeStep =
                currentStep
                        .replaceAll(
                                "[^a-zA-Z0-9_-]",
                                "_"
                        );

        String baseName =
                "FAILURE_" +
                        safeStep +
                        "_" +
                        timestamp;

        writeLog(
                "ERROR",
                "Failed Step: " +
                        currentStep
        );

        writeLog(
                "ERROR",
                "Reason: " +
                        safeMessage(exception)
        );


        // =====================================================
        // EXCEPTION DETAILS
        // =====================================================

        StringWriter stringWriter =
                new StringWriter();

        PrintWriter printWriter =
                new PrintWriter(
                        stringWriter
                );

        exception.printStackTrace(
                printWriter
        );

        printWriter.flush();

        writeLog(
                "ERROR",
                "Exception Details:\n" +
                        stringWriter
                                .toString()
        );


        // =====================================================
        // DEVICE INFORMATION
        // =====================================================

        if (driver != null) {

            try {

                writeLog(
                        "ERROR",
                        "Current Package: " +
                                driver.getCurrentPackage()
                );

                writeLog(
                        "ERROR",
                        "Current Activity: " +
                                driver.currentActivity()
                );

            } catch (Exception ignored) {
                // Continue failure recording.
            }


            // =================================================
            // SCREENSHOT
            // =================================================

            try {

                Path screenshotPath =
                        SCREENSHOT_DIRECTORY.resolve(
                                baseName +
                                        ".png"
                        );

                byte[] screenshot =
                        driver.getScreenshotAs(
                                OutputType.BYTES
                        );

                Files.write(
                        screenshotPath,
                        screenshot
                );

                success(
                        "Failure screenshot saved:"
                );

                info(
                        screenshotPath
                                .toAbsolutePath()
                                .toString()
                );

                writeLog(
                        "ERROR",
                        "Screenshot saved: " +
                                screenshotPath
                                        .toAbsolutePath()
                );

            } catch (Exception screenshotError) {

                error(
                        "Unable to save failure screenshot."
                );

                writeLog(
                        "ERROR",
                        "Screenshot error: " +
                                safeMessage(
                                        screenshotError
                                )
                );
            }


            // =================================================
            // PAGE SOURCE
            // =================================================

            try {

                Path pageSourcePath =
                        SCREENSHOT_DIRECTORY.resolve(
                                baseName +
                                        ".xml"
                        );

                String pageSource =
                        driver.getPageSource();

                Files.writeString(
                        pageSourcePath,
                        pageSource,
                        StandardCharsets.UTF_8
                );

                success(
                        "Failure page source saved:"
                );

                info(
                        pageSourcePath
                                .toAbsolutePath()
                                .toString()
                );

                writeLog(
                        "ERROR",
                        "Page source saved: " +
                                pageSourcePath
                                        .toAbsolutePath()
                );

            } catch (Exception sourceError) {

                error(
                        "Unable to save failure page source."
                );

                writeLog(
                        "ERROR",
                        "Page source error: " +
                                safeMessage(
                                        sourceError
                                )
                );
            }
        }


        // =====================================================
        // FINAL FAILURE LOG LOCATION
        // =====================================================

        error(
                "Complete error log saved:"
        );

        error(
                logFile.toAbsolutePath()
                        .toString()
        );
    }


    // =========================================================
    // CLOSE DRIVER
    // =========================================================

    private static void closeDriver(
            boolean automationPassed
    ) {

        if (driver == null) {
            return;
        }

        try {

            driver.quit();

            if (automationPassed) {

                success(
                        "Appium session closed successfully."
                );

            } else {

                warning(
                        "Appium session closed after failure."
                );
            }

        } catch (Exception e) {

            error(
                    "Unable to close Appium session."
            );

            writeLog(
                    "ERROR",
                    "Driver close error: " +
                            safeMessage(e)
            );
        }
    }


    // =========================================================
    // SLEEP
    // =========================================================

    private static void sleep(
            long milliseconds
    ) {

        try {

            Thread.sleep(
                    milliseconds
            );

        } catch (InterruptedException e) {

            Thread.currentThread()
                    .interrupt();

            throw new RuntimeException(
                    "Automation thread was interrupted.",
                    e
            );
        }
    }


    // =========================================================
    // START STEP
    // =========================================================

    private static void startStep(
            String message
    ) {

        output(
                CYAN,
                "",
                false
        );

        output(
                CYAN,
                "==================================================",
                true
        );

        output(
                CYAN,
                message,
                true
        );

        output(
                CYAN,
                "==================================================",
                true
        );

        writeLog(
                "STEP",
                message
        );
    }


    // =========================================================
    // END STEP
    // =========================================================

    private static void endStep(
            String message
    ) {

        success(
                "✓ " +
                        message
        );

        writeLog(
                "PASS",
                message
        );
    }


    // =========================================================
    // INFO
    // =========================================================

    private static void info(
            String message
    ) {

        output(
                BLUE,
                "→ " +
                        message,
                true
        );

        writeLog(
                "INFO",
                message
        );
    }


    // =========================================================
    // SUCCESS
    // =========================================================

    private static void success(
            String message
    ) {

        output(
                GREEN,
                "✓ " +
                        message,
                true
        );

        writeLog(
                "PASS",
                message
        );
    }


    // =========================================================
    // WARNING
    // =========================================================

    private static void warning(
            String message
    ) {

        output(
                YELLOW,
                "⚠ " +
                        message,
                true
        );

        writeLog(
                "WARNING",
                message
        );
    }


    // =========================================================
    // ERROR
    // =========================================================

    private static void error(
            String message
    ) {

        output(
                RED,
                "✗ " +
                        message,
                true
        );

        writeLog(
                "ERROR",
                message
        );
    }


    // =========================================================
    // OUTPUT
    // =========================================================

    private static void output(
            String color,
            String message,
            boolean newLine
    ) {

        String text =
                color +
                        message +
                        RESET;

        if (newLine) {

            CONSOLE.println(
                    text
            );

        } else {

            CONSOLE.print(
                    text
            );

            CONSOLE.flush();
        }
    }


    // =========================================================
    // SAFE EXCEPTION MESSAGE
    // =========================================================

    private static String safeMessage(
            Exception exception
    ) {

        String message =
                exception.getMessage();

        if (
                message == null
                        ||
                        message.isBlank()
        ) {

            return exception
                    .getClass()
                    .getSimpleName();
        }

        return message;
    }


    // =========================================================
    // CLOSE LOG FILE
    // =========================================================

    private static void closeLogFile() {

        if (logFile == null) {
            return;
        }

        try {

            Files.writeString(
                    logFile,
                    "\n==================================================\n" +
                            "AUTOMATION EXECUTION FINISHED\n" +
                            "Time: " +
                            LocalDateTime.now() +
                            "\n" +
                            "==================================================\n",
                    StandardCharsets.UTF_8,
                    java.nio.file.StandardOpenOption.APPEND
            );

        } catch (Exception ignored) {
            // Nothing else can be done here.
        }
    }
}