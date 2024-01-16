
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
        boolean esMultiploDe2;
        int resultado = a % 2;
        if (a >= 2) {
            if (resultado == 0) {
                esMultiploDe2 = true;
            }
            else{
                esMultiploDe2 = false;
            }
        }
        else{
            esMultiploDe2 = false;
        }
        return esMultiploDe2;
    }
    
    public boolean esMultiploDe5 (int a) {
         boolean esMultiploDe5;
        int resultado = a % 5;
        if (a >= 5) {
            if (resultado == 0) {
                esMultiploDe5 = true;
            }
            else{
                esMultiploDe5 = false;
            }
        }
        else{
            esMultiploDe5 = false;
        }
        return esMultiploDe5;
    }
    
    public boolean esMultiploDe (int a, int b) {
         boolean esMultiploDe;
        if (a < b || b == 0 || a < 0 || b < 0) {
            esMultiploDe = false;
        }
        else{
            if (a % b == 0) {
                esMultiploDe = true;
            }
            else {
                esMultiploDe = false;
            }
        }
        return esMultiploDe;
    }
}
