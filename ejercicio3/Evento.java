
package ejercicio3;

public class Evento extends Recital {
    private String motivo;
    private String contratante;
    private int diaEvento;

    public Evento(String motivo, String contratante, int diaEvento, String nombreBanda, int cantTemas) {
        super(nombreBanda, cantTemas);
        this.motivo = motivo;
        this.contratante = contratante;
        this.diaEvento = diaEvento;
    }
    @Override
    public double calcularCosto(){
        double aux;
        switch (getMotivo()) {
            case "beneficio":
                aux=0;
                break;
            case "TV":
                aux=50000;
                break;
            default:
                aux=150000;
                break;
        }
        return aux;
    }
    @Override
    public void actuar(){
        switch (getMotivo()) {
            case "beneficio":
                System.out.println("Recuerden colaborar con "+this.getContratante());
                break;
            case "TV":
                System.out.println("Buenas noches amigos televidentes ");
                break;
            default:
                System.out.println("Un feliz cumpleaños para "+this.getContratante());
                break;
        }
        super.actuar();
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public int getDiaEvento() {
        return diaEvento;
    }

    public void setDiaEvento(int diaEvento) {
        this.diaEvento = diaEvento;
    }
    
}
