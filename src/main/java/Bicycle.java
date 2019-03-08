/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @Description clase Bicycle es una clase hija que hered los atributos de la clase vehiculo 
 * @author stevenpc
 */
public class Bicycle extends Vehicle {
    
    /*variable myGearCount la cual guarda los datos propios de la clase Bicycle
    */
 private  String myGearCount;  
/**
 * guarda los atributos propios de la clase Bicycle y los heredados de la clase Vehicle 
 * @param myGearCount
 * @param myBrand
 * @param myModel 
 */
    public Bicycle(String myGearCount, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myGearCount = myGearCount;
    }

    /**
     * metodo heredado de la interfaz
     */
    
    @Override
    public void imprimirInterfaz() {
         
        System.out.println("imprecion de la interfaz en la clase bicicleta.");
    }
 
     /**
     * metodo propio de la clase Bicycle
     */
    
    
    public void imprimirBici(){  
        
      System.out.println("myGearCount"+ getMyGearCount() + "myBrand" + myBrand + "myModel" + myModel);
        
    }

    /**
     * @return the myGearCount
     */
    public String getMyGearCount() {
        return myGearCount;
    }

    /**
     * @param myGearCount the myGearCount to set
     */
    public void setMyGearCount(String myGearCount) {
        this.myGearCount = myGearCount;
    }
    
    
   
}
