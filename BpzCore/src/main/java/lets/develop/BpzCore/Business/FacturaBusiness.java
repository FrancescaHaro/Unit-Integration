package lets.develop.BpzCore.Business;

import java.util.List;

import lets.develop.BpzCore.Dao.FacturaDao;
import lets.develop.BpzCore.entity.Factura;


public class FacturaBusiness {

	private final FacturaDao facturaDao = new FacturaDao();
	
	public boolean insertar(Factura factura) throws Exception{
		return this.facturaDao.insertar(factura);
	}
	
	public boolean actualizar(Factura factura) throws Exception{
		return this.facturaDao.actualizar(factura);
	}
	
	public List<Factura> listar() throws Exception{
		return this.facturaDao.listar();
	}
	
	public boolean eliminar(int facturaId) throws Exception{
		return this.facturaDao.eliminar(facturaId);
	}
	
	public Factura obtener(int proveedorId) throws Exception{
		return this.facturaDao.obtener(proveedorId);
	}
	
	public List<Factura> listar(Long codigo) throws Exception{
		return this.facturaDao.listar(codigo);
	}
	
	
}
