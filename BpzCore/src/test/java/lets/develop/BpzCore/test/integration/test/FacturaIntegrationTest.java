package lets.develop.BpzCore.test.integration.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lets.develop.BpzCore.Business.FacturaBusiness;
import lets.develop.BpzCore.entity.Factura;


public class FacturaIntegrationTest {

	private final FacturaBusiness facturaBusiness = new FacturaBusiness();
	private static Factura factura;
	private String mensaje = "";
	private String codigo ="";
	private String fechaFacturacion = "";
	private String fechaVencimiento = "";
	private String moneda = "";
	private String precio = "";
	private String estado = "";
	private String proveedorId ="";
	private boolean esNuevo = true;
	@Mock
	private HttpServletResponse response;
	
	@Given("^despues de iniciar sesion en la aplicacion$")
	public void despues_de_iniciar_sesion_en_la_aplicacion() throws Throwable {
		 	MockitoAnnotations.initMocks(this);
		    Mockito.doNothing().when(response).sendRedirect("http://localhost:8080/bpz/factura.xhtml");
		    Assert.assertTrue(true);
	}

	@When("^hago clic en el enlace de Facturas$")
	public void hago_clic_en_el_enlace_de_Facturas() throws Throwable {
		Mockito.doNothing().when(response)
		.sendRedirect("");
		esNuevo = true;
		Assert.assertTrue(true);
	}

	@When("^luego hago clic en el boton de Registro$")
	public void luego_hago_clic_en_el_boton_de_Registro() throws Throwable {
		Mockito.doNothing().when(response)
		.sendRedirect("");
		esNuevo = true;
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en campo codigo el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_campo_codigo_el_valor_de(String arg1) throws Throwable {
		   codigo = arg1;
		   Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en campo fecha facturacion el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_campo_fecha_facturacion_el_valor_de(String arg1) throws Throwable {
	    fechaFacturacion=arg1;
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en campo fecha vencimiento el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_campo_fecha_vencimiento_el_valor_de(String arg1) throws Throwable {
	    fechaVencimiento=arg1;
		 Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en campo moneda el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_campo_moneda_el_valor_de(String arg1) throws Throwable {
	    moneda=arg1;
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en campo precio el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_campo_precio_el_valor_de(String arg1) throws Throwable {
	    precio=arg1;
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en campo proveedorId el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_campo_proveedorId_el_valor_de(String arg1) throws Throwable {
	    proveedorId=arg1;
		Assert.assertTrue(true);
	}

	@When("^presiono el boton de Guardar$")
	public void presiono_el_boton_de_Guardar() throws Throwable {
		 try {
			 	factura = new Factura();
		    	factura.setCodigo(Long.parseLong(codigo));
		    	factura.setPrecio(Double.parseDouble(precio));
		    	factura.setFechaFacturacion(Date.valueOf(fechaFacturacion));
		    	factura.setFechaVencimiento(Date.valueOf(fechaVencimiento));
		    	factura.setMoneda(moneda);
		    	factura.setEstado("ACT");
		    	factura.setProveedorId(Integer.parseInt(proveedorId));
		    	
				if(esNuevo){
					facturaBusiness.insertar(factura);
					mensaje = "Se registro correctamente la Factura";
				}else {
					facturaBusiness.actualizar(factura);
					mensaje = "Se actualizo correctamente la Factura";
				}
			} catch (Exception e) {
				mensaje = "Error: " + e .getMessage();
				e.printStackTrace();
				Assert.fail();
			}
	}

	@Then("^el sistema me muestra el mensaje de \"([^\"]*)\"$")
	public void el_sistema_me_muestra_el_mensaje_de(String arg1) throws Throwable {
		Assert.assertEquals(arg1, mensaje);
	}

	@When("^busco la factura de codigo \"([^\"]*)\" para seleccionarla$")
	public void busco_la_factura_de_codigo_para_seleccionarla(String arg1) throws Throwable {
		try {
			List<Factura> lista = facturaBusiness.listar(Long.parseLong(arg1));
			Assert.assertTrue(lista.size()>0);
			factura = lista.get(0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@When("^busco la factura de id \"([^\"]*)\" para seleccionarla$")
	public void busco_la_factura_de_id_para_seleccionarla(String arg1) throws Throwable {
		try {
			factura= facturaBusiness.obtener(Integer.parseInt(arg1));
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@When("^luego hago clic en el boton de Editar$")
	public void luego_hago_clic_en_el_boton_de_Editar() throws Throwable {
		Mockito.doNothing().when(response)
		.sendRedirect("http://localhost:8080/VisorWeb/mntEditar.xhtml");
		esNuevo = false;
		Assert.assertTrue(true);
	
	}
	

	@Then("^la nueva pantalla muestra la lista de facturas$")
	public void la_nueva_pantalla_muestra_la_lista_de_facturas() throws Throwable {
	   List<Factura> facturas = new ArrayList<>();
	   facturas = facturaBusiness.listar();
	}

	@When("^hago clic en el boton de Eliminar de la factura con el id \"([^\"]*)\"$")
	public void hago_clic_en_el_boton_de_Eliminar_de_la_factura_con_el_id(String arg1) throws Throwable {
		facturaBusiness.eliminar(Integer.parseInt(arg1));
		mensaje = "Se elimino la Factura";
		Mockito.doNothing().when(response)
		.sendRedirect("");
		Assert.assertTrue(true);
	}

	@Then("^el sistema muestra el mensaje de \"([^\"]*)\"$")
	public void el_sistema_muestra_el_mensaje_de(String arg1) throws Throwable {
		Assert.assertEquals(arg1, mensaje);
	}
	
	
}
