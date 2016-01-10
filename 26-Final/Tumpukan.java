import java.math.BigInteger;
/**
 * Write a description of class Tumpukan here.
 * 
 * referensi : http://stackoverflow.com/questions/3865590/does-the-singularly-linkedlist-give-output-in-lifo
 * http://introcs.cs.princeton.edu/java/43stack/Stack.java.html
 * Bahan Bacaan reading HEAD
 * hasil diskusi bersama team Kinket Kuena : (Fadhli, Fikar, Yussuf, Putra, dan Irfan)
 */
public class Tumpukan
{   
     
    private Node atas;
    private Node bawah;
    
    public Tumpukan(){
        atas=null;
        bawah=null;
    }
    
    public void tumpuk(BigInteger data){
        Node baru = new Node (data);
        baru.berikut = null;
        if(atas == null)
        {
            bawah = baru;
            atas = baru;
        }
        else{
            atas.berikut=baru;
            atas=baru;
        }
    }
    
    public BigInteger ambil(){
        if (atas==null){
        return null;
    }else{
        BigInteger ambil = atas.data;
        atas = atas.berikut;
        return ambil;
    }
    }
    
    public BigInteger atas(){
        if(atas==null)
        return null;
        else {
            return atas.data;
        }
    }
    
    public BigInteger bawah(){
        if(bawah!=null)
        return bawah.data;
        else{
            return null;
        }
    }
   
}
