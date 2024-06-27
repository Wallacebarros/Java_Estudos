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

    @Test
    public void topo(){
        pilha.adicionar("Elemento 1");
        pilha.adicionar("Elemento 2");
        assertEquals("Elemento 2", pilha.topo());
    }

    @Test
    public void cheio(){
        for(int i=0; i < 9; i++){
            pilha.adicionar("elementoX");
        }
        pilha.adicionar("ultimo elemento");
        pilha.adicionar("elemento exedente");

        assertEquals("ultimo elemento", pilha.topo());
    }
}