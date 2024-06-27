public class Pilha {

    private int quantidade = 0;
    private String[] elementos = new String[10];

    public boolean vazia() {
        return quantidade == 0;
    }

    public void adicionar(String elemento) {
        elementos[quantidade] = elemento;
        quantidade++;
    }

}
