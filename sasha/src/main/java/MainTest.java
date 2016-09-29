import org.junit.Assert;
import org.junit.Test;

/**
 * Created by evgeniy on 29/09/16.
 */
public class MainTest {

    @Test
    public void getOldestPetTest() {
        Pet oldest = new Pet(100);

        Pet[] pets = {
            oldest,
            new Pet(12),
            new Pet(8),
            new Pet(4),
            new Pet(2)
        };

        Pet result = Main.getOldestPet(pets);

        Assert.assertEquals(oldest.age, result.age);
    }

    @Test(expected = NullPointerException.class)
    public void getOldestPetTest2() {
        Pet oldest = new Pet(100);

        Pet[] pets = {
                oldest,
                new Pet(12),
                new Pet(8),
                new Pet(4),
                new Pet(2)
        };

        Pet result = Main.getOldestPet(pets);

        Assert.assertEquals(oldest.age, result.age);
    }
}
