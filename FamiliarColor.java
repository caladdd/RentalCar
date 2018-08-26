public class FamiliarColor implements Color {
    
    private String color;

    public FamiliarColor(String color){
        this.color=color;
    };

    @Override
    public void print() {
        System.out.println(color);
    }

    public String getColor(){
        return color;
    }
}