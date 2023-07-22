/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.View;

import com.mycompany.mavenproject2.Constantes;
import com.mycompany.mavenproject2.Model.Entidades.Desenho;
import com.mycompany.mavenproject2.View.Telas.TelaTexto;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Emanuel
 */
public class JRetangulodeSelecao extends JPanel{
    private Desenho desenhoAtual;
   
    
    public JRetangulodeSelecao(){
        //this.setUndecorated(true);
        this.desenhoAtual = new Desenho();
    }    
    public Desenho getDesenhoAtual() {
        return this.desenhoAtual;
    }
    public void gravarImagemDeCapturaDeTela(){
        try{
            this.setBackground(Constantes.COR_TRANSPARENTE);
            Robot robot = new Robot();
            Rectangle ScreenRectangle;
            ScreenRectangle = new Rectangle(this.desenhoAtual.getMargemEsquerda(),this.desenhoAtual.getMargemSuperior(),this.desenhoAtual.getLargura(),this.desenhoAtual.getAltura());
            BufferedImage image = robot.createScreenCapture(ScreenRectangle);
            
            File file = new File(Constantes.NOME_DA_IMAGEM_GERADA);
            ImageIO.write(image, "png", file);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void setarPainel(Desenho desenhoAtual){
        this.setBounds(desenhoAtual.getMargemEsquerda(),desenhoAtual.getMargemSuperior(),desenhoAtual.getLargura(),desenhoAtual.getAltura());
        this.setBackground(Constantes.COR_DO_RETANGULO);
    }
    public void  atualizarPainelMomentoInicial(int x, int y){
        this.desenhoAtual.moverPontoInicial(x,y);
        this.desenhoAtual.moverPontoFinal(x,y);
        this.setarPainel(this.desenhoAtual);
    }
    public void  atualizarPainelOutrosMomentos(int x, int y){
        this.desenhoAtual.moverPontoFinal(x,y);
        this.setarPainel(this.desenhoAtual);
    }
    
    
    public void executarOutrosMetodos(){
        try{
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
