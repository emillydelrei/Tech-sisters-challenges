package Desafio2;

import java.util.Scanner;

public class validacao {


    public static int validaSafe(Scanner scanner, String mensagem) {
        int num = 0;
        boolean valida = false;
        while (!valida) {
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



    }

}
