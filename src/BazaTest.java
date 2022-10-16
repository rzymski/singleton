import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BazaTest {

    @Test
    void checkIfOneDataBase() {
        IPolaczenie p1 = Baza.getPolaczenie();
        IPolaczenie p2 = Baza.getPolaczenie();
        IPolaczenie p3 = Baza.getPolaczenie();
        IPolaczenie p4 = Baza.getPolaczenie();

        for(int i=0; i<10; i++)
            p1.set(i, (char)(i+65));

        for(int i=0; i<10; i++)
        {
            assertEquals((char)(i+65), p1.get(i));
            assertEquals((char)(i+65), p2.get(i));
            assertEquals((char)(i+65), p3.get(i));
            assertEquals((char)(i+65), p4.get(i));
        }
    }

    @Test
    void checkIfTheSameObjects() {
        IPolaczenie p1 = Baza.getPolaczenie();
        IPolaczenie p2 = Baza.getPolaczenie();
        IPolaczenie p3 = Baza.getPolaczenie();
        IPolaczenie p4 = Baza.getPolaczenie();

        assertEquals(p1, p4);
    }

}