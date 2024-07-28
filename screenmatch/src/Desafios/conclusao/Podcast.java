package Desafios.conclusao;

public class Podcast extends Audio{
    private int episodio;
    private String descricao;

    public Podcast(String titulo, String autor, double duracao, int episodio, String descricao){
        super(titulo, autor, duracao);
        this.episodio = episodio;
        this.descricao = descricao;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void info() {
        System.out.println("Podcast: " + getTitulo() + "\nAutor: " + getAutor() + "\nEpidosio: " + episodio + "\nDescricao: " + descricao + "\nDuracao: " + getDuracao() + "minutos");
    }
}
