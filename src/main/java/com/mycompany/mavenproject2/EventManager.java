/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zero
 */
public class EventManager {
    private final List<EventListener> listeners = new ArrayList<>();
    
    void subscribe(EventListener listener) {
        listeners.add(listener);
    }
    
    void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }
    
    void notify(String type, String filename) {
        listeners.forEach(l -> {
            l.update(type, filename);
        });
    }
}
