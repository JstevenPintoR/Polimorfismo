/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * clase car la cual contiene sus 
 * @author stevenpc
 */
public class Car extends PowerredVehicle {
  private  String myEngineSize;
 
  /**
   * constructor en el cual se ingresan los datos propios de la clase 
   * @param myEngineSize
   * @param myFuelTipe
   * @param myBrand
   * @param myModel 
   */

    public Car(String myEngineSize, String myFuelTipe, String myBrand, String myModel) {
        super(myFuelTipe, myBrand, myModel);
        this.myEngineSize = myEngineSize;
    }

   
   
 /**
  * metodo propio de la calse car 
  *
  */
    public void imprimirCarro(){  
        
      System.out.println("myFuelTipe "+myFuelTipe+"myBrand"+myBrand+"myModel"+myModel);     
      
      
          
    }
   
/**
 * metodo heredado de la interfaz 
 */
    @Override
    public void imprimirInterfaz() {
          System.out.println("imprecion de la interfaz en la clase carro."); }

    /**
     * @return the myEngineSize
     */
    public String getMyEngineSize() {
        return myEngineSize;
    }

    /**
     * @param myEngineSize the myEngineSize to set
     */
    public void setMyEngineSize(String myEngineSize) {
        this.myEngineSize = myEngineSize;
    }
}
