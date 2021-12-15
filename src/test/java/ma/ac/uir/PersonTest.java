package ma.ac.uir;


import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testGetDisplayName() {
        Person person = new Person( "Josh" , "Hayden" );
        String displayName = person.getDisplayName();
        assertEquals( "Hayden, Josh" , displayName);
    }

}
