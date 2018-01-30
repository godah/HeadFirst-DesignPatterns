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
public class MiniDuckSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
    
}
