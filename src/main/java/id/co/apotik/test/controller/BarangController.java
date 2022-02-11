package id.co.apotik.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import id.co.apotik.test.model.Barang;
import id.co.apotik.test.repository.BarangRepository;

@Service
@RestController
@RequestMapping("/barang")
public class BarangController {

	@Autowired
	private BarangRepository barangRepository;

	@GetMapping("/getAll")
	public List<Barang> getAllBarang() {
		return barangRepository.findAll();
	}

	@GetMapping("/getBy")
	public Barang getById(@RequestParam("/idBarang") long idBarang) {
		return barangRepository.findOne(idBarang);
	}

	@PostMapping("/save")
	public Barang save(@RequestBody Barang barang) {
		return barangRepository.save(barang);
	}

}
