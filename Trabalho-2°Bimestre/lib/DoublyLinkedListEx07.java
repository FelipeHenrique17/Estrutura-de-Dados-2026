/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

/**
 *
 * @author Alexandre
 */
public class DoublyLinkedListEx07<T> {
    private static class Node<T> {
        public Node<T> prev;
        public T data;
        public Node<T> next;
        public Node(T val) {
            this.prev = null;
            this.data = val;
            this.next = null;
        }
    }
    private Node<T> head;
    private Node<T> tail;
    private int count;

    public DoublyLinkedListEx07() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public int getCount() {
        return this.count;
    }

    //método PRIVADO que encontra um nodo por sua posição
    private Node<T> findNode(int pos) {
        Node<T> node;

        if (pos < this.count / 2.0) {
            node = this.head;
            for (int i = 0; i < pos; i++) {
                node = node.next;
            }
        } else {
            node = this.tail;
            for (int i = this.count - 1; i > pos; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    public void insert(int pos, T val) {
        Node<T> inserted = new Node(val);
        //1º caso: lista vazia
        if (isEmpty()) {
            this.head = inserted;
            this.tail = inserted;
        } //2º caso: inserção na primiera posição
        else if (pos == 0) {
            inserted.next = this.head;
            this.head.prev = inserted;
            this.head = inserted;
        } //3º caso: inserção na última posição
        else if (pos >= this.count) {
            inserted.prev = this.tail;
            this.tail.next = inserted;
            this.tail = inserted;
        } //4º caso: inserção em posição intermediário
        else {
            Node<T> nodePos = findNode(pos);

            Node<T> before = nodePos.prev;

            before.next = inserted;

            inserted.prev = before;

            inserted.next = nodePos;

            nodePos.prev = inserted;
        }
        this.count++;
    }

    public void insertHead(T val) {
        this.insert(0, val);
    }

    public void insertTail(T val) {
        this.insert(this.count, val);
    }

    public void reverse() {
        if (isEmpty() || this.count == 1) {
            return; // Lista vazia ou com 1 elemento não precisa inverter
        }
        Node<T> current = this.head;
        Node<T> temp = null;
        // Passa de nodo em nodo trocando os ponteiros 'next' e 'prev' de lugar
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            this.tail = this.head;
            this.head = temp.prev;
        }
    }

    //método para remover um nodo de qualuqer posição
    public T remove(int pos) {
        //1º caso: lista vazia
        if (isEmpty() || pos < 0 || pos > this.count - 1) {
            return null;
        }

        Node<T> removed;

        //2º caso: remoção do primeiro nodo
        if (pos == 0) {
            removed = this.head;

            this.head = removed.next;
            if (this.head != null) {
                this.head.prev = null;
            }
            if (this.count == 1) {
                this.tail = null;
            }
        } //3º caso: remoção do último nodo
        else if (pos == this.count - 1) {
            removed = this.tail;

            this.tail = removed.prev;

            if (this.tail != null) {
                this.tail.next = null;
            }
            if (this.count == 1) {
                this.head = null;
            }
        } //4º caso: remoção em posição intermediária
        else {
            removed = findNode(pos);
            Node<T> before = removed.prev;
            Node<T> after = removed.next;

            before.next = after;

            after.prev = before;

        }

        this.count--;

        return removed.data;
    }

    public T removeHead() {
        return this.remove(0);
    }

    public T removeTail() {
        return this.remove(this.count - 1);
    }

    public T peek(int pos) {
        if (isEmpty() || pos < 0 || pos > this.count - 1) {
            return null;
        }
        Node<T> node = findNode(pos);
        return node.data;
    }

    public T peekHead() {
        return this.peek(0);
    }

    public T peekTail() {
        return this.peek(this.count - 1);
    }

    public int indexOf(T val) {
        int middle = (int) Math.ceil(this.count / 2.0);
        Node<T> node1 = this.head;
        Node<T> node2 = this.tail;

        for (int pos = 0; pos < middle; pos++) {
            if (val.equals(node1.data)) {
                return pos;
            }
            if (val.equals(node2.data)) {
                return this.count - 1 - pos;
            }

            node1 = node1.next;
            node2 = node2.prev;
        }
        return -1;
    }

    public String print() {
        StringBuilder output = new StringBuilder("( ");
        Node<T> node = this.head;
        for (int i = 0; i < this.count; i++) {
            if (output.length() > 2) {
                output.append(", ");
            }
            output.append("[").append(i).append("]: ").append(node.data);
            node = node.next;
        }
        output.append(" ), count: ").append(this.count);
        return output.toString();
    }
}
