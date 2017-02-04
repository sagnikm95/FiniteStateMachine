/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fsmexample;

import finitestatemachine.FiniteStateMachine;
import java.util.Scanner;

/**
 * A finite state machine to get the parity of number of 'a's in a string.
 * 
 * @author vikram
 */
public class Main {
    public static void main(String[] args) {
        FiniteStateMachine fsm = new FiniteStateMachine(Parity.Even, Parity.values(), SymbolInput.values());
        fsm.addTransition(Parity.Even, SymbolInput.A, Parity.Odd);
        fsm.addTransition(Parity.Odd, SymbolInput.A, Parity.Even);
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        for (char c: s.toCharArray()) {
            if (c == 'a') {
                fsm.processEvent(SymbolInput.A);
            }
        }
        
        if (fsm.getCurrentState() == Parity.Even) {
            System.out.println("Number of a's is even.");
        } else {
            System.out.println("Number of a's is odd.");
        }
    }
}
