/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author Abedias
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        String caminhoDoArquivo = "C:\\Users\\Emanuel\\Downloads\\TCC2\\Fundidos\\";
        String comando = "python " + caminhoDoArquivo;
        
        Process processo = null;
        try{
            processo = Runtime.getRuntime().exec(comando);
            Scanner scanner = new Scanner(processo.getInputStream());
            
            while(processo.isAlive() == true){
                while(scanner.hasNextLine() == true){
                    String linhaAtual = scanner.nextLine();
                    
                    System.out.println(linhaAtual);
                    Thread.sleep(300);
                }
                Thread.sleep(300);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
}
