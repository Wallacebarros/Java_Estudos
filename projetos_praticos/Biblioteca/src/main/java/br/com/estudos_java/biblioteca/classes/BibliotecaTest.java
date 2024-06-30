package br.com.estudos_java.biblioteca.classes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BibliotecaTest {
    private Biblioteca b;

    @Before
    public void before() {
        b = new Biblioteca();
    }
    
    @Test
    public void vazia() {
        assertTrue(b.vazia());
    }

    @Test
    public void adicinarLivro() {
        b.adicionarLivro("Meu Livro");
        assertFalse(b.vazia());
    }
}
