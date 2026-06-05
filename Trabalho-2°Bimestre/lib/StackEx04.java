/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class StackEx04<T> {
    private ArrayList<T> data; // LIsta interna privada
    private int limit;

    public StackEx04(int limit) {
        this.data = new ArrayList<T>(); // Lista vazia
        this.limit = limit;
    }

    //método para inserção na pilha
    public void push(T val){
        if (this.data.size() >= this.limit) {
            throw new IllegalStateException("Erro: A pilha atingiu seu limite máximo de " + this.limit + " elementos.");
        }
        this.data.add(val);
    }

    //método para remoção da pilha
    public T pop(){
        if(isEmpty()) return null;
        return this.data.remove(this.data.size() - 1);
    }

    //método para informar se a pilha está vazia ou não
    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    //método que imprime a pilha (para efeitos de depuração)
    public String print(){
        return this.data.toString();
    }
}