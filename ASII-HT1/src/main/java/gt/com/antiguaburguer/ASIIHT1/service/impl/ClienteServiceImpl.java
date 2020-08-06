package gt.com.antiguaburguer.ASIIHT1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.com.antiguaburguer.ASIIHT1.dao.IClienteDAO;
import gt.com.antiguaburguer.ASIIHT1.model.Cliente;
import gt.com.antiguarburguer.ASIIHT1.service.IClienteService;
@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDAO dao;
	
	
	@Override
	public Cliente registrar(Cliente t) {
		return dao.save(t);
	}

	@Override
	public Cliente modificar(Cliente t) {
		return dao.save(t);
	}

	/*@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Cliente listarId(int id) {
		return dao.findOne(id);
	}*/

	@Override
	public List<Cliente> listar() {
		return dao.findAll();
	}

}
