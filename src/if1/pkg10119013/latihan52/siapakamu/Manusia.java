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
public class Manusia {
    protected String nama;
    protected int umur;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public void siapaKamu(){
        System.out.println("Saya manusia");
    }
}
