package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {

    private ArrayList<Carta> baralho;

    //Cria o baralho
    public Baralho() {
        baralho = new ArrayList<>();
        criaBaralho();
    }

    //Função que cria as cartas e ja armazena no baralho com .add
    public void adicionaCarta(String numero, String naipe){
        Carta carta = new Carta(numero,naipe);
        baralho.add(carta);
    }

    //Função para identificar as cartas e naipes e gerar o baralho.
    private void criaBaralho() {
        String numeros[] = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Q", "J", "K"};
        String naipe[] = {"Espadas", "Ouros", "Paus", "Copas"};

        for(int i = 0; i < naipe.length; i++) {
            for(int j = 0; j < numeros.length; j++) {
                adicionaCarta(numeros[j], naipe[i]);
            }
        }
    }

    //Função para imprimir o baralho e embaralhar, utilizando StringBuilder e a classe Collections.
    public void imprimeBaralho(){
        StringBuilder stringb = new StringBuilder();

        Collections.shuffle(baralho);

        baralho.forEach((c) -> {
            stringb.append("Carta: ").append(c.getNumero()).append(" de ").append(c.getNaipe()).append("\n");
        });

        System.out.println(stringb.toString());
    }
}