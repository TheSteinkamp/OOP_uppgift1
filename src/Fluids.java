public enum Fluids {MINERALVATTEN("mineralvatten"), KRANVATTEN("kranvatten"), PROTEINDRYCK("proteindryck");
    private final String fluids; // här använder vi oss av inkapsling, dvs andra klasser kan inte komma åt variablerna utan att använda getFluids metoden
    Fluids(String s){
        fluids=s;
    }

    public String getFluids() {
        return fluids;
    }
}

// enums till de olika vätskorna plantorna behöver