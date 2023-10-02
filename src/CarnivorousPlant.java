public class CarnivorousPlant extends Plants{
    private String fluid = "Proteindryck";

    public String getFluid() {
        return fluid;
    }

    public void setFluid(String fluid) {
        this.fluid = fluid;
    }

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    @Override
    public double howMuchFeed() {
        return 0.1 + (0.2*getHeight());
    }
    @Override
    public String printOut() {

        return getName() + " ska ha " + howMuchFeed() + " liter " + getFluid();
    }
}
