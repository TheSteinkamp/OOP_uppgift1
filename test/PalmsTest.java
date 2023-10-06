import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmsTest {
    // Enhetstester. Vi testar metoden howMuchFeed.
    Palms Laura = new Palms("Laura", 5.0);

    @Test
    void howMuchFeed() {
        assert(Laura.howMuchFeed() == 2.5);
        assert(Laura.howMuchFeed() != 1);
    }
}