/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package nucleo3pym;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SEBASTIAN
 */
public class ClienteIT {
    
    public ClienteIT() {
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
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        String expesult = "";
        String result = instance.getNombre();
        assertEquals(expesult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSaldo method, of class Cliente.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Cliente instance = new Cliente();
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setSaldo method, of class Cliente.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double saldo = 0.0;
        Cliente instance = new Cliente();
        instance.setSaldo(saldo);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of depositar method, of class Cliente.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        double cantidad = 0.0;
        Cliente instance = new Cliente();
        instance.depositar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of retirar method, of class Cliente.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        double cantidad = 0.0;
        Cliente instance = new Cliente();
        instance.retirar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of saldo method, of class Cliente.
     */
    @Test
    public void testSaldo() {
        System.out.println("saldo");
        Cliente instance = new Cliente();
        double expResult = 0.0;
        double result = instance.saldo();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
