public class AutenticarUsuario {
    public Usuario autenticar(String nome, String senha) throws UserException {
        if(nome.equals("Usuario 1") && senha.equals("3E#3e")) {
            return new Usuario(nome);
        }
        throw new UserException("senha invalida", nome);
    }
}
