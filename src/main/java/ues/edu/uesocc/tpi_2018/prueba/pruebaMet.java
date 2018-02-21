/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.uesocc.tpi_2018.prueba;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author andrea
 */
public class pruebaMet {
    public static final String SEPARADOR = ",";

    public static void main(String[] args) {
 
        BufferedReader bufferLectura = null;
            try {
                // Abrir el .csv en buffer de lectura
                bufferLectura = new BufferedReader(new FileReader("archivo.csv"));
  
                // Leer una linea del archivo
                String linea = bufferLectura.readLine();
  
                while (linea != null) {
                // Sepapar la linea leída con el separador definido previamente
                String[] campos = linea.split(SEPARADOR); 
                System.out.println(Arrays.toString(campos));
                // Volver a leer otra línea del fichero
                linea = bufferLectura.readLine();
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                // Cierro el buffer de lectura
                if (bufferLectura != null) {
                    try {
                        bufferLectura.close();
                    } 
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
    }
}
