import java.util.HashMap;
import java.util.Map;
public class Tools{

    public static HashMap<Integer, String> nombres(){
        HashMap<Integer, String> map = new HashMap<>();
        String temp = "Alejo Borja Calisto"
        +" Alex Brahim José"
        +" Alfonso Brais Camilo"
        +" Alfredo Bruno Manuel"
        +" Alonso Calisto Carlos"
        +" Álvaro Camilo Julio"
        +" Amadeo Carlos Cayetano"
        +" Amado Cayetano César"    
        +" Amando César Christian"
        +" Ambrosio Christian Claudio";
        String[] nombres = temp.split(" ");
        for(int i=0;i<nombres.length;i++){
            map.put(i,nombres[i]);    
        }
        return map;
    }

    public static HashMap<Integer, String> color(){
        HashMap<Integer, String> map = new HashMap<>();
        String temp = "Rojo Verde Azul Magenta Amarillo Marron Naranja Negro Blanco";
        String[] color = temp.split(" ");
        for(int i=0;i<color.length;i++){
            map.put(i,color[i]);    
        }
        return map;
    }

    public static HashMap<Integer, String> marca(){
        HashMap<Integer, String> map = new HashMap<>();
        String temp = "Audi MNW Chevrolet Ford Honda Kia Mazda Mini Nissan Porsche Renault Toyota";
        String[] marca = temp.split(" ");
        for(int i=0;i<marca.length;i++){
            map.put(i,marca[i]);    
        }
        return map;
    }
}