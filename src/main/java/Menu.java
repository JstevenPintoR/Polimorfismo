
import java.util.ArrayList;


/**
 * clase en la cual se queman los datos y se imprimen estos
 * @author stevenpc
 */
public class Menu {
    
    ArrayList <Vehicle>  Vehuculo = new ArrayList <>();
/**
 * se llama el metodo de ingresar los daots
 * 
 */
    public Menu() {
   
      ingresaVehiculo ();  
    }
    /*
    metodo en el cual se ingresan los datos quemados
    
    */
  public  void ingresaVehiculo (){
      
      Vehicle skate = new Skateboard("vanz", "2009", "1 metro");
      Vehicle carro = new Car("renault", "2009", "disel","corriente" );
      Vehicle jet = new Jet("jet", "2019", "premiun", "ocho motores");
      Vehicle cicla = new Bicycle("shimano", "2010","4 tiempos" ) ;  
      Vehuculo.add(skate);
      Vehuculo.add(carro);
      Vehuculo.add(jet);
      Vehuculo.add(cicla);     
      
      /*
      for en el cual se hace el parceo y se instancia la clase Skateboard
      
      */
      for (Vehicle Vehuculo1 : Vehuculo) {
          if(Vehuculo1 instanceof Skateboard){
              Skateboard skatevehiculo = (Skateboard)Vehuculo1;
              skatevehiculo.imprimirPadre();
              skatevehiculo.imprimirSkate();
              skatevehiculo.imprimirInterfaz();
          }
          /*
          se intancia y se hace el parceo de la clase car
          
          */
          else if(Vehuculo1 instanceof Car){
          
              Car carvhiculo = (Car)Vehuculo1;
              carvhiculo.imprimirPadre();
              carvhiculo.imprimirCarro();
              carvhiculo.imprimirVehiculopotenciado();
              
              
            
          }
           /*se intancia y se hace el parceo de la clase
          
          */
           else if(Vehuculo1 instanceof Jet){
          
              Jet jethiculo = (Jet)Vehuculo1;
              jethiculo.imprimirPadre();
              jethiculo.imprimirJet();
              jethiculo.imprimirVehiculopotenciado();
              jethiculo.imprimirInterfaz();
          }
          else if(Vehuculo1 instanceof Bicycle){
          
              Bicycle ciclavehiculo = (Bicycle)Vehuculo1;
              ciclavehiculo.imprimirPadre();
              ciclavehiculo.imprimirBici();
          }
      }
      
      
  }
} 
