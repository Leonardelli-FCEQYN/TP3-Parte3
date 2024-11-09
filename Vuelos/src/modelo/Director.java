package modelo;

public class Director {
    public void construirReservaEstandar(Builder builder, int cantAsientos) {
        builder.reiniciar();
        builder.establecerSeleccionAsiento("Estandar");
        builder.establecerCantidadEquipaje(cantAsientos);
        builder.establecerTipoComida(TipoVuelo.ESTANDAR);
        builder.establecerServiciosPremium("Ninguno");
    }

    public void construirReservaPremium(Builder builder, int cantAsientos) {
        builder.reiniciar();
        builder.establecerSeleccionAsiento("Premium");
        builder.establecerCantidadEquipaje(cantAsientos);
        builder.establecerTipoComida(TipoVuelo.PREMIUM);
        builder.establecerServiciosPremium("Todos");
    }
}
