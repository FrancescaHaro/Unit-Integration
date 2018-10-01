package lets.develop.BpzCore.test.unit.test;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import lets.develop.BpzCore.Dao.ProovedorDao;
import lets.develop.BpzCore.entity.Factura;
import lets.develop.BpzCore.entity.Proveedor;


@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProveedorUnitTest {

	@Mock
	private ProovedorDao proveedorDao;
	@Mock
	private Proveedor proveedor;
 
	@Mock
	private List<Proveedor> lista;
	
	@BeforeClass
	public static void inicioClase() {
		System.out.println("Antes de la Clase");
	}

	@AfterClass
	public static void finClase() {
		System.out.println("Despues de la Clase");
	}

	@Before
	public void antesDeCadaTest() {
		System.out.println("Antes de cada Test");
	}

	@After
	public void despuesDeCadaTest() {
		System.out.println("Despues de cada Test");
	}

	@Test
	public void a_insertar() {
		try {
			System.out.println("Método Insertar");
			proveedor = new Proveedor();
			proveedor.setEstado("ACT");
			proveedor.setId(1);
			proveedor.setNombre("Petro Peru");
			
			when(proveedorDao.insertar((Proveedor) Matchers.any())).thenReturn(true);
			boolean flag = proveedorDao.insertar(proveedor);
			Assert.assertTrue(flag);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
	}
	
	
	
	@Test
	public void b_actualizar() {
		try {
			System.out.println("Método Actualizar");
			proveedor = new Proveedor();
			proveedor.setEstado("ACT");
			proveedor.setId(1);
			proveedor.setNombre("Petro Peru");
			
			when(proveedorDao.obtener(anyInt())).thenReturn(proveedor);
			Proveedor proveedorBuscado = proveedorDao.obtener(1);
			proveedorBuscado.setNombre("Petro Pero SAC");
			
			when(proveedorDao.actualizar((Proveedor) Matchers.any())).thenReturn(true);
			boolean flag = proveedorDao.actualizar(proveedor);
			Assert.assertTrue(flag);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
	}
	
	
	@Test
	public void c_listar() {
		try {
			System.out.println("Método Listar");
			lista = new ArrayList<>();
			when(lista.add((Proveedor) Matchers.any())).thenReturn(true);
			when(proveedorDao.listar()).thenReturn(lista);
			
			List<Proveedor> listaBuscada = proveedorDao.listar();
			Assert.assertTrue(listaBuscada.size()>0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
	}
	
	@Test
	public void d_eliminar() {
		try {
			System.out.println("Método Eliminar");
			proveedor = new Proveedor();
			proveedor.setId(4);
			when(proveedorDao.eliminar(anyInt())).thenReturn(true);
			boolean flag = proveedorDao.eliminar(proveedor.getId());
			Assert.assertTrue(flag);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
	}
	
	@Test
	public void e_obtener() {
		try {
			System.out.println("Método Obtener");
			
			proveedor = new Proveedor();
			proveedor.setEstado("ACT");
			proveedor.setId(1);
			proveedor.setNombre("Petro Peru");
			
			when(proveedorDao.obtener(anyInt())).thenReturn(proveedor);
			Proveedor proveedorSolicita = proveedorDao.obtener(proveedor.getId());
			
			Assert.assertEquals(proveedorSolicita.getId(), proveedor.getId());
			Assert.assertEquals(proveedorSolicita.getNombre(), proveedor.getNombre());
			Assert.assertEquals(proveedorSolicita.getEstado(), proveedor.getEstado());
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
	}
	

}
