
import Controladores.ListaController;
import Modelo.ListaModel;
import Vistas.frmListas;

public class Main {

    public static void main(String[] args) {
        frmListas VistaListas = new frmListas(null, true);
        ListaModel ModeloLista = new ListaModel();
        ListaController ControladorLista = new ListaController(VistaListas, ModeloLista);

    }
    
}
