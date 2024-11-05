import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class BebidaTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private PrintStream originalOut;

    @Before
    public void setUp() {
        // Redireciona a saída padrão para capturar as mensagens
        originalOut = System.out;
        System.setOut(new PrintStream(outputStreamCaptor));
        Logger.getLogger("").setLevel(Level.INFO); // Ajusta o nível de log
    }

    @Test
    public void testPrepararCafe() {
        Bebida cafe = new Café();
        cafe.prepararBebida();

        String expectedOutput = "Fervendo água...\n" +
                "Adicionando café à água...\n" +
                "Misturando os ingredientes...\n" +
                "Servindo a bebida.\n";

        assertEquals(expectedOutput.trim(), outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPrepararCha() {
        Bebida cha = new Chá();
        cha.prepararBebida();

        String expectedOutput = "Fervendo água...\n" +
                "Adicionando chá à água...\n" +
                "Misturando os ingredientes...\n" +
                "Servindo a bebida.\n";

        assertEquals(expectedOutput.trim(), outputStreamCaptor.toString().trim());
    }

    @After
    public void tearDown() {
        // Restaura a saída padrão
        System.setOut(originalOut);
    }
}
