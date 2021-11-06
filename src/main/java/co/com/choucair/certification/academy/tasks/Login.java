package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Login implements Task {
    public static Performable onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("Mauricio").into(ChoucairLoginPage.TXT_FIRSTNAME),
                Enter.theValue("Anaya").into(ChoucairLoginPage.TXT_LASTNAME),
                Enter.theValue("mao1095@hotmail.es").into(ChoucairLoginPage.TXT_EMAIL),
                SelectFromOptions.byVisibleText("November").from(ChoucairLoginPage.TXT_BIRTHMONTH),
                SelectFromOptions.byVisibleText("6").from(ChoucairLoginPage.TXT_BIRTHDAY),
                SelectFromOptions.byVisibleText("1989").from(ChoucairLoginPage.TXT_BIRTHYEAR),
                Click.on(ChoucairLoginPage.BUTTON_NEXTLOCATION),
                Click.on(ChoucairLoginPage.BUTTON_NEXTDEVICE),
                Click.on(ChoucairLoginPage.BUTTON_LASTSTEP),
                Enter.theValue("Andres1095*").into(ChoucairLoginPage.TXT_PWD),
                Enter.theValue("Andres1095*").into(ChoucairLoginPage.TXT_COMFIRMPWD),
                Click.on(ChoucairLoginPage.CHX_TERMOFUSE),
                Click.on(ChoucairLoginPage.CHX_PRIVACYSETTING),
                Click.on(ChoucairLoginPage.BUTTON_COMPLETE)
                );
    }
}
