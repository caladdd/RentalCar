public interface CarFactory {
    Color createColor(String color);
    Marca createMarca(String marca);
    Placa createPlaca(String placa);
    String getColor();
    String getMarca();
    String getPlaca();
    /*
    Cilindraje createCilindraje();
    Trasmision createTramision();
    NroPuestos createNroPuesto();
    */
}