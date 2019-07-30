package its;

/**
 *
 * @author mateo
 */
public class Estudiante extends Persona {
    
    private String curso;
    private int materias;
    
    
    public Estudiante(){
        
    }
    
    public Estudiante(String nombre, String apellido, int edad, String direccion, String curso, int materias){
        super(nombre, apellido, edad, direccion);
        this.curso = curso;
        this.materias = materias;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }
    
    public String dobleJornada(){
        if (materias >= 10){
            return "Tiene doble escolaridad";
        }else{
            return "Tiene escolaridad normal";
        }
    }
    
    public String viajeEscolar(){
        if (curso == "1a" || curso == "1b" || curso == "1c"){
            return "Este año viajan a la luna";
        }else if (curso == "2a" || curso == "2b" || curso == "2c"){
            return "Este año viajan a la panaderia de la esquina";
        }else if (curso == "3a" || curso == "3b" || curso == "3c"){
            return "Este año viajan a Chernobyl";
        }else if (curso == "4a" || curso == "4b" || curso == "4c"){
            return "Este año viajan hasta donde de la nafta";
        }else if (curso == "5a" || curso == "5b" || curso == "5c"){
            return "Este año viajan a conocer a juli3p";
        }else if (curso == "6a" || curso == "6b" || curso == "6c"){
            return "Este año viajan al Sol";
        }else{
            return "Este año no viajan";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", es estudiante, va al " + curso + ", y tiene " + materias + " materias";
    }
    
    
    
}
