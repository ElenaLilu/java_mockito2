import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void findAllTest() {
        FilmsManager manager = new FilmsManager();
        String film1 = "Bloodshot";
        String film2 = "Forward";
        String film3 = "Hotel Belgrade";
        String film4 = "Gentlemen";
        String film5 = "Invisible Man";
        String film6 = "Trolls";
        String film7 = "Number One";

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3};

        Assertions.assertArrayEquals(expected, actual);
    }
}
