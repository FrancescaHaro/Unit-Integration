package lets.develop.BpzCore.test.unit.test;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.spy;
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

import lets.develop.BpzCore.Dao.FacturaDao;
import lets.develop.BpzCore.entity.Factura;
import lets.develop.BpzCore.entity.Proveedor;


@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacturaUnitTest {

	@Mock
	private FacturaDao facturaDao;
	@Mock
	private Factura factura;
	@Mock
	private List<Factura> lista;

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
			 Date fechaFacturacion = Date.valueOf("2018-09-05");
             Date fechaVencimiento = Date.valueOf("2018-10-05");
             factura = new Factura();
             factura.setCodigo((long)1212132);
             factura.setProveedorId(1);
             factura.setFechaFacturacion(fechaFacturacion);
             factura.setFechaVencimiento(fechaVencimiento);
             factura.setMoneda("Soles");
             factura.setPrecio(5929.795);
             factura.setEstado("ACT");
			when(facturaDao.insertar((Factura) Matchers.any())).thenReturn(true);
			boolean flag = facturaDao.insertar(factura);
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
			factura = new Factura();
			factura.setId(1);
			 Date fechaFacturacion = Date.valueOf("2018-10-25");
             Date fechaVencimiento = Date.valueOf("2018-12-25");
             factura.setCodigo((long)12345);
             factura.setProveedorId(2);
             factura.setFechaFacturacion(fechaFacturacion);
             factura.setFechaVencimiento(fechaVencimiento);
             factura.setMoneda("Dolares");
             factura.setPrecio(10800.50);
             factura.setEstado("ACT");
			
			when(facturaDao.obtener(anyInt())).thenReturn(factura);
			Factura facturaBuscada = facturaDao.obtener(1);
			facturaBuscada.setCodigo((long)2);
			
			when(facturaDao.actualizar((Factura) Matchers.any())).thenReturn(true);
			boolean flag = facturaDao.actualizar(factura);
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
			when(lista.add((Factura) Matchers.any())).thenReturn(true);
			when(facturaDao.listar()).thenReturn(lista);
			
			List<Factura> listaBuscada = facturaDao.listar();
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
			factura = new Factura();
			factura.setId(4);
			when(facturaDao.eliminar(anyInt())).thenReturn(true);
			boolean flag = facturaDao.eliminar(factura.getId());
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
			Date fechaFacturacion = Date.valueOf("2018-09-05");
            Date fechaVencimiento = Date.valueOf("2018-10-05");
            factura = new Factura();
            factura.setId(1);
            factura.setCodigo((long)1212132);
            factura.setProveedorId(1);
            factura.setFechaFacturacion(fechaFacturacion);
            factura.setFechaVencimiento(fechaVencimiento);
            factura.setMoneda("Soles");
            factura.setPrecio(5929.795);
            factura.setEstado("ACT");
			when(facturaDao.obtener(anyInt())).thenReturn(factura);
			Factura facturaSolicita = facturaDao.obtener(factura.getId());
			
			Assert.assertEquals(facturaSolicita.getId(), factura.getId());
			Assert.assertEquals(facturaSolicita.getCodigo(),factura.getCodigo());
			Assert.assertEquals(facturaSolicita.getFechaFacturacion(),factura.getFechaFacturacion());
			Assert.assertEquals(facturaSolicita.getFechaVencimiento(),factura.getFechaVencimiento());
			Assert.assertEquals(facturaSolicita.getPrecio(),factura.getPrecio());
			Assert.assertEquals(facturaSolicita.getMoneda(),factura.getMoneda());
			Assert.assertEquals(facturaSolicita.getEstado(),factura.getEstado());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error: " + e.getMessage());
		}
	}
	
	
}
