package br.com.estudos_java.biblioteca.classes;

import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Object> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public boolean vazia() {
        return livros.isEmpty();
    }

    public void adicionarLivro(Object object) {
        livros.add(object);
    }

    public ArrayList<Object> listarLivros() {
        return new ArrayList<>(livros);
    }

    public Object pegarLivro(Object object) {
        if (livros.contains(object)) {
            livros.remove(object);
            return object;
        }
        return null;
    }

}
