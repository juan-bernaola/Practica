
package ejercicio3;

public abstract class Recital {
    private String nombreBanda;
    private int cantTemas;
    private int temasEnLista;
    private String[] temas;
  
    public Recital(String nombreBanda, int cantTemas) {
        this.nombreBanda = nombreBanda;
        this.cantTemas = cantTemas;
        temasEnLista=0;
        temas = new String[this.cantTemas];
    }
    public abstract double calcularCosto();
    public void actuar(){
        for (int i=0;i<this.cantTemas;i++){
            System.out.println("y ahora tocaremos "+temas[i]);
        }
    }
    public void agregarTema(String nombreTema){
        if(temasEnLista<cantTemas){
            temas[temasEnLista]=nombreTema;
            temasEnLista++;
        }
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public int getCantTemas() {
        return cantTemas;
    }

    public void setCantTemas(int cantTemas) {
        this.cantTemas = cantTemas;
    }
    
}
