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

    @Test
    public void adicianar(){
        pilha.adicionar("Elemento 1");
        assertEquals(false, pilha.vazia());
    }

    @Test
    public void retirar(){
        pilha.adicionar("Elemento 1");
        pilha.retirar();
        assertEquals(true, pilha.vazia());
    }
}