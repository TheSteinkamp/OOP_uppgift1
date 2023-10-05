public enum Fluids {
    // Här använder vi enums till de olika vätskorna plantorna behöver, dvs en variabel som bara kan ha vissa förutbestämda värden.
    // Jag har lagt till extra värden så att man ska kunna få ut värdena med små bokstäver
    MINERALVATTEN("mineralvatten"), KRANVATTEN("kranvatten"), PROTEINDRYCK("proteindryck");
    private final String fluids; // här använder vi oss av inkapsling, dvs andra klasser kan inte komma åt variablerna utan att använda getFluids metoden

    Fluids(String s) {
        fluids = s;
    }

    public String getFluids() {
        return fluids;
    }
}

