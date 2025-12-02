
package ejercicio1;

public class Ejecucion {
    public static void main(String[] args) {
        Proyecto p = new Proyecto("Practica",10,"Juan");
        Investigador i1 = new Investigador("Diego",3,"Cervecero");
        Investigador i2 = new Investigador("Sergio",1,"Metal");
        Investigador i3 = new Investigador("Agustin",2,"Comercio");
        
        p.agregarInvestigador(i1);
        p.agregarInvestigador(i2);
        p.agregarInvestigador(i3);
        
        i1.agregarSubsidio(new Subsidio(430.40,"Cebada"));
        i1.agregarSubsidio(new Subsidio(500,"Malta"));
        i2.agregarSubsidio(new Subsidio(800.40,"Martillo"));
        i2.agregarSubsidio(new Subsidio(300,"Alicate"));
        i3.agregarSubsidio(new Subsidio(1000,"Lacteo"));
        i3.agregarSubsidio(new Subsidio(2300.40,"Fiambre"));
        
        p.otorgarTodos("Agustin");
        System.out.println(p.toString());
    }
}
