package lets.develop.BpzCore.test.functional.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import lets.develop.BpzCore.Business.ProveedorBusiness;
import lets.develop.BpzCore.entity.Proveedor;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProveedorFunctionalTest {
	
	  private final ProveedorBusiness proveedorBusiness = new ProveedorBusiness();
	    private static Proveedor proveedor;

	    @BeforeClass
	    public static void inicioClase() {
	        System.out.println("Inicio de la clase");
	    }

	    @AfterClass
	    public static void finClase() {
	        System.out.println("Fin de la clase");
	    }

	    @Before
	    public void inicioMetodo() {
	        System.out.println("Inicio Metodo");
	    }

	    @After
	    public void finMetodo() {
	        System.out.println("Fin Metodo");
	    }

	    @Test
	    public void a_insertar() {
	        try {
	            System.out.println("Método Insertar");
	            proveedor = new Proveedor();
	            proveedor.setNombre("Proveedor de Prueba");
	            proveedor.setEstado("ACT");
	            Boolean flag = proveedorBusiness.insertar(proveedor);
	            Assert.assertTrue(flag);
	        } catch (Exception e) {
	            e.printStackTrace();
	            Assert.fail();
	        }
	    }
	    
	   
	    @Test
	    public void b_actualizar() {
	        try {
	            System.out.println("Método Actualiza");
	            proveedor = new Proveedor();
	            int proveedorId = 1;
	            String estado = "ACT";
	            proveedor.setId(proveedorId);
	            proveedor.setEstado(estado);
	            proveedor.setNombre("Proveedor Prueba Actualizada");
	            boolean flag = proveedorBusiness.actualizar(proveedor);
	            Assert.assertTrue(flag);
	        } catch (Exception e) {
	            e.printStackTrace();
	            Assert.fail();
	        }
	    }
	    
	    @Test
	    public void c_listar(){
	    	try {
	    		List<Proveedor> proveedores = new ArrayList<Proveedor>();
	    		proveedores = proveedorBusiness.listar();
	    		Assert.assertNotNull(proveedores);
	    		Assert.assertTrue(proveedores.size() > 0);
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		Assert.fail();
	    	}
	    }
	    
	    @Test
	    public void d_eliminar() {
	    	try {
	    		int proveedorEliminadoId = 6;
	    		boolean flag = proveedorBusiness.eliminar(proveedorEliminadoId);
	    		Assert.assertTrue(flag);
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		Assert.fail();
	    	}
	    }
	    
	    @Test
	    public void e_obtener() {
	    	try {
	    		
	    		//Data del proveedor a buscar
	    		String nombre = "PROVEEDOR DE PRUEBA";
	    		String estado = "ACT";
	    		
	    		Proveedor proveedor = new Proveedor();
	    		int proveedorBuscadoId = 2;
	    		proveedor = proveedorBusiness.obtener(proveedorBuscadoId);
	    		Assert.assertEquals(nombre, proveedor.getNombre());
	    		Assert.assertEquals( estado , proveedor.getEstado());
	    		Assert.assertNotNull(proveedor);
	    	}catch(Exception e){
	    		e.printStackTrace();
	    		Assert.fail();
	    	}
	    }
	
}
