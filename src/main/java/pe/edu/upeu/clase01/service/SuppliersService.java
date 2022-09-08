package pe.edu.upeu.clase01.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase01.dao.Todo;

import pe.edu.upeu.clase01.daoImpl.SuppliersDaoIMpl;
import pe.edu.upeu.clase01.entity.Suppliers;

@Service
public class SuppliersService implements Todo<Suppliers>{
	@Autowired
	private SuppliersDaoIMpl daoIMpl;
	@Override
	public int create(Suppliers t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
	}

	@Override
	public int update(Suppliers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Suppliers read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Suppliers> readAll() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll();
	}

}
