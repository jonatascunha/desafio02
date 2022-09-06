import java.util.ArrayList;


public class Metodo {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (Integer i = 0; i <= 10; i++) {
            numeros.add(i);
        }
        Metodo2 map = new Metodo2();
        map.returnmap(numeros);

    }
}

