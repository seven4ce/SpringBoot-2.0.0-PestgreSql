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
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "transaction_date", "modified_date" }, allowGetters = true)
@Table(name = "transaksi")
public class Transaksi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_transaksi")
	private long idTransaksi;

	@Column(name = "id_barang")
	private long idBarang;

	@Column(name = "jumlah_barang")
	private int jumlahBarang;

	@Column(name = "total_harga")
	private long totalHarga;

	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "GMT+7")
	@Column(name = "transaction_date")
	@CreatedDate
	private Date transactionDate;

	public Transaksi() {
		super();
	}

	public long getIdTransaksi() {
		return idTransaksi;
	}

	public void setIdTransaksi(long idTransaksi) {
		this.idTransaksi = idTransaksi;
	}

	public long getIdBarang() {
		return idBarang;
	}

	public void setIdBarang(long idBarang) {
		this.idBarang = idBarang;
	}

	public int getJumlahBarang() {
		return jumlahBarang;
	}

	public void setJumlahBarang(int jumlahBarang) {
		this.jumlahBarang = jumlahBarang;
	}

	public long getTotalHarga() {
		return totalHarga;
	}

	public void setTotalHarga(long totalHarga) {
		this.totalHarga = totalHarga;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

}