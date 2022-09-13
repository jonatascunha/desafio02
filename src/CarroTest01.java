import java.util.ArrayList;


public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        carro2.marca = "Volvo";
        carro.anoFabricacao="1992";
        carro.marca = "GM";
        carro2.anoFabricacao="1993";

        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(carro);
        carros.add(carro2);
        MetodoCarro carrinho = new MetodoCarro();
        carrinho.map(carros);
        MetodoCarro2 carrinho2 = new MetodoCarro2();
        carrinho2.mapAno(carros);

    }
}
