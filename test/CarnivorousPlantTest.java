import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousPlantTest {
    CarnivorousPlant Meatloaf = new CarnivorousPlant("Meatloaf", 0.7);

    @Test
    void howMuchFeed() {
        assertEquals((0.1 + (0.2 * Meatloaf.getHeight())), 0.24);
        assertEquals((0.1 + (0.2 * Meatloaf.getHeight())), 0.12);
    }
}