/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dependencyinjection.injector;

import com.dependencyinjection.services.AbstractMessageService;
import com.dependencyinjection.services.Email;
import com.dependencyinjection.services.EmailService;
import com.dependencyinjection.services.Facebook;
import com.dependencyinjection.services.FacebookService;
import com.dependencyinjection.services.JustAnotherInterface;
import com.dependencyinjection.services.MessageService;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 *
 * @author Avaisuddin
 */
public class AppInjector extends AbstractModule{

    @Override
    protected void configure() {
        bind(MessageService.class).annotatedWith(Names.named("Email")).to(EmailService.class);
        bind(MessageService.class).annotatedWith(Names.named("FB")).to(FacebookService.class);
        
        
        bind(MessageService.class).annotatedWith(Email.class).to(EmailService.class);
        bind(MessageService.class).annotatedWith(Facebook.class).to(FacebookService.class);
        
        bind(JustAnotherInterface.class).to(AbstractMessageService.class);
    }
    
}
