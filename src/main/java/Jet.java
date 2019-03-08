/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * clase jet joja de la clase PowerredVehicle y tambien hereda a interfaz
 * @author stevenpc
 */
public class Jet extends PowerredVehicle {
   private String myEngineCount; 
/**
 * constructor de la clase jet en la cual recibe los datos de sus atributos
 * @param myEngineCount
 * @param myFuelTipe
 * @param myBrand
 * @param myModel 
 */
    public Jet(String myEngineCount, String myFuelTipe, String myBrand, String myModel) {
        super(myFuelTipe, myBrand, myModel);
        this.myEngineCount = myEngineCount;
    }
    
    /*
    * metodo propio de la clase jet 
    */ 
    public void imprimirJet(){  
        
       System.out.println("myEngineCount"+myEngineCount+"myFuelTipe"+myFuelTipe+"myBrand"+myBrand+"myModel"+myModel);    
        
    }
    
    /**
     * @return the myEngineCount
     */
    public String getMyEngineCount() {
        return myEngineCount;
    }

    /**
     * @param myEngineCount the myEngineCount to set
     */
    public void setMyEngineCount(String myEngineCount) {
        this.myEngineCount = myEngineCount;
    }
/*
    metodo heredado de la interfaz
    
    */
    @Override
    public void imprimirInterfaz() {
         System.out.println("imprecion de la interfaz en la clase jet."); }

}
