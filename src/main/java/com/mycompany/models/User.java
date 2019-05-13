/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.models;

/**
 *
 * @author user
 */
public class User {
    private Integer id;
    private String firsName;
    private String lastName;

    public User(Integer id, String firsName, String lastName) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
    }
    
}
