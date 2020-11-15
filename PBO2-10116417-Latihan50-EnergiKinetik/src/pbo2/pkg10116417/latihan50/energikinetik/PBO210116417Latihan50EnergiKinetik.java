/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan50.energikinetik;

/**
 *
 * @author 
 *  NAMA        : GILANG PANJI WANENG PATI
 *  KELAS       : PBO2
 *  NIM         : 10116417
 *  DESKRIPSI   : BERISI TENTANG PROGRAM MENAMPILKAN PERHITUNGAN ENERGI KINETIK DALAM KEADAAN BERGERAK DAN KEADAAN DIAM
 * 
 */
public class PBO210116417Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Energi objE = new Energi();
        /*rubah gram ke kilogram dengan cara 145 gram dibgai dengan 1000
        menghasilkan nilai 0.145 kilogram*/
        objE.setMassa(0.145);
        objE.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan massa 145 g dilempar "
                + "dengan kecepatan 25 m/s");
        System.out.println("a. Berapakah Energi Kinetiknya ?");
        System.out.println("b. Berapakah usaha yang dilakukan pada bola untuk "
                + "mencapai kecepatan ini jika dimulai dari keadaan diam ?");
        System.out.println("");
        System.out.println("=====JAWABAN=====");
        System.out.println("a. Energi Kinetiknya Adalah "+objE.hitungEnergiKinetik()+" Joule");
        System.out.println("b. Usahanya adalah "+objE.hitungUsaha()+" Joule");
        System.out.println("");
        System.out.println("Jadi energi kinetik dan usahanya bernilai sama yaitu "
                + "sebesar 45.3125 Joule");
    }
    
}
