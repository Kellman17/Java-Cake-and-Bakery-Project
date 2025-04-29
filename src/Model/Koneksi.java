package Model; // Dalam sebuah Package dengan nama Model

import java.sql.Connection; // Mengimport java.sql.Connection untuk koneksi ke Database
import java.sql.DriverManager; // Mengimport java.sql.DriveManager, nama koneksi pada Database
import java.sql.Statement; // Mengimport java.sql.Statement untuk menggunakan perintah SQL (Insert Update Delete) ke Database

public class Koneksi { // sebuah class public dengan nama Koneksi
    public Connection con; // Membuat sebuah variable con sebagai perwakilan dari interface Connection
    public Statement stm; // Membuat sebuah variable stm sebagai perwakilan dari interface Statement
    

    public void koneksi() { // Sebuah class publik bertipe void dengan nama Koneksi untuk membuat koneksi ke Database 
        try{ // Sebuah statement try
           String url ="jdbc:mysql://localhost/projectakhirpbo"; // url menghuubungkan netbeans dengan Database 
           String user="root"; // id user Database 
           String pass=""; // Password Database
           Class.forName("com.mysql.jdbc.Driver"); // Memanggil driver JDBC yang bertujuan untuk registrasi class driver
           con = DriverManager.getConnection(url, user, pass); // Membangun koneksi dengan Database
           stm = con.createStatement(); // Membuat objek statement untuk penerimaan statement SQL tanpa parameter
           System.out.println("koneksi berhasil;"); // Perintah output "Koneksi Berhasil" jika koneksi ke Database berhasil
       } catch (Exception e){ // Sebuah statement catch untuk menangkap error bernama Exception
           System.err.println("koneksi gagal" +e.getMessage()); // Perintah output berisi message error "Koneksi Gagal" jika koneksi ke Database gagal
    }
}
}

