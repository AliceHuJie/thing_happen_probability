import org.junit.Assert;
import org.junit.Test;

public class ThingTest {

    @Test
    public void get_happen_probability_should_correct() {
        // given
        double probability = 0.6;
        int totalTimes = 4;
        int happenTimes = 1;
        double expectedProbability = 0.1536;

        // when
        Thing thing = new Thing(probability);
        double happenProbability = thing.getHappenProbability(totalTimes, happenTimes);

        //then
        Assert.assertEquals(expectedProbability, happenProbability, 0.000001);
    }
}