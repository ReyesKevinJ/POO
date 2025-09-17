
/**
 * Write a description of class Ciculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo
{
    private double radio;
    private Punto centro;
    
    public Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    public Circulo(){
        Punto p_punto = new Punto();
        this.setRadio(0.0);
        this.setCentro(p_punto);
    }
    
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    private void setCentro(Punto p_punto){
        this.centro = p_punto;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public Punto getCentro(){
        return this.centro;
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx,p_dy);
    }
    
    public double perimetro(){
        return Math.PI*2*this.getRadio();
    }
    
    public double superficie(){
        return Math.PI*(Math.pow(this.getRadio(),2));
    }
    
    public double distanciaA(Circulo otroCirculo){
        Punto centro = this.getCentro();
        Punto centro2 = otroCirculo.getCentro();
        return centro.distanciaA(centro2);
    }
    
    public Circulo elMayor(Circulo otroCirculo){
        double superficie1 = this.superficie();
        double superficie2 = otroCirculo.superficie();
        return (superficie1>superficie2)? this : otroCirculo;
    }
    
    public void caracteristicas(){
        System.out.println("Centro: "+this.getCentro().coordenadas()+"\t-Radio: "+this.getRadio());
        System.out.println("Superficie: "+this.superficie()+" - Perimetro: "+this.perimetro());
    }
}