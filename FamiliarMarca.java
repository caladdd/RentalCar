public class FamiliarMarca implements Marca {
    
    private String marca;

    public FamiliarMarca(String marca){
        this.marca=marca;
    };


    @Override
    public void print() {
        System.out.println(marca);
    }

    public String getMarca(){
        return marca;
    }
}