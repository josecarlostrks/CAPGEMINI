package com.carlostrks;

import java.util.Scanner;

public abstract class QuestaoUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro maior do que zero.");
        int numero = 0;
        try {
            numero = input.nextInt();
        }catch (java.util.InputMismatchException ex){
            System.out.println("Número inválido, número deveria ser inteiro");
        }

        imprime(numero);

    }
    public static boolean imprime(int n){
        if(n>0) {
            for (int i = 1; i <= n; i++) {
                for (int j = n - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for(int k = i; k>0; k--){
                    System.out.print("*");
                }
                System.out.println();
            }
            return true;
        }
        return false;
    }
}
