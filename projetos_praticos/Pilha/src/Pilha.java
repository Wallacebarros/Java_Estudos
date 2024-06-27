public class Pilha {

    private int quantidade = 0;
    private String[] elementos = new String[10];

    public boolean vazia() {
        return quantidade == 0;
    }

    public void adicionar(String elemento) {
        if(quantidade < 10){
            elementos[quantidade] = elemento;
            quantidade++;
        }
    }

    public void retirar() {
        elementos[quantidade - 1] = "";
        quantidade--;
    }

    public String topo() {
        return elementos[quantidade - 1];
    }

}
