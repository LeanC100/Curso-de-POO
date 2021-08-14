package JAVA;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
    
    private Map<String, Map<String, Integer>> typeCarAccepted;
    private ArrayList<String> seatMaterial;

    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;
    }

    public Map<String, Map<String, Integer>> getTypeCarAccepted() {
        return typeCarAccepted;
    }

    public void setTypeCarAccepted(Map<String, Map<String, Integer>> typeCarAccepted) {
        this.typeCarAccepted = typeCarAccepted;
    }

    public ArrayList<String> getSeatMaterial() {
        return seatMaterial;
    }

    public void setSeatMaterial(ArrayList<String> seatMaterial) {
        this.seatMaterial = seatMaterial;
    }
}
