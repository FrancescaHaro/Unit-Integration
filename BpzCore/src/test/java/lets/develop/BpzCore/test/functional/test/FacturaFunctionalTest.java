package lets.develop.BpzCore.test.functional.test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import lets.develop.BpzCore.Business.FacturaBusiness;
import lets.develop.BpzCore.entity.Factura;
import lets.develop.BpzCore.entity.Proveedor;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacturaFunctionalTest {

	 private final SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
	 private final  FacturaBusiness facturaBusiness = new FacturaBusiness();
	 private static Factura factura;
	 private static Proveedor proveedor;
	 
	 @Test
	 public void a_insertar() {
	        try {
	            System.out.println("Método Insertar");
	             
	             Date fechaFacturacion = Date.valueOf("2018-09-05");
	             Date fechaVencimiento = Date.valueOf("2018-10-05");
	             factura = new Factura();
	             factura.setCodigo((long)1212132);
	             factura.setProveedorId(2);
	             factura.setFechaFacturacion(fechaFacturacion);
	             factura.setFechaVencimiento(fechaVencimiento);
	             factura.setMoneda("Soles");
	             factura.setPrecio(5929.795);
	             factura.setEstado("ACT");
	             
	            boolean flag = facturaBusiness.insertar(factura);
	            Assert.assertTrue(flag);
	        } catch (Exception e) {
	            e.printStackTrace();
	            Assert.fail();
	        }
	    }
	 
	 @Test
	 public void b_actualizar() {
		 try {
			 factura = new Factura();
			 //Valores cambiados
			 Date fechaVencimiento = Date.valueOf("2018-10-19");
			 factura.setMoneda("Dolares");
			 factura.setProveedorId(3);
			 factura.setPrecio(8929.795);
			 
			 int facturaActualizadaId = 1;
			 Date fechaFacturacion = Date.valueOf("2018-09-05");
			 factura.setEstado("ACT");
			 factura.setCodigo((long)1212132);
             
			 boolean flag = facturaBusiness.actualizar(factura);
			 Assert.assertTrue(flag);
			 
		 }catch(Exception e) {
			 e.printStackTrace();
	            Assert.fail();
		 }
	 }
	 
	 @Test
	 public void b_eliminar() {
		 try {
			 int facturaEliminadaId = 2;
             boolean flag = facturaBusiness.eliminar(facturaEliminadaId);
			 Assert.assertTrue(flag); 
		 }catch(Exception e) {
			 e.printStackTrace();
	            Assert.fail();
		 }
	 }
	 
	 @Test
	 public void b_listar() {
		 try {
			 List<Factura> facturas = new ArrayList<Factura>();
			 facturas = facturaBusiness.listar();
			 Assert.assertNotNull(facturas);
			 Assert.assertTrue(facturas.size() > 0);
		 }catch(Exception e) {
			 e.printStackTrace();
	            Assert.fail();
		 }
	 }
	 
	 @Test
	 public void b_obtener() {
		 try {
		
			 
			 //Datos de la factura a buscar 
			 Date fechaFacturacion = Date.valueOf("2018-09-05");
             Date fechaVencimiento = Date.valueOf("2018-10-05");
             Long codigo = (long)1212132;
             Integer proveedorId = 2;
             String moneda = "Soles";
             Double precio = 5929.795;
             int facturaBuscadaId = 2;
             Factura facturaBuscada = facturaBusiness.obtener(proveedorId);
			 Assert.assertNotNull(facturaBuscada);
			 Assert.assertEquals(fechaFacturacion, facturaBuscada.getFechaFacturacion());
			 Assert.assertEquals(fechaVencimiento, facturaBuscada.getFechaVencimiento());
			 Assert.assertEquals(codigo, facturaBuscada.getCodigo());
			 Assert.assertEquals(proveedorId, facturaBuscada.getProveedorId());
			 Assert.assertEquals(moneda, facturaBuscada.getMoneda());
			 Assert.assertEquals(precio, facturaBuscada.getPrecio());
		 }catch(Exception e) {
			 e.printStackTrace();
	            Assert.fail();
		 }
	 }
	 
	
}
