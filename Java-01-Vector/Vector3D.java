
/**
 * Write a description of class Vector3D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vector3D
{
    /**
     * inisiasi awal
     */
    double x, y, z;
    
    /**
     * Constructor
     */
    public Vector3D (double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    
    /**
     * membuat getter
     */
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
}
