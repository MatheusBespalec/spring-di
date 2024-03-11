package com.matheus.algaworks.springdi.notification;

import com.matheus.algaworks.springdi.model.Client;

public class EmailNotifier implements NotifierInterface {
    private Boolean uppercase = false;
    private String hostServerSmtp;

    public void setUppercase(Boolean uppercase) {
        this.uppercase = uppercase;
    }

    public EmailNotifier(String hostServerSmtp) {
        this.hostServerSmtp = hostServerSmtp;
        System.out.println("Notificador Email");
    }

    @Override
    public void notify(Client client, String message) {
        if (this.uppercase) {
            message = message.toUpperCase();
        }
        System.out.printf("notificando %s via email pelo host %s a mensagem: %s\n", client.getName(), this.hostServerSmtp, message);
    }

    public void start() {
        System.out.println("start");
    }

    public void end() {
        System.out.println("end");
    }
}
