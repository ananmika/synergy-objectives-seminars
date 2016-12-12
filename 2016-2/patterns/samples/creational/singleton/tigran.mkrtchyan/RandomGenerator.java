/**
 * @author Tigran.Mkrtchyan
 * @since 12/12/2016.
 */
// Generates random numbers.
public class RandomGenerator {
    private static RandomGenerator gen = null;
    public static RandomGenerator getInstance() {
        if (gen == null) {
            synchronized (RandomGenerator.class) {
                // must test again -- can you see why?
                if (gen == null)
                    gen = new RandomGenerator();
            }
        }
        return gen;
    }
}

