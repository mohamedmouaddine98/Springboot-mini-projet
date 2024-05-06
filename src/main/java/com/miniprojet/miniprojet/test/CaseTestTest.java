//Test unitaire pour tous les attributs de la classe

package com.miniprojet.miniprojet.test;

import com.miniprojet.miniprojet.Model.CaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CaseTestTest {

    private CaseTest caseTest;

    @BeforeEach
    public void setUp() {
        caseTest = new CaseTest();
    }

    @Test
    public void testSetTitle() {
        String titre = "Test titre";
        caseTest.setTitle(titre);

        // Vérifier si le titre est correctement défini
        Assertions.assertEquals(titre, caseTest.getTitle());
    }

    @Test
    public void testSetDescription() {
        String desc = "Test Description";
        caseTest.setDescription(desc);

        Assertions.assertEquals(desc, caseTest.getDescription());
    }

    @Test
    public void testCreationDate() {
        Assertions.assertNotNull(caseTest.getCreationDate());
    }

    @Test
    public void testLastUpdateDate() {
        Assertions.assertNotNull(caseTest.getLastUpdateDate());
    }
}