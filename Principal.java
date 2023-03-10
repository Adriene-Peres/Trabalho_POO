import java.util.Scanner;

// Adriene Peres
// versao 1.0

public class Principal {
    private static Controle cont;
    private static Scanner ent;

    public static void main(String[] args) {
        cont = new Controle();
        ent = new Scanner(System.in);
        escolheMenu();
        
      
    }
     
    public static void escolheMenu(){
        int op = definirAcesso();
        if (op == 1) {
            do {
                op = MenuAdministrador();
                System.out.println();
                executarOpcaoAdm(op);
            } while (op != 0);

        } else if (op == 2) {
            do {
                op = MenuCliente();
                System.out.println();
                executarOpcaoCliente(op);
            } while (op != 0);
        }
    }

    // metodo para exibir menu de administrador
    private static int MenuAdministrador() {
        System.out.println("###### Menu de opções ####### ");
        System.out.println("1 - Cadastrar Veículo: ");
        System.out.println("2 - Remover Veículo: ");
        System.out.println("3 - Visualizar Veículos: ");
        System.out.println("4 - Conferir Disponibilidade: ");
        System.out.println("5 - Cadastrar Cliente: ");
        System.out.println("6 - Remover Cliente: ");
        System.out.println("7 - Cancelar Reservar: ");
        System.out.println("8 - Gerar Relatório: ");
        System.out.println("9 - Menu inicial: ");
        System.out.println("10 - Salvar: ");
        System.out.println("0 - Sair: ");

        System.out.println("\nDigite a opção desejada: ");

        // Objeto da classe Scanner para pedir a entrada do usuário
        Scanner entrada = new Scanner(System.in);
        // Pede entrada pro usuário
        int opcao = entrada.nextInt();
        // Retorna a entrada
        return opcao;
    }

    private static int MenuCliente() {
        System.out.println("###### Menu de opções ####### ");
        System.out.println("1 - Fazer reserva");
        System.out.println("2 - Cancelar reserva");
        System.out.println("3 - Visualizar veículos disponíveis");
        System.out.println("4 - Menu inicial: ");
        System.out.println("5 - Salvar: ");
        System.out.println("0 - Sair: ");

        System.out.println("\nDigite a opção desejada: ");

        // Objeto da classe Scanner para pedir a entrada do usuário
        Scanner entrada = new Scanner(System.in);
        // Pede entrada pro usuário
        int opcao = entrada.nextInt();
        // Retorna a entrada
        return opcao;
    }

    // metodo para saber o tipo de pessoa que esta acessando o sistema
    private static int definirAcesso() {
        System.out.println("Digite 1 para Administrador: ");
        System.out.println("Digite 2 para Cliente: ");
        Scanner s = new Scanner(System.in);
        int aux = s.nextInt();

        System.out.println();
        if (aux == 1) {
            return 1;
        } else if (aux == 2) {
            return 2;
        } else {
            return 0;
        }
    }

    // metodo para saber o tipo de veiculo (carro ou moto)
    private static int definirTipodeVeiculo() {
        System.out.println("Digite 1 para Carro: ");
        System.out.println("Digite 2 para Moto: ");
        Scanner s = new Scanner(System.in);
        int aux = s.nextInt();

        System.out.println();
        if (aux == 1) {
            return 1;
        } else if (aux == 2) {
            return 2;
        } else {
            return 0;
        }
    }

    // metodo para saber o tipo de carro (combustão, elétrico ou gás)
    private static int definirTipodeCarro() {
        System.out.println("Digite 1 para Combustão: ");
        System.out.println("Digite 2 para Elétrico: ");
        System.out.println("Digite 3 para a Gás: ");
        Scanner s = new Scanner(System.in);
        int aux = s.nextInt();

        System.out.println();
        if (aux == 1) {
            return 1;
        } else if (aux == 2) {
            return 2;
        } else if (aux == 3) {
            return 3;
        } else {
            return 0;
        }
    }

    // executa as opções existentes no menu de adm
    private static void executarOpcaoAdm(int op) {
        switch (op) {
            case 1:
                
                cadastrarVeiculo();
                break;
            case 2:
                removerVeiculo();
                break;
            case 3:
                visualizarVeiculos();
                break;
            case 4:
                conferirDisponibilidade();
                break;
            case 5:
                cadastrarCliente();
                break;
            case 6:
                removerCliente();
                break;
            case 7:
                cancelarReserva();
                break;
            case 8:
                gerarRelatorio();
                break;
            case 9:
                 escolheMenu();
                 break;    
            case 10:
                salvar();
                break;
            default:
                break;
        }
    }

    // executa as opções existentes no menu de cliente
    private static void executarOpcaoCliente(int op) {
        switch (op) {
            case 1:
                fazerRezerva();        
                break;
            case 2:
                cancelarReserva();
                break;
            case 3:
                visualizarVeiculos();
                 break;
            case 4:
                 escolheMenu();
                 break;
            case 5:
                salvar();     
            default:
                break;
        }
    }

    private static String lerNome() {
        // nome do cliente
        System.out.println("Insira seu nome: ");
        return ent.nextLine();
    }

    private static int lerIdade() {
        // idade cliente
        System.out.println("Insira sua idade: ");
        return ent.nextInt();
    }

    private static String lerCpf() {
        // cpf cliente
        System.out.println("Insira o número do seu cpf: ");
        return ent.nextLine();
    }

    private static String lerMarca() {
        // marca do carro/moto
        System.out.println("Insira a marca do veículo: ");
        return ent.nextLine();
    }

    private static String lerTipo() {
        // tipo de veiculo
        System.out.println("Insira o tipo do veículo: ");
        return ent.nextLine();
    }

    private static String lerCambio() {
        // tipo de cambio do veiculo
        System.out.println("Insira o tipo de câmbio do veículo: ");
        return ent.nextLine();
    }

    private static String lerPlaca() {
        // placa do veículo
        System.out.println("Insira a placa do veículo: ");
        return ent.nextLine();
    }

    private static int lerQtdPortas() {
        // quantidade de portas do carro
        System.out.println("Insira a quantidade de portas do carro: ");
        return ent.nextInt();
    }

    private static double lerTamnhoTanque() {
        // tamanho do tanque do carro a combustão
        System.out.println("Insira o tamanho do tanque: ");
        return ent.nextDouble();
    }

    private static String lerEstilo() {
        // estilo da moto
        System.out.println("Insira o estilo da moto: ");
        return ent.nextLine();
    }

    private static double lerCapacidadeBateria() {
        // capacidade da bateria de carro eletrico
        System.out.print("Insira a capacidade da bateria: ");
        return ent.nextDouble();

    }

    private static int lerQtdCilindros() {
        // quantidade de cilindros do carro a gás
        System.out.print("Insira a quantidade de cilindros: ");
        return ent.nextInt();

    }

    private static double lerCapacidadeCilindro() {
        // capaciadade dos cilindros
        System.out.print("Insira a capacidade dos cilindros: ");
        return ent.nextDouble();
    }

    private static double lerPrecoFixo() {
        // preço fixodo aluguel de determidado veiculo
        System.out.print("Insira o valor fixo do aluguel: ");
        return ent.nextDouble();
    }

    public static int lerQtdDias(){
        //quantidade de dias que o veiculo será reservado
        System.out.print("Insira a quatidade de dias que o veículo será reservado: ");
        return ent.nextInt();
    }

    public static int lerMesReserva(){
        //mês no qual o veículo será reservado
        System.out.print("Insira o número referente ao mês que gostaria de reservar o veículo: ");
        return ent.nextInt();

    }

    public static int lerDataInicial(){
        //primeiro dia no qual o veículo será reservado
        System.out.print("Insira o dia inicial da reserva:  ");
        ent.nextLine();
        return ent.nextInt();

    }

    private static void cadastrarVeiculo() {
        System.out.println("----------------------------------------------------------");
        System.out.println("\nCadastrar Veículo");
        System.out.println();

        if (definirTipodeVeiculo() == 1) {
            if (definirTipodeCarro() == 1) {
                cont.cadastraVeiculo(
                        new Combustao(lerMarca(), lerTipo(), lerCambio(), lerPlaca(), lerPrecoFixo(), lerQtdPortas(),
                                lerTamnhoTanque()));

            } else if (definirTipodeCarro() == 2) {
                cont.cadastraVeiculo(
                        new Eletrico(lerMarca(), lerTipo(), lerCambio(), lerPlaca(), lerPrecoFixo(), lerQtdPortas(),
                                lerCapacidadeBateria()));

            } else if (definirTipodeCarro() == 3) {
                cont.cadastraVeiculo(
                        new Gas(lerMarca(), lerTipo(), lerCambio(), lerPlaca(), lerPrecoFixo(), lerQtdPortas(),
                                lerQtdCilindros(), lerCapacidadeCilindro()));
            }
        } else if (definirTipodeVeiculo() == 2) {
            cont.cadastraVeiculo(new Moto(lerMarca(), lerTipo(), lerCambio(), lerPlaca(), lerPrecoFixo(), lerEstilo()));

        } else {
            System.out.print("Insira uma opção valida: ");
        }
    }

    private static void removerVeiculo() {
        System.out.println("----------------------------------------------------------");
        System.out.println("\nRemover Veículo");
        System.out.println();

        System.out.print("\nInsira a placa do veículo que deseja remover: ");
        String placa = ent.nextLine();
        if (!cont.buscaPlaca(placa)) {
            cont.removeVeiculo(cont.buscarVeiculo(placa));
        } else {
            System.out.println("O veículo não pode ser removido pois encontra-se reservado.");
        }
    }

    private static void visualizarVeiculos() {
        System.out.println("----------------------------------------------------------");
        System.out.println("\nLista de veículos existentes");
        System.out.println();

        cont.visualizaVeiculos();
    }

    private static boolean conferirDisponibilidade() {
        System.out.println("----------------------------------------------------------");
        System.out.println("\nConferir disponibilidade");
        System.out.println();

        String placa = ent.nextLine();
        if (cont.buscaPlaca(placa)) { // se a placa for encontrada
            if (verificar.data) {

            }
        } else {

        }
    }

    private static void cadastrarCliente() {
        System.out.println("----------------------------------------------------------");
        System.out.println("\nCadastrar Cliente");
        System.out.println();

        cont.cadastraCliente(new Cliente(lerNome(), lerIdade(), lerCpf()));
    }

    private static void removerCliente() {
        System.out.println("----------------------------------------------------------");
        System.out.println("\nRemover Cliente");
        System.out.println();

        System.out.print("\nInsira o cpf do cliente que deseja remover: ");
        String cpf = ent.nextLine();

        cont.removeCliente(cont.buscarCliente(cpf));
    }

    private static void cancelarReserva() {

    }

    private static void gerarRelatorio() {

    }

    private static void salvar() {

    }

    private static void fazerRezerva() {
        String cpf = lerCpf();
        if (cont.verificaCliente(cpf)) {
            Cliente c = cont.buscarCliente(cpf);
            System.out.println("Cliente já cadastrado!");
            System.out.println("Chegou 1");
            visualizarVeiculos();
            lerMesReserva();
            System.out.println("Chegou 2");
            cont.fazReserva(c,lerQtdDias(),lerMesReserva(),lerDataInicial(),lerPlaca());

        } else {
            System.out.println("Para fazer reserva é necessário fazer um cadastro!");
            cadastrarCliente();
            Cliente c = cont.buscarCliente(cpf);
            System.out.println("Cadastro realizado com sucesso!");
            visualizarVeiculos();
            cont.fazReserva(c,lerQtdDias(),lerMesReserva(),lerDataInicial(),lerPlaca());
            
        }
    }

}