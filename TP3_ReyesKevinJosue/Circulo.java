
/**
 * La clase Circulo representa un circulo en el plano cartesiano.
 * Se define por un centro y un radio.
 * 
 * Ofrece metodos para acceder y modificar sus atributos, asi como
 * para calcular propiedades geométricas como superficie y perimetro
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Circulo {
  //Atributos
  private double radio;
  private Punto centro;
  
  /**
   * Constructor con radio 0 y centro en (0,0).
   */
  public Circulo () {
    Punto punto = new Punto();
    this.setRadio(0);
    this.setCentro(punto);
  }
  
  /**
   * Constructor con centro y radio pasados por parametros.
   * 
   * @param p_radio radio que tendrá el circulo
   * @param p_centro centro que tendrá el del circulo
   */
  public Circulo (double p_radio, Punto p_centro) {
    this.setRadio(p_radio);
    this.setCentro(p_centro);
  }
  
  //Setters
  /**
   * Asigna p_centro al centro del circulo.
   * @param p_centro punto que será asignado como centro.
   */
  private void setCentro (Punto p_centro) {
    this.centro = p_centro;
  }
  
  /**
   * Asigna p_radio al radio del circulo.
   * @param double p_radio
   */
  private void setRadio(double p_radio) {
    this.radio = p_radio;
  }
  
  //Getters
  /**
   * Devuelve el centro del circulo.
   * @return centro como Punto.
   */
  public Punto getCentro() {
    return this.centro;
  }
  
  /**
   * Devuelve el radio del circulo
   * @return radio como double.
   */
  public double getRadio () {
    return this.radio;
  }
  
  //Metodos de comportamiento
  /**
   * Desplaza el circulo moviendo su centro.
   * 
   * @param p_dx desplazamiento en X
   * @param p_dy desplazamiento en Y
   */
  public void desplazar (double p_dx, double p_dy) {
    this.getCentro().desplazar(p_dx, p_dy);
  }
  
  /**
   * Muestra por pantalla las caracteristicas del circulo.
   */
  public void caracteristicas() {
    System.out.println("****** Circulo ******");
    System.out.printf("Centro: %s - Radio: %.2f%n", this.getCentro().coordenadas(), this.getRadio());
    System.out.printf("Superficie: %.2f - Perimetro: %.2f%n", this.superficie(), this.perimetro());
  }
    
   /**
   * Calcula y devuelve el primetro (circunferencia) del circulo.
   * 
   * @return perimetro
   */
  public double perimetro() {
    return 2 * Math.PI * this.getRadio();
  }
  
  /**
   * Calcula y devuelve la superficie del circulo.
   * 
   * @return superficie
   */
  public double superficie() {
    return Math.PI * Math.pow (this.getRadio(), 2);
  }
  
  /**
   * Devuelve la distancia entre los centros de dos circulos.
   * 
   * @param otroCirculo el otro circulo con el cual medir distancia
   * @return distancia entre centros
   */
  public double distanciaA (Circulo otroCirculo) {
    return this.getCentro().distanciaA(otroCirculo.getCentro());
  }
  
  /**
   * Devuelve el circulo con mayor superficie (si son iguales, devuelve this).
   * 
   * @param otroCirculo el otro circulo
   * @return el circulo de mayor superficie
   */
  public Circulo elMayor (Circulo otroCirculo) {
      if(this.superficie() >= otroCirculo.superficie()) {
          return this;
      }
      else {
          return otroCirculo;
      }
  }
}