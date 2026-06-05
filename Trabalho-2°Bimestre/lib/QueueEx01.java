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
public class QueueEx01<T> {
    private ArrayList<T> data; //Lista privada
    private int operationCount;

    public QueueEx01() {
        this.data = new ArrayList<T>(); //Lista vazia
        this.operationCount = 0;
    }

    //método para inserção de dados na fila
    public void enqueue(T val) {
        this.data.add(val);
        this.operationCount++;
    }

    //método para remoção de dados na fila
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        this.operationCount++;
        return this.data.remove(0);
    }

    //método para verificar se a fila está vazia ou não
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    //método para consultar o início da fila sem remover o elemento
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return this.data.get(0);
    }

    public int getOperationCount() {
        return this.operationCount;
    }

    //método que imprimi a fila (para efeitos de depuração)
    public String print() {
        StringBuilder output = new StringBuilder("[ ");
        for (int i = 0; i < this.data.size(); i++) {
            if (output.length() > 2) {
                output.append(", ");
            }
            output.append("(")
                  .append(i)
                  .append("): ")
                  .append(this.data.get(i));
        }
        output.append(" ]");
        return output.toString();
    }
}