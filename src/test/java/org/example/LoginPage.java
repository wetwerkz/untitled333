package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }    @FindBy(xpath = "//*[@id=\"loginform\"]/table/tbody/tr[1]/td[2]/input")
    private WebElement loginform;
    @FindBy(xpath = "//*[@id=\"loginform\"]/table/tbody/tr[2]/td[2]/input")
    private WebElement loginPassword;
    @FindBy(xpath = "//*[@id=\"loginform\"]/table/tbody/tr[3]/td[2]/input[2]")
    private WebElement loginSignIn;

    public void inputLogin(String login){
        loginform.sendKeys(login);
    }    public void inputPassword(String password){
        loginPassword.sendKeys(password);    }
    public void clickSignIn(){
        loginSignIn.click();
    }}
