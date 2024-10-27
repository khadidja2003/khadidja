package dz.Biskra.Info.exo2;

public class Matiere {
    private String intitule;
    private double coefficient;

    
    public Matiere(String intitule, double coefficient) {
        this.intitule = intitule;
        this.coefficient = coefficient;
    }

    
    public double getCoefficient() {
        return coefficient;
    }

   
    public String getIntitule() {
        return intitule;
    }
}

