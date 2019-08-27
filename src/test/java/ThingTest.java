import org.junit.Assert;
import org.junit.Test;

public class ThingTest {

    @Test
    public void test_and_should_correct() {
        // given
        Thing oneThing = new Thing(0.5);
        Thing anotherThing = new Thing(0.6);
        double expectedProbability = 0.3;

        // when
        Thing and = oneThing.and(anotherThing);

        // then
        Assert.assertEquals(expectedProbability, and.getProbability(), 0.000001);
    }

    @Test
    public void test_not_should_correct() {
        // given
        Thing thing = new Thing(0.6);
        double expectedProbability = 0.4;

        // when
        Thing not = thing.not();

        // then
        Assert.assertEquals(expectedProbability, not.getProbability(), 0.000001);
    }

    @Test
    public void test_or_should_correct() {
        // given
        Thing oneThing = new Thing(0.5);
        Thing anotherThing = new Thing(0.6);
        double expectedProbability = 0.8;

        // when
        Thing or = oneThing.or(anotherThing);

        // then
        Assert.assertEquals(expectedProbability, or.getProbability(), 0.000001);
    }
}