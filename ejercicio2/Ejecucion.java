
package ejercicio2;
import PaqueteLectura.Lector;
public class Ejecucion {
    public static void main(String[] args) {
       Estacionamiento e1=new Estacionamiento("Bernaola", 2375, 8.00, 21.00 , 3, 3);
 
       Auto a1=new Auto("Juan","FFF577");
       Auto a2=new Auto("Cesar","AF598IX");
       Auto a3=new Auto("Gladys","JLM213");
       Auto a4=new Auto("Agustin","RRE310");
       Auto a5=new Auto("Lourdes","AA216BA");
       Auto a6=new Auto("Sergio","AG213JL");
       
       e1.registrarAuto(a1, 1, 1);
       e1.registrarAuto(a2, 3, 3);
       e1.registrarAuto(a3, 2, 1);
       e1.registrarAuto(a4, 3, 1);
       e1.registrarAuto(a5, 1, 3);
       e1.registrarAuto(a6, 2, 2);
       
        System.out.println(e1.toString());
        System.out.println("Cantida de autos en plaza 1: "+e1.cantidadAutos(1));
        System.out.println("Ingrese una patente:");
        String patente=Lector.leerString();
        System.out.println(e1.retornarEstacionamiento(patente));
    }
}
