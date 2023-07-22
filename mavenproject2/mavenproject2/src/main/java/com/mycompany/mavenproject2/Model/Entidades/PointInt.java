/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.Model.Entidades;

/**
 *
 * @author Emanuel
 */
public class PointInt {
    private int x;
    private int y;
    
    public PointInt(int x, int y){
        this.setX(x);
        this.setY(x);
    }
    public PointInt(){
        this.setX(0);
        this.setY(0);
    } 
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void mover(int x, int y){
        this.setX(x);
        this.setY(y);
    }
    public void mover(PointInt pontoAtual){
       this.setX(pontoAtual.getX());
       this.setY(pontoAtual.getY());
    }
     public void testarPonto(PointInt ponto){
        System.out.println(ponto.getX());
        System.out.println(ponto.getY());
     }
     
}
