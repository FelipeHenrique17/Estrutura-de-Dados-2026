/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscasequencial;

/**
 *
 * @author felip
 */
public class BuscaSequencial {

    public static int buscaSequencial(String[] vetor, String valorBusca){
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i].equals(valorBusca)){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        //vetor de frutas
        String[] frutas = {"laranja", "maça", "pera", "uva", "jabuticada", "limao", "mamão"};
        System.out.println ("Posição de uva: " + buscaSequencial(frutas, "uva"));
        System.out.println ("Posição de maça: " + buscaSequencial(frutas, "maça"));
        System.out.println ("Posição de melão: " + buscaSequencial(frutas, "melão"));
    }
}