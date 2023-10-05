import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CactusTest {
    Cactus Igge = new Cactus("Igge", 0.2);

    @Test
    void howMuchFeed() {
        assert (Igge.howMuchFeed() == 0.2);
        assert (Igge.howMuchFeed() == 1);
    }

}