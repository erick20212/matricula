package pe.edu.upeu.LP2_clase01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.LP2_clase01.entity.Prestamo;

@Repository
public interface PrestamoRepository extends  JpaRepository<Prestamo, Long>{

}
