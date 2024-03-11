package com.matheus.algaworks.springdi.notification;

import com.matheus.algaworks.springdi.model.Client;
import com.matheus.algaworks.springdi.properties.NotificationWhatsAppProperties;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("celular")
@NotifierType(NotifierCategory.PHONE)
@Component
public class WhatsAppNotifier implements NotifierInterface, InitializingBean, DisposableBean {
    @Autowired
    private NotificationWhatsAppProperties notificationWhatsAppProperties;

    @Override
    public void notify(Client client, String message) {
        System.out.printf(
                "notificando %s a partir do numero %s via Whatszap: %s\n",
                client.getName(),
                notificationWhatsAppProperties.getFrom(),
                message
        );
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("start whats");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("end whats");
    }
}
