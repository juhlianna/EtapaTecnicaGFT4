package Exercicio01;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2018) {
            System.out.println("Senha Inválida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Garantido");

        sc.close();
    }



}
