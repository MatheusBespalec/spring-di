package com.matheus.algaworks.springdi.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notification.whatsapp")
public class NotificationWhatsAppProperties {
    private String from = "11222223333";

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }
}
