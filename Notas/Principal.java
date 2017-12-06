package Notas;
/**
 * @author jbromero
 */
public class Principal {
    public static void main(String[] args) {
        Estudiante e[] = new Estudiante[4];
        e[0] = new Estudiante("Luis","Alcivar");
        e[1] = new Estudiante("Luis","Alcivar");
        e[2] = new Estudiante("Luis","Alcivar");
        e[3] = new Estudiante("Luis","Alcivar");
        double matematicas[] = new double[4];
        matematicas[0] = 10.56;
        matematicas[1] = 10.56;
        matematicas[2] = 10.56;
        matematicas[3] = 10.56;
        double sociales[] = new double[4];
        sociales[0] = 9.2;
        sociales[1] = 9.2;
        sociales[2] = 9.2;
        sociales[3] = 9.2;
        Asignacion a = new Asignacion(e,matematicas,sociales);
        System.out.println(a);
    }
}
