public class Cancion {
    String nombre;
    String genero;
    String artista;
    String album;
    int pista;

    //constructor

    public Cancion(String nombre, String genero, String artista, String album, int pista) {
        this.nombre = nombre;
        this.genero = genero;
        this.artista = artista;
        this.album = album;
        this.pista = pista;
    }
    //constructor vacío

    public Cancion() {

    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public String getGenero() {
        return genero;
    }
    public String getArtista() {
        return artista;
    }
    public String getAlbum() {
        return album;
    }

    public int getPista() {
        return pista;
    }
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setGenero(String genero) {
        this.genero = genero;

    }
    public void setArtista(String artista) {
        this.artista = artista;

    }
    public void setAlbum(String album) {
        this.album = album;

    }
    public void setPista(int pista) {
        this.pista = pista;

    }
    //métodos personalizados
    public void imprimir() {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Genero: "+this.genero);
        System.out.println("Artista: "+this.artista);
        System.out.println("Album: "+this.album);
        System.out.println("Pista: "+this.pista);

    }
}
f