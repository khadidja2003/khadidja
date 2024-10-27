package dz.Biskra.Info.exo2;

public class Note {
    private Matiere matiere;
    private double valeur;

    // Constructeur
    public Note(Matiere matiere, double valeur) {
        this.matiere = matiere;
        this.valeur = valeur;
    }

    // Accesseur pour la matière
    public Matiere getMatiere() {
        return matiere;
    }

    // Accesseur pour la valeur de la note
    public double getValeur() {
        return valeur;
    }
}

