public class FamiliarFactory implements CarFactory {

    private Color color;
    private Marca marca;
    private Placa placa;

    public FamiliarFactory(String color,String marca,String placa){
        this.color = createColor(color);
        this.marca = createMarca(marca);
        this.placa = createPlaca(placa);
    }

    public Color createColor(String color) {
        return new FamiliarColor(color);
    }

    public Marca createMarca(String marca) {
        return new FamiliarMarca(marca);
     }

     
    public Placa createPlaca(String placa) {
        return new FamiliarPlaca(placa);
     }

    public String getColor() {
        return color.getColor();
    }

    public String getMarca() {
        return marca.getMarca();
    }
    
    public String getPlaca() {
        return placa.getPlaca();
    }
/* 
    public Cilindraje createCilindraje() {
        return new FamiliarCilindraje();
    }

    public Trasmision createTramision() {
        return new FamiliarTramision();
    }

    public NroPuestos createNroPuesto() {
        return new FamiliarNroPuesto();
    }*/
}

