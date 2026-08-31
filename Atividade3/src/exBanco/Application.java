package exBanco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        Banco c1 = new Banco(1, 100, "Sede", 1);

        try {
            while (op != 4 && op != 5) {
                exibirMenu();

                try {
                    op = sc.nextInt();

                    if (op < 1 || op > 5) {
                        System.out.println("Opção inválida. Escolha um número de 1 a 5.");
                        continue;
                    }

                    switch (op) {
                        case 1:
                            if (c1.getTipo() == 4) {
                                System.out.println("Erro: a conta está encerrada.");
                                break;
                            }
                            System.out.print("Valor a creditar: R$ ");
                            c1.creditar(sc.nextDouble());
                            System.out.printf("Novo saldo: R$ %.2f%n", c1.getSaldo());
                            break;
                        case 2:
                            if (c1.getTipo() == 4) {
                                System.out.println("Erro: a conta está encerrada.");
                                break;
                            }
                            System.out.print("Valor a debitar: R$ ");
                            c1.debitar(sc.nextDouble());
                            System.out.printf("Novo saldo: R$ %.2f%n", c1.getSaldo());
                            break;
                        case 3:
                            System.out.println(c1.consultarSaldo(c1.getNumero()));
                            break;
                        case 4:
                            if (c1.getSaldo() < 0) {
                                System.out.println("Não é possível encerrar uma conta com saldo negativo.");
                                op = 0;
                            } else {
                                double saldoDevolvido = c1.getSaldo();
                                c1.encerrarConta();
                                System.out.println(c1.textoEncerrar(saldoDevolvido));
                            }
                            break;
                        case 5:
                            System.out.println("Programa encerrado.");
                            break;
                        default:
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Digite apenas números.");
                    sc.nextLine();
                    op = 0;
                } catch (IllegalArgumentException | IllegalStateException e) {
                    System.out.println("Erro: " + e.getMessage());
                    op = 0;
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um problema inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    private static void exibirMenu() {
        System.out.println("\n1 - Creditar");
        System.out.println("2 - Debitar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Encerrar conta");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}
