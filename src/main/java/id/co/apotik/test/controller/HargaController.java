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

import id.co.apotik.test.model.Harga;
import id.co.apotik.test.repository.HargaRepository;

@Service
@RestController
@RequestMapping("/harga")
public class HargaController {

	@Autowired
	private HargaRepository hargaRepository;

	@GetMapping("/getAll")
	public List<Harga> getAllHarga() {
		return hargaRepository.findAll();

	}

	@GetMapping("/getBy")
	public Harga getById(@RequestParam("/idHarga") long idHarga) {
		return hargaRepository.findOne(idHarga);

	}

	@PostMapping("/save")
	public Harga saveHarga(@RequestBody Harga harga) {
		return hargaRepository.save(harga);
	}

}
