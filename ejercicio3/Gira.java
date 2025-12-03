
package ejercicio3;

public class Gira extends Recital {
    private String nombreGira;
    private int totalFechas;
    private int cantFechas;
    private Fecha[] fechas;
    private int actual;
    
    public Gira(String nombreGira, int totalFechas, String nombreBanda, int cantTemas) {
        super(nombreBanda, cantTemas);
        this.nombreGira = nombreGira;
        this.totalFechas = totalFechas;
        cantFechas=0;
        fechas= new Fecha[this.totalFechas];
        this.actual=0;
    }
    @Override
    public double calcularCosto(){
        double aux;
        aux=30000*getTotalFechas();
        return aux;
    }
    @Override
    public void actuar(){
        System.out.println("Buenas noches "+fechas[actual].getCiudad());
        super.actuar();
        actual++;
    }
    public void agregarFecha(Fecha unaFecha){
        if(cantFechas<this.totalFechas){
            fechas[cantFechas]=unaFecha;
            cantFechas++;
        }
    }

    public String getNombreGira() {
        return nombreGira;
    }

    public void setNombreGira(String nombreGira) {
        this.nombreGira = nombreGira;
    }

    public int getTotalFechas() {
        return totalFechas;
    }

    public void setTotalFechas(int totalFechas) {
        this.totalFechas = totalFechas;
    }
}
