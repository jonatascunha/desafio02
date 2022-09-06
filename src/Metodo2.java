import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Metodo2 {

        public void returnmap (List<Integer> list) {
            Map<String, Integer> map = new HashMap<>();
            for (Integer numero : list) {
                if (numero % 2 == 0) {
                    map.put("par", numero);
                } else {
                    map.put("impar", numero);
                }

                for (String key : map.keySet()) {
                    System.out.println(key + ": " + map.get(key));

                }

            }

        }
    }


