package com.tugas.tokoonline.model;

import com.tugas.tokoonline.auditing.Audit;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long No;

    @Column(name = "Nama_Barang")
    private String namaBarang;

    @Column(name = "Harga")
    private String harga;

    @Column(name = "Pemilik")
    private String pemilik;

    public Order() {
    }

    public Long getNo() {
        return No;
    }

    public void setNo(Long no) {
        No = no;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    @Override
    public String toString() {
        return "Order{" +
                "No=" + No +
                ", namaBarang='" + namaBarang + '\'' +
                ", harga='" + harga + '\'' +
                ", pemilik='" + pemilik + '\'' +
                '}';
    }
}
