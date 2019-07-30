package its;

/**
 *
 * @author mateo
 */
public class Profesor extends Persona {
    
    private String materia;
    private int cursos;
    
    int sueldoTotal = 0;
    
    public Profesor(){
        
    }

    public Profesor(String nombre, String apellido, int edad, String direccion, String materia, int cursos) {
        super(nombre, apellido, edad, direccion);
        this.materia = materia;
        this.cursos = cursos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getCursos() {
        return cursos;
    }

    public void setCursos(int cursos) {
        this.cursos = cursos;
    }
    
    @Override
    public String sueldoDiario(){
        int sueldoTotal = cursos * 100;
        return "El sueldo por jornada del profesor, teniendo en cuenta los cursos que tiene, es de $" + sueldoTotal;
    }
    
    @Override
    public String sueldoMensual(){
        int inasistencias = (int) (Math.random() * 30) + 1;
        int sueldoMensual = inasistencias-(sueldoTotal *30);
        return "Su sueldo mensual, teniendo en cuenta sus inasistencias, es de $" + sueldoMensual;
    }

    @Override
    public String toString() {
        return super.toString() + ", es profesor, da la materia " + materia + ", y da clases a " + cursos + " cursos";
    }
    
    
    
}
