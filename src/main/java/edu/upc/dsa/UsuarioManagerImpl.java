package edu.upc.dsa;

import edu.upc.dsa.models.PI;
import edu.upc.dsa.models.Track;
import edu.upc.dsa.models.Usuario;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class UsuarioManagerImpl implements UsuarioManager{

    private static UsuarioManager instance; //Afegir Instancia
    final static Logger logger = Logger.getLogger(UsuarioManagerImpl.class);

    protected HashMap<String, Usuario> MapUsuarios = new HashMap<>();
    //Import clas java.util. HashMap (Show context actions)

    protected HashMap<String, PI> MapPI = new HashMap<>();

    private UsuarioManagerImpl() {

    }

    public static UsuarioManager getInstance() {

        if (instance==null) instance = new UsuarioManagerImpl();
        return instance;

    }

    public int sizePI() {

        int ret = this.MapPI.size();
        logger.info("size " + ret);

        return ret;
    }
    public int sizeUsuarios() {

        int ret = this.MapUsuarios.size();
        logger.info("size " + ret);

        return ret;
    }
    public void addUsuario(Usuario User, PI puntoI){
        User.addToList(puntoI);
        puntoI.addToList(User);
        MapUsuarios.put(User.getId(),User);
        MapPI.put(puntoI.getNamePI(),puntoI);
    }

//    public List<Usuario> ListaOrdenada (String name){
//        PI puntoParaOrdenar = MapPI.get(name);
//    }

    public List<PI> ConsultarInfo(String id){

        Usuario u =MapUsuarios.get(id);
        List<PI> ListInfo = u.getListaPIs();
        return ListInfo;
    }


}
