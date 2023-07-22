/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.Servicos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import static java.lang.System.out;

/**
 *
 * @author Emanuel
 */
public final class CriadorDeArquivoPython {
    public CriadorDeArquivoPython(){}
    public static void gravar(String caminhodoArquivo,String programa){
       try{ 
        BufferedWriter br = new BufferedWriter(new FileWriter(caminhodoArquivo));
        br.write(programa);
        br.close();
      }catch (IOException e){
          e.printStackTrace();
      }       
        
    }

}

