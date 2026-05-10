public class TesteDeque {
    public static void main(String[] args){
        Deque<String> listaCompras = new Deque();
        System.out.println(listaCompras.print());

        //alimenticio -> início
        listaCompras.insertFront("Arroz");
        listaCompras.insertFront("Feijão");
        listaCompras.insertFront("Macarrão");
        System.out.println(listaCompras.print());

        //higiene/limpeza -> final
        listaCompras.insertBack("Sabão em pó");
        listaCompras.insertBack("Desodorante");
        listaCompras.insertBack("Água sanitária");
        System.out.println(listaCompras.print());

        listaCompras.insertFront("Café");
        listaCompras.insertFront("Açúcar");
        System.out.println(listaCompras.print());

        listaCompras.insertBack("Shampoo");
        listaCompras.insertBack("Amaciante");
        System.out.println(listaCompras.print());

        //desisti de comprar algumas coisas do final
        String removido = listaCompras.removeBack();
        System.out.println("Removido (Back): " + removido);
        System.out.println(listaCompras.print());

        //desisti de comprar algumas coisas do início
        removido = listaCompras.removeFront();
        System.out.println("Removido (Front): " + removido);
        System.out.println(listaCompras.print());

        //consultar qual o próximo item da lista (início)
        String proximo = listaCompras.peekFront();
        System.out.println("Próximo (Front): " + proximo);

        //consultar qual o próximo item da lista (final)
        String ultimo = listaCompras.peekBack();
        System.out.println("Último (Back): " + ultimo);
    }
}
