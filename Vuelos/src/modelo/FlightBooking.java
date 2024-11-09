package modelo;

public class FlightBooking {
    private String seleccionAsiento;
    private int cantidadEquipaje;
    private Comida comida;
    private String serviciosPremium;

    @Override
    public String toString() {
        return  "[seleccionAsiento='" + seleccionAsiento + '\'' +
                "\n cantidadEquipaje=" + cantidadEquipaje + '\'' +
                "\n serviciosPremium='" + serviciosPremium + '\'' +
                "\n comida='" + comida.toString() + '\'' + ']';
    }

    // Getters y setters
    public String getSeleccionAsiento() {
        return seleccionAsiento;
    }

    public void setSeleccionAsiento(String seleccionAsiento) {
        this.seleccionAsiento = seleccionAsiento;
    }

    public int getCantidadEquipaje() {
        return cantidadEquipaje;
    }

    public void setCantidadEquipaje(int cantidadEquipaje) {
        this.cantidadEquipaje = cantidadEquipaje;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public String getServiciosPremium() {
        return serviciosPremium;
    }

    public void setServiciosPremium(String serviciosPremium) {
        this.serviciosPremium = serviciosPremium;
    }
}
