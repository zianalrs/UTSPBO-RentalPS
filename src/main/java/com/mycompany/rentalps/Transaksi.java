/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalps;

/**
 *
 * @author LOQ
 */
public class Transaksi {

    private int idTransaksi;
    private String namaPelanggan;
    private String jenisPs;
    private int durasi;
    private int totalBayar;

    public Transaksi(int idTransaksi, String namaPelanggan,
                     String jenisPs, int durasi, int totalBayar) {

        this.idTransaksi = idTransaksi;
        this.namaPelanggan = namaPelanggan;
        this.jenisPs = jenisPs;
        this.durasi = durasi;
        this.totalBayar = totalBayar;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    // Method biasa
    public void tampilkanData() {
        System.out.println(
            idTransaksi + " | " +
            namaPelanggan + " | " +
            jenisPs + " | " +
            durasi + " jam | Rp" +
            totalBayar
        );
    }

    // Method Overloading
    public void tampilkanData(String judul) {

        System.out.println("================================");
        System.out.println("        " + judul);
        System.out.println("================================");
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Nama         : " + namaPelanggan);
        System.out.println("Jenis PS     : " + jenisPs);
        System.out.println("Durasi       : " + durasi + " jam");
        System.out.println("Total Bayar  : Rp" + totalBayar);
        System.out.println("================================");
    }
}
