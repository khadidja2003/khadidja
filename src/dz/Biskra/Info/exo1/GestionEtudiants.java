package dz.Biskra.Info.exo1;

import java.time.LocalDate;

public class GestionEtudiants {
    public static void main(String[] args) {
        
        Etudiant lolo = new Etudiant("Lolo", "Dupont", LocalDate.of(2001, 5, 15), "lolo@mail.com", "123 Rue Exemple");
        Etudiant toto = lolo; 

        
        toto.setNom("Toto");
        System.out.println("بعد تعديل اسم toto:");
        System.out.println("lolo: " + lolo);
        System.out.println("toto: " + toto);

        
        Etudiant fifi = new Etudiant("Fifi", "Martin", LocalDate.of(2002, 6, 10), "fifi@mail.com", "456 Rue Exemple");
        Etudiant riri = new Etudiant("Riri", "Durand", LocalDate.of(2003, 7, 20), "riri@mail.com", "789 Rue Exemple");

       
        Departement monDepInfo = new Departement("Informatique", "Université de X");
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(fifi);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(riri);

      
        System.out.println("قبل حذف toto:");
        System.out.println(monDepInfo);

    
        monDepInfo.desinscrire(toto);
        System.out.println("بعد حذف toto:");
        System.out.println(monDepInfo);
    }
}
