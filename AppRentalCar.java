public class AppRentalCar {

    private Color color;
    private Placa placa;
    private Marca marca;
  
    /**
     * Creates kingdom
     */
    public void createCar(final CarFactory factory) {
      setColor(factory.createColor());
      setMarca(factory.createMarca());
      setPlaca(factory.createPlaca());
    }
    
    Color getColor(final CarFactory factory) {
      return factory.createColor();
    }
  
    public Color getColor() {
      return color;
    }
  
    private void setColor(final Color color) {
      this.color = color;
    }
    
    Marca getMarca(final CarFactory factory) {
      return factory.createMarca();
    }
  
    public Marca getMarca() {
      return marca;
    }
  
    private void setMarca(final Marca marca) {
      this.marca = marca;
    }
    
    Placa getPlaca(final CarFactory factory) {
      return factory.createPlaca();
    }
  
    public Placa getPlaca() {
      return placa;
    }
  
    private void setPlaca(final Placa placa) {
      this.placa = placa;
    }
  
    /**
     * The factory of kingdom factories.
     */
    public static class FactoryMaker {
  
      /**
       * Enumeration for the different types of Kingdoms.
       */
      /**
       * The factory method to create CarFactory concrete objects.
       */
      public static CarFactory makeFactory(String color, String marca, String placa, int type) {
        switch (type) {
          case 1:
            return new FamiliarFactory(color, marca, placa);
          case 2:
            return new FamiliarFactory(color, marca, placa);
            //return new OrcCarFactory();
          default:
            throw new IllegalArgumentException("KingdomType not supported.");
        }
      }
    }
  
    /**
     * Program entry point.
     * 
     * @param args
     *          command line args
     */
    public static void main(String[] args) {
  
      AppRentalCar app = new AppRentalCar();
  
      //LOGGER.info("Elf Kingdom");
      app.createCar(FactoryMaker.makeFactory("rojo","bmw","qwe",1));
      app.getPlaca().print();
      app.getMarca().print();
      app.getColor().print();
      app.createCar(FactoryMaker.makeFactory("azul","bmw","qwe",2));
      app.getPlaca().print();
      app.getMarca().print();
      app.getColor().print();
    }
  }