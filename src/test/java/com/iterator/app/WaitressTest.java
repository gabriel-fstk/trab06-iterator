package test.java.com.iterator.app;

import main.java.menus.CafeMenu;
import main.java.menus.DinerMenu;
import main.java.menus.DessertMenu;
import main.java.menus.PancakeHouseMenu;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertTrue;

public class WaitressTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Waitress waitress;

    @Before
    public void setUp() {
        // Configura a saída padrão para capturar o texto impresso
        System.setOut(new PrintStream(outputStreamCaptor));

        // Inicializa os menus e a garçom
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        DessertMenu dessertMenu = new DessertMenu();
        CafeMenu cafeMenu = new CafeMenu();

        waitress = new Waitress(pancakeHouseMenu, dinerMenu, dessertMenu, cafeMenu);
    }

    @Test
    public void testPrintMenu() {
        // Chama o método para imprimir o menu
        waitress.printMenu();

        // Converte a saída capturada em uma String
        String output = outputStreamCaptor.toString();

        // Verifica se a saída contém os itens dos menus esperados
        assertTrue(output.contains("Panqueca Simples"));
        assertTrue(output.contains("Hambúrguer Vegano"));
        assertTrue(output.contains("Bolo de Chocolate"));
        assertTrue(output.contains("Café Expresso"));
        assertTrue(output.contains("Café com Leite"));
    }
}
