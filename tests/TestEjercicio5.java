import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Pruebas Ejercicio 5 - Días de Cátedra")
public class TestEjercicio5 {

    @ParameterizedTest(name = "Para el día ''{0}'' se espera: \"{1}\"")
    @CsvSource({
        "L, HOY TENGO RESOLUCION",
        "M, NO TENGO RESOLUCION", // Suponiendo días específicos de tu cátedra
        "I, DIA INVALIDO",
        "X, DIA INVALIDO"         // Caso de borde: Entrada errónea
    })
    void testDiasCatedra(char dia, String mensajeEsperado) {
        String mensajeObtenido = Ejercicio5.evaluarDia(dia);
        
        assertEquals(mensajeEsperado, mensajeObtenido, () -> 
            String.format("❌ Error en el día '%c'. Se esperaba: \"%s\" pero se obtuvo: \"%s\".", 
            dia, mensajeEsperado, mensajeObtenido)
        );
    }
}