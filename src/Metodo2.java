import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Metodo2 {
    int resultpar = 0;
    int resultimpar =0;
    public List<List<Integer>> listaParesImpares(List<Integer> numeros) {

        List<Integer> listaPares = new ArrayList<>();
        List<Integer> listaImpares = new ArrayList<>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        int j =0;
        int k =0;
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                listaPares.add(numero);
                map.put("Par", Integer.valueOf(j = j + 1));

            }
            else {
                listaImpares.add(numero);
                map.put("Impar", Integer.valueOf(k = k + 1));

            }

        }

        List<List<Integer>> resultado = new ArrayList<>();

        resultado.add(listaPares);
        resultado.add(listaImpares);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));

        }

        return resultado;


    }




    }


