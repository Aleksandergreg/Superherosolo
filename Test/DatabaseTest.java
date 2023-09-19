import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Superhero s1;
    Superhero s2;
    Superhero s3;
    Database database;

    @BeforeEach
    void setUp() {
        database = new Database();


    }

    @AfterEach
    void tearDown() {
        database = null;
    }

    @Test
    void getSearchMatchesWithOne() {
        s1 = new Superhero("Spiderman", "Aner det ikke","Edderkoppesværd", 1990, true, 1000);
        database.getSuperheroesArrayList().add(s1);
        //Arrange
        String expectedName = "Spiderman";
        //Act
        String actualName = s1.getSuperheroName();
        //Assert
        assertEquals(expectedName, actualName);
    }
    @Test
    void getSearchMatches_NoMatches() {
        // Arrange
        int expectedSize = 0;
        // Act
        List<Superhero> searchMatches = database.getSearchMatches();

        // Assert
        assertEquals(expectedSize, searchMatches.size());
    }
    @Test
    void getSearchMatches(){
        s1 = new Superhero("Spiderman", "Aner det ikke","Edderkoppesværd", 1990, true, 1000);
        s2 = new Superhero("Ironman", "Vides ikke","Jern", 1980, true, 300);
        s3 = new Superhero("Superman", "Clark Kent", "Laser", 1983, true, 183);

        database.getSearchMatches().addAll(List.of(s1,s2,s3));
        List<Superhero> searchMatches = database.getSearchMatches();

        assertEquals(searchMatches.size(), 3);
    }

    @Test
    //Tilføjer yderligere en superhelt udover de to hardcodede i databasen. Tester om expectedSize og størrelsen på min superheroesArraylist() er lige store.
    void addSuperhero() {
        //Arrange
        int expectedSize = 4;
        s1 = new Superhero("Spiderman", "Aner det ikke","Edderkoppesværd", 1990, true, 1000);
        s2 = new Superhero("Ironman", "Vides ikke","Jern", 1980, true, 300);
        s3 = new Superhero("Superman", "Clark Kent", "Laser", 1983, true, 183);
        //Act
        database.getSuperheroesArrayList().addAll(List.of(s1,s2,s3));
        database.addSuperhero("Holger", "Rune", "Tennisketsjer",2000, true, 7);
        //assert
        assertEquals(expectedSize, database.getSuperheroesArrayList().size());

    }
    @Test
    void addNewSuperhero(){
        //Arrange
        int expectedSize = 1;
        s1 = new Superhero("Spiderman", "Aner det ikke","Edderkoppesværd", 1990, true, 1000);
        //Act
        database.getSuperheroesArrayList().add(s1);
        //
        assertEquals(expectedSize, database.getSuperheroesArrayList().size());

    }
    }
