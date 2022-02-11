package id.co.apotik.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.co.apotik.test.model.Barang;

@Repository
public interface BarangRepository extends JpaRepository<Barang, Long> {

	List<Barang> findAll();

}
