public class Evento {

    private String fecha;
    private String hora;
    private  String lugar;
    private  int cantidad;
    private  double costo;


    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getCosto() {
        return costo;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setCantidad(int capacidad) {
        cantidad = capacidad;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
