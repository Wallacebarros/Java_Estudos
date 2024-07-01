package br.com.estudos_java.biblioteca.classes;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
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
    
    @Test
    public void listarLivros() {
        b.adicionarLivro("Livro 1");
        b.adicionarLivro("Livro 2");

        ArrayList<String> expect = new ArrayList<>();
        expect.add("Livro 1");
        expect.add("Livro 2");

        assertEquals(expect , b.listarLivros());
    }

    @Test
    public void pegarLivro() {
        b.adicionarLivro("Livro 1");
        
        assertEquals("Livro 1", b.pegarLivro("Livro 1"));
        assertTrue(b.vazia());
    }
}
