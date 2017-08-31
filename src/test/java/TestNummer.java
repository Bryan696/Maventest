import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class TestNummer {


    @Test
    public void testGenerate() {
        int maxNumber = 100;
        int amount = 5;

        Nummer nummerGen = new Nummer();
        List<Integer> nummers =  nummerGen.generate(amount,maxNumber);

        assertThat(nummers).hasSize(amount);
    }


}
