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
public class Main {

    public static void main(String[] args) {
       Editor editor = new Editor();
       
       LoggingListener logging = new LoggingListener();
       editor.getEvent().subscribe(logging);
       
       editor.openFile("a.txt");
       editor.saveFile();
    }
}
