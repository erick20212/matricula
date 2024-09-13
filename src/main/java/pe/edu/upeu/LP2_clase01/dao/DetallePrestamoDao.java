package pe.edu.upeu.LP2_clase01.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.LP2_clase01.entity.DetallePrestamo;

public interface DetallePrestamoDao {
	
	DetallePrestamo create(DetallePrestamo c);
	DetallePrestamo update(DetallePrestamo c);
	void delete(Long id);
	Optional<DetallePrestamo> read(Long id);
	List<DetallePrestamo> readAll();

}
