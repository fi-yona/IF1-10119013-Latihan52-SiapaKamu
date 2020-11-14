/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan52.siapakamu;

/**
 *
 * @author Fiona Avila
 */


public class Main extends Manusia{

    public static void main(String[] args) {
        Manusia oo1 = new Manusia();
        
        Dosen oo2 = new Dosen();
        oo2.setNip("41227829930");
        oo2.setNama("Rizki Adam Kurniawan");
        oo2.setUmur(27);
        oo2.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : " + oo2.getNip());
        oo2.siapaKamu();
        oo2.mengajarApa();
        
        System.out.println();
        
        Mahasiswa oo3 = new Mahasiswa();
        oo3.setNim("10119013");
        oo3.setNama("Fiona Avila Putri");
        oo3.setUmur(19);
        oo3.setKelas("PBO");
        System.out.println("NIM MAHASISWA : " + oo3.getNim());
        oo3.siapaKamu();
        oo3.kelasApa();
        
        System.out.println();
        System.out.println("by. Fiona Avila");
        }
}
