public class Cactus extends Plants{

    private String fluid = "Mineralvatten";

    public String getFluid() {
        return fluid;
    }

    public void setFluid(String fluid) {
        this.fluid = fluid;
    }

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double howMuchFeed() {
        return 0.2;
    }
    @Override
    public String printOut() {
        return getName() + " ska ha " + howMuchFeed() + " liter " + getFluid();
    }
}
