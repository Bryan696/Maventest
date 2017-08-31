import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Nummer {

    public List<Integer> generate(int amount, int maxNumber ) {
        Random random  = new Random();
        List<Integer> nummerList = new ArrayList<Integer>();

        for(int i = 0; i<amount; i++)
            nummerList.add(random.nextInt(maxNumber));

        return nummerList;
    }
}
