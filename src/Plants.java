abstract public class Plants  implements Feed{
    private String name;
    //private String fluid;
    private double height;
   // private double amountOfFluid;

/*
    public String getFluid() {
        return fluid;
    }

    public void setFluid(String fluid) {
        this.fluid = fluid;
    }
*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
/*
    public double getAmountOfFluid() {
        return amountOfFluid;
    }

    public double setAmountOfFluid(double amountOfFluid) {
        this.amountOfFluid = amountOfFluid;
        return amountOfFluid;
    }*/

    public Plants(String name, double height) {
        this.name = name;
        this.height = height;
    }

/*    @Override
    public double howMuchFeed() {
        return 0;
    }*/

/*    @Override
    public String printOut() {
        return getName() + " ska ha " + getAmountOfFluid() + " liter " + getFluid();
    }*/


}
