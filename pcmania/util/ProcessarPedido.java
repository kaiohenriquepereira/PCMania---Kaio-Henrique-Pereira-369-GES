package pcmania.util;

import pcmania.computador.Computador;

public class ProcessarPedido {
    public static void processar(Computador[] pcs) {
        System.out.println();
        System.out.println("--- Pedido enviado ---");
        System.out.println();
        for (Computador pc : pcs) {
            if (pc != null) {
                pc.mostrarInfo();
                System.out.println();
            }
        }
        System.out.println("--- Fim do Pedido ---");
        System.out.println();
    }
}
