package Controladores;

import Modelo.Clientes;
import Modelo.ListaModel;
import Vistas.frmListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

public class ListaController implements ActionListener{
    


    frmListas VistaLista;
    ListaModel ModeloClientes;

    public ListaController(frmListas VistaLista, ListaModel ModeloLista) {
        this.VistaLista = VistaLista;
        this.ModeloClientes = ModeloLista;
        
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnAtenderTdos.addActionListener(this);
        this.VistaLista.btnIngresarCliente.addActionListener(this);
        
        this.VistaLista.setVisible(true);
        
    }
     
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    
        if(e.getSource() == this.VistaLista.btnIngresarCliente){
            this.ModeloClientes.EncolarCliente(this.VistaLista.txtApellidos.getText(),
                    this.VistaLista.txtNombres.getText());
            
            Queue <Clientes> listaLocal = this.ModeloClientes.ListarClientes();
            
                String Cadena = "";
                
            for(Clientes MiListaClientes: listaLocal){
                Cadena = Cadena + MiListaClientes.getApellidos() + " " + MiListaClientes.getNombres() +"\n";
                this.VistaLista.txtListaClientes.setText(Cadena);
                        
            }           
    }   }  
} 