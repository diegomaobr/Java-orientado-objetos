package Desafios.conclusao;

public class App {
    public static void main(String[] args) {
        Musica musica = new Musica("Pais e Filhos ", "Legiao Urbana", 5.22, "Urbano", "Rock");
        Podcast podcast = new Podcast("Ciencia Sem Fim", "Sergio Sarcani", 30.00, 1, "Marte planeta vermelho");

        musica.play();
        musica.info();

        System.out.println();

        podcast.play();
        podcast.info();
    }
}
