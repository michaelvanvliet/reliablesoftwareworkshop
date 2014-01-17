/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dtls.workshop.reliablesoftware;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author david
 */
public class MemLeakServletTest {

    private HttpServletRequest request;
    private HttpServletResponse response;

    public MemLeakServletTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws IOException {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        when(response.getWriter()).thenReturn(new PrintWriter(System.out));
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of processRequest method, of class MemLeakServlet.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        MemLeakServlet instance = new MemLeakServlet();
        instance.processRequest(request, response);
    }

    /**
     * Test of doGet method, of class MemLeakServlet.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        MemLeakServlet instance = new MemLeakServlet();
        instance.doGet(request, response);
    }

    /**
     * Test of doPost method, of class MemLeakServlet.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        MemLeakServlet instance = new MemLeakServlet();
        instance.doPost(request, response);
    }

    /**
     * Test of getServletInfo method, of class MemLeakServlet.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        MemLeakServlet instance = new MemLeakServlet();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
    }

}
