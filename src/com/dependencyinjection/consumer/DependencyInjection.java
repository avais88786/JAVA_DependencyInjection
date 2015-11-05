/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dependencyinjection.consumer;

import com.dependencyinjection.injector.AppInjector;
import com.dependencyinjection.services.AbstractMessageService;
import com.dependencyinjection.services.JustAnotherInterface;
import com.dependencyinjection.services.MessageService;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

/**
 *
 * @author Avaisuddin
 */
public class DependencyInjection {

    private MessageService service;
    private static final String FB_SERVICE_ANNOTATION = "FB";
    private static final String EMAIL_SERVICE_ANNOTATION = "Email";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());
        
        //DependencyInjection clas = injector.getInstance(DependencyInjection.class);
        //DependencyInjection clas = injector.getInstance(Key.get(DependencyInjection.class, Names.named("FB")));
        //clas.sendMessage("avais", "avais 2");
        
        MessageService fbClass = injector.getInstance(Key.get(MessageService.class, Names.named(FB_SERVICE_ANNOTATION)));
        MessageService msClass = injector.getInstance(Key.get(MessageService.class, Names.named(EMAIL_SERVICE_ANNOTATION)));
        
        fbClass.sendMessage("avais", "avais 1");
        msClass.sendMessage("avais", "avais 2");
        
        JustAnotherInterface serv = injector.getInstance(JustAnotherInterface.class);
        
        serv.sendMessage("Another Interface", "Hi there");
        
    }

    /**
     * @param service the service to set
     */
    @Inject
    public void setService(MessageService service) {
        this.service = service;
    }
    
    public boolean sendMessage(String msg, String rec){
        //some business logic here
        return service.sendMessage(msg, rec);
    }
    
}
