package lets.develop.BpzCore.test.integration.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lets.develop.BpzCore.Business.ProveedorBusiness;
import lets.develop.BpzCore.entity.Factura;
import lets.develop.BpzCore.entity.Proveedor;

public class ProveedorIntegrationTest {

	private final ProveedorBusiness proveedorBusiness = new ProveedorBusiness();
	private static Proveedor proveedor;
	private String mensaje = "";
	private String nombre = "";
	private boolean esNuevo = true;
	@Mock
	private HttpServletResponse response;

	@Given("^luego de iniciar sesion en la aplicacion$")
	public void luego_de_iniciar_sesion_en_la_aplicacion() throws Throwable {
		MockitoAnnotations.initMocks(this);
		Mockito.doNothing().when(response).sendRedirect("http://localhost:8080/bpz/factura.xhtml");
		Assert.assertTrue(true);
	}

	@When("^hago clic en el enlace de Proveedores$")
	public void hago_clic_en_el_enlace_de_Proveedores() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("");
		esNuevo = true;
		Assert.assertTrue(true);
	}

	@When("^luego hago click en el boton de Registro$")
	public void luego_hago_click_en_el_boton_de_Registro() throws Throwable {
		Mockito.doNothing().when(response).sendRedirect("");
		esNuevo = true;
		Assert.assertTrue(true);
	}

	@When("^en la nueva pantalla escribo en campo nombre el valor de \"([^\"]*)\"$")
	public void en_la_nueva_pantalla_escribo_en_campo_nombre_el_valor_de(String arg1) throws Throwable {
		nombre = arg1;
		Assert.assertTrue(true);
	}

	@When("^busco el Proveedor de nombre \"([^\"]*)\" para seleccionarlo$")
	public void busco_el_Proveedor_de_nombre_para_seleccionarlo(String arg1) throws Throwable {
		try {
			List<Proveedor> lista = proveedorBusiness.listar(arg1);
			Assert.assertTrue(lista.size() > 0);
			proveedor = lista.get(0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	
	@When("^busco el Proveedor de id \"([^\"]*)\" para seleccionarlo$")
	public void busco_el_Proveedor_de_id_para_seleccionarlo(String arg1) throws Throwable {
		proveedor= proveedorBusiness.obtener(Integer.parseInt(arg1));
		
	}

	@Then("^la nueva pantalla muestra la lista de Proveedores$")
	public void la_nueva_pantalla_muestra_la_lista_de_Proveedores() throws Throwable {
		List<Proveedor> proveedores = new ArrayList<>();
		proveedores = proveedorBusiness.listar();
	}

	@When("^hago clic en el boton de Eliminar el Proveedor con el id \"([^\"]*)\"$")
	public void hago_clic_en_el_boton_de_Eliminar_el_Proveedor_con_el_id(String arg1) throws Throwable {
		proveedorBusiness.eliminar(Integer.parseInt(arg1));
		mensaje = "Se elimino el Proveedor";
		Mockito.doNothing().when(response).sendRedirect("");
		Assert.assertTrue(true);
	}

	@When("^hago click en el boton de Guardar$")
	public void hago_click_en_el_boton_de_Guardar() throws Throwable {
		   try {
			   	proveedor = new Proveedor();
		    	proveedor.setNombre(nombre);
		    	proveedor.setEstado("ACT");
				if(esNuevo){
					proveedorBusiness.insertar(proveedor);
					mensaje = "Se registro correctamente el Proveedor";
				}else {
					proveedorBusiness.actualizar(proveedor);
					mensaje = "Se actualizo correctamente el Proveedor";
				}
			} catch (Exception e) {
				mensaje = "Error: " + e .getMessage();
				e.printStackTrace();
				Assert.fail();
			}
	}
	

	@Then("^el sistema muestra un mensaje de \"([^\"]*)\"$")
	public void el_sistema_muestra_un_mensaje_de(String arg1) throws Throwable {
		Assert.assertEquals(arg1, mensaje);
	}

	@When("^luego hago click en el boton de Editar$")
	public void luego_hago_click_en_el_boton_de_Editar() throws Throwable {
		Mockito.doNothing().when(response)
		.sendRedirect("http://localhost:8080/VisorWeb/mntEditar.xhtml");
		esNuevo = false;
		Assert.assertTrue(true);
	}

}
