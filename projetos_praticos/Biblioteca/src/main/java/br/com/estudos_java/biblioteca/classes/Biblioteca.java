package br.com.estudos_java.biblioteca.classes;

import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<String> livros;

    public Biblioteca() {
        livros = new ArrayList<String>();
    }

    public boolean vazia() {
        return livros.isEmpty();
    }

    public void adicionarLivro(String string) {
        livros.add(string);
    }
}
