import java.util.ArrayList;
import java.math.BigInteger;

/**
 * Write a description of class DaftarTransaksi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DaftarTransaksi
{
    public DaftarTransaksi(){
        daftar = new ArrayList<Transaksi>();
        
        this.saldoAkhir = new BigInteger("0");
    }
    
    public void tambah(Transaksi baru){
        daftar.add(baru);
    }
    
    public int banyakTransaksi(){
        return daftar.size();
    }
    
    public BigInteger saldoAkhir(){
        return saldoAkhir;
    }
    
    public String saldoAkhirStr(){
        return saldoAkhir.toString();
    }
    
    public void tampilkan(){
      System.out.println(daftar.size());
        
        for (int a=0; a < daftar.size(); ++a)
        System.out.println(daftar.get(a).toString());
        System.out.println();
    
    }
    
    private ArrayList<Transaksi> daftar;
    private BigInteger saldoAkhir;
    
    public static void main(String[] args) {
        DaftarTransaksi contoh = new DaftarTransaksi();
        contoh.tampilkan();
    }
}
