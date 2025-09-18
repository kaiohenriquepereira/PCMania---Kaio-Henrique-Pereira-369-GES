package pcmania.main;

import java.util.Scanner;
import pcmania.cliente.Cliente;
import pcmania.computador.*;
import pcmania.util.ProcessarPedido;

public class PCMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("Kaio Henrique", "123.456.789-00", "k.henrique@ges.inatel.br");

        Computador[] ofertas = new Computador[3];

        ofertas[0] = new Computador(
                "Apple",
                369,
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i3", 2200),
                        new HardwareBasico("Memória RAM", 8),
                        new HardwareBasico("HD", 500)
                },
                new SistemaOperacional("macOS Sequoia", 64),
                new MemoriaUSB("Pen-drive", 16)
        );

        ofertas[1] = new Computador(
                "Samsung",
                1603,
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i5", 3370),
                        new HardwareBasico("Memória RAM", 16),
                        new HardwareBasico("HD", 1000)
                },
                new SistemaOperacional("Windows 8", 64),
                new MemoriaUSB("Pen-drive", 32)
        );

        ofertas[2] = new Computador(
                "Dell",
                6047,
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i7", 4500),
                        new HardwareBasico("Memória RAM", 32),
                        new HardwareBasico("HD", 2000)
                },
                new SistemaOperacional("Windows 10", 64),
                new MemoriaUSB("HD Externo", 1000)
        );

        Computador[] compras = new Computador[5];
        int qtdCompras = 0;
        float total = 0;

        int opcao;
        do {
            System.out.println();
            System.out.println("Escolha uma promoção:");
            System.out.println("1 - Apple");
            System.out.println("2 - Samsung");
            System.out.println("3 - Dell");
            System.out.println("0 - Finalizar compra");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 3 && qtdCompras < compras.length) {
                compras[qtdCompras] = ofertas[opcao - 1];
                total += ofertas[opcao - 1].getPreco();
                System.out.println();
                System.out.println("Produto adicionado ao carrinho.");
                qtdCompras++;
            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        System.out.println();
        cliente.mostrarInfo();
        System.out.println();

        System.out.println("PCs adquiridos:");
        for (int i = 0; i < qtdCompras; i++) {
            compras[i].mostrarInfo();
            System.out.println();
        }
        System.out.println("Total da compra: R$" + total);

        ProcessarPedido.processar(compras);

        sc.close();
    }
}
