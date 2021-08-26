//autor: pedro Santos
//Bachareado em jogos 3ºsemestre
//professor; Fabio Luba
//Atividade Sudoku
package sudoku;


import java.util.Scanner;
import java.io.*;
public class Sudoku {
    public static void main(String[] args) throws IOException {
        game();
    }
    public static void game() throws IOException
  {
   char matrix [][];
   int loop =-1;
  
   Scanner ler = new Scanner(System.in);

   matrix = initialize();
   print(matrix);
   
   while(loop == -1)
   {
     
     System.out.println("escolha um local para colocar um numero");
     
     System.out.print("A linha ");
      
     int lin = ler.nextInt();
     
     System.out.print("A coluna ");
     int col = ler.nextInt();

     System.out.println("Agora coloque o numero, mas caso queira apagar o numero da linha escolhida coloque 0");
     int user = ler.nextInt();
     if (step(matrix,lin,col,user)==-1)
     {
       System.out.println("Voce não pode fazer isso. Talvez por ter colocado um local inexistente na areal ou a area ja esta ocupada");
     }
     if (step(matrix,lin,col,user)==0)
     {
      System.out.println("O numero escolhido ja existe na linha, coluna ou na região.");
     }
     
     if (step(matrix,lin,col,user)==1)
     {
      System.out.println("pronto");
     }
     if (status(matrix) == true)
     {
      System.out.print("parabens você venceu!!!!");
      loop++;
     }
     print(matrix);
   }
   
  }
  public static char[][] initialize() throws IOException
  {
      char area[][] = new char [9][9];
      int i = 0;
    //abertura
    FileReader LerArquivo = new FileReader("facil.txt");

    BufferedReader lerBuffer = new BufferedReader(LerArquivo);
    while(true)
    {
     String linha = lerBuffer.readLine();
     if(linha==null)
     {
       break;
     }
     String vetorstring[]= linha.split(" ");
     
     
     for( int j=0; j< area[0].length; j++)
        {
            area[i][j] =  vetorstring[j].charAt(0);
        }
     
     
     i++;


    }
    return area;
    

 }
  public static void print(char T[][])
  {
    for( int i=0; i < T.length; i++)
    {
        for( int j=0; j < T[0].length; j++)
            System.out.printf(" %c ",T[i][j]);
          System.out.println(":"+i);
        }
    System.out.println(" 0  1  2  3  4  5  6  7  8");
  }
  
  public static int step(char A [][],int lin, int col, int gamer)
 {  
   int arilin = lin/3*3;
   int aricol = col/3*3;
   int resposta = 2;
   if(gamer == '0')
   {
    A[lin][col] = '_';
    
    resposta = 1;
   }
   if( lin>9 || lin<0 ||col>9 ||col <1)
  {
    resposta = -1;
    return resposta;
  }
   if(A[lin][col] != '_' )
   {
    resposta = -1;
   }

   for (int c = 0; c<9; c++)
   {
       if (gamer == 1){
    if( A[lin][c] == '1')
    {
      resposta = 0;
      
      
    }
    }
        if (gamer == 2){
    if( A[lin][c] == '2')
    {
      resposta = 0;
      
      
    }
    }
        if (gamer == 3){
    if( A[lin][c] == '3')
    {
      resposta = 0;
      
      
    }
       }
    if (gamer == 4){
       if( A[lin][c] == '4')
       {
      resposta = 0;
      
      
       }
    }
    if (gamer == 5){
       if( A[lin][c] == '5')
       {
      resposta = 0;
      
      
       }
    }
    if (gamer == 6){
       if( A[lin][c] == '6')
       {
      resposta = 0;
      
      
       }
    }
    if (gamer == 7){
       if( A[lin][c] == '7')
       {
      resposta = 0;
      
      
       }
    }
    if (gamer == 8){
       if( A[lin][c] == '8')
       {
      resposta = 0;
      
      
       }
    }
    if (gamer == 9){
       if( A[lin][c] == '9')
       {
      resposta = 0;
      
      
       }
    }
    
   }

   for (int L = 0; L<9; L++)
   {
    if (gamer == 1){
      if(  A[L][col] == '1')
      {
      resposta = 0;
      
      
      }
    }
        if (gamer == 2){
    if(  A[L][col] == '2')
    {
      resposta = 0;
      
      
    }
    }
        if (gamer == 3){
    if(  A[L][col] == '3')
    {
      resposta = 0;
      
      
    }
       }
    if (gamer == 4){
       if(  A[L][col] == '4')
       {
      resposta = 0;
      
      
       }
    }
    if (gamer == 5){
       if(  A[L][col] == '5')
       {
      resposta = 0;
      
      
       }
    }
    if (gamer == 6){
       if(  A[L][col] == '6')
       {
      resposta = 0;
      
      
       }
    }
    if (gamer == 7){
       if(  A[L][col] == '7')
       {
      resposta = 0;
    
      
       }
    }
    if (gamer == 8){
       if(  A[L][col] == '8')
       {
      resposta = 0;
      
      
       }
    }
    if (gamer == 9){
       if(  A[L][col] == '9')
       {
      resposta = 0;
      
      
       }
    }
   }
   if(gamer == 1){
  if (A[arilin][aricol] == '1' || A[arilin+1][aricol+1] == '1' ||  A[arilin+2][aricol+2] == '1' ||  A[arilin+1][aricol] == '1' ||  A[arilin+2][aricol] == '1' ||  A[arilin][aricol+1] == '1' || A[arilin+2][aricol+1] == '1' ||  A[arilin][aricol+2] == '1' ||  A[arilin+1][aricol+2] == '1')
  {
    resposta = 0;
    
  }
   }
  if(gamer == 2){
  if (A[arilin][aricol] == '2' || A[arilin+1][aricol+1] == '2' ||  A[arilin+2][aricol+2] == '2' ||  A[arilin+1][aricol] == '2' ||  A[arilin+2][aricol] == '2' ||  A[arilin][aricol+1] == '2' || A[arilin+2][aricol+1] == '2' ||  A[arilin][aricol+2] == '2' ||  A[arilin+1][aricol+2] == '2')
  {
    resposta = 0;
    
  }
  }
  if(gamer == 3){
  if (A[arilin][aricol] == '3' || A[arilin+1][aricol+1] == '3' ||  A[arilin+2][aricol+2] == '3' ||  A[arilin+1][aricol] == '3' ||  A[arilin+2][aricol] == '3' ||  A[arilin][aricol+1] == '3' || A[arilin+2][aricol+1] == '3' ||  A[arilin][aricol+2] == '3' ||  A[arilin+1][aricol+2] == '3')
  {
    resposta = 0;
    
  }
  }
  if(gamer == 1){
  if (A[arilin][aricol] == '4' || A[arilin+1][aricol+1] == '4' ||  A[arilin+2][aricol+2] == '4' ||  A[arilin+1][aricol] == '4' ||  A[arilin+2][aricol] == '4' ||  A[arilin][aricol+1] == '4' || A[arilin+2][aricol+1] == '4' ||  A[arilin][aricol+2] == '4' ||  A[arilin+1][aricol+2] == '4')
  {
    resposta = 0;
    
  }
  }
  if(gamer == 1){
  if (A[arilin][aricol] == '5' || A[arilin+1][aricol+1] == '5' ||  A[arilin+2][aricol+2] == '5' ||  A[arilin+1][aricol] == '5' ||  A[arilin+2][aricol] == '5' ||  A[arilin][aricol+1] == '5' || A[arilin+2][aricol+1] == '5' ||  A[arilin][aricol+2] == '5' ||  A[arilin+1][aricol+2] == '5')
  {
    resposta = 0;
    
  }
  }
  if(gamer == 6){
  if (A[arilin][aricol] == '6' || A[arilin+1][aricol+1] == '6' ||  A[arilin+2][aricol+2] == '6' ||  A[arilin+1][aricol] == '6' ||  A[arilin+2][aricol] == '6' ||  A[arilin][aricol+1] == '6' || A[arilin+2][aricol+1] == '6' ||  A[arilin][aricol+2] == '6' ||  A[arilin+1][aricol+2] == '6')
  {
    resposta = 0;
    
  }
  }
  if(gamer == 7){
  if (A[arilin][aricol] == '7' || A[arilin+1][aricol+1] == '7' ||  A[arilin+2][aricol+2] == '7' ||  A[arilin+1][aricol] == '7' ||  A[arilin+2][aricol] == '7' ||  A[arilin][aricol+1] == '7' || A[arilin+2][aricol+1] == '7' ||  A[arilin][aricol+2] == '7' ||  A[arilin+1][aricol+2] == '7')
  {
    resposta = 0;
    
  }
   }
  if(gamer == 8){
  if (A[arilin][aricol] == '8' || A[arilin+1][aricol+1] == '8' ||  A[arilin+2][aricol+2] == '8' ||  A[arilin+1][aricol] == '8' ||  A[arilin+2][aricol] == '8' ||  A[arilin][aricol+1] == '8' || A[arilin+2][aricol+1] == '8' ||  A[arilin][aricol+2] == '8' ||  A[arilin+1][aricol+2] == '8')
  {
    resposta = 0;
    
  }
   }
  if(gamer == 9){
  if (A[arilin][aricol] == '9' || A[arilin+1][aricol+1] == '9' ||  A[arilin+2][aricol+2] == '9' ||  A[arilin+1][aricol] == '9' ||  A[arilin+2][aricol] == '9' ||  A[arilin][aricol+1] == '9' || A[arilin+2][aricol+1] == '9' ||  A[arilin][aricol+2] == '9' ||  A[arilin+1][aricol+2] == '9')
  {
    resposta = 0;
    
  }
   }
  if(resposta == 2){
     
    if(gamer == 1)
    {
      A[lin][col] = '1';
      resposta = 1;
    }
    else if(gamer == 2)
    {
      A[lin][col] = '2';
      resposta = 1;
    }
    else if(gamer == 3)
    {
      A[lin][col] = '3';
      resposta = 1;
    }
    else if(gamer == 4)
    {
      A[lin][col] = '4';
      resposta = 1;
    }
    else if(gamer == 5)
    {
      A[lin][col] = '5';
      resposta = 1;
    }
    else if(gamer == 6)
    {
      A[lin][col] = '6';
      resposta = 1;
    }
    else if(gamer == 7)
    {
      A[lin][col] = '7';
      resposta = 1;
    }
    else if(gamer == 8)
    {
      A[lin][col] = '8';
      resposta = 1;
    }
    else if(gamer == 9)
    {
      A[lin][col] = '9';
      resposta = 1;
    }
  }
    return resposta;
 }
  
  public static boolean status (char M[][])
 {
    for( int i=0; i < M.length; i++)
     {
        for( int j=0; j < M[0].length; j++)
            if (M[i][j] == '_')
            {
              return false;
            }
      }
      return true;
  }

}
 