import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PilhaTest {
    
    Pilha pilha;
    
    @Before
    public void setUp(){
        pilha = new Pilha();
    }

    @Test
    public void vazia(){
        assertEquals(true, pilha.vazia());
    }
}