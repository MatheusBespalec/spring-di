package com.matheus.algaworks.springdi.notification;

import com.matheus.algaworks.springdi.model.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Qualifier("celular")
@Profile("dev")
@NotifierType(NotifierCategory.PHONE)
@Component
public class SMSNotifierMock implements NotifierInterface {
    public SMSNotifierMock() {
        System.out.println("Notificador SMS Mock");
    }

    @Override
    public void notify(Client client, String message) {
        System.out.printf("MOCK: notificando %s via SMS: %s\n", client.getName(), message);
    }
}
