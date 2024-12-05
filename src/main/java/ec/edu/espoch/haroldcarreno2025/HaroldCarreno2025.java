

package ec.edu.espoch.haroldcarreno2025;
import java.util.Stack;
import java.util.ArrayList;
public class HaroldCarreno2025 {

    public static void main(String[] args) {
       
        Calculadora objCalculadora = new Calculadora(2);

          Stack objStack= new  Stack<>();
           
             
        System.out.println(""+objCalculadora.Sumaa());
        
        
        
        System.out.println(""+objStack.push(objCalculadora.Sumaa()+objCalculadora.getNumero()));
        
        objStack.pop();
       
        
  
    }
}
