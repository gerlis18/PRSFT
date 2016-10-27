/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prsft.controlador;

import prsft.modelo.DAOTCliente;
import prsft.vista.VTablaClientes;
import prsft.vista.VVentas;

/**
 * Clase encargada inicializar la interfaz TCliente
 * @author by Gerlis A.C
 */
public class ControladorTCliente {
    VTablaClientes vista;
    DAOTCliente modelo;
    /**
     * Metodo constructor de la clase ControladorTCliente
     * @param vista Interfaz 
     * @param modelo Modelo
     * @throws InstantiationException Throws
     * @throws IllegalAccessException Throws
     */
    public ControladorTCliente(VTablaClientes vista, DAOTCliente modelo) throws InstantiationException, IllegalAccessException{
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(new VVentas());
    }
    
}
