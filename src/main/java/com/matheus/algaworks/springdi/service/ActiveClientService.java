package com.matheus.algaworks.springdi.service;

import com.matheus.algaworks.springdi.event.ClientActivedEvent;
import com.matheus.algaworks.springdi.model.Client;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ActiveClientService {

    @Autowired
    public ApplicationEventPublisher publisher;

    public void active(Client client) {
        client.active();
        publisher.publishEvent(new ClientActivedEvent(client));
    }

    @PostConstruct
    public void start() {
        System.out.println("start email");
    }

    @PreDestroy
    public void end() {
        System.out.println("end email");
    }
}
