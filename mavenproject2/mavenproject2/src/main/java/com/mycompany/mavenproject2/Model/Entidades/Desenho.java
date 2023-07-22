/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.Model.Entidades;

/**
 *
 * @author Emanuel
 */
public class Desenho {
    private PointInt pontoInicial;
    private PointInt pontoFinal;
    private int statusMovimento;
    private int vetor[]= new int[5];

    
    public Desenho(){
        this.pontoInicial=new PointInt();
        this.pontoFinal=new PointInt();
    } 
    private void moverPonto(PointInt ponto,int x, int y){
        ponto.mover(x,y);
    }
    public void moverPontoFinal(int x, int y){
        moverPonto(pontoFinal,x,y);
    }
    public void moverPontoInicial(int x, int y){
        moverPonto(pontoInicial,x,y);
    }
    
    public static int retornaDimensões(int x1, int x2){
        if(x1<x2){
            return x1;
        }else{
            return x2;
        }
    } 
    public int getMargemEsquerda(){
       return  retornaDimensões(this.pontoInicial.getX(),this.pontoFinal.getX());
    }
    public int getMargemSuperior(){
         return retornaDimensões(this.pontoInicial.getY(),this.pontoFinal.getY());
    }
     
    public int getLargura(){
        return Math.abs(this.pontoFinal.getX() - this.pontoInicial.getX());
    }
     
    public int getAltura(){
        return Math.abs(this.pontoFinal.getY() - this.pontoInicial.getY());
    }
 
    

    
}
