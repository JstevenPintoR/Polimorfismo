
/**
 *
 * @author stevenpc
 */
public abstract class PowerredVehicle extends Vehicle {
    protected String myFuelTipe;

      public PowerredVehicle(String myFuelTipe, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myFuelTipe = myFuelTipe;
    }

  
      
    
    public void imprimirVehiculopotenciado(){  
        
      System.out.println("\nCalse hija de Vehicle pero a su vez clase padre de las clases Car y Jet  ");     
        
    }
   
    public String getMyFuelTipe() {
        return myFuelTipe;
    }

    public void setMyFuelTipe(String myFuelTipe) {
        this.myFuelTipe = myFuelTipe;
    }
}
