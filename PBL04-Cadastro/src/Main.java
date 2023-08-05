import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoas> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
    
        int optionMenu = 0;
    
        while(optionMenu <= 4) {
            System.out.println();
            System.out.println("O que deseja? \n 1 - Cadastrar pessoa \n 2 - Listas pessoas \n 3 - Buscar pessoas por tipo \n 4 - Sair");
            optionMenu = scanner.nextInt();
            System.out.println();
    
            if (optionMenu == 1) {
                System.out.println("Deseja cadastrar o que? \n 1 - Novo cliente \n 2 - Novo Funcionário \n 3 - Novo Gerente \n 4 - Sair");
                int optionCargo = scanner.nextInt();
                System.out.println();

                if (optionCargo < 4) {
                    System.out.println("Insira o nome:");
                    String nome = scanner.next();
                    System.out.println();

                    System.out.println("Insira o genero:");
                    String genero = scanner.next();
                    System.out.println();

                    System.out.println("Insira a data de nascimento:");
                    String dt_nasc = scanner.next();
                    System.out.println();

                    System.out.println("Insira o cpf:");
                    String cpf = scanner.next();
                    System.out.println();

                    if (optionCargo == 1) {
                        System.out.println("Deseja salvar o cliente? \n 1 - Sim \n 2 - Não");
                        int optionSaveCliente = scanner.nextInt();

                        if (optionSaveCliente == 1) {
                            pessoas.add(new Clientes(nome, genero, dt_nasc, cpf));
                        }
                    } else if (optionCargo == 2) {
                        System.out.println("Insira o cargo desse funcionário:");
                        String cargoFuncionario = scanner.next();
                        System.out.println();

                        System.out.println("Insira o salário desse funcionário:");
                        int salarioFuncionario = scanner.nextInt();
                        System.out.println();

                        System.out.println("Deseja salvar o funcionário? \n 1 - Sim \n 2 - Não");
                        int optionSaveFuncionario = scanner.nextInt();

                        if (optionSaveFuncionario == 1) {
                            pessoas.add(new Funcionarios(nome, genero, dt_nasc, cpf, cargoFuncionario, salarioFuncionario));
                        }

                    } else if (optionCargo == 3) {
                        System.out.println("Insira o setor do gerente:");
                        String setorGerente = scanner.next();
                        System.out.println();
                        System.out.println("Insira o salario do gerente:");
                        int salarioGerente = scanner.nextInt();
                        System.out.println();

                        System.out.println("Deseja salvar o gerente? \n 1 - Sim \n 2 - Não");
                        int optionSaveGerente = scanner.nextInt();

                        if (optionSaveGerente == 1) {
                            pessoas.add(new Gerentes(nome, genero, dt_nasc, cpf, setorGerente, salarioGerente));
                        }
                    }
                }
            } else if (optionMenu == 2) {
                System.out.println();
                System.out.println("LISTA DE PESSOAS CADASTRADAS");
                System.out.println();

                if(pessoas.isEmpty()) {
                    System.out.println("Ninguem foi cadastrado");
                    System.out.println();
                }

                for (Pessoas pessoa: pessoas) {
                    pessoa.listarPessoas();
                }
                System.out.println("Digite algo para voltar ao menu");
                String tecla = scanner.next();
                System.out.println();

            } else if (optionMenu == 3) {
                System.out.println("Deseja listar quais tipos? \n 1 - Clientes \n 2 - Funcionários \n 3 - Gerentes \n 4- Sair");
                int optionTipo = scanner.nextInt();
                System.out.println();

                for (Pessoas pessoa: pessoas) {
                    if(pessoa instanceof Clientes && optionTipo == 1) {
                        ((Clientes) pessoa).listarClientes();
                    } else if (pessoa instanceof Funcionarios && optionTipo == 2) {
                        ((Funcionarios) pessoa).listarFuncionarios();
                    } else if (pessoa instanceof Gerentes && optionTipo == 3) {
                        ((Gerentes) pessoa).listarGerentes();
                    }
                }
                System.out.println("Digite algo para voltar ao menu");
                String tecla = scanner.next();
                System.out.println();
            } else {
                break;
            }
        }
    }
}


