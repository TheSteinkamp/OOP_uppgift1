public class CarnivorousPlant extends Plants {

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    @Override
    public double howMuchFeed() {
        return 0.1 + (0.2 * getHeight());
    }

    @Override
    public String printOut() {

        return getName() + " ska ha " + howMuchFeed() + " liter " + wichFluid();
    }

    @Override
    public String wichFluid() {
        return Fluids.PROTEINDRYCK.getFluids();
    }
}
