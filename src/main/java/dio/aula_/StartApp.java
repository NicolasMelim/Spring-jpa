package dio.aula_;

import dio.aula_.model.Usuario;
import dio.aula_.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UsuarioRepositorio repositorio;
    @Override
    public void run(String... args) throws Exception {
        Usuario usu = new Usuario();
        usu.setName("Nicolas Melim");
        usu.setUserName("xumbada2000");
        usu.setSenha("melimrx2604@!");

        repositorio.save(usu);

        for(Usuario u: repositorio.findAll()){
            System.out.println(u);
        }

    }
}
