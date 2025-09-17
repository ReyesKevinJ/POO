
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo
{
    private Punto origen;
    private double ancho;
    private double alto;
    
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    public Rectangulo(double p_ancho, double p_alto){
        Punto p_origen = new Punto();
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
        this.setOrigen(p_origen);
    }
    
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    
    public Punto getOrigen(){
        return this.origen;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    public double getAlto(){
        return this.alto;
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    
    public double distanciaA(Rectangulo otroRectangulo){
        Punto centro = this.getOrigen();
        Punto centro2 = otroRectangulo.getOrigen();
        return centro.distanciaA(centro2);
    }
    
    public double perimetro(){
        return 2*(this.getAncho()+ this.getAlto());
    }
    
    public double superficie(){
         return this.getAncho()*this.getAlto();   
    }
    
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        double superficie1 = this.superficie();
        double superficie2 = otroRectangulo.superficie();
        return (superficie1>superficie2)? this : otroRectangulo;
    }
    
    public void caracteristicas(){
        System.out.println("Origen: "+this.getOrigen().coordenadas()+"-Alto: "+this.getAlto()+"-Ancho: "+this.getAncho());
        System.out.println("Superficie: "+this.superficie()+" - Perimetro: "+this.perimetro());
    }
}