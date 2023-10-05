public class Palms extends Plants {
    // Palms och de andra växtklasserna ärver Plants, dvs de variablerna (och ev metoder) som finns i Plants kommer även kunna
    // användas och hämtas från dessa klasser

    public Palms(String name, double height) {
        super(name, height);
    }

    @Override // polymorfism, dessa metoder nedan som kommer från interfacet ger olika resultat beroende på vilken klass som anropar dom
    public double howMuchFeed() {
        return 0.5 * getHeight();
    }

    @Override
    public String printOut() {
        return getName() + " ska ha " + howMuchFeed() + " liter " + wichFluid();
    }

    @Override
    public String wichFluid() {
        return Fluids.KRANVATTEN.getFluids();
    }
}
