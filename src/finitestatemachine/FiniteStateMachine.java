/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finitestatemachine;

/**
 *
 * @author vikram
 */
public class FiniteStateMachine {
    private State currentState;

    public FiniteStateMachine(State startState) {
        this.currentState = startState;
    }
    
    public State getCurrentState() {
        return currentState;
    }
}