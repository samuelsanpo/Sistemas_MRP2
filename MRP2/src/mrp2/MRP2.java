
package mrp2;

import Interfaz.Principal;
import Conexion.Conex;

public class MRP2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Principal f = new Principal(); 
        f.setVisible (true); 
        f.setLocationRelativeTo(null);
        Conex c = new Conex();
        c.connect();
        
    }
    
}
