package dz.Biskra.Info.exo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepartementTest {

	@Test
	public void test_getMoyennePromo_retourne_zero_si_pas_detudiants() {
        Departement departement = new Departement("Informatique", "123 Rue Université");
        assertEquals(0.0, departement.getMoyennePromo(), 0.001);
    }

    @Test
    public void test_getMoyennePromo_retourne_moyenne_unique_si_un_seul_etudiant() {
        Departement departement = new Departement("Informatique", "123 Rue Université");
        Etudiant etudiant = new Etudiant("Alice", null, null, null, null);

        Matiere math = new Matiere("Mathématiques", 1.0);
        etudiant.noter(math, 15.0);

        departement.inscrire(etudiant);

        assertEquals(15.0, departement.getMoyennePromo(), 0.001);
    }

    @Test
    public void test_getMoyennePromo_retourne_moyenne_correcte_si_plusieurs_etudiants() {
        Departement departement = new Departement("Informatique", "123 Rue Université");

       
        Etudiant alice = new Etudiant("Alice", null, null, null, null);
        Matiere math = new Matiere("Mathématiques", 1.0);
        Matiere science = new Matiere("Science", 2.0);
        alice.noter(math, 15.0);
        alice.noter(science, 10.0);

       
        Etudiant bob = new Etudiant("Bob", null, null, null, null);
        Matiere histoire = new Matiere("Histoire", 1.0);
        Matiere anglais = new Matiere("Anglais", 3.0);
        bob.noter(histoire, 12.0);
        bob.noter(anglais, 14.0);

        departement.inscrire(alice);
        departement.inscrire(bob);

        double moyenneAttendue = (11.67 + 13.5) / 2;
        assertEquals(moyenneAttendue, departement.getMoyennePromo(), 0.01);

        

    }

}
