package com.carlostrks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class QuestaoTres {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra para a verificação de anagramas.");
        String palavra = input.nextLine();


        List<String[]> listaDeAnagramas = verificacao(palavra);
        System.out.println("A lista de todos os anagramas pares é: ");
        for(String[] anagramas: listaDeAnagramas){
            System.out.println("["+anagramas[0]+','+anagramas[1]+"]");
        }
        System.out.println("O número de pares de substrings que são anagramas é: "+listaDeAnagramas.size());


    }


    public static int lerDados(String palavra){
        Scanner input = new Scanner(System.in);
        //System.out.println("Digite uma palavra para a verificação de anagramas.");
        //String palavra = input.nextLine();

        List<String[]> listaDeAnagramas = verificacao(palavra);
        System.out.println("A lista de todos os anagramas pares é: ");

        for(String[] anagramas: listaDeAnagramas){
            System.out.println("["+anagramas[0]+','+anagramas[1]+"]");
        }
        System.out.println("O número de pares de substrings que são anagramas é: "+listaDeAnagramas.size());
        return listaDeAnagramas.size();
    }



    private static List<String[]> verificacao(String palavra) {
        List<String> listaDeAnagramas = new ArrayList<>();
        String primeira = "";
        for (int i = 0; i < palavra.length(); i++) {
            for(int j = i; j< palavra.length(); j++) {
                char c = palavra.charAt(j);
                primeira += Character.toString(c);
                listaDeAnagramas.add(primeira);
            }
            primeira = "";
        }
        return verificaAnagramas(listaDeAnagramas);
    }


    private static List<String[]> verificaAnagramas(List<String> strings){
        List<String> listaRecebida = strings;
        List<String> listaDeVerificacao = new ArrayList(listaRecebida);
        List<String[]> listaDeAnagramas = new ArrayList<>();
        String[] anagramas;
        String primeira;
        String segunda;
        for(int i = 0; i< listaRecebida.size(); i++){
            primeira = listaRecebida.get(i);
            listaDeVerificacao.remove(0);
            //System.out.println("A primeira é "+primeira);
            char[] ordenacao = primeira.toCharArray();
            Arrays.sort(ordenacao);
            String primeiraOrdenada = new String(ordenacao);
            //System.out.println("A primeira ordenada é "+primeiraOrdenada);
            //System.out.println("A string removida é "+listaRecebida.get(i));

            for(int j = 0; j<listaDeVerificacao.size(); j++){
                segunda = listaDeVerificacao.get(j);
                //System.out.println("A segunda é "+segunda);
                char[] ordenacaoDois = segunda.toCharArray();
                Arrays.sort(ordenacaoDois);
                String segundaOrdenada = new String(ordenacaoDois);
                //System.out.println("A segunda ordenada é "+segundaOrdenada);
                if(primeiraOrdenada.equals(segundaOrdenada)){
                    //System.out.println("A primeira: "+primeira+" é igual a segunda: "+segunda);
                    if(primeira.length()==segunda.length()) {
                        anagramas = new String[]{primeira, segunda};
                        listaDeAnagramas.add(anagramas);

                    }
                }
            }
        }
        return listaDeAnagramas;
    }


}
