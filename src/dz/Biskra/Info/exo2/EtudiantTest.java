/**
 * 
 */
package dz.Biskra.Info.exo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class EtudiantTest {
	@Test
	public void test_calcul_moyenne_retourne_zero_Quand_Pas_De_Note() {
        Etudiant etudiant = new Etudiant("Alice", null, null, null, null);
        assertEquals(0.0, etudiant.calculerMoyenne(), 0.001);
    }

    @Test
    public void test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note() {
        Etudiant etudiant = new Etudiant("BOB", null, null, null, null);
        Matiere math = new Matiere("Mathématiques", 1.0);
        
        etudiant.noter(math, 15.0);
        
        
        assertEquals(15, etudiant.calculerMoyenne(), 0.001);
    }

    @Test
    public void test_calcul_moyenne_retourne_valeur_note_pondérée_quand_une_seule_note_avec_coefficient() {
        Etudiant etudiant = new Etudiant("Alice", null, null, null, null);
        Matiere science = new Matiere("Science", 3.0);
        
        etudiant.noter(science, 10.0);
        
        
        assertEquals(10.0, etudiant.calculerMoyenne(), 0.001);
    }

    @Test
    public void test_calcul_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients() {
        Etudiant etudiant = new Etudiant("BOB", null, null, null, null);

        Matiere math = new Matiere("Mathématiques", 2.0);
        Matiere science = new Matiere("Science", 3.0);
        
        etudiant.noter(math, 15.0);
        etudiant.noter(science, 10.0);
        
        // Moyenne pondérée: (15 * 2 + 10 * 3) / (2 + 3) = 12.0
        double moyenneAttendue = (15.0 * 2.0 + 10.0 * 3.0) / (2.0 + 3.0);
        assertEquals(moyenneAttendue, etudiant.calculerMoyenne(), 0.001);
    }

}
