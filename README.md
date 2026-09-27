# Sistem Rental PS

Nama: Zian Alrais

NIM : 2509116064

## 1. Deskripsi Proyek

Sistem Rental PS merupakan program berbasis Java yang digunakan untuk mengelola proses penyewaan PlayStation. Program ini dapat digunakan untuk melihat daftar PlayStation, melakukan booking, melihat transaksi, mengelola data PlayStation, serta menyelesaikan penyewaan.

Program dibuat dengan menerapkan konsep dasar Pemrograman Berorientasi Objek (PBO), seperti **Inheritance, Polymorphism, Method Overloading, Conditional, dan Looping**.

Class yang digunakan dalam program ini yaitu `PlayStation`, `PS4`, `PS5`, `Pelanggan`, `Transaksi`, dan `Main`.

---

## 2. Alur Program

### 2.1 Menu Utama

Saat program dijalankan, sistem akan menampilkan menu utama yang terdiri dari beberapa pilihan.

<img width="303" height="208" alt="image" src="https://github.com/user-attachments/assets/9a568f57-8c7a-4b3c-8424-b87d35de834a" />

Pengguna dapat memilih menu dengan memasukkan nomor sesuai dengan pilihan yang tersedia.

### 2.2 Lihat PlayStation

Pada menu **Lihat PlayStation**, sistem akan menampilkan daftar PlayStation yang tersedia beserta ID, jenis PS, status, dan harga sewa per jam.

<img width="294" height="374" alt="image" src="https://github.com/user-attachments/assets/15bf6d48-39a8-4288-8cf3-8224e10498a1" />

### 2.3 Booking PS

Untuk melakukan penyewaan, pengguna memilih menu **Booking PS**. Sistem akan menampilkan daftar PlayStation dan pengguna memasukkan ID PlayStation yang ingin disewa.

<img width="296" height="534" alt="image" src="https://github.com/user-attachments/assets/9d17b513-7689-4edc-bc80-df93c6649c45" />

Setelah memilih PlayStation, pengguna memasukkan data pelanggan berupa ID pelanggan, nama, dan nomor HP. Selanjutnya pengguna memasukkan ID transaksi dan durasi penyewaan. Sistem akan menghitung total pembayaran berdasarkan durasi penyewaan dan harga PlayStation. Jika booking berhasil, status PlayStation akan berubah menjadi **Disewa**.

<img width="299" height="56" alt="image" src="https://github.com/user-attachments/assets/c0187c76-d9eb-467f-abf9-704c05694300" />

Setelah itu, sistem akan menampilkan struk rental yang berisi informasi transaksi dan total pembayaran.

<img width="297" height="184" alt="image" src="https://github.com/user-attachments/assets/6aa62daa-a06f-44c9-9f6b-527b11abe06e" />

### 2.4 Lihat Transaksi

Pada menu **Lihat Transaksi**, pengguna dapat melihat data transaksi yang telah dilakukan.

<img width="290" height="99" alt="image" src="https://github.com/user-attachments/assets/91cdfe04-870e-4afb-b7e4-8aa57e31f30f" />

### 2.5 Kelola PlayStation

Menu **Kelola PlayStation** digunakan untuk mengelola data PlayStation. Menu ini memiliki beberapa pilihan, yaitu tambah, lihat, ubah, dan hapus data PlayStation.

<img width="294" height="184" alt="image" src="https://github.com/user-attachments/assets/4b6e43c4-5e10-45c4-8023-845fabb1ad9d" />

#### Tambah PlayStation

Pengguna dapat menambahkan PlayStation baru dengan memasukkan ID dan memilih jenis PlayStation.

<img width="299" height="188" alt="image" src="https://github.com/user-attachments/assets/b9f74b08-0373-44b6-9d4e-b28b5eb34613" />

#### Ubah PlayStation

Pengguna dapat mengubah data PlayStation berdasarkan ID yang dipilih.

<img width="293" height="248" alt="image" src="https://github.com/user-attachments/assets/6c021346-e28f-4f43-b877-53bf69ced669" />

#### Hapus PlayStation

Pengguna dapat menghapus data PlayStation berdasarkan ID yang dipilih.

<img width="295" height="110" alt="image" src="https://github.com/user-attachments/assets/4c31809e-251a-4453-9488-eaec186eb4f4" />

### 2.6 Selesai Sewa

Setelah penyewaan selesai, pengguna dapat memilih menu **Selesai Sewa**. Sistem akan mengubah status PlayStation dari **Disewa** menjadi **Tersedia** sehingga PlayStation dapat digunakan untuk penyewaan berikutnya.

<img width="302" height="131" alt="image" src="https://github.com/user-attachments/assets/67ec3dab-c55a-454f-a735-86d8a0005b15" />

### 2.7 Keluar

Pengguna dapat memilih menu **Keluar** untuk menghentikan program.

<img width="376" height="274" alt="image" src="https://github.com/user-attachments/assets/5e7e4cb0-c180-4002-92ea-58087df5790b" />

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
