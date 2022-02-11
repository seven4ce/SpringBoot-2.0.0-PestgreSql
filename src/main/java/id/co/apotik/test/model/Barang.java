package id.co.apotik.test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "created_date", "modified_date" }, allowGetters = true)
@Table(name = "barang")
public class Barang {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_barang")
	private long idBarang;

	@Column(name = "nama_barang")
	private String namaBarang;

	@Column(name = "id_harga")
	private long idHarga;
	
	@Column
	private long deskripsi;

	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "GMT+7")
	@Column(name = "created_date", nullable = false, updatable = false)
	@CreatedDate
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "GMT+7")
	@Column(name = "modified_date", nullable = false)
	@LastModifiedDate
	private Date modifiedDate;

	public Barang() {
		super();
	}

	public long getIdBarang() {
		return idBarang;
	}

	public void setIdBarang(long idBarang) {
		this.idBarang = idBarang;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public long getIdHarga() {
		return idHarga;
	}

	public void setIdHarga(long idHarga) {
		this.idHarga = idHarga;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public long getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(long deskripsi) {
		this.deskripsi = deskripsi;
	}
	
	

}