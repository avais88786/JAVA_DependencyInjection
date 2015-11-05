/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dependencyinjection.services;

/**
 *
 * @author Avaisuddin
 */
public class FacebookService  implements MessageService {

    @Override
    public boolean sendMessage(String msg, String receipient) {
        //some fancy code to send email
        System.out.println("Email Message sent FB User to "+receipient+" with message="+msg);
        return true;
    }
    
}
