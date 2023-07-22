/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.View;

import com.mycompany.mavenproject2.Constantes;
import com.mycompany.mavenproject2.View.JRetangulodeSelecao;
import com.mycompany.mavenproject2.View.Telas.TelaTexto;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;


import javax.imageio.ImageIO;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Emanuel
 */
public class MouseTracker extends JFrame implements MouseListener, MouseMotionListener{
  
    
    private static int modoAtualDoSistema;
    

    private JRetangulodeSelecao painelRetanguloDeSelecaoProprio;
         
    
    void removerPainelDaTela(){
        this.painelRetanguloDeSelecaoProprio.removeAll();
        this.painelRetanguloDeSelecaoProprio = null;
        //provisório
        //this.dispose();
        System.out.println("Código pós dispose");
    }
    public void removerPainel(){ 
       try{
            this.remove(this.painelRetanguloDeSelecaoProprio);
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
    }
    
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked: "+e.getX() + ", "+e.getY());  
        this.painelRetanguloDeSelecaoProprio.executarOutrosMetodos();
    }   
    public void mouseEntered(MouseEvent e) {
       System.out.println("mouseEntered: "+e.getX() + ", "+e.getY()); 
       this.painelRetanguloDeSelecaoProprio.executarOutrosMetodos();
    }
    public void mouseExited(MouseEvent e) {
       System.out.println("mouseExited: "+e.getX() + ", "+e.getY());
       this.painelRetanguloDeSelecaoProprio.executarOutrosMetodos();
    }
      
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed: "+e.getX() + ", "+e.getY());  
        this.painelRetanguloDeSelecaoProprio.atualizarPainelMomentoInicial(e.getX() ,e.getY());
        this.add(this.painelRetanguloDeSelecaoProprio);
    }
    
    
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased: "+e.getX() + ", "+e.getY());
        System.out.println("CAPTURAR IMAGEM. INSERIR CóDIGO AQUI");
        //Para o caso de movimento de cima para baixo, da esquerda para a direita
        //Implementar ifs para ver se o movimento está na ascendente ou na descendente em Y
        //e se está indo para a direita ou para a esquerda em X
        this.painelRetanguloDeSelecaoProprio.atualizarPainelOutrosMomentos(e.getX() ,e.getY());
        this.dispose();
        this.painelRetanguloDeSelecaoProprio.gravarImagemDeCapturaDeTela();
        TelaTexto telaTexto=new TelaTexto(modoAtualDoSistema);
        telaTexto.setVisible(true);
    }
   
   
    public void mouseDragged(MouseEvent e){
     System.out.println("mouseDragged: "+e.getX() + ", "+e.getY());
        //Para o caso de movimento de cima para baixo, da esquerda para a direita
        //Implementar ifs para ver se o movimento está na ascendente ou na descendente em Y
        //e se está indo para a direita ou para a esquerda em X
     this.painelRetanguloDeSelecaoProprio.atualizarPainelOutrosMomentos(e.getX() ,e.getY());
    }
    
    public void mouseMoved(MouseEvent e) {
       System.out.println("mouseMoved: "+e.getX() + ", "+e.getY()); 
       this.painelRetanguloDeSelecaoProprio.executarOutrosMetodos();
    }
    
    public void start(int modo){
        this.modoAtualDoSistema = modo;
        this.painelRetanguloDeSelecaoProprio=new JRetangulodeSelecao();
        this.addMouseListener( this );        // listens for own mouse and
        this.addMouseMotionListener( this );  // mouse-motion events
        this.setLayout(new FlowLayout(1));
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(size );
        this.setUndecorated(true);
        this.getContentPane().setBackground(Constantes.COR_DA_TELA_DE_FUNDO);
        this.setBackground(Constantes.COR_DA_TELA_DE_FUNDO);
        this.setVisible( true );
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
