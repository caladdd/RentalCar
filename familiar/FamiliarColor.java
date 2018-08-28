package familiar;
import carro.*;
public class FamiliarColor implements Color {
    
    private String color;

    public FamiliarColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }
}