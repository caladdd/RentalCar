public class FamiliarFactory implements CarFactory {

    String color;
    String marca;
    String placa;

    public FamiliarFactory(String color,String marca,String placa){
        this.color = color;
        this.marca= marca;
        this.placa = placa;
    }

    public Color createColor() {
        return new FamiliarColor(color);
    }

    public Marca createMarca() {
        return new FamiliarMarca(marca);
     }

     
    public Placa createPlaca() {
        return new FamiliarPlaca(placa);
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

