# Sistem Rental PS

## 1. Deskripsi Proyek

Sistem Rental PS merupakan program berbasis Java yang digunakan untuk mengelola proses penyewaan PlayStation. Program ini dapat digunakan untuk melihat daftar PlayStation, melakukan booking, melihat transaksi, mengelola data PlayStation, serta menyelesaikan penyewaan.

Program dibuat dengan menerapkan konsep dasar Pemrograman Berorientasi Objek (PBO), seperti **Inheritance, Polymorphism, Method Overloading, Conditional, dan Looping**.

Class yang digunakan dalam program ini yaitu `PlayStation`, `PS4`, `PS5`, `Pelanggan`, `Transaksi`, dan `Main`.

---

## 2. Alur Program

### 2.1 Menu Utama

Saat program dijalankan, sistem akan menampilkan menu utama yang terdiri dari beberapa pilihan.

[ss menu utama]

Pengguna dapat memilih menu dengan memasukkan nomor sesuai dengan pilihan yang tersedia.

### 2.2 Lihat PlayStation

Pada menu **Lihat PlayStation**, sistem akan menampilkan daftar PlayStation yang tersedia beserta ID, jenis PS, status, dan harga sewa per jam.

[ss output lihat playstation]

### 2.3 Booking PS

Untuk melakukan penyewaan, pengguna memilih menu **Booking PS**. Sistem akan menampilkan daftar PlayStation dan pengguna memasukkan ID PlayStation yang ingin disewa.

[ss menu booking ps]

Setelah memilih PlayStation, pengguna memasukkan data pelanggan berupa ID pelanggan, nama, dan nomor HP. Selanjutnya pengguna memasukkan ID transaksi dan durasi penyewaan.

[ss input data booking]

Sistem akan menghitung total pembayaran berdasarkan durasi penyewaan dan harga PlayStation. Jika booking berhasil, status PlayStation akan berubah menjadi **Disewa**.

[ss output booking berhasil]

Setelah itu, sistem akan menampilkan struk rental yang berisi informasi transaksi dan total pembayaran.

[ss output struk rental ps]

### 2.4 Lihat Transaksi

Pada menu **Lihat Transaksi**, pengguna dapat melihat data transaksi yang telah dilakukan.

[ss output lihat transaksi]

### 2.5 Kelola PlayStation

Menu **Kelola PlayStation** digunakan untuk mengelola data PlayStation. Menu ini memiliki beberapa pilihan, yaitu tambah, lihat, ubah, dan hapus data PlayStation.

[ss menu kelola playstation]

#### Tambah PlayStation

Pengguna dapat menambahkan PlayStation baru dengan memasukkan ID dan memilih jenis PlayStation.

[ss output tambah ps]

#### Ubah PlayStation

Pengguna dapat mengubah data PlayStation berdasarkan ID yang dipilih.

[ss output ubah ps]

#### Hapus PlayStation

Pengguna dapat menghapus data PlayStation berdasarkan ID yang dipilih.

[ss output hapus ps]

### 2.6 Selesai Sewa

Setelah penyewaan selesai, pengguna dapat memilih menu **Selesai Sewa**. Sistem akan mengubah status PlayStation dari **Disewa** menjadi **Tersedia** sehingga PlayStation dapat digunakan untuk penyewaan berikutnya.

[ss output selesai sewa]

### 2.7 Keluar

Pengguna dapat memilih menu **Keluar** untuk menghentikan program.

[ss output keluar program]

---

## 3. Cara Kerja Sistem

Secara umum, cara kerja sistem adalah sebagai berikut:

1. Program dijalankan dan menampilkan menu utama.
2. Pengguna memilih menu yang tersedia.
3. Pengguna dapat melihat atau mengelola data PlayStation.
4. Untuk melakukan penyewaan, pengguna memilih PlayStation yang tersedia.
5. Pengguna memasukkan data pelanggan dan data transaksi.
6. Sistem menghitung total pembayaran berdasarkan durasi dan harga PlayStation.
7. Status PlayStation berubah menjadi **Disewa**.
8. Sistem menampilkan data transaksi dan struk rental.
9. Setelah penyewaan selesai, pengguna memilih menu **Selesai Sewa**.
10. Status PlayStation kembali menjadi **Tersedia**.
11. Program akan terus berjalan sampai pengguna memilih menu **Keluar**.

---

## 4. Konsep PBO yang Digunakan

### 4.1 Inheritance

Inheritance diterapkan pada class `PS4` dan `PS5` yang merupakan turunan dari class `PlayStation`.

### 4.2 Polymorphism

Polymorphism diterapkan melalui method `getHargaPerJam()` yang dioverride pada class `PS4` dan `PS5`. Dengan demikian, harga sewa dapat berbeda sesuai dengan jenis PlayStation.

### 4.3 Method Overloading

Method overloading diterapkan pada class `Transaksi` melalui method `tampilkanData()`. Method tersebut memiliki dua bentuk, yaitu tanpa parameter dan dengan parameter judul.

### 4.4 Conditional

Program menggunakan `if`, `else if`, dan `else` untuk menentukan pilihan menu, melakukan validasi data, serta mengecek kondisi PlayStation.

### 4.5 Looping

Program menggunakan perulangan untuk menampilkan data, mencari data berdasarkan ID, melakukan validasi input, dan menjaga program agar terus berjalan sampai pengguna memilih keluar.

---

## 5. Fitur Program

* Melihat daftar PlayStation
* Booking PlayStation
* Melihat transaksi
* Menambah data PlayStation
* Mengubah data PlayStation
* Menghapus data PlayStation
* Validasi ID agar tidak duplikat
* Mengubah status PlayStation saat disewa
* Menyelesaikan penyewaan
* Menampilkan struk rental
* Menghitung total pembayaran berdasarkan durasi dan harga PlayStation
