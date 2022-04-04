package com.udemy.automation.application.components.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import org.springframework.beans.factory.annotation.Autowired;

public class TheEmailInputExists implements Question<Boolean> {

    @Autowired
    private LoginComponent component;

    @Override
    public Boolean answeredBy(Actor actor) {
        return Presence.of(component.getEmailInput()).viewedBy(actor).resolve();
    }
}
