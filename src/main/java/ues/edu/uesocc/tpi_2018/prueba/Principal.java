/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.uesocc.tpi_2018.prueba;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ues.edu.uesocc.tpi_2018.prueba.objetos.Objeto;

/**
 *
 * @author andrea
 */
public class Principal {

    public static void main(String[] args) {
        try {
            ManageFile mf = new ManageFile();
            InputStream is = mf.getFile();
            List<Objeto> lista = mf.leerCSV(is);
            
            for (Objeto obj: lista) {
                System.out.println("Objeto: " + obj.getColum1());
            }

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
