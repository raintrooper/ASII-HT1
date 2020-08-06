package gt.com.antiguaburguer.ASIIHT1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.com.antiguaburguer.ASIIHT1.dao.IEmpleadoDAO;
import gt.com.antiguaburguer.ASIIHT1.model.Empleado;
import gt.com.antiguarburguer.ASIIHT1.service.IEmpleadoService;
@Service
public class EmpleadoServiceImpl  implements IEmpleadoService  {

	@Autowired
	private IEmpleadoDAO dao;
	
	
	@Override
	public Empleado registrar(Empleado t) {
		return dao.save(t);
	}

	@Override
	public Empleado modificar(Empleado t) {
		return dao.save(t);
	}

	/*@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Empleado listarId(int id) {
		return dao.findOne(id);
	}*/

	@Override
	public List<Empleado> listar() {
		return dao.findAll();
	}

}
