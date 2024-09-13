package pe.edu.upeu.LP2_clase01.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.LP2_clase01.entity.Usuario;

public interface UsuarioDao {
	
	Usuario create(Usuario c);
	Usuario update(Usuario c);
	void delete(Long id);
	Optional<Usuario> read(Long id);
	List<Usuario> readAll();

}
