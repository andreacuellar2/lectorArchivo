/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.uesocc.tpi_2018.prueba;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ues.edu.uesocc.tpi_2018.prueba.objetos.Objeto;

/**
 *
 * @author andrea
 */
public class pruebaMetTest {

    public pruebaMetTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class pruebaMet.
     */
    @Test
    public void testMain() throws IOException {
        ManageFile mf = new ManageFile();
        InputStream is = mf.getFile();
        List<Objeto> lista = mf.leerCSV(is);

        for (Objeto obj : lista) {
            System.out.println("Objeto: " + obj.getColum1());
        }
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of multi method, of class pruebaMet.
     */
//    @Test
//    public void testMulti() {
//        System.out.println("multi");
//        double a = 0.0;
//        double b = 0.0;
//        pruebaMet instance = new pruebaMet();
//        double expResult = 0.0;
//        double result = instance.multi(a, b);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test TESSSSSSSScase is a prototype.");
//    }
//
//    /**
//     * Test of leerArchivo method, of class pruebaMet.
//     */
//    @Test
//    public void testLeerArchivo() {
//        System.out.println("leerArchivo");
//        pruebaMet instance = new pruebaMet();
//        String expResult = "";
//        String result = instance.leerArchivo();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
}
