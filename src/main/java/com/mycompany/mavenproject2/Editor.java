/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zero
 */
public class Editor {
    private EventManager event;
    private File file;

    public EventManager getEvent() {
        return event;
    }
    
    public Editor() {
        event = new EventManager();
    }
    
    void openFile(String path) {
        this.file = new File(path);
        event.notify("Open", file.getName());
    }
    
    void saveFile() {
        try {
            file.createNewFile();
            event.notify("Creat", file.getName());
        } catch (IOException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
