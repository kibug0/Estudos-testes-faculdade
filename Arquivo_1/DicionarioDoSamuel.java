/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicionariodosamuel;

import java.io.*;

/*
Entrega do Trabalho 2- Algoritmos e Programação II
Nós,
Pedro Oliveira Monteiro Santos
João Vitor Sonoda Rezende
declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou
prejudicar outros.
*/


public class DicionarioDoSamuel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        String[] dicionario = new String [100];
        int rota = 0;
        int atropela = 0;
        int tamanho = 100;
        String linha = "nada";
        FileReader LerArquivo = new FileReader("Historia.txt");
        BufferedReader lerBuffer = new BufferedReader(LerArquivo);
        
        
        Ordenando(dicionario, rota,atropela, lerBuffer, linha);
        
        //Ordenandobublee(dicionario, tamanho);
        
        
        for( int j=0; j< dicionario.length; j++)
        {
            if (dicionario[j] == null)
            {
                break;
            }
            System.out.println(dicionario[j]);
           
        }
        
    }
    
    public static int Ordenando(String[] dicionario, int j, int athos, BufferedReader lerBuffer, String linha) throws IOException
    {
        int fim = 0;
        int meio = 50;
        String reserva = "";
        
        
        
    
    
    
    if(j == 0)
    {
     linha = lerBuffer.readLine();
     if(linha.compareTo("")==0)
     {
       
       return Ordenando(dicionario, j=0,athos, lerBuffer, linha);
       
     }
     if(linha.compareTo(".")==0)
     {
       
       return fim;
     }
    }
     
     
     
     String vetorstring[]= linha.split(" ");
     
     
     
     
    dicionario[athos]= vetorstring[j].toLowerCase();
    
    if (athos > 0)
    {
        if(dicionario[athos-1].compareTo(dicionario[athos])<0)
        {
            reserva = dicionario[athos-1];
            dicionario[athos-1] = dicionario[athos];
            dicionario[athos] = reserva;
        }
    }
        
     
     
     
     
     
     
     if(j != vetorstring.length - 1)
     {
         
         return Ordenando(dicionario, j+1,athos+1, lerBuffer, linha);

     }
     else
     {
         
          
          return Ordenando(dicionario, j=0,athos+1, lerBuffer, linha);
     }
}
    
    
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     