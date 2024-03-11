package com.matheus.algaworks.springdi.listener;

import com.matheus.algaworks.springdi.event.ClientActivedEvent;
import com.matheus.algaworks.springdi.notification.NotifierCategory;
import com.matheus.algaworks.springdi.notification.NotifierType;
import com.matheus.algaworks.springdi.notification.NotifierInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NotificationListener {
    @NotifierType(NotifierCategory.PHONE)
    @Autowired
    private List<NotifierInterface> notifiers;

    @EventListener
    public void clientActivedListener(ClientActivedEvent clientActivedEvent) {
        this.notifiers.forEach(notifier -> notifier.notify(clientActivedEvent.getClient(), "Sua conta esta ativa"));
    }

    @EventListener
    public void testListener(ClientActivedEvent clientActivedEvent) {
        System.out.println("test " + clientActivedEvent);
    }
}
