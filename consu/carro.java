
public class carro {

    String placa;
    String cor;
    int ano;
    String tipo_combustivel;
    int portas;
    double kilometragem;
    String renavam;
    String chassi;
    double valor_locacao;
    Modelo modelo = new Modelo();
    Marca marca = new Marca();

    public void cadastroCarro(String p, String c, int a, String comb, int portas, double kilom, String modelo, String marca){
        this.placa = p;
        this.ano = a;
        this.cor = c;
        this.tipo_combustivel = comb;
        this.portas = portas;
        this.kilometragem = kilom;
        this.modelo.descricao = modelo;
        this.marca.descricao = marca;
        

    }
}