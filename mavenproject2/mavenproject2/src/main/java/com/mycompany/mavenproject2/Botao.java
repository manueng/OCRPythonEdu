/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Botao extends JButton{
    public Botao(String textoDoBotao,Runnable runnableDeAcaoASerExecutada){
        this.setText(textoDoBotao); 
        
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(runnableDeAcaoASerExecutada != null){
                    runnableDeAcaoASerExecutada.run();
                }
            }
        });
         
    }
    
    
}

