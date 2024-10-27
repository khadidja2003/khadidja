package dz.Biskra.Info.exo2;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        
        Etudiant lolo = new Etudiant("Lolo", "Dupont", LocalDate.of(2001, 5, 15), "lolo@mail.com", "123 Rue Exemple");
       
        Etudiant toto = lolo; 

        
        toto.setNom("toto");
        System.out.println(" °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°toto VS lolo°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°:");
        System.out.println("lolo: " + lolo);
        System.out.println("toto: " + toto);
        System.out.println(" °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°:");

        
        Etudiant fifi = new Etudiant("Fifi", "Martin", LocalDate.of(2002, 6, 10), "fifi@mail.com", "456 Rue Exemple");
        Etudiant riri = new Etudiant("Riri", "Durand", LocalDate.of(2003, 7, 20), "riri@mail.com", "789 Rue Exemple");

       
        Departement monDepInfo = new Departement("Informatique", "Université de X");
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(fifi);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(riri);

        System.out.print("\n "+ "\n"+ "\n"+ "\n" );
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°Departement before deliting toto°°°°°°°°°°°°°°°°°°");
        System.out.println(monDepInfo);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

    
        monDepInfo.desinscrire(toto);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°Departement after deliting toto°°°°°°°°°°°°°°°°°°");
        System.out.println(monDepInfo);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        
        System.out.print("\n "+ "\n"+ "\n"+ "\n" );
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°EtudiantTelescopique°°°°°°°°°°°°°°°°°°°°°°");
        EtudiantTelescopique etudiant1 = new EtudiantTelescopique("Alice", "Dupont");
        System.out.println(etudiant1);

        // Création d'un étudiant avec nom, prénom et date de naissance
        EtudiantTelescopique etudiant2 = new EtudiantTelescopique("Bob", "Martin", LocalDate.of(2000, 5, 15));
        System.out.println(etudiant2);

        // Création d'un étudiant avec nom, prénom et email
        EtudiantTelescopique etudiant3 = new EtudiantTelescopique("Charlie", "Dupuis", "charlie.dupuis@example.com");
        System.out.println(etudiant3);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        
        System.out.print("\n "+ "\n"+ "\n"+ "\n" );
        System.out.println("°°°°°°°°°°°°°°°°°°EtudiantJavaBeans°°°°°°°°°°°°°°°°°°°°°°°°°°");
        EtudiantJavaBeans toto3 = new EtudiantJavaBeans();
        toto3.setNom("BenAli");
        toto3.setPrenom("Ali");
        toto3.setDateDeNaissance(LocalDate.of(2003, Month.JANUARY, 28));
        toto3.setEmail("benali@example.com");
        toto3.setAdressePostale("99, av. Zaatcha, 07000 Biskra");

        // Affichage des informations de l'étudiant
        System.out.println("Nom: " + toto3.getNom());
        System.out.println("Prénom: " + toto3.getPrenom());
        System.out.println("Date de Naissance: " + toto3.getDateDeNaissance());
        System.out.println("Email: " + toto3.getEmail());
        System.out.println("Adresse Postale: " + toto3.getAdressePostale());
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        
        System.out.print("\n "+ "\n"+ "\n"+ "\n" );

        System.out.println("°°°°°°°°°°°°°°°°°°°EtudiantBuilder°°°°°°°°°°°°°°°°°°°°°°°°°");
        Etudiant lolo4 = new Etudiant.EtudiantBuilder()
                .ajouterNom("BenAli")
                .ajouterPrenom("Mohamed")
                .ajouterDateNaissance(LocalDate.of(2003, Month.JANUARY, 28))
                .ajouterMail("name@univ-biskra.dz")
                .ajouterAdresse("99, av. Zaatcha, 07000 Biskra")
                .build();

        System.out.println(lolo4);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
    }
}
