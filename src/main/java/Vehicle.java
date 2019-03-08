
import Interfaces.ITransportes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 */
public abstract class Vehicle implements ITransportes {
    protected String myBrand;
    protected String myModel;

    public Vehicle(String myBrand, String myModel) {
        this.myBrand = myBrand;
        this.myModel = myModel;
    }

   
    
    
    public void imprimirPadre(){
      System.out.println("\nCalse padre principal.");  
    }
    /**
     * @return the myBrand
     */
    public String getMyBrand() {
        return myBrand;
    }

    /**
     * @param myBrand the myBrand to set
     */
    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    /**
     * @return the myModel
     */
    public String getMyModel() {
        return myModel;
    }

    /**
     * @param myModel the myModel to set
     */
    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }

    

}
