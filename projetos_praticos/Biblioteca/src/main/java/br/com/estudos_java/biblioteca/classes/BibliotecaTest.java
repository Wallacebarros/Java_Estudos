package br.com.estudos_java.biblioteca.classes;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BibliotecaTest {
    private Biblioteca b;
    private Livro l1, l2;
    ArrayList<Object> expect;

    @Before
    public void before() {
        b = new Biblioteca();
        expect = new ArrayList<>();
        l1 = new Livro("Livro 1", "Autor 1", 100);
        l2 = new Livro("Livro 2", "Autor 2", 200);
    }
    
    @Test
    public void vazia() {
        assertTrue(b.vazia());
    }

    @Test
    public void adicionarLivro() {
        b.adicionarLivro(l1);
        assertFalse(b.vazia());
    }
    
    @Test
    public void listarLivros() {
        b.adicionarLivro(l1);
        b.adicionarLivro(l2);

        expect.add(l1);
        expect.add(l2);

        assertEquals(expect , b.listarLivros());
    }

    @Test
    public void pegarLivro() {
        b.adicionarLivro(l1);
        expect.add(l1);

        assertEquals(l1, b.pegarLivro(l1));
        assertTrue(b.vazia());
    }
}
