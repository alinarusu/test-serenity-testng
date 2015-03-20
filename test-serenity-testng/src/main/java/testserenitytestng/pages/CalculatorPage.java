package testserenitytestng.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://juliemr.github.io/")

public class CalculatorPage extends PageObject {

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    public WebElementFacade firstOperand() {
        return find(By.xpath("//input[@ng-model='first']"));
    }

    public WebElementFacade secondOperand() {
        return find(By.xpath("//input[@ng-model='second']"));
    }

    public WebElementFacade goButton() {
        return find(By.id("gobutton"));
    }

    public WebElement select() {
        return find(By.tagName("select"));
    }

    public WebElement result(){
        return find(By.className("ng-binding"));
    }

    public void enter_operands(String firstOp, String secondOp) {
        firstOperand().type(firstOp);
        secondOperand().type(secondOp);
    }

    public void select_operator_add() {

        select().findElement(By.xpath("//option[@value='ADDITION']")).click();
    }

    public void select_operator_div() {

        select().findElement(By.xpath("//option[@value='DIVISION']")).click();
    }

    public void select_operator_mod() {

        select().findElement(By.xpath("//option[@value='MODULO']")).click();
    }

    public void select_operator_mul() {

        select().findElement(By.xpath("//option[@value='MULTIPLICATION']")).click();
    }

    public void select_operator_sub() {

        select().findElement(By.xpath("//option[@value='SUBTRACTION']")).click();
    }

    public void calculate() {
        goButton().click();
    }

    public String getResult() {
        return result().getText();
    }

}