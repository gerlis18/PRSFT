package prsft.controlador;

import prsft.vista.VCompra;
import prsft.vista.VTProveedor;
import prsft.modelo.DAOTproveedor;

/**
 * Clase encargada de inicializar la interfaz TProveedor
 * @author by Gerlis A.C
 */
public class ControladorTproveedor {
    VTProveedor vista;
    DAOTproveedor modelo;
   /**
    * Constructor de la clase TProveedor
    * @param vista Interfaz
    * @param modelo Modelo DAO
    * @throws InstantiationException Throws
    * @throws IllegalAccessException Throws
    */ 
    public ControladorTproveedor(VTProveedor vista, DAOTproveedor modelo) throws InstantiationException, IllegalAccessException{
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(new VCompra());
    }
}
