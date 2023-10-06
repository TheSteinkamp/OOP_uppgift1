import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousPlantTest {
    CarnivorousPlant Meatloaf = new CarnivorousPlant("Meatloaf", 0.7);

    @Test
    void howMuchFeed() {
        assert(Meatloaf.howMuchFeed() == 0.24);
        assert(Meatloaf.howMuchFeed() != 1);
    }
}