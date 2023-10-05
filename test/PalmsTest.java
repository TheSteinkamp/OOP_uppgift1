import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmsTest {
    // Enhetstester. Vi testar metoden howMuchFeed.
    Palms Laura = new Palms("Laura", 5.0);

    @Test
    void howMuchFeed() {
        assertEquals((0.5 * Laura.getHeight()), 2.5); // det här kommer ge ok
        assertEquals((0.5 * Laura.getHeight()), 1); // här har vi gett ett felaktigt värde att jämföra med så det kommer inte vara ok.
    }
}