import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        boolean finish = false;
        Foguete foguete = new Foguete(0, 0, 0);
        while (!finish) {
            System.out.println("\nAltura: ");
            int altura = in.nextInt();
            System.out.println("\nInclinacao: ");
            int inclinacao = in.nextInt();
            System.out.println("\nVelocidade: ");
            int velocidade = in.nextInt();
            foguete.setAltura(altura);
            foguete.setInclinacao(inclinacao);
            foguete.setVelocidade(velocidade);
            int fase1 = funcaoDeControleFase1(foguete);
            int fase2 = funcaoDeControleFase2(foguete);
            int dest = funcaoAutoDestruicao(foguete);
            if(fase1 == 1) {
                System.out.println("\nA base do foguete foi desprendida. Passando para fase 2...");
                Thread.sleep(2000);
            }
            if(fase2 == 1) {
                System.out.println("\nO satelite foi desprendido. Passando para fase 3...");
                Thread.sleep(2000);
            }
            if(fase1 == 1 && fase2 == 1) {
                System.out.println("\nSatelite em orbita de forma estavel, missao completa.");
            }
            else {
                if(dest == 1) {
                    System.out.println("\nFalha, entrando em auto destruicao");
                }
            }
            
        }
        
        
    }

    public static int funcaoDeControleFase1(Foguete foguete) {
        if(foguete.getAltura() >= 160) return 1;
        return 0;
    }

    public static int funcaoDeControleFase2(Foguete foguete) {
        if(foguete.getVelocidade() >= 300 && foguete.getInclinacao() >= 0 && foguete.getInclinacao() <= 10 ) return 1;
        return 0;
    }

    public static int funcaoAutoDestruicao(Foguete foguete) {
        if(foguete.getAltura() >= 10 && foguete.getAltura() < 160 && foguete.getInclinacao() > 90) return 1;
        return 0;
    }
}
