package familiar;
import carro.*;
public class FamiliarPlaca implements Placa {
    
    private String placa;

    public FamiliarPlaca(String placa){
        this.placa=placa;
    }

    public String getPlaca(){
        return placa;
    }
}