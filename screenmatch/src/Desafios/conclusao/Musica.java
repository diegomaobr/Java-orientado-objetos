package Desafios.conclusao;

public class Musica extends Audio{
    private String album;
    private String genero;
    public Musica(String titulo, String autor, double duracao,String album, String genero){
        super(titulo, autor, duracao);
        this.album = album;
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void info(){
        System.out.println("Musica: " +getTitulo() + "\nArtista: "+getAutor() + "\nAlbum: "+album+ "\nGenero: " +genero+ "\nDuracao: "+getDuracao()+ "minutos");
    }
}
