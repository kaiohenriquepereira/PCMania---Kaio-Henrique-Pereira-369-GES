package pcmania.computador;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwares;
    private SistemaOperacional sistema;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico[] hardwares, SistemaOperacional sistema, MemoriaUSB memoriaUSB) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = hardwares;
        this.sistema = sistema;
        this.memoriaUSB = memoriaUSB;
    }

    public float getPreco() {
        return preco;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        for (HardwareBasico h : hardwares) {
            h.mostrarInfo();
        }
        sistema.mostrarInfo();
        if (memoriaUSB != null) {
            memoriaUSB.mostrarInfo();
        }
    }
}
