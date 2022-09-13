import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MetodoCarro2 {
    public void mapAno(ArrayList<Carro> carros) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int j =0;
        int k =0;
        for (Carro i : carros) {
            if(i.anoFabricacao.equals("1992")) {
                map.put("1992", Integer.valueOf(j = j + 1));
            }
            else {
                map.put("1993", Integer.valueOf(k = k + 1));
            }

        }
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));

        }


    }


}
