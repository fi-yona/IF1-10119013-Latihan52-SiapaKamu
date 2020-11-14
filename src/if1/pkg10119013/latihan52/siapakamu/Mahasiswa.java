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
public class Mahasiswa extends Manusia{
    
    private String nim;
    private String kelas;
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya " + nama + " umur " + umur + " sedang belajar di kelas " + kelas);
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya mahasiswa");
    }
}
