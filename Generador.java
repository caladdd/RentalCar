import java.util.Random;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;


import com.sun.org.apache.regexp.internal.recompile;

public class Generador{

    public static Stack<CarFactory>[] generadorCar(int tiposCarros, int cantidad){
        Random rand = new Random();
        int randType, randColor, randMarca, randPlaca;
        //Stack objects
        Stack<CarFactory> [] stockCar = new Stack[tiposCarros]; 
        for (int i=0; i<tiposCarros; ++i){
            stockCar[i] = new Stack<CarFactory>();
        }
        HashMap<Integer, String> colors = Tools.color();
        HashMap<Integer, String> marcas = Tools.marca();
        for (int i = 0; i < cantidad; i++) {
            randType = rand.nextInt(tiposCarros);
            randColor = rand.nextInt(colors.size());
            randMarca = rand.nextInt(marcas.size());
            randPlaca = rand.nextInt(900) + 100;
            CarFactory temp = FactoryMaker.makeFactory(colors.get(randColor), marcas.get(randMarca), ""+randPlaca, randType);
            stockCar[randType].push(temp);
        }
        return stockCar;
    }

    public static Customer[] generadorCustomer(int cantidad){
        Random rand = new Random();
        Customer[] customers = new Customer[cantidad];
        Customer customer;
        int randName, randId;  
        HashMap<Integer, String> nombres = Tools.nombres();
        for(int i=0; i < cantidad;i++){
            randName = rand.nextInt(nombres.size());
            randId = rand.nextInt(900) + 100;
            customer = new Customer(randId, nombres.get(randName));
            customers[i] = customer;
        }
        return customers; 
    }
}