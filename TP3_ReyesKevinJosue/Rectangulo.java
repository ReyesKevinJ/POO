
/**
 * La clase Rectangulo representa un rectángulo definido por:
 * un origen (esquina inferior izquierda) como objeto Punto, un ancho y un alto.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Rectangulo {
  //Atributos
  private Punto origen;
  private double ancho;
  private double alto;
    
  /**
   * Constructor con origen, ancho y alto pasados por parametros.
   * 
   * @param p_origen Punto que representa el origen del rectangulo
   * @param p_ancho ancho del rectangulo
   * @param p_alto alto del rectangulo
   */
  Rectangulo (Punto p_origen, double p_ancho, double p_alto) {
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
  }
    
  /**
   * Constructor con origen (0,0), ancho y alto pasados por parametro.
   * 
   * @param p_ancho ancho del rectangulo
   * @param p_alto alto del rectangulo
   */
  Rectangulo (double p_ancho, double p_alto) {
    Punto punto = new Punto();
    //this.setOrigen(new Punto());
    this.setOrigen(punto);
    this.setAncho(p_ancho);
    this.setAlto(p_alto);       
  }
  
  //Setters
  /**
   * Asigna p_origen como nuevo punto de origen del rectangulo.
   * 
   * @param p_origen objeto de tipo Punto
   */
  private void setOrigen(Punto p_origen) {
      this.origen = p_origen;
  }
  
  /**
   * Asigna p_ancho como nuevo ancho del rectangulo.
   * 
   * @param p_ancho ancho de tipo double
   */
  private void setAncho(double p_ancho) {
      this.ancho = p_ancho;
  }
  
  /**
   * Asigna p_alto como nuevo alto del rectangulo.
   * 
   * @param p_alto alto de tipo double
   */
  private void setAlto(double p_alto) {
      this.alto = p_alto;
  }
  
  //Getters
  /**
   * Devuelve el origen del rectangulo.
   * 
   * @return un objeto de tipo Punto
   */
  public Punto getOrigen() {
      return this.origen;
  }
  
  /**
   * Devuelve el ancho del rectangulo.
   * 
   * @return un valor de tipo double
   */
  public double getAncho() {
      return this.ancho;
  }
  
  /**
   * Devuelve el alto del rectangulo.
   * 
   * @return un valor de tipo double
   */
  public double getAlto() {
      return this.alto;
  }
  
  //Metodos de comportamiento
  /**
   * Desplaza el rectangulo en el plano sin cambiar sus dimensiones.
   * 
   * @param p_dx desplazamiento en el eje X
   * @param p_dy desplazamiento en el eje Y
   */
  public void desplazar(double p_dx, double p_dy) {
      this.getOrigen().desplazar(p_dx, p_dy);
  }
  
  /**
   * Calcula y devuelve el perimetro del rectangulo.
   * 
   * @return un valor tipo double
   */
  public double perimetro() {
      return 2 * (this.getAncho() + this.getAlto());
  }
  
  /**
   * Calcula y devuelve la superficie del rectangulo.
   * 
   * @return un valor tipo double
   */
  public double superficie() {
      return this.getAncho() * this.getAlto();
  }
  
  /**
   * Muestra por pantalla las caracteristicas del rectangulo.
   */
  public void caracteristicas() {
      System.out.println("****** Rectangulo ******");
      System.out.printf("Origen: %s - Alto: %.2f - Ancho: %.2f", 
                        this.getOrigen().coordenadas(), this.getAlto(), this.getAncho());
      System.out.printf("\nSuperficie: %.2f - Perimetro: %.2f", 
                        this.superficie(), this.perimetro());
  }
  
  /**
   * Calcula y devuelve la distancia entre los origenes dos rectangulos.
   * 
   * @param otroRectangulo otro rectangulo a comparar
   * @return un valor de tipo double
   */
  public double distanciaA(Rectangulo otroRectangulo) {
      return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
  }
  
  /**
   * Determina y devuelve el rectangulo de mayor superficie.
   * 
   * @param otroRectangulo otro rectangulo a comparar
   * @return un objeto de tipo Rectangulo
   */
  public Rectangulo elMayor(Rectangulo otroRectangulo) {
      if(this.superficie() >= otroRectangulo.superficie()) {
          return this;
      }
      else {
          return otroRectangulo;
      }
  }
}