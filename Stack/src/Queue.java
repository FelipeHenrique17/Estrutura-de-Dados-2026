import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> data; //lista privada

    public Queue() {
        this.data = new ArrayList<T>(); //lista vazia
    }

    //metodo para inserção de dados na fila
    public void enqueue(T val){
        this.data.add(val);
    }

    //metodo para remoção de dados na fila
    public T dequeue(){
        if (isEmpty()) return null;
        return this.data.remove(0);
    }

    //metodo para verificar se a fila está vazia ou não
    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    //metodo para consultar o início da fila sem remover o elemento
    public T peek(){
        if (isEmpty()) return null;
        return this.data.get(0);
    }

    //metodo que imprime a fila (para efeitos de depuração)
    public String print(){
        StringBuilder output = new StringBuilder("[ ");
        for (int i = 0; i < this.data.size(); i++){
            if (output.length() > 2) output.append(", ");
            output.append("(").append(i).append("): ").append(this.data.get(i));
        }
        output.append(" ]");
        return output.toString();
    }
}
