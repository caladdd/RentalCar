import carro.*;

public interface CarFactory {
    Color createColor(String color);
    Marca createMarca(String marca);
    Placa createPlaca(String placa);
    String getColor();
    String getMarca();
    String getPlaca();
    String getTipo();
    /*
    Cilindraje createCilindraje();
    Trasmision createTramision();
    NroPuestos createNroPuesto();
    */
}