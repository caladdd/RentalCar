package familiar;
import carro.*;
public class FamiliarMarca implements Marca {
    
    private String marca;

    public FamiliarMarca(String marca){
        this.marca=marca;
    }

    public String getMarca(){
        return marca;
    }
}