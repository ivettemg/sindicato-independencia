/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.evoti.dao;

import java.util.List;
import mx.com.evoti.dto.UsuarioDto;
import mx.com.evoti.hibernate.config.HibernateUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Venette
 */
public class AvalesSolicitudDaoTest {
    
    public AvalesSolicitudDaoTest() {
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
     * Test of getPerfilAvales method, of class AvalesSolicitudDao.
     */
    @Test
    public void testGetPerfilAvales() throws Exception {
        System.out.println("getPerfilAvales");
        int usuId = 1;
        AvalesSolicitudDao instance = new AvalesSolicitudDao();
        UsuarioDto expResult = null;
        UsuarioDto result = instance.getPerfilAvales(usuId, 1);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaClavesAval method, of class AvalesSolicitudDao.
     */
    @Test
    public void testConsultaClavesAval() throws Exception {
        System.out.println("consultaClavesAval");
        AvalesSolicitudDao instance = new AvalesSolicitudDao();
        List<UsuarioDto> expResult = null;
           HibernateUtil.buildSessionFactory2();
          
            List<UsuarioDto> result = instance.consultaClavesAval();
            HibernateUtil.closeSessionFactory();


            assertNull("La lista viene nula", result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
