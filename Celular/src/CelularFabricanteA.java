public class CelularFabricanteA extends CelularComum implements Celular {
    private final double preco;

    public CelularFabricanteA(boolean temEnviarMensagem, boolean temAcessarInternet, boolean temAcessarEmails,
                              boolean temRadio, boolean temTV, boolean temVerificarSistemaArquivos, double preco) {
        super(temEnviarMensagem, temAcessarInternet, temAcessarEmails, temRadio, temTV, temVerificarSistemaArquivos);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void ligar() {
    }

    public void desligar() {
    }

    public void acessarCamera() {
    }

    public void acessarFoneDeOuvido() {
    }

    public void controlarVolume() {
    }

    public String toString() {
        return "CelularFabricanteA: " +
                "preco=" + preco +
                ", temEnviarMensagem: " + temEnviarMensagem +
                ", temAcessarInternet: " + temAcessarInternet +
                ", temAcessarEmails: " + temAcessarEmails +
                ", temRadio: " + temRadio +
                ", temTV: " + temTV +
                ", temVerificarSistemaArquivos: " + temVerificarSistemaArquivos;
    }
}
