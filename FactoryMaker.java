
import familiar.*;
/**
     * The factory of kingdom factories.
     */
    public class FactoryMaker {
  
        /**
         * Enumeration for the different types of Kingdoms.
         */
        /**
         * The factory method to create CarFactory concrete objects.
         */
        public static CarFactory makeFactory(String color, String marca, String placa, int type) {
            
          switch (type) {
            case 0:
              return new FamiliarFactory(color, marca, placa);
            case 1:
              return new FamiliarFactory(color, marca, placa);
              //return new OrcCarFactory();
            default:
              throw new IllegalArgumentException("KingdomType not supported.");
          }
        }
      }