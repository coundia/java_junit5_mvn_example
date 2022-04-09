import com.coundia.tuto.Hello;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Papa Coundia
 * @created 09/04/2022 / 14:22
 * @project java_junit
 */
 class TestHello {
    @Test
   void testHello(){
        assertEquals("Hello", Hello.sayHello());
    }
}
