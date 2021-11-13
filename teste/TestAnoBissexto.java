import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestAnoBissexto {

    @Test
    public void verificaBissexto1(){
        AnoBissexto ano = new AnoBissexto();
        assertTrue(ano.main(1988));
        assertTrue(ano.main(1992));
        assertTrue(ano.main(1996));
        assertTrue(ano.main(2000));
        assertFalse(ano.main(1998));
        assertFalse(ano.main(1700));
        assertFalse(ano.main(1800));
        assertFalse(ano.main(1900));
        assertFalse(ano.main(2100));
        assertFalse(ano.main(2200));
        assertFalse(ano.main(2300));
        assertFalse(ano.main(2500));
        assertFalse(ano.main(2600));
    }
}