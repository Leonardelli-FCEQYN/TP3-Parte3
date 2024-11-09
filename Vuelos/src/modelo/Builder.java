package modelo;

public interface Builder {
    void reiniciar();
    void establecerSeleccionAsiento(String seleccionAsiento);
    void establecerCantidadEquipaje(int cantidad);
    void establecerTipoComida(TipoVuelo tipoVuelo);
    void establecerServiciosPremium(String servicios);
}
