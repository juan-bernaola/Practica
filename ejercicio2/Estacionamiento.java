
package ejercicio2;


public class Estacionamiento {
    private String nombre;
    private int direccion;
    private double apertura;
    private double cierre;
    private int pisos;
    private int plazas;
    private Auto[][] lugar;
    public Estacionamiento(String nombre,int direccion){
        setNombre(nombre);
        setDireccion(direccion);
        setApertura(8.00);
        setCierre(21.00);
        setPisos(5);
        setPlazas(10);
        this.lugar = new Auto[5][10];
    }
    public Estacionamiento(String nombre,int direccion,double apertura,
            double cierre,int pisos,int plazas){
        setNombre(nombre);
        setDireccion(direccion);
        setApertura(apertura);
        setCierre(cierre);
        setPisos(pisos);
        setPlazas(plazas);
        this.lugar = new Auto[pisos][plazas];
    }
    public int cantidadAutos(int plaza){
        int aux=0;
        for(int i=0;i<pisos;i++){
            if(this.lugar[i][plaza-1]!=null)
                aux++;
        }
        return aux;
    }
    public String representarEstacionamiento(){
        String aux="";
        for (int i=0;i<pisos;i++)
            for(int j=0;j<plazas;j++){
                if(this.lugar[i][j]==null)
                    aux+="Piso "+(i+1)+" Plaza "+(j+1)+":libre\n";
                else
                    aux+="Piso "+(i+1)+" Plaza "+(j+1)+":"+this.lugar[i][j].toString()+"\n";
            }
        return aux;
    }
    @Override
        public String toString(){
            return representarEstacionamiento();
        }
    public String retornarEstacionamiento(String patente){
        String aux="";
        for (int i=0;i<pisos;i++)
            for(int j=0;j<plazas;j++){
                if(!this.lugar[i][j].getPatente().equals(patente))
                    aux+="Auto Inexistente";
                else {
                    aux+="Piso:"+i+"\nPlaza:"+j;
                    i=pisos;
                    j=plazas;
            }
            }
        return aux;    
    }
    public void registrarAuto(Auto a,int x,int y){
        this.lugar[x-1][y-1]=a;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDireccion(int direccion){
        this.direccion=direccion;
    }
    public int getDireccion(){
        return direccion;
    }
    public void setApertura(double apertura){
        this.apertura=apertura;
    }
    public double getApertura(){
        return apertura;
    }
    public void setCierre(double cierre){
        this.cierre=cierre;
    }
    public double getCierre(){
        return cierre;
    }
    public void setPisos(int pisos){
        this.pisos=pisos;
    }
    public int getPisos(){
        return pisos;
    }
    public void setPlazas(int plazas){
        this.plazas=plazas;
    }
    public int getPlazas(){
        return plazas;
    }
}
