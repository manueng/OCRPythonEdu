/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.View;

import com.mycompany.mavenproject2.Botao;
import com.mycompany.mavenproject2.Servicos.ClasseProcessadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Emanuel
 */
public class Tela extends JFrame {
   private Botao botaoDispararModo1;
   private Botao botaoDispararModo2;
   
   private void configurarBotao1(){
       Runnable runnableDispararModo1 = new Runnable(){
           @Override
           public void run() {
               ClasseProcessadora.dispararModo1();
           }
       };
       
       String textoDoBotao = "DISPARAR MODO 1";
       botaoDispararModo2 = new Botao(textoDoBotao,runnableDispararModo1);
   }
   
   private void configurarBotao2(){
       Runnable runnableDispararModo2 = new Runnable(){
           @Override
           public void run() {
               ClasseProcessadora.dispararModo2();
           }
       };
       
       String textoDoBotao = "DISPARAR MODO 2";
       
       botaoDispararModo1 = new Botao(textoDoBotao,runnableDispararModo2);
   }
   
   public void  start(){
    JFrame f=new JFrame("Button Example");  
    this.configurarBotao1();
    this.configurarBotao2();  
    botaoDispararModo1.setBounds(10,10,155,100);  
    botaoDispararModo2.setBounds(0,370,20,10);
    f.add(botaoDispararModo1);
    f.add(botaoDispararModo2);
    f.setSize(200,400); 
    f.setVisible(true);
   }
  }
