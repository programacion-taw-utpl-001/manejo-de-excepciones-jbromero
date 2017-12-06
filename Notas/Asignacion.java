package Notas;
/**
 * @author jbromero
 */
public class Asignacion{
    private Estudiante lista_est[];
    private double notas_mats[];
    private double notas_sociales[];
    private double promedio[];

    public Asignacion(Estudiante[] lista_est, double[] notas_mats, double[] notas_sociales) {
        this.lista_est = lista_est;
        this.notas_mats = notas_mats;
        this.notas_sociales = notas_sociales;
    } 
    
    public void setLista_est(Estudiante[] lista_est) {
        this.lista_est = lista_est;
    }
    
    public Estudiante[] getLista_est() {
        return lista_est;
    }
    
    public void setNotas_mats(double[] notas_mats) {
        this.notas_mats = notas_mats;
    }

    public double[] getNotas_mats() {
        return notas_mats;
    }
    
    public void setNotas_sociales(double[] notas_sociales) {
        this.notas_sociales = notas_sociales;
    }

    public double[] getNotas_sociales() {
        return notas_sociales;
    }
    
    public double Promedio_totalmats(){
        double st = 0.0;
        double pro = 0.0;
        for (int i = 0; i < getNotas_mats().length; i++) {
            st += notas_mats[i];
            pro = st/getNotas_mats().length;
        }
        return pro;
    }
    
    public double Promedio_totalsociales(){
        double st = 0.0;
        double pro = 0.0;
        for (int i = 0; i < getNotas_sociales().length; i++) {
            st += notas_sociales[i];
            pro = st/getNotas_sociales().length;
        }
        return pro;
    }
    
    public double Promedio_estudiante(int i){
        double pro=0.0;
        
            pro+= getNotas_sociales()[i];
            pro+= getNotas_mats()[i];
        
        
        return pro/2;
    }
    
    @Override
    public String toString(){
        String cadena="";
        for (int i = 0; i < getLista_est().length; i++) {
            cadena+=String.format("%s\n"
                    + "\tMatematica %1.2f\n"
                    + "\tSociales %1.2f\n"
                    + "\tPromedio %1.2f\n\n",lista_est[i].toString(),notas_mats[i],notas_sociales[i],Promedio_estudiante(i));
        }
        
        return String.format("%s\n"
                + "Promedio General\n"
                + "Promedio Matematicas : %.2f\n"
                + "Promedio Sociales : %.2f\n", cadena,Promedio_totalmats(),Promedio_totalsociales());
    }
}
