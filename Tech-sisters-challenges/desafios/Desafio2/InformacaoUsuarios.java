package Desafio2;
import java.util.Scanner;

public class InformacoeUsuarios {
 public static void main(String[] args) {

     Scanner scanner=new Scanner(System.in);

     System.out.print("Digite seu nome: ");
     String nome=scanner.nextLine();

     System.out.print("qual sua idade? ");
     int idade=scanner.nextInt();
     while (idade<=0) {
         System.out.println("Ops, essa não é uma idade valida");
     idade=scanner.nextInt();}

     System.out.print("qual sua altura? ");
     double altura=scanner.nextDouble();
     scanner.nextLine();

     System.out.print("Digite sua cidade: ");
     String cidade=scanner.nextLine();

     System.out.println("Olá "+nome+", você tem "+idade +" anos,"+altura+" de altura e mora em "+ cidade+".");



 }
}
