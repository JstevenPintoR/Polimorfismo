/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenpc
 */
public class Skateboard  extends Vehicle {
   private String myBoardLength ;

    public Skateboard(String myBoardLength, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myBoardLength = myBoardLength;
    }

       
    public void imprimirSkate(){  
        
      System.out.println("myBoardLength" + myBoardLength + "myBrand"+myBrand + "myModel"+myModel);     
        
    }
    public String getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(String myBoardLength) {
        this.myBoardLength = myBoardLength;
    }

    @Override
    public void imprimirInterfaz() {
      System.out.println("imprecion de la interfaz en la clase Skateboard.");    
    
    }
}
