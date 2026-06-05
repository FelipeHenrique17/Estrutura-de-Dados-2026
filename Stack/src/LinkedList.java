public class LinkedList<T> {

    // classe interna que representa a unidade de armazenamento da lista encadeada
    public static class Node<T>{
        public T data;
        public Node<T> next;

        public Node(T val){
            this.data = val;
            this.next = null;
        }
    }
    private Node<T> head ; // inicio da lista (cabeça)
    private Node<T> tail ; // fim da lista (cauda)
    private int count; // quantidade de nodos da lista

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    // metodo que retorna se a lista esta vazia ou não
    public boolean isEmpty(){
        return this.count == 0;
    }

    // metodo que retorna a quantidade de elementos da lista
    public int getCount(){
        return this.count;
    }

    // metodo para inserir em qualquer posição um nodo na lista
    public void insert(int pos, T val){
        // cria o nó para armazenar o valor pretendido
        Node<T> inserted = new Node(val);

        // 1 caso: a lista está vazia
        if (isEmpty()){
            this.head = inserted;
            this.tail = inserted;
        }

        // 2 caso: lista não vazia, inserção na primeira posição
        else if (pos == 0){
            inserted.next = this.head;
            this.head = inserted;
        }

        // 3 caso: inserção no final da lista
        else if (pos >= this.count){
            this.tail.next = inserted;
            this.tail = inserted;
        }

        // 4 caso: posição intermediária
        else {
            Node<T> before = this.head;
            for(int i = 1; i < pos; i++){
                before = before.next;
            }
                Node<T> after = before.next;
                inserted.next = after;
                before.next = inserted;
        }
        this.count++;
    }
    // metodo para inserção da primeira posição (atalho)
    public void insertHead(T val){
        this.insert(0, val);
    }

    // metodo para inserção na última posição (atalho)
    public void insertTail(T val){
        this.insert(this.count, val);
    }

    // metodo para remoção de um nodo na lista
    public T remove(int pos){
        // 1 caso: a lista está vazia ou posição informada está fora dos limites da lista
        if (isEmpty() || pos < 0 || pos > this.count - 1){
            return null;
        }
        Node<T> removed;

        // 2 caso: remoção do inicio da lista
        if (pos == 0){
            removed = this.head;
            this.head = this.head.next;

            // atualizando o tail em caso de remoção do único nodo restante
            if (this.count == 1){
                this.tail = null;
            }
        }

        // 3 caso: remoção de nodo intermediário ou final da lista
        else{
            Node<T> before = this.head;
            for(int i = 1; i < pos; i++){
                before = before.next;
            }
            removed = before.next;
            Node<T> after = removed.next;
            before.next = after;

            if (pos == this.count - 1){
                this.tail = before;
            }
        }
        this.count--;
        return removed.data;
    }

    public T removedHead(){
        return this.remove(0);
    }

    public T removedTail(){
        return this.remove(this.count - 1);
    }

    public int indexOf(T val){
        // 1 caso: lista vazia
        if (isEmpty()){
            return - 1;
        }
        Node<T> node = this.head;
        for (int i = 0; i < this.count; i++){
            if(node.data.equals(val)){
                return i;
            }
            node = node.next;
        }
        return - 1;
    }
    public T peek(int pos){
        // 1 caso: lista vazia ou posição fora dos limites
        if (isEmpty() || pos < 0 || pos > this.count - 1){
            return null;
        }
        Node<T> node = this.head;
        for (int i = 0; i < pos; i++){
            node = node.next;
        }
        return node.data;
    }

    public T peekHead(){
        return this.peek(0);
    }

    public T peekTail(){
        return this.peek(this.count - 1);
    }

    public String print(){
        StringBuilder output = new StringBuilder("( ");
        Node<T> node = this.head;
        for (int i = 0; i < this.count; i++){
            if (output.length() > 2) output.append(", ");
            output.append("[").append(i).append("]: ").append(node.data);
            node = node.next;
        }
        output.append(" ), count: ").append(this.count);
        return output.toString();
    }
}

