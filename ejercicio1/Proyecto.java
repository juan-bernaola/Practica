package ejercicio1;

public class Proyecto {
    private String nombre;
    private int codigo;
    private String nombreDirector;
    private int cantInvestigadores;
    private Investigador[] investigadores;
    public Proyecto(String unNombre,int unCodigo,String unDirector){
        this.nombre=unNombre;
        this.codigo=unCodigo;
        this.nombreDirector=unDirector;
        this.cantInvestigadores=0;
        this.investigadores=new Investigador[50];
    }
    public void otorgarTodos(String nombre){
        int i=0;
        while(i<cantInvestigadores&&!investigadores[i].getNombre().equals(nombre))
            i++;
        if(investigadores[i].getNombre().equals(nombre))
            this.investigadores[i].otorgarSubsidios();
    }
    public double dinertoTotalOtorgado(){
        double dineroTotal=0;
        for (int i=0;i<cantInvestigadores;i++)
            dineroTotal+=investigadores[i].dineroTotal();
        return dineroTotal;
    }
    public void agregarInvestigador(Investigador unInvestigador){
        if(cantInvestigadores<50){
            investigadores[cantInvestigadores]=unInvestigador;
            cantInvestigadores++;
        }
    }
    public String imprimirInvestigadores(){
        String aux="";
        for(int i=0;i<this.cantInvestigadores;i++)
            aux+=this.investigadores[i].toString();
        return aux;
    }
    @Override
    public String toString(){
        String aux;
        aux="Proyecto:"+this.getNombre()+"\nCodigo:"+this.getCodigo()+
                "\nDirector:"+this.getDirector()+"\nDinero total del proyecto:"+
                this.dinertoTotalOtorgado()+imprimirInvestigadores();
        return aux;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setDirector(String nombre){
        this.nombreDirector=nombre;
    }
    public String getDirector(){
        return nombreDirector;
    }
    public void setCantInvestigadores(int cant){
        this.cantInvestigadores=cant;
    }
    public int getCantInvestigadores(){
        return cantInvestigadores;
    }
}
