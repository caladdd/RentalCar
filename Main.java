import java.util.Stack;

public class Main{

    /**
     * Program entry point.
     * 
     * @param args
     *          command line args
     */
    public static void main(String[] args) {
        //Asiganar al arreglo el tamaño de cantidad de tipos de autos
        //LinkedList<AppRentalCar>[] autos = new LinkedList<AppRentalCar>()[10]; 
        //AppRentalCar app = new AppRentalCar();
        //LOGGER.info("Elf Kingdom");
        //Stack<Card>[] cards = (Stack<Card>[]) new Stack[52];
        int tiposCarros = 2;
        Stack<CarFactory> [] pila = new Stack[tiposCarros]; 
        
        
        // Fill it with ten new Stack objects
        for (int i=0; i<tiposCarros; ++i){
            pila[i] = new Stack<CarFactory>();
        }


        CarFactory c = FactoryMaker.makeFactory("rojo","xD","asd",1);
        CarFactory d = FactoryMaker.makeFactory("verde","rt","wsa",1);
        pila[0].push(c);
        System.out.println(c.getPlaca());
        System.out.println(pila[0].pop().getPlaca());
        System.out.println(d.getPlaca());
/* 
        app.createCar(FactoryMaker.makeFactory("rojo","bmw","qwe",1));
        app.getPlaca().print();
        app.getMarca().print();
        app.getColor().print();
        app.createCar(FactoryMaker.makeFactory("azul","bmw","qwe",2));
        app.getPlaca().print();
        app.getMarca().print();
        app.getColor().print();

        while (true) {
            System.out.println();
        } */
      }
}