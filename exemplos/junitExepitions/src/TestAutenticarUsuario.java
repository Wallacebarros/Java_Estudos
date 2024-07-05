import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestAutenticarUsuario {

    @Test
    public void usuarioAutenticado() throws Exception{
        AutenticarUsuario a = new AutenticarUsuario();
        Usuario u = a.autenticar("Usuario 1", "3E#3e");

        assertEquals("Usuario 1", u.getNome());
    }

    @Test(expected = UserException.class)
    public void usuarioNoaAutenticado() throws Exception{
        AutenticarUsuario a = new AutenticarUsuario();
        Usuario u = a.autenticar("Usuario 1", "senha errada");

        assertEquals("Usuario 1", u.getNome());
    }

    @Test
    public void messageErro() {
        AutenticarUsuario a = new AutenticarUsuario();
        try {
            Usuario u = a.autenticar("Usuario 1", "senha errada");
            fail();
        } catch (Exception e) {
            assertEquals("senha invalida", e.getMessage());
        }
    }

}