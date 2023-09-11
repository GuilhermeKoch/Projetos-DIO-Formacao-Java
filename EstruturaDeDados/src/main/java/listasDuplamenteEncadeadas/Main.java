package listasDuplamenteEncadeadas;

public class Main {
    public static void main(String[] args) {

       listaDuplamenteEncadeada<String> minhaListaEncadeada = new listaDuplamenteEncadeada<>();

       minhaListaEncadeada.add("c1");
       minhaListaEncadeada.add("c2");
       minhaListaEncadeada.add("c3");
       minhaListaEncadeada.add("c4");
       minhaListaEncadeada.add("c5");
       minhaListaEncadeada.add("c6");
       minhaListaEncadeada.add("c7");

       System.out.println(minhaListaEncadeada);

       System.out.println(minhaListaEncadeada.get(3));

       minhaListaEncadeada.remove(3);

       System.out.println(minhaListaEncadeada);

       minhaListaEncadeada.add(3, "a4");

       System.out.println(minhaListaEncadeada);

       System.out.println(minhaListaEncadeada.get(3));
        
    }
}
