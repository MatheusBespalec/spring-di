package com.matheus.algaworks.springdi.notification;

import com.matheus.algaworks.springdi.model.Client;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Qualifier("celular")
@NotifierType(NotifierCategory.PHONE)
@Component
public class SMSNotifier implements NotifierInterface {
    @Value("${notification.sms.from}")
    private String fromNumber;
    public SMSNotifier() {
        System.out.println("Notificador SMS");
    }

    @Override
    public void notify(Client client, String message) {
        System.out.printf("notificando %s a partir do numero %s via SMS: %s\n", client.getName(), this.fromNumber, message);
    }
}
