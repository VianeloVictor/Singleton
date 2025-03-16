package test;

import org.junit.jupiter.api.Test;
import Singleton.ControladorSemaforo;
import static org.junit.jupiter.api.Assertions.*;

class ControladorSemaforoTest {
    @Test
    public void deveRetornarSinal(){
        ControladorSemaforo.getInstance().alterarIndicador("vermelho");
        assertEquals("vermelho", ControladorSemaforo.getInstance().getIndicadorSinal());
    }
}