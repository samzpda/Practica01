class Evento {

    private final String fecha;
    private final String hora;
    private final String lugar;
    private final int cantidad;
    private final double costo;

    public Evento(String fecha, String hora, String lugar, int cantidad, double costo){
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public Evento() {

        cantidad = 0;
        costo = 0;
        lugar = "cine";
        hora = "12:00";
        fecha = "2/2/20";

    }


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
    public String setFecha() {
        return fecha;
    }

    public String setHora() {
        return hora;
    }

    public String setLugar() {
        return lugar;
    }

    public int setCantidad() {
        return cantidad;
    }

    public double setCosto() {
        return costo;
    }

}
