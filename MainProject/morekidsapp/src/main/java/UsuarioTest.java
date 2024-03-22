import com.mainapp.morekidsapp.modelo.dao.UsuarioDao;
import com.mainapp.morekidsapp.modelo.entity.Perfil;
import com.mainapp.morekidsapp.modelo.entity.Usuario;

import java.time.LocalDateTime;

public class UsuarioTest {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1L, "MoreKids", "usemorekids@gmail.com", "Morekids", "usemorekids", Perfil.ADMIN, null, null);

        UsuarioDao usuarioDao = new UsuarioDao();
        String mensagem = usuarioDao.salvar(usuario);
        System.out.println(mensagem);
    }
}
