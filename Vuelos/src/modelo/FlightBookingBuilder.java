package modelo;

public class FlightBookingBuilder implements Builder {
    private FlightBooking reservaVuelo;

    public FlightBookingBuilder() {
        this.reiniciar();
    }

    @Override
    public void reiniciar() {
        this.reservaVuelo = new FlightBooking();
    }

    @Override
    public void establecerSeleccionAsiento(String seleccionAsiento) {
        this.reservaVuelo.setSeleccionAsiento(seleccionAsiento);
    }

    @Override
    public void establecerCantidadEquipaje(int cantidad) {
        this.reservaVuelo.setCantidadEquipaje(cantidad);
    }

    @Override
    public void establecerTipoComida(TipoVuelo tipoComida) {
        Comida comida;
        if (tipoComida == TipoVuelo.ESTANDAR) {
            comida = new ComidaEstandar();
        } else {
            comida = new ComidaPremium();
        }
        this.reservaVuelo.setComida(comida);
    }

    @Override
    public void establecerServiciosPremium(String servicios) {
        this.reservaVuelo.setServiciosPremium(servicios);
    }

    public FlightBooking obtenerResultado() {
        return this.reservaVuelo;
    }
}
