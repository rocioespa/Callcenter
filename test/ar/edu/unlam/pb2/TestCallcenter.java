package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCallcenter {

	@Test
	public void agregarElSoftwareDelCallcenter() {
		Callcenter callcenter = new Callcenter();
		assertNotNull(callcenter);
	}
	
	@Test
	public void agregarDosClientesALaListaDeContactos() {
		Callcenter callcenter = new Callcenter();
		Cliente clientes = new Cliente("Rocio", 1122334, "castelar");
		Cliente clientes1 = new Cliente("Lola", 1172334, "castelar");
		callcenter.agregarContacto(clientes);
		callcenter.agregarContacto(clientes1);
		Integer valorEsperado = 2;
		Integer valorObtenido = callcenter.getClientes().size();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queSePuedaRealizarUnaLLamadaSiLosClientesExistenEnElSoftware() {
		Callcenter callcenter = new Callcenter();
		Cliente clientes = new Cliente("Rocio", 1122334, "castelar");
		Cliente clientes1 = new Cliente("Lola", 1172334, "castelar");
		Cliente clientes3 = new Cliente("Lola", 1172334, "castelar");
		callcenter.agregarContacto(clientes);
		callcenter.agregarContacto(clientes1);
		assertTrue(callcenter.realizarllamada(clientes));
		assertTrue(callcenter.realizarllamada(clientes1));
		assertFalse(callcenter.realizarllamada(clientes3));
//		assertTrue(callcenter.buscarCliente(clientes));
//		assertTrue(callcenter.buscarCliente(clientes1));
		
	}
	
	@Test 
	public void queSePuedaRealizarUnaLlamadaSoloSiAmbosClientesSonDeDireccionDistinta() {
		Callcenter callcenter = new Callcenter();
		Cliente clientes = new Cliente("Rocio", 1122334, "ituzaingo");
		Cliente clientes1 = new Cliente("Lola", 1172334, "castelar");
		callcenter.agregarContacto(clientes);
		callcenter.agregarContacto(clientes1);
		assertTrue(callcenter.realizarllamada(clientes,clientes1));
	}

}
