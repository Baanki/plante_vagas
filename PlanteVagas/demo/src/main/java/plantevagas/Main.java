package plantevagas;

import java.util.ArrayList;

import plantevagas.model.bean.UsuarioCandidato;
import plantevagas.model.dao.UsuarioCandidatoDAO;

public class Main {
    public static void main( String[] args ){

        UsuarioCandidato usuarioTeste = new UsuarioCandidato("igorhdg@gmail.com", "123456", "Igor Felipe", null, "12345678", "45998113972", "8461324", false);
    
        new UsuarioCandidatoDAO().create(usuarioTeste);

    }
}
