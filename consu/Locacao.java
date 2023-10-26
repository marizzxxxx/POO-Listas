import java.time.LocalDateTime;

public class Locacao {
    carro c;
    LocalDateTime datalocacao;
    LocalDateTime datadevolucao;
    double valor;
    Cliente cliente;

    public void imprimirlocacao() {
        System.out.println("Locação de veiculos");
        System.out.println("Modelo: "+this.c.modelo);
        System.out.println("Modelo: "+this.c.placa);
        System.out.println("Modelo: "+this.c.cor);
        System.out.println("Modelo: "+this.c.ano);
        System.out.println("Cliente: "+this.cliente.nome);
        System.out.println("Data de locação: "+this.datalocacao.toString());
        System.out.println("Data de devolução: "+this.datadevolucao.toString());
        System.out.println("valor a pagar: "+this.valor);

    }
}
