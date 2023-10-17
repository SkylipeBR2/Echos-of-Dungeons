import javax.sound.sampled.*;
import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class JOGO {
    public void Tarefa2() {
        int delay = 5000;
        int interval = 1000;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Olá");
            }
        }, delay, interval);
    }
    public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner entrada = new Scanner(System.in);
        boolean x = false;

        System.out.println("");
        System.out.println("bem-vindo ao jogo que nao e jogo...");
        System.out.println("escolha uma opçao a baixo");
        System.out.println("");

        do {
            System.out.printf("1 Instruções\n"
                    + "2 Jogar\n"
                    + "3 Créditos\n"
                    + "4 Sair\n");
            int resp = entrada.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("e simples e so escolher 1 ou 2 si tentar ser esperto vc se lasca...");
                    System.out.println("");
                    break;
                case 2:
                    //inicio do jogo..........................................................................
                    for (int i = 0; i < 10; i++){
                        System.out.println("\n");
                    }

                    //prólogo do jogo--------------------------------------------------------------------------
                    System.out.println("Em uma pequena vila perdida no meio da floresta, viviam dois irmãos. Eles eram inseparáveis. \n" +
                            "Sempre caçando aventuras por onde iam. O irmão mais velho, *irmão*, adorava procurar tesouros escondidos e misteriosos,\n" +
                            "já o irmão mais novo, *personagem* gostava de entender a natureza das coisas, como elas funcionam a partir de certos experimentos.");

                    System.out.println("...");
                    Thread.sleep(15000);

                    System.out.println(" O *irmão* Uma vez encontrou uma caverna ainda não explorada por ele, como de costume, chamou seu irmão para ir junto nessa jornada.\n" +
                            "Ao chegar nela entraram sem sequer pensar duas vezes, eram fascinados em mistérios e segredos.");

                    System.out.println("...");
                    Thread.sleep(10000);

                    System.out.println(" Ao entrarem perceberam que era extremamente escuro, não iriam ficar muito tempo ali sem algo para iluminar o caminho.\n" +
                            "Mas sem explicação, de alguma forma, essa caverna \"chamava\" eles, como se alguém estivesse sussurrando ou até mesmo um sentimento \n" +
                            "de ansiedade e curiosidade que não poderiam deixar de escutar.");

                    System.out.println("...");
                    Thread.sleep(15000);

                    System.out.println("Em um certo momento, a caverna estava tão escura que mal conseguiam enxergar um ao outro, o único guia deles agora era a voz um do outro. \n" +
                            "De Repente o *irmão* para de falar, o *personagem* chama por seu nome, porém sem sucesso.");


                    // Carrega o arquivo de áudio (não funciona com .mp3, só .wav)
                    String resource = "audioHello.WAV";
                    InputStream input = JOGO.class.getResourceAsStream(resource);
                    Clip oClip = AudioSystem.getClip();
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);
                    oClip.open(audioInput);

                    oClip.loop(0); //0 Toca uma vez
                    //clip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente (para o caso de músicas)
                    // Para a execução (senão o programa termina antes de você ouvir o som)
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            System.out.println("O *personagem* entra em pânico e tenta voltar do caminho que fizeram na esperança de achar alguma luz novamente. \n" +
                                    "Ele começa a ver uma luz, corre em direção daquilo que seria a saída, mas na realidade, se deparou uma um ambiente que jamais imaginou existir. \n" +
                                    "Estava vendo uma luz de duas tochas penduradas na parede, que iluminavam diversas celas de prisão, enferrujadas e repulsivas.\n" +
                                    "Se deu conta que estava em uma macabra masmorra abandonada.”");

                            System.out.println("...");
                            try {
                                Thread.sleep(20000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    });

                    System.out.println("...");
                    Thread.sleep(10000);

                    System.out.println("O *personagem* entra em pânico e tenta voltar do caminho que fizeram na esperança de achar alguma luz novamente. \n" +
                            "Ele começa a ver uma luz, corre em direção daquilo que seria a saída, mas na realidade, se deparou uma um ambiente que jamais imaginou existir. \n" +
                            "Estava vendo uma luz de duas tochas penduradas na parede, que iluminavam diversas celas de prisão, enferrujadas e repulsivas.\n" +
                            "Se deu conta que estava em uma macabra masmorra abandonada.”");

                    System.out.println("...");
                    Thread.sleep(20000);

                    break;//fim do jogo.............................................................---...---
                case 3:
                    System.out.println("agora e os creditos...");
                    System.out.println("feito por min kevin.\n"
                            + "e eu...\n"
                            + "e eu de novo...");
                    break;
                case 4:
                    System.out.println("vc esta saindo desse jogo maravilhoso...");
                    System.out.println("xauuu");
                    x = true;
                    break;
                default:
                    System.out.println("opçao invalida. escolha uma opçao de 1 a 4");
            }
        } while (!x);
        System.out.println("oh good by...");

    }

}
