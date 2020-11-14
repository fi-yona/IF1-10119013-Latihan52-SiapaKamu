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
public class Dosen extends Manusia{
    
    private String nip;
    private String mataKuliah;
    
    public String getNip(){
        return nip;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getMataKuliah(){
        return mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya " + nama + " umur " + umur + " mengajar " + mataKuliah);
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya dosen");
    }
}
