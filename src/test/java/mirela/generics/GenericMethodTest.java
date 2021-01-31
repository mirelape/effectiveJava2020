package mirela.generics;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.demo.effective_java.mirela.generics.GenericMethod;
import static org.assertj.core.api.Assertions.assertThat;


public class GenericMethodTest {

    @Test
    public void setUnionTest() {
        Set<String> bands = new HashSet<String>(Arrays.asList("Led Zeppelin", "The Beatles"));
        Set<String> songs = new HashSet<String>(Arrays.asList("Stairway to Heaven", "Here comes the Sun"));

        GenericMethod genericMethod = new GenericMethod();
        Set<String> bandsAndSongs = genericMethod.setUnion(bands, songs);

        assertThat(bandsAndSongs.containsAll(Arrays.asList("Led Zeppelin", "The Beatles", "Stairway to Heaven", "Here comes the Sun")));
    }
}
