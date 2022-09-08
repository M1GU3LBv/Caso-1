package pe.edu.upeu.clase01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase01.dao.Todo;

import pe.edu.upeu.clase01.entity.Suppliers;
@Component
public class SuppliersDaoIMpl implements Todo<Suppliers>{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Suppliers t) {
		// TODO Auto-generated method stub
		return 0;
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
		return jdbcTemplate.query("select *from suppliers", new BeanPropertyRowMapper<Suppliers>(Suppliers.class));
	}

}
