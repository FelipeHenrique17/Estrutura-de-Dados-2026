import java.util.ArrayList;

public class Deque<T> {
    private ArrayList<T> data; //lista privada

    public Deque(){
        this.data = new ArrayList<T>(); //lista vazia
    }

    //metodo para inserção no início da estrutura
    public void insertFront (T val){
        this.data.add(0, val);
    }

    //metodo para inserção no final da estrutura
    public void insertBack (T val){
        this.data.add(val);
    }

    //metodo para remoção do início da estrutura
    public T removeFront(){
        if (isEmpty()) return null;
        return this.data.remove(0);
    }

    //metodo para remoção do final da estrurura
    public T removeBack(){
        if (isEmpty()) return null;
        return this.data.remove(this.data.size() - 1);
    }

    //metodo para consultar o início da estrutura (sem remover)
    public T peekFront(){
        if (isEmpty()) return null;
        return this.data.get(0);
    }

    //metodo para consultar o final da estrutura (sem remover)
    public T peekBack(){
        if (isEmpty()) return null;
        return this.data.get(this.data.size() - 1);
    }

    //metodo para informar se o deque esta vazio ou não
    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    //metodo que imprime o deque (para efeitos de depuração)
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
