package Desafio1;
import java.util.Scanner;

public class VerificacaoNumeros {
public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int numero;

            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();
            System.out.print("O numero " + numero);
            if (numero > 0) {
                System.out.println(" é POSITIVO.");
            } else if (numero < 0) {
                System.out.println(" é NEGATIVO.");
            } else {
                System.out.println(" é NULO.");
            }
            scanner.close();
        }
    }

