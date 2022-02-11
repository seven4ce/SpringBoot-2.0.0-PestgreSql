package id.co.apotik.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.co.apotik.test.model.Transaksi;

@Repository
public interface TransaksiRepository extends JpaRepository<Transaksi, Long> {

	List<Transaksi> findAll();

}
