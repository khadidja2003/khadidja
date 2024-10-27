package dz.Biskra.Info.exo1;

import java.time.LocalDate;

class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String email;
    private String adressePostale;

    public Etudiant(String nom, String prenom, LocalDate dateDeNaissance, String email, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.adressePostale = adressePostale;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", email='" + email + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                '}';
    }
}