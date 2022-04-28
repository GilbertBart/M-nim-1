package edu.upc.dsa;

import edu.upc.dsa.models.PI;
import edu.upc.dsa.models.Usuario;

import java.util.List;

public interface UsuarioManager {

//    public Track addTrack(String title, String singer); // Track es lo q devuelve // String tile y String singer lo q le das para añadir el track
//    public Track addTrack(Track t);
//    public Track getTrack(String id);
//    public List<Track> findAll();
//    public void deleteTrack(String id);
//    public Track updateTrack(Track t);



    public void addUsuario(Usuario User, PI puntoI);

    //public Usuario getUsuario(String id);
    public int sizePI();
    public int sizeUsuarios();
    //public List<Usuario> ListaOrdenada (String name);
    public List<PI> ConsultarInfo(String id);
}
