package modelo;

import java.util.Arrays;

public class Comida {
    private TipoVuelo tipoVuelo;
    private String[] platos;

    public TipoVuelo getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }
    
    public String[] getPlatos() {
        return platos;
    }

    public void setPlatos() {
        if (tipoVuelo == TipoVuelo.ESTANDAR) {
            platos = new String[]{"Pollo a la parrilla", "Pasta con salsa de tomate",
            "Ensalada mixta", "Fruta fresca", "Agua mineral"};
        } else if (tipoVuelo == TipoVuelo.PREMIUM) {
            platos = new String[]{"Caviar", "Langosta", "Filete Mignon","Trufas", 
            "Champán"};
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "platos=" + Arrays.toString(platos) +
                '}';
    }
}
