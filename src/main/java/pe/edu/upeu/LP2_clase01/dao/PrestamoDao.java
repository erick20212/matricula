package pe.edu.upeu.LP2_clase01.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.LP2_clase01.entity.Prestamo;

public interface PrestamoDao {
	
	Prestamo create(Prestamo c);
	Prestamo update(Prestamo c);
	void delete(Long id);
	Optional<Prestamo> read(Long id);
	List<Prestamo> readAll();


}
