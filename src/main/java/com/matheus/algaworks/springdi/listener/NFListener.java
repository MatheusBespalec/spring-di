package com.matheus.algaworks.springdi.listener;

import com.matheus.algaworks.springdi.event.ClientActivedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NFListener {
    @EventListener
    public void clientActivedListener (ClientActivedEvent clientActivedEvent) {
        System.out.println("NF emitida para o cliente " + clientActivedEvent.getClient().getName());
    }
}
