import java.util.ArrayList;

public class Controle {
    private ArrayList<Veiculo> veiculo;
    private ArrayList<Cliente> cliente;

    public Controle() {
        veiculo = new ArrayList<Veiculo>();
        cliente = new ArrayList<Cliente>();
    }

    public void cadastraVeiculo(Veiculo v) {
        veiculo.add(v);
    }

    public void removeVeiculo(Veiculo v) {
        veiculo.remove(v);
    }

    public void visualizaVeiculos() {
        for (Veiculo v : veiculo) {
            System.out.println(v);
            System.out.println("-----------------");
        }
    }

    public void cadastraCliente(Cliente c) {
        cliente.add(c);
    }

    public void removeCliente(Cliente c) {
        cliente.remove(c);
    }

    public boolean verificaCliente(String cpf) {
        return cliente.contains(buscarCliente(cpf));
    }
    
    public void fazReserva(Cliente c,int qtdeDias, int mesReservado, int diaInicial, String placa){
        Veiculo v =buscarVeiculo(placa);
        c.reservarVeiculo(qtdeDias, mesReservado, diaInicial, v);
        
    }

    // Método que busca a placa e retorna um booleano caso p veiculo referente a placa esteja reservado
    public boolean buscaPlaca(Veiculo v) {
        for (Cliente cliente2 : cliente) {
            Veiculo atual = cliente2.getReserva().getVeiculo();
            if (atual.getPlaca().equals(v.getPlaca())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    // metodo que busca e retornar um veiculo a partir de seu placa
    public Veiculo buscarVeiculo(String info) {
        for (Veiculo v : veiculo) {
            if (v.getPlaca().equals(info)) {
                return v;
            }
        }
        return null;
    }

    // metodo que busca e retornar um cliente a partir de seu cpf
    public Cliente buscarCliente(String cpf) {
        for (Cliente c : cliente) {
            if (c.getCpf().equals((cpf))) {
                return c;
            }
        }
        return null;
    }

}
