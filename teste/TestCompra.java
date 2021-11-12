import Compra.NotasMoedas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompra {
    void divisao() {
        NotasMoedas troco2 = new NotasMoedas();
        int n1 = 36;
        int n2 = 20;
        int resultado = 1;
        assertEquals(resultado, troco2.getNotasVinte());
    }
}
