
package ejercicio2;

public class Auto {
    private String nombre;
    private String patente;
    public Auto(String nombre,String patente){
        setNombre(nombre);
        setPatente(patente);
    }
    @Override
    public String toString(){
        String aux=this.getNombre()+" Patente: "+this.getPatente();
        return aux;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setPatente(String patente){
        this.patente=patente;
    }
    public String getPatente(){
        return patente;
    }
}
