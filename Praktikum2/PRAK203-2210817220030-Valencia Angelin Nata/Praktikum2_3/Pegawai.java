package Praktikum2_3;

//Pada baris ini terjadi error karena public class memiliki nama yang berbeda dengan nama file (Pegawai)
//public class Employee {
public class Pegawai{
    public String nama;
    //Pada baris ini membuat error pada file main karena tipe data yang dimasukkan harusnya (String)
   // public char asal;
    public String asal;
    public String jabatan;
    //Baris ini belum memberi value pada variabel umur, harus diberi nilai agar menghasilkan output yang diinginkan perintah (17)
    //public int umur;
    public int umur = 17;
    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //Parameter setJabatan tidak ada isinya, pada class Soal3Main berisi parameter "Assasin"
    //public void setJabatan() {
    public void setJabatan(String jabatan) {
        //Baris ini error karena variabel yang dipanggil seharusnya adalah "jabatan" bukanlah j
    	//this.jabatan = j;
    	this.jabatan = jabatan;
    }
}
