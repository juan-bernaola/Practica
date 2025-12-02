
package ejercicio1;

public class Investigador {
    private String nombre;
    private int categoria;
    private String especialidad;
    private int cantSubsidios;
    private Subsidio[] subsidios;
    public Investigador(String unNombre,int unaCategoria,String unaEspecialidad){
        this.nombre=unNombre;
        this.categoria=unaCategoria;
        this.especialidad=unaEspecialidad;
        this.cantSubsidios=0;
        this.subsidios = new Subsidio[5];
    }
    public void otorgarSubsidios(){
        for(int i=0;i<cantSubsidios;i++){
            if(!this.subsidios[i].isOtorgado())
                subsidios[i].setOtorgado(true);
        }
    }
    public double dineroTotal(){
        double aux=0;
        for(int i=0;i<cantSubsidios;i++)
            aux=aux=+subsidios[i].getMonto();
        return aux;
    }
    public void agregarSubsidio(Subsidio unSubsidio){
        if(cantSubsidios<5){
            subsidios[cantSubsidios]=unSubsidio;
            cantSubsidios++;
        }
    }
    @Override
    public String toString(){
        String aux;
        aux="\n"
                +"\nInvestigador: "+this.getNombre()+"\nCategoria: "+this.getCategoria()+
                "\nEspecialidad: "+this.getEspecialidad()+"\nDinero total: "+this.dineroTotal();
        return aux;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCantSubsidios() {
        return cantSubsidios;
    }

    public void setCantSubsidios(int cantSubsidios) {
        this.cantSubsidios = cantSubsidios;
    }
    
}
