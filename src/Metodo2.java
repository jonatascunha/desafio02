import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Metodo2 {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }
        public void returnmap () {
            Map<String, Integer> map = new HashMap<>();
            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    map.put("par", numero);
                } else {
                    map.put("impar", numero);
                }

            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }


        }
    }


