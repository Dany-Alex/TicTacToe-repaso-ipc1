/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.game;

import javax.swing.JFrame;

/**
 *
 * @author dany
 */
public class Ventana extends JFrame{

    public Ventana(String Titulo) {
        super(Titulo);
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
