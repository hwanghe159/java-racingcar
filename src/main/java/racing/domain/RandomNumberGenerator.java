package racing.domain;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {
    private static final int BOUND = 10;

    @Override
    public int generate() {
        Random random = new Random();
        return random.nextInt(BOUND);
    }
}
