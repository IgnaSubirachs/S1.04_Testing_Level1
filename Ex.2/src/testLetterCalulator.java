import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class testLetterCalulator {


    @ParameterizedTest(name = "DNI: {0} -> Lletra esperada: {1}")
    @CsvSource({
            "46973793, L",
            "12345678, Z",
            "11111111, H",
            "22222222, C",
            "33333333, Y",
            "44444444, L",
            "55555555, B",
            "66666666, X",
            "77777777, M",
            "88888888, G"
    })
    public void testIdLetterCalculate(int dniNumber, char expectedLetter) {
        assertEquals(expectedLetter, IdCalculator.idLetterCalculate(dniNumber));
    }
}