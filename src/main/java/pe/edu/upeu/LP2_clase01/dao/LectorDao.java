package pe.edu.upeu.LP2_clase01.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.LP2_clase01.entity.Lector;

public interface LectorDao {
	
	Lector create(Lector c);
	Lector update(Lector c);
	void delete(Long id);
	Optional<Lector> read(Long id);
	List<Lector> readAll();
}
