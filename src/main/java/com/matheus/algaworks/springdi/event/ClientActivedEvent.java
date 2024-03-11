package com.matheus.algaworks.springdi.event;

import com.matheus.algaworks.springdi.model.Client;

public class ClientActivedEvent {
    private Client client;

    public ClientActivedEvent(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
