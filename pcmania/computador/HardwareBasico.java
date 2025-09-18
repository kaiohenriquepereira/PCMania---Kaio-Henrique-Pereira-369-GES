package pcmania.computador;

public class HardwareBasico {
    private String nome;
    private int capacidade;

    public HardwareBasico(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostrarInfo() {
        if(this.nome == "Memória RAM") {
            System.out.println("Memória RAM: " + nome + " - " + capacidade + "Gb");
        }
        else if(this.nome == "HD") {
                if(this.capacidade == 1000) {
                    System.out.println("Armazenamento: " + nome + " - " + (capacidade - 999) + "Tb");
                } else if (this.capacidade == 2000) {
                    System.out.println("Armazenamento: " + nome + " - " + (capacidade - 1998) + "Tb");
                }
                else
                    System.out.println("Armazenamento: " + nome + " - " + capacidade + "Gb");
        }
        else
            System.out.println("Processador: " + nome + " - " + capacidade + "Mhz");
    }
}
