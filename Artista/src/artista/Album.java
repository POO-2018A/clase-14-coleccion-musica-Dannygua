
package artista;


public class Album {
    
    private int año;
    private int numerocanciones;
    private String nombrealbum;
    private String genero;

    public Album(int año,String genero, int numerocanciones, String nombre) {
        this.año = año;
        this.numerocanciones = numerocanciones;
        this.nombrealbum = nombre;
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumerocanciones() {
        return numerocanciones;
    }

    public void setNumerocanciones(int numerocanciones) {
        this.numerocanciones = numerocanciones;
    }

    public String getNombre() {
        return nombrealbum;
    }

    public void setNombre(String nombre) {
        this.nombrealbum = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public String toString (){
        
        return "Nombre: " +this.nombrealbum +"\n"+"Numero de canciones: " +this.numerocanciones+"\n"+"Ano: " +this.año+"\n"+"Genero: " +this.genero ;
    }
            
}
