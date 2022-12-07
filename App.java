import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Companhia Aérea");
        System.out.println("Bem-vindo ao Aeroporto!");


        do{
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastrar Aeronave");
            System.out.println("2 - Cadastrar Hangar");
            System.out.println("3 - Cadastrar Pista");
            System.out.println("4 - Cadastrar Companhia");
            System.out.println("5 - Cadastrar Voo");
            System.out.println("6 - Listar Voo");
            System.out.println("7 - Listar Hangar");
            System.out.println("8 - Listar Pista");
            System.out.println("7 - Listar Companhia");
            System.out.println("8 - Listar Aeronave");
            System.out.println("13 - Sair");
            System.out.print("Opção: ");
            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    cadastrarAeronave(scanner);
                    break;
                case 2:
                    cadastrarHangar(scanner);
                    break;
                case 3:
                    cadastrarPista(scanner);
                    break;
                case 4:
                    cadastrarCompanhia(scanner);
                    break;
                case 5:
                    cadastrarVoo(scanner);
                    break;
                case 6:
                    listarVoos();
                    break;
                case 7:
                    listarHangares();
                    break;
                case 8:
                    listarPistas();
                    break;

            }


        }while (opcao != 13);
    }

    public static void cadastrarAeronave(Scanner scanner) {
        System.out.println("Cadastrar Aeronave");
        System.out.println("Informe o id da aeronave:");
        int getById = scanner.nextInt();
        System.out.println("Informe a marca da aeronave:");
        String marca = scanner.next();
        System.out.println("Informe o modelo da aeronave:");
        String modelo = scanner.next();

        System.out.println("Digite o tipo: ([A] Avião; [H] Helicóptero; [J] Jato)");
        String tipo = scanner.next();
    
        switch (tipo) {
            case "A":{
                System.out.println("Informe o capacidade do avião:");
                int capacidade = scanner.nextInt();
                System.out.println("Informe o prefixo do avião:");
                String prefixo = scanner.next();
                System.out.println("Informe a companhia do avião:");
                int idCompanhia = scanner.nextInt();
                try {
                    Companhia companhia = Companhia.getById(idCompanhia);
                    Aviao aviao = new Aviao(
                        marca,
                        modelo,
                        capacidade,
                        prefixo
                    );   
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
                break;
            }
            case "H":{            
                System.out.println("Informe o capacidade do helicóptero:");
                int capacidade = scanner.nextInt();
                System.out.println("Informe a cor do helicóptero:");
                String cor = scanner.next();
                
                try {
                    Helicoptero helicoptero = new Helicoptero(
                        marca,
                        modelo,
                        capacidade,
                        cor
                    );   
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
            }
            break;
            case "J":{            
                System.out.println("Informe o capacidade do jato:");
                int velocidade = scanner.nextInt();
                System.out.println("Informe a cor do jato:");
                String cor = scanner.next();
                
                try {
                    Jato jato = new Jato(
                        marca,
                        modelo,
                        velocidade,
                        cor
                    );   
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
            }
            break;           
        default:
            break;
        }
    }
    public static void cadastrarHangar(Scanner scanner) {
        System.out.println("Cadastrar Hangar");
        System.out.println("Informe o local do hangar:");
        String local = scanner.next();
        System.out.println("Informe o id do Avião:");
        int idAviao = scanner.nextInt();
        try {
            Aviao aviao = Aviao.getById(idAviao);
            Hangar hangar = new Hangar(local, aviao, idAviao);
            System.out.println("Hangar cadastrado com sucesso!");
            System.out.println(hangar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void cadastrarPista(Scanner scanner) {
        System.out.println("Cadastrar Pista");
        System.out.println("Informe o id da Pista:");
        int id = scanner.nextInt();
        System.out.println("Informe o numero da Pista:");
        String numero = scanner.next();
        Pista pista = new Pista(id, numero);
        System.out.println("Pista cadastrada com sucesso!");
        System.out.println(pista);
    }

    public static void cadastrarCompanhia(Scanner scanner) {
        System.out.println("Cadastrar Companhia");
        System.out.println("Informe o id da Companhia:");
        int id = scanner.nextInt();
        System.out.println("Informe o nome da Companhia:");
        String nome = scanner.next();
        System.out.println("Informe o cnpj da Companhia:");
        String cnpj = scanner.next();
        Companhia companhia = new Companhia(id, nome, cnpj);
        System.out.println("Companhia cadastrada com sucesso!");
        System.out.println(companhia);
    }

    public static void cadastrarVoo(Scanner scanner) {
        System.out.println("Cadastrar Voo");
        System.out.println("Informe o id do Voo:");
        int id = scanner.nextInt();
        System.out.println("Informe o numero do Voo:");
        String numero = scanner.next();
        System.out.println("Informe a data do Voo:");
        String data = scanner.next();
        System.out.println("Informe a hora do Voo:");
        String hora = scanner.next();
        System.out.println("Informe a origem do Voo:");
        String origem = scanner.next();
        System.out.println("Informe a destino do Voo:");
        String destino = scanner.next();
        System.out.println("Informe a piloto do Voo:");
        String piloto = scanner.next();
        System.out.println("Informe a copiloto do Voo:");
        String copiloto = scanner.next();
        System.out.println("Informe a observação do Voo:");
        String observacao = scanner.next();
        System.out.println("Informe o id da pista do Voo: ");
        int idPista = scanner.nextInt();
        Pista idPistaVerificado = Pista.verificaId(idPista);
        System.out.println("Digite o tipo: ([A] Avião; [H] Helicóptero; [J] Jato)");
        String tipo = scanner.next();
    
        switch (tipo) {
            case "A":{
                try {
                    System.out.println("Informe o id do avião:");
                    int idAviao = scanner.nextInt();
                    Aviao idAviaoVerificado = Aviao.verificaId(idAviao);
                    new Voo(idAviao, numero, data, hora, origem, destino, piloto, copiloto, observacao, idPistaVerificado, idPista, idAviaoVerificado, idAviao, tipo);
            }catch (Exception e) {
                        System.out.println(e.getMessage());
                }
                break;
            }
            case "H":{            
                try {
                    System.out.println("Informe o id do helicóptero:");
                    int idAviao = scanner.nextInt();
                    Aviao idAviaoVerificado = Aviao.verificaId(idAviao);
                    new Voo(idAviao, numero, data, hora, origem, destino, piloto, copiloto, observacao, idPistaVerificado, idPista, idAviaoVerificado, idAviao, tipo);
            }catch (Exception e) {
                        System.out.println(e.getMessage());
                }
                break;
            }
            case "J":{            
                try {
                    System.out.println("Informe o id do avião:");
                    int idAviao = scanner.nextInt();
                    Aviao idAviaoVerificado = Aviao.verificaId(idAviao);
                    new Voo(idAviao, numero, data, hora, origem, destino, piloto, copiloto, observacao, idPistaVerificado, idPista, idAviaoVerificado, idAviao, tipo);
            }catch (Exception e) {
                        System.out.println(e.getMessage());
                }
                break;
            }          
        default: {
            break;
            }
        }
    }
    public static void listarVoos() {
        System.out.println("Listar Voos");
        for (Voo voo : Voo.getVoos()) {
            System.out.println(voo);
        }
    }
    public static void listarAeronaves() {
        System.out.println("Listar Aeronaves");
        for (Aeronave aeronave : Aeronave.getAeronaves()) {
            System.out.println(aeronave);
        }
    }
    public static void listarAvioes() {
        System.out.println("Listar Aviões");
        for (Aviao aviao : Aviao.getAvioes()) {
            System.out.println(aviao);
        }
    }
    public static void listarHelicopteros() {
        System.out.println("Listar Helicóopteros");
        for (Helicoptero helicoptero : Helicoptero.getHelicopteros()) {
            System.out.println(helicoptero);
        }
    }
    public static void listarJatos() {
        System.out.println("Listar Jatos");
        for (Jato jatos : Jato.getJatos()) {
            System.out.println(jatos);
        }
    }
    public static void listarCompanhias() {
        System.out.println("Listar Companhias");
        for (Companhia companhias : Companhia.getCompanhias()) {
            System.out.println(companhias);
        }
    }
    public static void listarHangares() {
        System.out.println("Listar Hangares");
        for (Hangar hangares : Hangar.getHangares()) {
            System.out.println(hangares);
        }
    }
    public static void listarPistas() {
        System.out.println("Listar Pistas");
        for (Pista pistas : Pista.getPistas()) {
            System.out.println(pistas);
        }
    }
}


