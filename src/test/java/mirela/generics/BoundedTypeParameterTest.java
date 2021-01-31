package mirela.generics;

import com.demo.effective_java.mirela.generics.BoundedTypeParameter;
import com.demo.effective_java.mirela.generics.Cat;
import org.junit.Test;

public class BoundedTypeParameterTest {

    @Test
    public void createBeautyAppointmentTest() {
        // this is ok
        BoundedTypeParameter<Cat> cat = new BoundedTypeParameter<Cat>();

        // compilation error
        //BoundedTypeParameter<Object> cow;

    }
}
