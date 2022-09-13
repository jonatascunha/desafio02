import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MetodoCarro {
        public void map(ArrayList<Carro> carros) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            int j =0;
            int k =0;
            for (Carro i : carros) {
                if(i.marca.equals("GM")) {
                    map.put("GM", Integer.valueOf(j = j + 1));
                }
                else {
                map.put("Volvo", Integer.valueOf(k = k + 1));
            }

        }
            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));

            }


        }

}
