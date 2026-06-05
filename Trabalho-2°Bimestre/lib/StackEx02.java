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
public class StackEx02<T> {
    private ArrayList<T> data; // LIsta interna privada
    private ArrayList<T> historyData;

    public StackEx02() {
        this.data = new ArrayList<T>(); // Lista vazia
        this.historyData = new ArrayList<T>();
    }
    
    //método para inserção na pilha
    public void push(T val){
        this.data.add(val);
    }
    
    //método para remoção da pilha
    public T pop(){
        if(isEmpty()) return null;
        T removed = this.data.remove(this.data.size() - 1);
        this.historyData.add(removed); // Alimenta o histórico
        return removed;
    }
    
    //método para informar se a pilha está vazia ou não
    public boolean isEmpty(){
        return this.data.isEmpty();
    }
    
    //método para consultar o topo (última posição) da pilha
    //sem remover o elemento
    public T peek(){
        if(isEmpty()) return null;
        return this.data.get(this.data.size() -1);
    }

    public ArrayList<T> getHistory() {
        return this.historyData;
    }
    
    //método que imprime a pilha (para efeitos de depuração)
    public String print(){
        return this.data.toString();
    }
}
