package id.co.apotik.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.co.apotik.test.model.Harga;

@Repository
public interface HargaRepository extends JpaRepository<Harga, Long> {
	
	List<Harga> findAll();

}
