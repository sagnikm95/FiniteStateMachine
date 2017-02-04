/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fsmexample;

import finitestatemachine.State;
/**
 *
 * @author vikram
 */
public enum Parity implements State {
    /**
     * 
     */
    Even,

    /**
     *
     */
    Odd;
    
    @Override
    public int getIndex() {
        return this.ordinal();
    }
}
