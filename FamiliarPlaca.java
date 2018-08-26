public class FamiliarPlaca implements Placa {
    

    private String placa;

    public FamiliarPlaca(String placa){
        this.placa=placa;
    };


    @Override
    public void print() {
        System.out.println(placa);
    }

    public String getPlaca(){
        return placa;
    }
}