package its;

/**
 *
 * @author mateo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    
    public Persona(){
        
    }

    public Persona(String nombre, String apellido, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String nombreCompleto(){
        return "Su nombre completo es " + nombre + " " + apellido;
    }
    
    public String mayorDeEdad(){
        String msg = "";
        if(edad > 18){
            msg = "Es mayor de edad";
        }else{
            msg = "Es menor de edad";
        }
        return msg;
    }
    
    public String llegaTarde(){
        int num = (int) (Math.random() * 2) + 1;
        if (num == 1){
            return "Llega tarde";
        }else{
            return "Llega temprano";
        }
    }
    
    public String sueldoDiario(){
        return "";
    }
    
    public String sueldoMensual(){
        return "";
    }

    @Override
    public String toString() {
        return "La persona se llama " + nombre + ", tiene " + edad + " años, y vive en " + direccion;
        
    }
    
    
   
}
