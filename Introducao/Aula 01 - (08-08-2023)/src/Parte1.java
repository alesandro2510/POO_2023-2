import java.util.Scanner;

public class Parte1{
    public static void main(String args[]){ 
      Scanner s = new Scanner(System.in);
      System.out.println("Nome do professor?");
      String nome  = s.next();
      if (nome.equals("Bernardo")){ 
        System.out.println("Show!");
      }else{
        System.out.println("Nao conheco");
      }
      s.close();
    }
  }