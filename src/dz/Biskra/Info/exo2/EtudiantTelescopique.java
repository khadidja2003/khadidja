package dz.Biskra.Info.exo2;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class EtudiantTelescopique {
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String email;
    private String adressePostale;
    private List<Note> notes;

    // Constructeur avec nom et prénom فقط
    public EtudiantTelescopique(String nom, String prenom) {
        this(nom, prenom, null, null);
    }

    // Constructeur avec nom, prénom et date de naissance
    public EtudiantTelescopique(String nom, String prenom, LocalDate dateDeNaissance) {
        this(nom, prenom, dateDeNaissance, null);
    }

    // Constructeur avec nom, prénom et email
    public EtudiantTelescopique(String nom, String prenom, String email) {
        this(nom, prenom, null, email);
    }

    // Constructeur principal (tous les paramètres)
    private EtudiantTelescopique(String nom, String prenom, LocalDate dateDeNaissance, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.notes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "EtudiantTelescopique{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", email='" + email + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                '}';
    }
    
    
}
