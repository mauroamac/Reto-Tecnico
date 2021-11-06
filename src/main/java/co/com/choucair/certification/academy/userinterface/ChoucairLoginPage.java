package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Join Today')]"));
    public static final Target TXT_FIRSTNAME = Target.the("box for").located(By.id("firstName"));
    public static final Target TXT_LASTNAME = Target.the("box for").located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("box for").located(By.id("email"));
    public static final Target TXT_BIRTHMONTH = Target.the("box for").located(By.cssSelector("select#birthMonth"));
    public static final Target TXT_BIRTHDAY = Target.the("box for").located(By.cssSelector("select#birthDay"));
    public static final Target TXT_BIRTHYEAR = Target.the("box for").located(By.cssSelector("select#birthYear"));
    public static final Target BUTTON_NEXTLOCATION = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(),'Next: Location')]"));
    public static final Target BUTTON_NEXTDEVICE = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Devices')]"));
    public static final Target BUTTON_LASTSTEP = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));
    public static final Target TXT_PWD = Target.the("box for").located(By.id("password"));
    public static final Target TXT_COMFIRMPWD = Target.the("box for").located(By.id("confirmPassword"));
    public static final Target CHX_TERMOFUSE = Target.the("box for").located(By.name("termOfUse"));
    public static final Target CHX_PRIVACYSETTING = Target.the("box for").located(By.name("privacySetting"));
    public static final Target BUTTON_COMPLETE = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Complete Setup')]"));



}
