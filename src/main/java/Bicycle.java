/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 */
public class Bicycle extends Vehicle {
 private  String myGearCount;  

    public Bicycle(String myGearCount, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myGearCount = myGearCount;
    }

    @Override
    public void imprimirInterfaz() {
         
        System.out.println("imprecion de la interfaz en la clase bicicleta.");
    }
 
    
    
    public void imprimirBici(){  
        
      System.out.println("myGearCount"+ myGearCount + "myBrand" + myBrand + "myModel" + myModel);
        
    }
    
    public String getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(String myGearCount) {
        this.myGearCount = myGearCount;
    }
}
