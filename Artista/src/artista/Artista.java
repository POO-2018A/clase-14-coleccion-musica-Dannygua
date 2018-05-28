
package artista;

import java.util.Objects;


public class Artista {


    private String nombre; 
    private String fechanacimiento; 
    private String pais;

    public Artista(String nombre, String fechanacimiento, String pais) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
   
    
    @Override
    public String toString (){

        return "Nombre: "+ this.nombre+"\n" + " fecha de nacimiento: "+this.fechanacimiento+ "\n"+ " Pais: "+this.pais;
    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Artista other = (Artista) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.fechanacimiento, other.fechanacimiento)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }
    
    
    
}
