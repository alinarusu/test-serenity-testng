package testserenitytestng;

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import testserenitytestng.pages.CalculatorPage;
import testserenitytestng.steps.EndUserSteps;


/**
 * Created by rusu on 3/17/15.
 */

public class CalculatorStory {

    WebDriver driver;
    EndUserSteps endUser;
    static final Logger logger = Logger.getLogger(CalculatorStory.class);



    @BeforeClass
    public void setUpClass() {

        driver = new FirefoxDriver();
        endUser = new EndUserSteps(new Pages(driver));
    }

    @BeforeMethod
    public void setUp() {

        driver.get("http://juliemr.github.io/protractor-demo/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Issue("#CALC-ADD")
    @Test
    public void calculate_add() {

        endUser.enters("1", "2");
        endUser.starts_calculate();
        endUser.enter_add_operation();
        endUser.should_see_the_result("3");

    }

    @Issue("#CALC-DIV")
    @Test
    public void calculate_div() {

        endUser.enters("10", "2");
        endUser.enter_div_operation();
        endUser.starts_calculate();
        endUser.should_see_the_result("5");
    }

    @Issue("#CALC-MOD")
    @Test
    public void calculate_mod() {

        endUser.enters("2", "2");
        endUser.enter_mod_operation();
        endUser.starts_calculate();
        endUser.should_see_the_result("0");
    }

    @Issue("#CALC-MUL")
    @Test
    public void calculate_mul() {

        endUser.enters("2", "2");
        endUser.starts_calculate();
        endUser.enter_mul_operation();
        endUser.should_see_the_result("4");
    }

    @Issue("#CALC-SUB")
    @Test
    public void calculate_sub() {

        endUser.enters("8", "2");
        endUser.enter_sub_operation();
        endUser.starts_calculate();
        endUser.should_see_the_result("6");
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.setLevel(Level.DEBUG);
        logger.debug("Hello, logger!");
    }
}
