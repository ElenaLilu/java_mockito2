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
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3, film4, film5, film6, film7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findLastWhenLessTest() {
        FilmsManager manager = new FilmsManager();
        String film1 = "Bloodshot";
        String film2 = "Forward";
        String film3 = "Hotel Belgrade";
        String film4 = "Gentlemen";


        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);

        String[] actual = manager.findLast();
        String[] expected = {film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void findLastWhenLessTest2() {
        FilmsManager manager = new FilmsManager(2);
        String film1 = "Bloodshot";
        String film2 = "Forward";


        manager.add(film1);
        manager.add(film2);

        String[] actual = manager.findLast();
        String[] expected = {film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastWhenMoreTest() {
        FilmsManager manager = new FilmsManager();
        String film1 = "Bloodshot";
        String film2 = "Forward";
        String film3 = "Hotel Belgrade";
        String film4 = "Gentlemen";
        String film5 = "Invisible Man";
        String film6 = "Trolls";
        String film7 = "Number One";
        String film8 = "Barbie";


        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);

        String[] actual = manager.findLast();
        String[] expected = {film8, film7, film6, film5, film4};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastWhenMoreTest2() {
        FilmsManager manager = new FilmsManager(8);
        String film1 = "Bloodshot";
        String film2 = "Forward";
        String film3 = "Hotel Belgrade";
        String film4 = "Gentlemen";
        String film5 = "Invisible Man";
        String film6 = "Trolls";
        String film7 = "Number One";
        String film8 = "Barbie";


        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);

        String[] actual = manager.findLast();
        String[] expected = {film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void findLastWhenEqualsTest() {
        FilmsManager manager = new FilmsManager();
        String film1 = "Bloodshot";
        String film2 = "Forward";
        String film3 = "Hotel Belgrade";
        String film4 = "Gentlemen";
        String film5 = "Invisible Man";


        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        String[] actual = manager.findLast();
        String[] expected = {film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void findLastWhenEqualsTest2() {
        FilmsManager manager = new FilmsManager(7);
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
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        String[] actual = manager.findLast();
        String[] expected = {film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

}
