public class Foguete {
    int altura;
    int inclinacao;
    int velocidade;

    public Foguete(int altura, int inclinacao, int velocidade) {
        this.altura = altura;
        this.inclinacao = inclinacao;
        this.velocidade = velocidade;
    }

    public int getAltura() {
        return altura;
    }

    public int getInclinacao() {
        return inclinacao;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setInclinacao(int inclinacao) {
        this.inclinacao = inclinacao;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}