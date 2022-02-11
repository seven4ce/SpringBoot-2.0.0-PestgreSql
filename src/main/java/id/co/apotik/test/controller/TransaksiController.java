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

import id.co.apotik.test.model.Transaksi;
import id.co.apotik.test.repository.TransaksiRepository;

@Service
@RestController
@RequestMapping("/transaksi")
public class TransaksiController {

	@Autowired
	private TransaksiRepository transaksiRepository;

	@GetMapping("/getAll")
	public List<Transaksi> getAllItem() {
		return transaksiRepository.findAll();
	}

	@GetMapping("/getBy")
	public Transaksi getById(@RequestParam("/idItem") long idTransaksi) {
		return transaksiRepository.findOne(idTransaksi);
	}

	@PostMapping("/save")
	public Transaksi save(@RequestBody Transaksi trx) {
		return transaksiRepository.save(trx);
	}

}
