package br.com.estudos_java.biblioteca.classes;

import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<String> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public boolean vazia() {
        return livros.isEmpty();
    }

    public void adicionarLivro(String string) {
        livros.add(string);
    }

    public ArrayList<String> listarLivros() {
        return new ArrayList<>(livros);
    }

        public String pegarLivro(String string) {
            if (livros.contains(string)) {
                livros.remove(string);
                return string;
            }
            return null;
        }

}
