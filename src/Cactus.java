public class Cactus extends Plants {

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double howMuchFeed() {
        return 0.2;
    }

    @Override
    public String printOut() {
        return getName() + " ska ha " + howMuchFeed() + " liter " + wichFluid();
    }

    @Override
    public String wichFluid() {
        return Fluids.MINERALVATTEN.getFluids();
    }


}
