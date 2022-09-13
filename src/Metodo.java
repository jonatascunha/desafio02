import java.util.ArrayList;



public class Metodo {
    public static void main(String[] args) {
        Metodo2 metodo = new Metodo2();
        ArrayList<Integer> list = new ArrayList();
        for(int i=0; i<=10; i++) {
            list.add(i);
        }

        System.out.println(metodo.listaParesImpares(list));

    }
}
