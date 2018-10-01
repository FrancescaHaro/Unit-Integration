package lets.develop.BpzCore.Business;

import java.util.List;

import lets.develop.BpzCore.Dao.ProovedorDao;
import lets.develop.BpzCore.entity.Proveedor;



public class ProveedorBusiness {

	private final ProovedorDao proveedorDao = new ProovedorDao();
	
	public boolean insertar(Proveedor proveedor) throws Exception{
		return this.proveedorDao.insertar(proveedor);
	}
	
	public boolean actualizar(Proveedor proveedor) throws Exception{
		return this.proveedorDao.actualizar(proveedor);
	}
	
	public List<Proveedor> listar() throws Exception{
		return this.proveedorDao.listar();
	}
	
	public List<Proveedor> listar(String nombre) throws Exception{
		return this.proveedorDao.listar(nombre);
	}
	
	public boolean eliminar(int proveedorId) throws Exception{
		return this.proveedorDao.eliminar(proveedorId);
	}
	
	public Proveedor obtener(int proveedorId) throws Exception{
		return this.proveedorDao.obtener(proveedorId);
	}
	
	
}
