public class Cliente {
    String nome;
    String cpf;
    String tel;
    Endereco endereco;

    public void cadastrarCliente (String nome, String cpf, String fone){
        this.nome = nome;
        this.cpf = cpf;
        this.tel = fone;
    }
}
