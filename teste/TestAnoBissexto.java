import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestAnoBissexto {

    @Test
    public void verificaBissexto(){
        AnoBissexto ano = new AnoBissexto();
        assertTrue(ano.main(1988));
        assertTrue(ano.main(1992));
        assertTrue(ano.main(1996));
        assertTrue(ano.main(2000));
        assertTrue(ano.main(1998));
        assertTrue(ano.main(1700));
        assertTrue(ano.main(1800));
        assertTrue(ano.main(1900));
        assertTrue(ano.main(2100));
        assertTrue(ano.main(2200));
        assertTrue(ano.main(2300));
        assertTrue(ano.main(2500));
        assertTrue(ano.main(2600));
    }
}