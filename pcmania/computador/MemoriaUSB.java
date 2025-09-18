package pcmania.computador;

public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostrarInfo() {
        if(this.capacidade == 1000) {
            System.out.println("Acompanha: " + nome + " - " + (capacidade - 999) + "Tb");
        } else if (this.capacidade == 2000) {
            System.out.println("Acompanha: " + nome + " - " + (capacidade - 1998) + "Tb");
        }
        else
            System.out.println("Acompanha: " + nome + " - " + capacidade + "Gb");
    }
}
