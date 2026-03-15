

//tentar criar uma versão do programa que execute cada opção em classe;
import java.util.Scanner;

public class dogtorDemo1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //estoque do sistema;
        int[] codigo = {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010};
        String[] medic = {"Amoxicilina", "Meloxicam", "Fenbendazol", "Prednisona", "Ivermectina", "Enrofloxacino", "Dexametasona", "Loperamida", "Fipronil", "Metronidazol"};
        int[] estoque = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
        double[] preco = {29.99, 49.99, 39.99, 29.99, 19.99, 69.99, 24.99, 14.99, 99.99, 29.99};
        int[] estoqueMin = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50};

        System.out.println("=============== Bem vindo ao sistema Dogtor! ===============");
        int menuPrincipal;

        do {

        System.out.println("\n===== MENU PRINCIPAL =====\n  " +
                "\n 1 - REABASTECER" +
                "\n 2 - VENDA" +
                "\n 3 - RELATÓRIOS" +
                "\n 4 - ACERTO" +
                "\n 5 - SAIR");

        menuPrincipal = input.nextInt();

        switch (menuPrincipal) {

            case 1:
                System.out.println("Em desenvolvimento!!!");
                break;

            case 2:
            System.out.println("==================" + " VENDA " + "===================\n");
            System.out.println("informe o produto vendido: " +
                    "\n0 - " + medic[0] +
                    "\n1 - " + medic[1] +
                    "\n2 - " + medic[2] +
                    "\n3 - " + medic[3] +
                    "\n4 - " + medic[4] +
                    "\n5 - " + medic[5] +
                    "\n6 - " + medic[6] +
                    "\n7 - " + medic[7] +
                    "\n8 - " + medic[8] +
                    "\n9 - " + medic[9]  );

            int venda = input.nextInt();
            int confirmVenda = 0;
            int qtdVend;

            if(venda <0 || venda > 9){

                System.out.println("\nEscolha uma opção válida!:" +
                        "\n0 - " + medic[0] +
                        "\n1 - " + medic[1] +
                        "\n2 - " + medic[2] +
                        "\n3 - " + medic[3] +
                        "\n4 - " + medic[4] +
                        "\n5 - " + medic[5] +
                        "\n6 - " + medic[6] +
                        "\n7 - " + medic[7] +
                        "\n8 - " + medic[8] +
                        "\n9 - " + medic[9]  );
                venda = input.nextInt();
            }

            System.out.println("==================  VENDA  =================== \n " +
                    "\n| Medicamento: " + medic[venda] + "|" +
                    "\n| " + "Preço Unid.: R$" + preco[venda] +
                    "    |\n informe a quantidade vendida: ");
                                    qtdVend = input.nextInt();

            if (qtdVend > estoque[venda]) { /*confere se a quantidade desejada pelo cliente existe em estoque.
                                                              Caso não, printa: */
                System.out.printf("Desculpe, a quantidade escolhida está fora de estoque." +
                        "\n \nMedicamento: %s | Quantidade em estoque: %d\n", medic[venda], estoque[venda]);
                // se a quantidade existe em estoque, continua a venda:

            } else { //exibe um resumo da compra até então:
                System.out.printf("\n| Medicamento | Qtd | Preço Unid.: | Total:\n| %s | %d x| R$ %.2f     | R$ %.2f\n",
                        /*reserva o espaço para os valores (%s = String, %d = inteiro, %f = decimal)*/
                        medic[venda], qtdVend, preco[venda], (preco[venda] * qtdVend)
                );

                System.out.println("\nVocê confirma a venda? \n1 - CONFIRMAR\n2 - CANCELAR VENDA");
                confirmVenda = input.nextInt();
                switch (confirmVenda){
                    case 1:
                     estoque[venda] = estoque[venda] - qtdVend;
                    System.out.println("\n VENDA CONCLUIDA! OBRIGADO!\n");
                    break;

                    case 2:
                        break;

                    default:
                        System.out.println("Escolha uma opção inválida! \nVocê confirma a venda? \n1 - CONFIRMAR\n2 - CANCELAR COMPRA");
                        confirmVenda = input.nextInt();
                }
            };
            break;

            case 3:
                System.out.println("Em desenvolvimento!!!");

                int relatorio;

                System.out.println("===== RELATORIOS =====");

                System.out.println("\n1 - Relatório do estoque atual \n2 - Relatório de medicamento específico \n3 - Relatório da ultima venda");
                relatorio = input.nextInt();

                switch (relatorio){
                    case 1:

                        System.out.println("===== RELATORIOS - ESTOQUE ATUAL =====");

                        System.out.println("| Cód. | Medicamento  | Preço   |Estoque | Estoque Mínimo " +
                                "\n| " + codigo[0] + " | " + medic[0] + "  | " + "R$ " + preco[0] + "|" + estoque[0] + "      | " + estoqueMin[0] +
                                "\n| " + codigo[1] + " | " + medic[1] + "    | " + "R$ " + preco[1] + "|" + estoque[1] + "      | " + estoqueMin[1] +
                                "\n| " + codigo[2] + " | " + medic[2] + "  | " + "R$ " + preco[2] + "|" + estoque[2] + "      | " + estoqueMin[2] +
                                "\n| " + codigo[3] + " | " + medic[3] + "   | " + "R$ " + preco[3] + "|" + estoque[3] + "      | " + estoqueMin[3] +
                                "\n| " + codigo[4] + " | " + medic[4] + "  | " + "R$ " + preco[4] + "|" + estoque[4] + "      | " + estoqueMin[4] +
                                "\n| " + codigo[5] + " | " + medic[5] + "| " + "R$ " + preco[5] + "|" + estoque[5] + "      | " + estoqueMin[5] +
                                "\n| " + codigo[6] + " | " + medic[6] + " | " + "R$ " + preco[6] + "|" + estoque[6] + "      | " + estoqueMin[6] +
                                "\n| " + codigo[7] + " | " + medic[7] + "   | " + "R$ " + preco[7] + "|" + estoque[7] + "      | " + estoqueMin[7] +
                                "\n| " + codigo[8] + " | " + medic[8] + "     | " + "R$ " + preco[8] + "|" + estoque[8] + "      | " + estoqueMin[8] +
                                "\n| " + codigo[9] + " | " + medic[9] + " | " + "R$ " + preco[9] + "|" + estoque[9] + "      | " + estoqueMin[9]);
                        break;

                    case 2:

                        System.out.println("informe o medicamento que deseja visualizar: " +
                                "\n0 - " + medic[0] +
                                "\n1 - " + medic[1] +
                                "\n2 - " + medic[2] +
                                "\n3 - " + medic[3] +
                                "\n4 - " + medic[4] +
                                "\n5 - " + medic[5] +
                                "\n6 - " + medic[6] +
                                "\n7 - " + medic[7] +
                                "\n8 - " + medic[8] +
                                "\n9 - " + medic[9]);
                        int estoqueEspec = input.nextInt();

                        System.out.printf("===== RELATORIOS - &d ===== ",medic[estoqueEspec]);

                        System.out.println("---------------------" +
                                "\nCódigo do remédio: " + codigo[estoqueEspec] +
                                "\nMedicamento: " + medic[estoqueEspec] +
                                "\nEm estoque: " + estoque[estoqueEspec] +
                                "\nEstoque mínimo: " + estoqueMin[estoqueEspec] +
                                "\n---------------------");
                        break;

                    case 3:

                       /* System.out.println("===== RELATORIOS - ULTIMA VENDAS ====="); */
                        System.out.println("Esse relatório está em construção!");
                        break;

                    default:
                        System.out.println("Opção inválida!" );
                }
                break;

            case 4:
                System.out.println("em desenvolvimento!!!");
                break;

            case 5:
                System.out.println("Encerrando...");
                return;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        }while (menuPrincipal!=999);
    }
}
