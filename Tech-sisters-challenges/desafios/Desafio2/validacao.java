package Desafio2;

import java.util.Scanner;

public class validacao {


    public static int validaSafe(Scanner scanner, String mensagem) {
        int num = 0;
        boolean valida = false;
        while (!valida || num <= 0) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine();
            try {
                num = Integer.parseInt(entrada);
                valida = true;
            } catch (NumberFormatException e) {
                System.out.println("Ops!Digite somente números.");
            }
        }
        return num;
    }

    public static double validaaltura(Scanner scanner, String mensagem) {

        double altura = 0;
        boolean valida = false;

        while (!valida || altura <= 0) {
            System.out.println("Qual sua altura? ");
            String entrada = scanner.nextLine();
            try {
                altura = Double.parseDouble(entrada);
                valida = true;
            } catch (NumberFormatException e) {

                System.out.println("Opss! digite somente números.");
            }
        }
        return altura;
    }
}



