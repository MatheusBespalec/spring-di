package com.matheus.algaworks.springdi.config;

import com.matheus.algaworks.springdi.notification.NotifierCategory;
import com.matheus.algaworks.springdi.notification.NotifierType;
import com.matheus.algaworks.springdi.notification.EmailNotifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {
    @NotifierType(NotifierCategory.MAIL)
    @Bean(initMethod = "start", destroyMethod = "end")
    public EmailNotifier notifyEmail() {
        return new EmailNotifier("smtp.test.com.br");
    }
}
