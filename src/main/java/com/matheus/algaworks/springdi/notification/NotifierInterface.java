package com.matheus.algaworks.springdi.notification;

import com.matheus.algaworks.springdi.model.Client;

public interface NotifierInterface {
    void notify(Client client, String message);
}
