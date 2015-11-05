/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dependencyinjection.services;

import com.google.inject.BindingAnnotation;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 *
 * @author Avaisuddin
 */
@BindingAnnotation @Retention(RUNTIME)
public @interface Email {
    
}
