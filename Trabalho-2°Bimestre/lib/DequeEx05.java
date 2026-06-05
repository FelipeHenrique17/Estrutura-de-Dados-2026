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
public class DequeEx05<T> {
    private ArrayList<T> data; // lista privada

    public DequeEx05(){
        this.data = new ArrayList<T>(); // lista vazia
    }

    //método para inserção no início da estrutura
    public void insertFront(T val){
        if (this.data.contains(val)) {
            throw new IllegalArgumentException("Erro: O elemento '" + val + "' já existe no deque.");
        }
        this.data.add(0, val);
    }

    //método para inserção no final da estrutura
    public void insertBack(T val){
        if (this.data.contains(val)) {
            throw new IllegalArgumentException("Erro: O elemento '" + val + "' já existe no deque.");
        }
        this.data.add(val);
    }

    //método para remoção do início da estrutura
    public T removeFront(){
        if(isEmpty()) return null;
        return this.data.remove(0);
    }

    //método para remoção do final da estrutura
    public T removeBack(){
        if(isEmpty()) return null;
        return this.data.remove(this.data.size() - 1);
    }

    //método para consultar o inicio da estrutura (sem remover)
    public T peekFront(){
        if(isEmpty()) return null;
        return this.data.get(0);
    }

    //método para consultar o final da estrutura (sem remover)
    public T peekBack(){
        if(isEmpty()) return null;
        return this.data.get(this.data.size() - 1);
    }

    //método para informar se o deque está vazio ou não
    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    //método que imprime o deque (para efeitos de depuração
    public String print(){
        StringBuilder output = new StringBuilder("[ ");
        for(int i = 0; i < this.data.size(); i++){
            if(output.length() > 2) output.append(", ");
            output.append("(").append(i).append("): ").append(this.data.get(i));
        }
        output.append(" ]");
        return output.toString();
    }
}

