/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vktranslator;

import java.io.FileNotFoundException;

/**
 *
 * @author Administrador
 */
public class VKTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       Tela view = new Tela();
        view.setVisible(true);
        view.setLocationRelativeTo(null); 
    }   
}