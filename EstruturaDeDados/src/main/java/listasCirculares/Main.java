package listasCirculares;

public class Main {
    public static void main(String[] args) {

        listaCircular<String> minhaListaCircular = new listaCircular<>();

        minhaListaCircular.add("c0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c1");
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(3));
    }
}
