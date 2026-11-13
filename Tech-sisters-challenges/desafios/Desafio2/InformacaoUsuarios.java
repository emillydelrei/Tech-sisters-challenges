package Desafio2;
import java.util.Scanner;

public class InformacaoUsuarios {
 public static void main(String[] args) {

     Scanner scanner=new Scanner(System.in);


     System.out.print("Digite seu nome: ");
     String nome=scanner.nextLine();

     int idade=validacao.validaSafe(scanner,"Digite dua idade: ");


     double altura=validacao.validaaltura(scanner,"Digite sua altura: ");


     System.out.print("Digite sua cidade: ");
     String cidade=scanner.nextLine();

     System.out.println("Olá "+nome+", você tem "+idade +" anos,"+altura+" de altura e mora em "+ cidade+".");





 }
}
