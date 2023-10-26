import java.time.LocalDateTime;

public class main {
    public static void main(String [] args) {
        Cliente c = new Cliente();
        c.cadastrarCliente("Laura Castelli", "09030553332", "88999448032");
        carro car = new carro();
        car.cadastroCarro("NUM23", "Cinza", 2023, "flex", 4, 0, "fusca", "chevroet");
        Locacao loc = new Locacao();
        loc.c = car;
        loc.cliente = c;
        loc.valor = 250000;
        loc.datalocacao = LocalDateTime.parse("2023/10/15", "08:00");
        
        
    }
    
}
