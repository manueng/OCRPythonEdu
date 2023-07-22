/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.Servicos;

import java.util.Scanner;

/**
 *
 * @author Emanuel
 */
public final class ClasseProcessadora{
    
    private ClasseProcessadora(){}
        
    private static String retornarResultadoDaExecucao(String comando){
        Process processo;
        processo = null;
        String linhaAtual=""; 
        try{
            processo = Runtime.getRuntime().exec(comando);
            Scanner scanner = new Scanner(processo.getInputStream());
            
            while(processo.isAlive() == true){
                while(scanner.hasNextLine() == true){
                    linhaAtual =linhaAtual+scanner.nextLine() + "\n";
                    
                    System.out.println(linhaAtual);
                    Thread.sleep(300);
                }
                Thread.sleep(300);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return linhaAtual;
    }
    
    public static String executar(String nomeDoArquivoPython) {
        String resultado = retornarResultadoDaExecucao(nomeDoArquivoPython);
        return resultado;
    }
    
    private static String executarParte1(){
        return executar("teste04.py");
    }
    private static String  executarparte2(){
         return executar("introduzerrofor.py");
    }
    public static String dispararModo1(){
         return executarParte1();
    }
    public static String dispararModo2(){
        String Resultado;
        return Resultado= executarParte1();
                           //executarparte2();
    }
    public static String setarComando(String caminhoDoArquivo, String nomeArquivo){
        String comando = "python " + caminhoDoArquivo+" "+nomeArquivo;
        return retornarResultadoDaExecucao(comando);
    }
    public static  String setarComandoRoda(String caminhoDoArquivo){
        String comando = "Python " + caminhoDoArquivo;
        return retornarResultadoDaExecucao(comando);
    }
     
}
