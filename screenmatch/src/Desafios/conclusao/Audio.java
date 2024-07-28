package Desafios.conclusao;

public abstract class Audio {
    private String titulo;
    private String autor;
    private double duracao;

    public Audio(String titulo, String autor, double duracao){
        this.titulo = titulo;
        this.autor = autor;
        this.duracao = duracao;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void play(){
        System.out.println("Tocando: " + titulo + "por: " + autor);
    }

    public abstract void info();
}
