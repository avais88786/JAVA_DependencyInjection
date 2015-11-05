/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dependencyinjection.services;

import com.google.inject.Inject;

/**
 *
 * @author Avaisuddin
 */
public class AbstractMessageService implements JustAnotherInterface{
    private final MessageService messageService;
    
    @Inject
    public AbstractMessageService(@Facebook MessageService messageService){
        this.messageService = messageService;
        
    }

    @Override
    public boolean sendMessage(String msg, String reci) {
       return messageService.sendMessage(msg, reci);
    }
    
}
