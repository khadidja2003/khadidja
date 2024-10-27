package dz.Biskra.Info.exo2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Etudiant {
	
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String email;
    private String adressePostale;
    private List<Note> notes;

    public Etudiant(String nom, String prenom, LocalDate dateDeNaissance, String email, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.adressePostale = adressePostale;
        this.notes = new ArrayList<>(); 
    }
    
    private Etudiant(EtudiantBuilder builder) {
        this.nom = builder.nom;
        this.prenom = builder.prenom;
        this.dateDeNaissance = builder.dateDeNaissance;
        this.email = builder.email;
        this.adressePostale = builder.adressePostale;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom ) {
        this.prenom =prenom ;
    }
    public void setdateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance =dateDeNaissance ;
    }
    public void setemail(String email ) {
        this.email =email ;
    }
    public void setadressePostale(String adressePostale ) {
        this.adressePostale=adressePostale ;
    }
    
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getEmail() {
        return email;
    }

    public String getAdressePostale() {
        return adressePostale;
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
    public void noter(Matiere matiere, double valeur) {
        Note note = new Note(matiere, valeur);
        notes.add(note);
    }
    public List<Note> getNotes() {
        return notes;
    }
    public double calculerMoyenne() {
        double sommePonderee = 0;
        double sommeCoefficients = 0;

        for (Note note : notes) {
            sommePonderee += note.getValeur() * note.getMatiere().getCoefficient();
            sommeCoefficients += note.getMatiere().getCoefficient();
        }

        return (sommeCoefficients == 0) ? 0 : sommePonderee / sommeCoefficients;
    }
    
    
    
    
    public static class EtudiantBuilder {

        private String nom;
        private String prenom;
        private LocalDate dateDeNaissance;
        private String email;
        private String adressePostale;

        public EtudiantBuilder ajouterNom(String nom) {
            this.nom = nom;
            return this;
        }

        public EtudiantBuilder ajouterPrenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public EtudiantBuilder ajouterDateNaissance(LocalDate dateDeNaissance) {
            this.dateDeNaissance = dateDeNaissance;
            return this;
        }

        public EtudiantBuilder ajouterMail(String email) {
            this.email = email;
            return this;
        }

        public EtudiantBuilder ajouterAdresse(String adressePostale) {
            this.adressePostale = adressePostale;
            return this;
        }

        // Construction de l'objet Etudiant
        public Etudiant build() {
            return new Etudiant(this);
        }
    }
    
    
    
    
    
}