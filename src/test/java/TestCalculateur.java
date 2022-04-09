import com.coundia.calculator.Calculateur;
//import
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tester la class Calculateur
 * @author Papa Coundia
 * @created 09/04/2022 / 13:52
 * @project java_junit
 */
 class TestCalculateur {
    private final Calculateur calculator = new Calculateur();
    //test si la somme est bonne
    @Test
    void   testSomme(){
        assertEquals(10, calculator.somme(5, 5));
    }
    //test si la somme n 'est pas bonne
    @Test
    void   testSommeKo(){
        assertNotEquals(10, calculator.somme(5, 15));
    }

}
