package com.carlostrks;

import java.util.Scanner;

public abstract class QuestaoDois {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String digitos = "0123456789";
        String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String especiais = "!@#$%^&*()-+";
        String senha="";
        int acrescimo = 0;
        boolean valida= false;
        boolean contemMaiuscula;
        boolean contemMinuscula;
        boolean contemDigitos;
        boolean contemEspeciais;



        System.out.println("Para ser considerada forte, sua senha " +
                "deve possuir no mínimo 6 caracteres.\n" +
                "Conter no mínimo 1 digito.\n" +
                "Conter no mínimo 1 letra em minúsculo.\n" +
                "Conter no mínimo 1 letra em maiúsculo.\n" +
                "Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+\n" +
                "Insira sua senha e clique em enter. \n");



        while(valida==false) {

            senha += input.nextLine();
            String quais = "";

            contemDigitos = verificaCriterios(digitos, senha);
            contemMaiuscula = verificaCriterios(maiusculas, senha);
            contemMinuscula = verificaCriterios(minusculas, senha);
            contemEspeciais = verificaCriterios(especiais, senha);

            if (contemDigitos == false) {
                acrescimo++;
                quais += "Adicione 1 digito\n";
            }
            if (contemMaiuscula == false) {
                acrescimo++;
                quais += "Adicione 1 letra maiúscula\n";
            }
            if (contemMinuscula == false) {
                acrescimo++;
                quais += "Adicione 1 letra minúscula\n";
            }
            if (contemEspeciais == false) {
                acrescimo++;
                quais += "Adicione 1 caractere especial\n";
            }

            int qtd = senha.length();

            if (!quais.equals("")) {
                int falta = 6 - qtd < acrescimo ? acrescimo : 6 - qtd;
                System.out.println("A senha atual é: "+senha);
                System.out.println("Você deve inserir pelo menos mais " + falta + " caractere.");
                System.out.println(quais);
                acrescimo = 0;
                continue;
            }else if(senha.length()<6){
                System.out.println("A senha atual é: "+senha);
                System.out.println("Você deve inserir pelo menos mais " + (6-qtd) + " caractere.");
                continue;
            }
            valida = true;
            System.out.println("Senha "+senha+" inserida com sucesso");
        }
    }






    public static int insereSenha(String senhaInserida){

        String digitos = "0123456789";
        String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String especiais = "!@#$%^&*()-+";
        String senha= senhaInserida;
        int acrescimo = 0;
        boolean valida= false;
        boolean contemMaiuscula;
        boolean contemMinuscula;
        boolean contemDigitos;
        boolean contemEspeciais;



        System.out.println("Para ser considerada forte, sua senha " +
                "deve possuir no mínimo 6 caracteres.\n" +
                "Conter no mínimo 1 digito.\n" +
                "Conter no mínimo 1 letra em minúsculo.\n" +
                "Conter no mínimo 1 letra em maiúsculo.\n" +
                "Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+\n" +
                "Insira sua senha e clique em enter. \n");



        while(valida==false) {
            String quais = "";

            contemDigitos = verificaCriterios(digitos, senha);
            contemMaiuscula = verificaCriterios(maiusculas, senha);
            contemMinuscula = verificaCriterios(minusculas, senha);
            contemEspeciais = verificaCriterios(especiais, senha);

            if (contemDigitos == false) {
                acrescimo++;
                quais += "Adicione 1 digito\n";
            }
            if (contemMaiuscula == false) {
                acrescimo++;
                quais += "Adicione 1 letra maiúscula\n";
            }
            if (contemMinuscula == false) {
                acrescimo++;
                quais += "Adicione 1 letra minúscula\n";
            }
            if (contemEspeciais == false) {
                acrescimo++;
                quais += "Adicione 1 caractere especial\n";
            }

            int qtd = senha.length();

            if (!quais.equals("")) {
                int falta = 6 - qtd < acrescimo ? acrescimo : 6 - qtd;
                System.out.println("A senha atual é: "+senha);
                System.out.println("Você deve inserir pelo menos mais " + falta + " caractere.");
                System.out.println(quais);
                acrescimo = 0;
                return falta;
                //continue;
            }else if(senha.length()<6){
                System.out.println("A senha atual é: "+senha);
                System.out.println("Você deve inserir pelo menos mais " + (6-qtd) + " caractere.");
                return (6-qtd);
                //continue;
            }
            valida = true;
            //System.out.println("Senha "+senha+" inserida com sucesso");
            //retornará zero para uma senha válida.

        }
        System.out.println("Senha "+senha+" inserida com sucesso");
        return 0;
    }




    public static boolean verificaCriterios(String caracteres, String senha){
        for (int i = 0; i < caracteres.length(); i++) {
            char c = caracteres.charAt(i);
            if (senha.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}
