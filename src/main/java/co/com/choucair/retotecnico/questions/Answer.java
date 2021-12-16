package co.com.choucair.retotecnico.questions;

import co.com.choucair.retotecnico.userinterface.AutomationDemoSiteRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String verifyStep = Text.of(AutomationDemoSiteRegister.VERIFY_STEP).viewedBy(actor).asString();
        if (question.equals(verifyStep)){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
