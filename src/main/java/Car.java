/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 */
public class Car extends PowerredVehicle {
  private  String myEngineSize;


    public Car(String myEngineSize, String myFuelTipe, String myBrand, String myModel) {
        super(myFuelTipe, myBrand, myModel);
        this.myEngineSize = myEngineSize;
    }

   
   
 
    public void imprimirCarro(){  
        
      System.out.println("myFuelTipe "+myFuelTipe+"myBrand"+myBrand+"myModel"+myModel);     
      
      
          
    }
    public String getMyEngineSize() {
        return myEngineSize;
    }

    public void setMyEngineSize(String myEngineSize) {
        this.myEngineSize = myEngineSize;
    }

    @Override
    public void imprimirInterfaz() {
          System.out.println("imprecion de la interfaz en la clase carro."); }
}
