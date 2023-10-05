abstract public class Plants implements Feed {
    // plants är en abstrakt superklass, dvs man ska inte skapa objekt av den utan objekten ska tillhöra någon av subklasserna.
    // Plants implementerar interfacet Feed, vilket gör att alla subklasser också implementerar de metoderna.
    // Vi använder oss av inkapsling för att inte andra klasser ska komma åt variablerna, istället kommer dom åt variablerna genom getters och setters
    private String name;
    private double height;

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

    public Plants(String name, double height) { // konstruktor som används när vi skapar upp objekten och skickar in namn och höjd som inparametrar
        this.name = name;
        this.height = height;
    }

}
