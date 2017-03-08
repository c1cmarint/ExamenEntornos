/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class PruebaTest {
    
    public PruebaTest() {
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
     * Test of getValor method, of class Prueba.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Prueba instance = new Prueba();
        int expResult = 0;
        int result = instance.getValor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValor method, of class Prueba.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        int valor = 0;
        Prueba instance = new Prueba();
        instance.setValor(valor);
    }

    /**
     * Test of modificar method, of class Prueba.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        int[] vector = null;
        int LongitudActual = 0;
        int posicion = 0;
        Prueba instance = new Prueba();
        instance.modificar(vector, LongitudActual, posicion);
    }

    /**
     * Test of Visualizar method, of class Prueba.
     */
    @Test
    public void testVisualizar() {
        System.out.println("Visualizar");
        int i = 0;
        int[] vector = null;
        Prueba instance = new Prueba();
        instance.Visualizar(i, vector);
    }

    /**
     * Test of borrar method, of class Prueba.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        int[] v = null;
        int LongitudActual = 0;
        Prueba instance = new Prueba();
        instance.borrar(v, LongitudActual);
    }

    /**
     * Test of insertar method, of class Prueba.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        int[] v = null;
        int LongitudActual = 0;
        Prueba instance = new Prueba();
        instance.insertar(v, LongitudActual);
    }

    /**
     * Test of BorraElemento method, of class Prueba.
     */
    @Test
    public void testBorraElemento() {
        System.out.println("BorraElemento");
        int[] v = null;
        int p = 0;
        int i = 0;
        Prueba instance = new Prueba();
        instance.BorraElemento(v, p, i);
    }

    /**
     * Test of InsertaElemento method, of class Prueba.
     */
    @Test
    public void testInsertaElemento() {
        System.out.println("InsertaElemento");
        int i = 0;
        int[] v = null;
        int p = 0;
        Prueba instance = new Prueba();
        instance.InsertaElemento(i, v, p);
    }

    /**
     * Test of ModificaElemento method, of class Prueba.
     */
    @Test
    public void testModificaElemento() {
        System.out.println("ModificaElemento");
        int[] v = null;
        int p = 0;
        Prueba instance = new Prueba();
        instance.ModificaElemento(v, p);
    }

    /**
     * Test of main method, of class Prueba.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Prueba.main(args);
    }
    
}
