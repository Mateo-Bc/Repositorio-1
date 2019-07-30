package its;

/**
 *
 * @author mateo
 */
public class ITS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Estudiante e = new Estudiante("juan","carlos",15,"su casa","5c",8);
        
        System.out.println(e.toString());
        System.out.println(e.mayorDeEdad());
        System.out.println(e.nombreCompleto());
        System.out.println(e.llegaTarde());
        System.out.println(e.dobleJornada());
        System.out.println(e.viajeEscolar());
        
        System.out.println("");
        
        Profesor p = new Profesor("Nicolas","Fanin",18,"el colegio","Programacion",2);
        
        System.out.println(p.toString());
        System.out.println(p.mayorDeEdad());
        System.out.println(p.nombreCompleto());
        System.out.println(p.llegaTarde());
        System.out.println(p.sueldoDiario());
        System.out.println(p.sueldoMensual());
        
        System.out.println("");
        
        Preceptor f = new Preceptor("Martin","Suarez",43,"al lado de la casa de ninci",10,2);
        
        System.out.println(f.toString());
        System.out.println(f.mayorDeEdad());
        System.out.println(f.nombreCompleto());
        System.out.println(f.llegaTarde());
        System.out.println(f.sueldoDiario());
        System.out.println(f.sueldoMensual());
    }
    
}
