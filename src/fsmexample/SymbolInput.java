/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fsmexample;

import finitestatemachine.Event;
/**
 *
 * @author vikram
 */
public enum SymbolInput implements Event {

    A;

    @Override
    public int getIndex() {
        return this.ordinal();
    }
    
}
