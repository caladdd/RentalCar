public class Customer {

    private int id;
    private String nombre; //genero, tipo;

    public Customer(int id, String nombre){ //, String genero, String tipo){
        this.id = id;
        this.nombre = nombre;
        /* this.genero = genero;
        this.tipo = tipo; */
    }

    public String getNombre(){
        return nombre;
    }

    public int getId(){
        return id;
    }

/* 
    public String getGenero(){
        return genero;
    }

    public String getTipo(){
        return tipo;
    } */

    
}