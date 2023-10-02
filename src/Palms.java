public class Palms extends Plants {
    private String fluid = "Kranvatten";

    public Palms(String name, double height) {
        super(name, height);
    }

    public String getFluid() {
        return fluid;
    }

    public void setFluid(String fluid) {
        this.fluid = fluid;
    }
/*    @Override
    public double howMuchFeed() {
        getAmountOfFluid() = 0.5 * getHeight();
        return amountOfFluid;
    }*/

   @Override
    public double howMuchFeed() {
        return 0.5 * getHeight();
    }

    @Override
    public String printOut() {
        return getName() + " ska ha " + howMuchFeed() + " liter " + getFluid();
    }
}
