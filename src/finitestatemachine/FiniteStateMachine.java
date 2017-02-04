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
    private int[][] transitionTable;
    private final State[] states;
    private final Event[] events;
    private State currentState;

    public FiniteStateMachine(State startState,
            State[] states, Event[] events) {
        this.currentState = startState;
        this.states = states;
        this.events = events;
        this.transitionTable = new int[states.length][events.length];
        for (int i = 0; i < states.length; i++) {
            for (int j = 0; j < events.length; j++) {
                this.transitionTable[i][j] = -1;
            }
        }
    }
    
    public State getCurrentState() {
        return currentState;
    }
    
    public void addTransition(State sourceState, Event e,
            State destinationState) {
        this.transitionTable[sourceState.getIndex()][e.getIndex()] =
                destinationState.getIndex();
    }
    
    public void processEvent(Event e) {
        if (transitionTable[this.currentState.getIndex()][e.getIndex()] != -1) {
            int index =
                    transitionTable[this.currentState.getIndex()][e.getIndex()];
            this.currentState = states[index];
        }
    }
}
