import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Veiculo fuca = new Veiculo();
        fuca.setModelo("Vw fuscao preto");
        fuca.setCor("Preto");
        fuca.setPlaca("RI 20:38");

        Carreta carreta = new Carreta();
        carreta.setCor("Azul");
        carreta.setModelo("Feneme");
        carreta.setPlaca("RIR 29:40");

        List<Veiculo> estacionamento = new LinkedList<>();
        estacionamento.add(fuca);
        estacionamento.add(carreta);

        for (Veiculo variavel:estacionamento){
            System.out.println(variavel);
        }
    }
}