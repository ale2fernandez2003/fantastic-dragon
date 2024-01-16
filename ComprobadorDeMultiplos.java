
/**
 * Clase que comprueba si un numero es multiplo de otro
 * mediante diversos metodos.
 * 
 * @author Alejandro Fernandez Fernandez 
 * @version 0.1
 */
public class ComprobadorDeMultiplos
{
    public boolean esMultiploDe2 (int a){
        if (a<2){
            return false;
        }
        if (a%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean esMultiploDe5 (int b){
        if (b<5){
            return false;
        }
        
        if (b%5==0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean esMultiploDe (int a, int b){
        if (b<=0){
            return false;
        }
        
        if (a<b){
            return false;
        }
        
        if (a%b==0){
            return true;
        }
        else {
            return false;
        }
    }
}
