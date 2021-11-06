package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterface.ChoucairUtesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUtes implements Task {
    private ChoucairUtesPage ChoucairUtesPage;

    public static OpenUtes thePage() {
        return Tasks.instrumented(OpenUtes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(ChoucairUtesPage));
    }
}
