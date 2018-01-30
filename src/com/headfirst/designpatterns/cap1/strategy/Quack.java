/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.headfirst.designpatterns.cap1.strategy;

/**
 *
 * @author luciano
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack.");
    }
    
}
