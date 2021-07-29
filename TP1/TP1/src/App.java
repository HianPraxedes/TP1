import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Programa feito para gerenciar a lista de produtos de um vendedor

        int opcao;
        String nome[] = new String[100];
        String endereco[] = new String[100];
        int telefone[] = new int[100];
        int contLimpaTela;
        int totalPessoas = 10;
        int totalProdutos = 10;
        String nomeProduto[] = new String[100];
        String descricao[] = new String[100];
        float valor[] = new float[100];
        float porcentagem[] = new float[100];
        int quantidadeProdutos[] = new int[100];
        String armazenaString;
        int numPessoas;
        int numProdutos;

        // Usuairos
        nome[0] = "ITALO";nome[1] = "HIAN";nome[2] = "PEDRO HENRIQUE";nome[3] = "SAMUEL";nome[4] = "CARLOS EDUARDO";
        nome[5] = "DIEGO";nome[6] = "LUCAS MELO";nome[7] = "PEDRO LUCAS";nome[8] = "SANDER";nome[9] = "GABRIEL CARDOSO";
        // Endereço
        endereco[0] = "ABC123";endereco[1] = "DEF456";endereco[2] = "GHI789";endereco[3] = "JKL012";endereco[4] = "MNO345";
        endereco[5] = "PQR678";endereco[6] = "STU901";endereco[7] = "WXY234";endereco[8] = "ZAB567";endereco[9] = "CDE890";
        // Telefone
        telefone[0] = 000;telefone[1] = 111;telefone[2] = 222;telefone[3] = 333;telefone[4] = 444;
        telefone[5] = 555;telefone[6] = 666;telefone[7] = 777;telefone[8] = 888;telefone[9] = 999;
        // Nome dos produtos
        nomeProduto[0] = "MONITOR";nomeProduto[1] = "MOUSE";nomeProduto[2] = "TECLADO";nomeProduto[3] = "GABINETE";nomeProduto[4] = "MEMÓRIA RAM";
        nomeProduto[5] = "HD";nomeProduto[6] = "PROCESSADOR";nomeProduto[7] = "COOLER";nomeProduto[8] = "FONDE";nomeProduto[9] = "PLACA MÃE";
        // DISCRIÇÃO
        descricao[0] = "A";descricao[1] = "B";descricao[2] = "N";descricao[3] = "M";descricao[4] = "j";
        descricao[5] = "I";descricao[6] = "U";descricao[7] = "T";descricao[8] = "y";descricao[9] = "E";
        // Valor
        valor[0] = (float) 1.00;valor[1] = (float) 2.00;valor[2] = (float) 3.00;valor[3] = (float) 4.00;valor[4] = (float) 5.00;
        valor[5] = (float) 6.00;valor[6] = (float) 7.00;valor[7] = (float) 8.00;valor[8] = (float) 9.00;valor[9] = (float) 10.00;
        // Porcentagem
        porcentagem[0] = (float) 1.00;porcentagem[1] = (float) 1.00;porcentagem[2] = (float) 1.00;porcentagem[3] = (float) 1.00;porcentagem[4] = (float) 1.00;porcentagem[5] = (float) 1.00;
        porcentagem[6] = (float) 1.00;porcentagem[7] = (float) 1.00;porcentagem[8] = (float) 1.00;porcentagem[9] = (float) 1.00;
        // Quantidade de produtos
        quantidadeProdutos[0] = 1;quantidadeProdutos[1] = 2;quantidadeProdutos[2] = 3;quantidadeProdutos[3] = 4;quantidadeProdutos[4] = 5;
        quantidadeProdutos[5] = 6;quantidadeProdutos[6] = 7;quantidadeProdutos[7] = 8;quantidadeProdutos[8] = 9;quantidadeProdutos[9] = 10;

        Scanner ler = new Scanner(System.in);

        do {
            menu();

            armazenaString = ler.nextLine();
            opcao = Integer.parseInt(armazenaString);

            for (contLimpaTela = 0; contLimpaTela < 51; contLimpaTela++) {
                System.out.println("");
            }

            switch (opcao) {
                case 1:
                    // Aqui é o cadastro de usuário.
                    System.out.println("Quantas pessoas você vai cadastrar?");
                    // ArmazenaString recebe o valor e converte para inteiro em numPessoas, na linha
                    // de baixo atualiza o número de pessoas cadastradas.
                    armazenaString = ler.nextLine();
                    numPessoas = Integer.parseInt(armazenaString);
                    totalPessoas = numPessoas + totalPessoas;
                    cadastroNovoCliente(totalPessoas, nome, endereco, telefone, ler, numPessoas);
                    break;
                case 2:
                    // Aqui é a busca de cadastrados.
                    buscarCliente(totalPessoas, nome, endereco, telefone, ler);
                    break;
                case 3:
                    // Aqui é o cadastro de produtos.
                    System.out.println("Quantos produtos você vai cadastrar?");
                    // ArmazenaString recebe o valor e converte para inteiro em numProdutos, na
                    // linha de baixo atualiza o número de produtos cadastradas.
                    armazenaString = ler.nextLine();
                    numProdutos = Integer.parseInt(armazenaString);
                    totalProdutos = totalProdutos + numProdutos;
                    cadastroProduto(totalProdutos, ler, nomeProduto, descricao, valor, quantidadeProdutos, porcentagem,
                            numProdutos);
                    break;
                case 4:
                    // Aqui é a busca de produtos cadastrados.
                    buscaProduto(totalPessoas, totalProdutos, ler, nomeProduto, descricao, valor, quantidadeProdutos,
                            porcentagem);
                    break;
                case 5:
                    // Aqui é o cadastro de vendas.
                    cadastroVendas(totalProdutos, totalPessoas, nomeProduto, ler, nome, quantidadeProdutos);
                    break;
                case 6:
                    // Aqui mostra o estoque.
                    mostraEstoque(totalProdutos, nomeProduto, quantidadeProdutos, ler);
                    break;
                default:
            }
        } while (opcao < 7);
    }

    public static void menu() {
        System.out.println("==============ESCOLHA UMA OPÇÃO==============");
        System.out.println("1) Cadastro de novo cliente.");
        System.out.println("2) Busca por cliente.");
        System.out.println("3) Cadastro de novo produto.");
        System.out.println("4) Busca por produto.");
        System.out.println("5) Cadastro de venda.");
        System.out.println("6) Mostrar produtos em estoque.");
        System.out.println("7) SAIR");
    }

    public static void cadastroNovoCliente(int totalPessoas, String nome[], String endereco[], int telefone[],
            Scanner ler, int numPessoas) {

        String armazenaString;
        int i;
        int contLimpaTela;

        if (numPessoas > 0) {
            for (i = totalPessoas - numPessoas; i < totalPessoas; i++) {
                // Aqui começa a parte do cadastro, onde tudo é lido como string e o que não for
                // string é convertido logo depois.

                System.out.println("Digite o nome da pessoa.");
                nome[i] = ler.nextLine().toUpperCase();
                System.out.println("Digite o endereço da pessoa.");
                endereco[i] = ler.nextLine().toUpperCase();
                System.out.println("Digite o telefone da pessoa.");
                armazenaString = ler.nextLine();
                telefone[i] = Integer.parseInt(armazenaString);
                // Essa parte é feita para diminuir a poluição no ternimal, nada é apagado so é
                // passa do para cima.
                for (contLimpaTela = 0; contLimpaTela < 51; contLimpaTela++) {
                    System.out.println("");
                }
            }
        } else {
            System.out.println("Digite um número válido!");
        }
        // Essa parte é feita para diminuir a poluição no ternimal, nada é apagado so é
        // passa do para cima.
        for (contLimpaTela = 0; contLimpaTela < 51; contLimpaTela++) {
            System.out.println("");
        }
        System.out.println("Digite B para voltar ao menu.");
        armazenaString = ler.nextLine();
    }

    public static void buscarCliente(int totalPessoas, String nome[], String endereco[], int telefone[], Scanner ler) {

        // Aqui começa a parte de buscar os cadastrados na lista.

        String armazenaString;
        int contLimpaTela;
        int j;
        String nomePesquisa;
        Character S_N;
        int opcao2;
        int cont = 0;

        System.out.println("Digite um o nome do cadastrado.");
        nomePesquisa = ler.nextLine().toUpperCase();
        for (j = 0; j < totalPessoas; j++) {
            String nome1 = nome[j];
            // Aqui ele analisa cada parte do vetor e imprime os dados do cadastrado que foi
            // escolhido.
            if (nome1.equals(nomePesquisa)) {
                System.out.println("Resultado:");
                System.out.println("Nome: " + nome[j]);
                System.out.println("Endereço: " + endereco[j]);
                System.out.println("Telefone: " + telefone[j]);
                System.out.println("");
                // Aqui é pergunta se quer mudar alguma informação do cadastrado.
                System.out.println("Deseja alterar alguma informação?(S/N)");

                armazenaString = ler.nextLine().toUpperCase();
                S_N = armazenaString.charAt(0);
                // Aqui ele vê se o usuário digitou certo.
                while (S_N != 'S' && S_N != 'N') {
                    System.out.println("Resposta inválida! Deseja alterar alguma informação?(S/N)");
                    armazenaString = ler.nextLine().toUpperCase();
                    S_N = armazenaString.charAt(0);
                }
                if (S_N == 'S') {

                    System.out.println("Qual você deseja altetar?");
                    System.out.println("");
                    System.out.println("1)Nome");
                    System.out.println("2)Endereço");
                    System.out.println("3)Telefone");
                    System.out.println("4)Sair");

                    armazenaString = ler.nextLine();
                    opcao2 = Integer.parseInt(armazenaString);

                    // Aqui ele muda a informação.
                    switch (opcao2) {
                        case 1:
                            System.out.println("Digite o novo nome.");
                            nome[j] = ler.nextLine().toUpperCase();
                            break;
                        case 2:
                            System.out.println("Digite o novo endereço.");
                            endereco[j] = ler.nextLine().toUpperCase();
                            break;
                        case 3:
                            System.out.println("Digite o novo telefone.");
                            armazenaString = ler.nextLine();
                            telefone[j] = Integer.parseInt(armazenaString);
                            break;
                        default:
                    }
                }
            } else {

                cont++;
            }
        }
        if (cont == totalPessoas) {
            System.out.println("Cliente não encontrado!");
        }

        System.out.println("Digite B para voltar ao menu.");
        armazenaString = ler.nextLine();

        for (contLimpaTela = 0; contLimpaTela < 51; contLimpaTela++) {
            System.out.println("");
        }
    }

    public static void cadastroProduto(int totalProdutos, Scanner ler, String nomeProduto[], String descricao[],
            float[] valor, int quantidadeProdutos[], float[] porcentagem, int numProdutos) {

        String armazenaString;
        int i;
        int contLimpaTela;

        if (numProdutos > 0) {
            for (i = totalProdutos - numProdutos; i < totalProdutos; i++) {

                System.out.println("Digite o nome do produto.");
                nomeProduto[i] = ler.nextLine().toUpperCase();
                System.out.println("Digite a descrição do porduto.");
                descricao[i] = ler.nextLine().toUpperCase();
                System.out.println("Digite o valor.(Não colocar R$)");
                armazenaString = ler.nextLine();
                valor[i] = Float.parseFloat(armazenaString);
                System.out.println("Digite a porcentagem de lucro.(Sem %, apenas os números)");
                armazenaString = ler.nextLine();
                porcentagem[i] = Float.parseFloat(armazenaString);
                System.out.println("Digite a quanidade do estoque.");
                armazenaString = ler.nextLine();
                quantidadeProdutos[i] = Integer.parseInt(armazenaString);
                for (contLimpaTela = 0; contLimpaTela < 51; contLimpaTela++) {
                    System.out.println("");
                }
            }

        } else {
            System.out.println("Digite um número válido!");
        }
        System.out.println("Digite B para voltar ao menu.");
        armazenaString = ler.nextLine();

        for (contLimpaTela = 0; contLimpaTela < 51; contLimpaTela++) {
            System.out.println("");
        }

    }

    public static void buscaProduto(int totalPessoas, int totalProdutos, Scanner ler, String nomeProduto[],
            String descricao[], float[] valor, int quantidadeProdutos[], float[] porcentagem) {

        int j;
        String nomePesquisaProduto;
        String armazenaString;
        Character S_N;
        int opcao2;
        int contLimpaTela;
        int cont = 0;

        System.out.println("Digite o nome do produto cadastrado.");
        nomePesquisaProduto = ler.nextLine().toUpperCase();
        for (j = 0; j <= totalPessoas; j++) {
            String nome2 = nomeProduto[j];
            if (nome2.equals(nomePesquisaProduto)) {

                System.out.println("Resultado:");
                System.out.println("Nome do produto: " + nomeProduto[j]);
                System.out.println("Descrição: " + descricao[j]);
                System.out.println("Valor: R$" + valor[j]);
                System.out.println("Porcentagem de lucro: " + porcentagem[j] + "%");
                System.out.println("Quantidade: " + quantidadeProdutos[j]);
                System.out.println("");

                System.out.println("Deseja alterar alguma informação?(S/N)");
                armazenaString = ler.nextLine().toUpperCase();
                S_N = armazenaString.charAt(0);
                while (S_N != 'S' && S_N != 'N') {
                    System.out.println("Resposta inválida! Deseja alterar alguma informação?(S/N)");
                    armazenaString = ler.nextLine().toUpperCase();
                    S_N = armazenaString.charAt(0);
                }
                if (S_N == 'S') {
                    System.out.println("Qual você deseja altetar?");
                    System.out.println("");
                    System.out.println("1)Nome do produto");
                    System.out.println("2)Descrição");
                    System.out.println("3)Valor");
                    System.out.println("4)Porcentagem de lucro ");
                    System.out.println("5)Quantidade");
                    System.out.println("6)Sair");

                    armazenaString = ler.nextLine();
                    opcao2 = Integer.parseInt(armazenaString);
                    switch (opcao2) {
                        case 1:
                            System.out.println("Digite o novo nome.");
                            armazenaString = ler.nextLine();
                            nomeProduto[j] = armazenaString.toUpperCase();
                            break;
                        case 2:
                            System.out.println("Digite a nova descrição.");
                            armazenaString = ler.nextLine();
                            descricao[j] = armazenaString.toUpperCase();
                            break;
                        case 3:
                            System.out.println("Digite o novo valor.");
                            armazenaString = ler.nextLine();
                            valor[j] = Float.parseFloat(armazenaString);
                            break;
                        case 4:
                            System.out.println("Digite a nova porcentagem.");
                            armazenaString = ler.nextLine();
                            porcentagem[j] = Float.parseFloat(armazenaString);
                            break;
                        case 5:
                            System.out.println("Digite a nova quantidade.");
                            armazenaString = ler.nextLine();
                            quantidadeProdutos[j] = Integer.parseInt(armazenaString);
                            break;
                        default:
                    }
                }

            } else {
                cont++;
            }
        }
        if (cont == totalProdutos) {
            System.out.println("Produto não encontrado!");
        }
        System.out.println("Digite B para voltar ao menu.");
        armazenaString = ler.nextLine();

        for (contLimpaTela = 0; contLimpaTela < 51; contLimpaTela++) {
            System.out.println("");
        }
    }

    public static void cadastroVendas(int totalProdutos, int totalPessoas, String nomeProduto[], Scanner ler,
            String nome[], int quantidadeProdutos[]) {

        int i;
        String armazenaString;
        int contLimpaTela;

        for (i = 0; i < totalPessoas; i++) {
            System.out.println(i + ") " + nome[i]);
        }
        System.out.println("Escolha um usuário.");
        armazenaString = ler.nextLine();
        int escolhaUser = Integer.parseInt(armazenaString);

        do {
            for (i = 0; i < totalProdutos; i++) {
                System.out.println(i + ") " + nomeProduto[i]);
            }
            System.out.println("Escolha um produto.");
            armazenaString = ler.nextLine();
            int escolhaProduto = Integer.parseInt(armazenaString);
            System.out.println("Qual foi a quantidade vendida?");
            armazenaString = ler.nextLine();
            int escolhaQuantidade = Integer.parseInt(armazenaString);
            if (quantidadeProdutos[i] > 0) {
                System.out.println("Sem estoque desse produto!");
            }
            System.out.println("Deseja cadastrar mais vendas para o cliente em questão? S/N");
            armazenaString = ler.nextLine().toUpperCase();

        } while (armazenaString == "S");
        System.out.println("Digite B para voltar ao menu.");
        armazenaString = ler.nextLine();

        for (contLimpaTela = 0; contLimpaTela < 51; contLimpaTela++) {
            System.out.println("");
        }
    }

    public static void mostraEstoque(int totalProdutos, String nomeProduto[], int quantidadeProdutos[], Scanner ler) {

        int i;
        int contLimpaTela;
        String armazenaString;

        for (i = 0; i < totalProdutos; i++) {
            System.out.println(i + ") " + nomeProduto[i] + "[ " + quantidadeProdutos[i] + " unidade(s)]");
        }
        System.out.println("Digite B para voltar ao menu.");
        armazenaString = ler.nextLine();

        for (contLimpaTela = 0; contLimpaTela < 51; contLimpaTela++) {
            System.out.println("");
        }
    }
}
