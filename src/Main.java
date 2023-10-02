import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    Cactus Igge = new Cactus("Igge", 0.2);
    CarnivorousPlant Meatloaf = new CarnivorousPlant("Meatloaf", 0.7);
    Palms Laura = new Palms("Laura", 5.0);
    Palms Olof = new Palms("Olof", 1.0);

    ArrayList<Plants> plantList = new ArrayList<>();

    public Main() {

        plantList.add(Igge);
        plantList.add(Meatloaf);
        plantList.add(Laura);
        plantList.add(Olof);

        while (true) { // en loop som fortsätter fråga så länge man inte trycker på avbryt eller cancel
            String name = JOptionPane.showInputDialog("Vilken planta vill du vattna?");
            if (name == null)
                break;
            else
                searchList(plantList, name);
        }
    }

    public void searchList(ArrayList<Plants> list, String name) {
        boolean found = false;
        for (Plants p : list) {
            if (p.getName().equalsIgnoreCase(name)) {
                found = true;
                JOptionPane.showMessageDialog(null, p.printOut());
            }
        }
        if (!found)
            JOptionPane.showMessageDialog(null, "Namnet hittades inte");
    }

    public static void main(String[] args) {

        Main m = new Main();

    }
}