package its;

/**
 *
 * @author mateo
 */
public class Preceptor extends Persona {
    
    private int antiguedad;
    private int años_a_cargo;
    
    int sueldoTotal = 0;
    
    public Preceptor(){
        
    }

    public Preceptor(String nombre, String apellido, int edad, String direccion, int antiguedad, int años_a_cargo) {
        super(nombre, apellido, edad, direccion);
        this.antiguedad = antiguedad;
        this.años_a_cargo = años_a_cargo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getAños_a_cargo() {
        return años_a_cargo;
    }

    public void setAños_a_cargo(int años_a_cargo) {
        this.años_a_cargo = años_a_cargo;
    }
    
    @Override
    public String sueldoDiario(){
        int sueldoTotal = años_a_cargo * 100;
        return "El sueldo por jornada del preceptor, teniendo en cuenta los años que tiene a cargo, es de $" + sueldoTotal;
    }
    
    @Override
    public String sueldoMensual(){
        int inasistencias = (int) (Math.random() * 30) + 1;
        int sueldoMensual = inasistencias-((sueldoTotal *30)*antiguedad);
        return "Su sueldo mensual, teniendo en cuenta sus inasistencias, es de $" + sueldoMensual;
    }

    @Override
    public String toString() {
        return "Preceptor{" + "antiguedad=" + antiguedad + ", a\u00f1os_a_cargo=" + años_a_cargo + ", sueldoTotal=" + sueldoTotal + '}';
    }
    
    
    
}
