public class FilmsManager {

    private String[] Films = new String[0];

    private int limit = 5;

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public FilmsManager() {
    }

    public void add(String newFilm) {
        String[] tmp = new String[Films.length + 1];
        for (int i = 0; i < Films.length; i++) {
            tmp[i] = Films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        Films = tmp;
    }
    public String[] findAll() {
        return Films;
    }

    public String[] findLast() {
        int resultLength;
        if (limit < Films.length) {
            resultLength = limit;
        } else {
            resultLength = Films.length;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result [i] = Films[Films.length - 1 - i];
        }
        return result;

    }
}
