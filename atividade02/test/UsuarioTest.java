/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import atividade1.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author MarkVII
 */
public class UsuarioTest {

    Usuario u;
    UsuarioDAO usuarioDaoMock;
    UsuarioValidator uV;
    SenhaValidator senhaVMock;

    public UsuarioTest() {
        usuarioDaoMock = mock(UsuarioDAO.class);
        senhaVMock = mock(SenhaValidator.class);
        when(usuarioDaoMock.getByName("Existe")).thenReturn(null);
        uV = new UsuarioValidator(usuarioDaoMock);
        when(senhaVMock.verificar("22utfpr22")).thenReturn(false);
        when(senhaVMock.verificar("12345")).thenReturn(true);
        uV.setSenhaValidator(senhaVMock);
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

    @Test
    public void usuarioValido() throws Exception {
        u = new Usuario();
        u.setNome("Anderson");
        u.setSenha("22utfpr22");
        u.setSenhaConfirmada("22utfpr22");
        assertTrue(this.uV.ehUsuarioValido(u));
    }
    @Test
    public void nomeMenorque5() throws Exception {
        u = new Usuario();
        u.setNome("Ande");
        u.setSenha("22utfpr22");
        u.setSenhaConfirmada("22utfpr22");
        this.uV.ehUsuarioValido(u);
    }

    @Test
    public void senhasDiferentesTest() throws Exception {
        u = new Usuario();
        u.setNome("Anderson");
        u.setSenha("22utfpr22");
        u.setSenhaConfirmada("pr22");
        this.uV.ehUsuarioValido(u);
    }
    @Test
    public void senhaInvalidaTest() throws Exception {
        u = new Usuario();
        u.setNome("Anderson");
        u.setSenha("12345");
        u.setSenhaConfirmada("12345");
        this.uV.ehUsuarioValido(u);
    }
    @Test
    public void nomeEspecial() throws Exception {
        u = new Usuario();
        u.setNome("$#&%#&!");
        u.setSenha("22utfpr22");
        u.setSenhaConfirmada("22utfpr22");
        assertFalse(this.uV.ehUsuarioValido(u));
    }
    @Test
    public void usuarioExiste() throws Exception {
        u = new Usuario();
        u.setNome("Existe");
        u.setSenha("22utfpr22");
        u.setSenhaConfirmada("22utfpr22");
        this.uV.ehUsuarioValido(u);
    }
    
}
