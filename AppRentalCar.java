import java.util.Stack;
import java.util.Scanner;

public class AppRentalCar {
    private static AppRentalCar instance = null;
    private int idRenta;

    private AppRentalCar() {
        this.idRenta=0;
        rentalTransation();
    }
    
    public static AppRentalCar getInstance() {
        if (instance == null)
            instance = new AppRentalCar();
        return instance;
    }

    private void rentalTransation(){
        Scanner sc = new Scanner(System.in);
        /* int tiposCarros = 2;
        Stack<CarFactory> [] pila = new Stack[tiposCarros]; 
        // Fill it with ten new Stack objects
        for (int i=0; i<tiposCarros; ++i){
            pila[i] = new Stack<CarFactory>();
        }
        CarFactory c = FactoryMaker.makeFactory("rojo","xD","asd",1);
        CarFactory d = FactoryMaker.makeFactory("verde","rt","wsa",1);
        pila[0].push(c);
        pila[0].push(d); */
        //System.out.println(c.getPlaca());
        //System.out.println(pila[0].pop().getPlaca());
        //System.out.println(d.getPlaca());
        int cantidadAutos = 5;
        /* Customer customer = new Customer(123, "juan");
        for (int i = 0; i < 2; i++) {
            RentalTransation r = new RentalTransation(idRenta, "fecha", customer, pila[0].pop());
            idRenta++;
        } */

        Stack<CarFactory>[] carros = Generador.generadorCar(1, 5);
        Customer[] customer = Generador.generadorCustomer(5);
        int n = 0, m = 0;
        System.out.println(carros[0].size());
        RentalTransation r;
        while(cantidadAutos != 0){
            System.out.print("Customer: ");
            n = sc.nextInt();
            System.out.print("Carro: ");
            m = sc.nextInt();
            r = new RentalTransation(idRenta, "fecha", customer[n-1], carros[m-1].pop());
            cantidadAutos--;
        }
    }

}