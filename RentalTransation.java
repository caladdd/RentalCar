public class RentalTransation{

    private int id;
    private String fecha; // pickupDate, returnDate, valorHora, valorTotal;
    private Customer customer;
    private CarFactory car;

    public RentalTransation(int id, String fecha, Customer customer, CarFactory car){
        this.id = id;
        this.fecha = fecha;
        this.customer = customer;
        this.car = car;
        print();
    }

    private void print(){
        System.out.println("Numero de orden "+id);
        System.out.println("Fecha "+fecha);
        System.out.println("Cliente "+customer.getNombre());
        System.out.println("Tipo de auto rentado "+car.getMarca());
        System.out.println("Color de auto rentado "+car.getColor());
    }

}