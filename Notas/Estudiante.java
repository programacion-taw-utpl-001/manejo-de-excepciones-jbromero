package Notas;
/**
 * @author jbromero
 */
public class Estudiante {
    private String nombre;
    private String apellido;

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getnombre() {
        return nombre;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getapellido() {
        return apellido;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s",getnombre(),getapellido());
    }
}
