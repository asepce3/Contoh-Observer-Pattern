/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author zero
 */
public class LoggingListener implements EventListener {

    @Override
    public void update(String type, String filename) {
        System.out.println("Event: [" + type + ", " + filename + "]");
    }
    
}
