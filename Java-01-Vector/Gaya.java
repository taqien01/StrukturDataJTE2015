
/**
 * Write a description of class Gaya here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gaya
{
    private Vector3D titikAcuan;
    private Vector3D arah;
    
    public Gaya(Vector3D titikAcuan, Vector3D arah){
        this.titikAcuan=titikAcuan;
        this.arah=arah;
        
    }

    Vector3D getTitikAcuan(){
        return titikAcuan;
    }
    Vector3D getArah(){
        return arah;
    }
}
