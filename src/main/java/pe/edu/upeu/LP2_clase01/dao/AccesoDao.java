package pe.edu.upeu.LP2_clase01.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.LP2_clase01.entity.Acceso;

public interface AccesoDao {
	Acceso create(Acceso c);
	Acceso update(Acceso c);
	void delete(Long id);
	Optional<Acceso> read(Long id);
	List<Acceso> readAll();

}
