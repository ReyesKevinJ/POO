/**
 * La clase Punto representa un punto en el plano cartesiano bidimensional.
 * Posee dos coordenadas: X (abscisa) e Y (ordenada).
 * 
 * Permite inicializar el punto en el origen o en una posicion especifica, asi como métodos para desplazar el punto, 
 * obtener sus coordenadas en formato texto y mostrar sus valores.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */

public class Punto {
    //Atributos
    private double x;
    private double y;
    
    /**
     * Constructor por defecto. 
     * Inicializa el punto en el origen (0,0).
     */
    public Punto () {
        this.setX(0);
        this.setY(0);
    }
    
     /**
     * Constructor con parametros. 
     * Inicializa el punto en las coordenadas especificadas.
     * 
     * @param x Abscisa
     * @param y Ordenada
     */
    public Punto (double p_x, double p_y) {
        this.setX(p_x);
        this.setY(p_y);
    }
    
    //Setters
    private void setX(double p_x) {
        this.x = p_x;
    }
    private void setY(double p_y) {
        this.y = p_y;
    }
    
    //Getters
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    
    //Metodos de comportamiento
    /**
     * Desplaza el punto a una nueva posicion sumando
     * los valores dx y dy a las coordenadas actuales.
     * 
     * @param dx desplazamiento en X
     * @param dy desplazamiento en Y
     */
    public void desplazar(double p_dx, double p_dy) {
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    /**
     * Muestra en consola la representación del punto.
     * Formato: Punto. X: valor, Y: valor
     */
    public void mostrar() {
        System.out.println("Punto. X: " + this.getX() + ", Y: " + this.getY());
    }
    
    /**
     * Retorna una cadena con las coordenadas en formato (x, y).
     * 
     * @return coordenadas como texto
     */
    public String coordenadas() {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
    
    public double distanciaA(Punto p_ptoDistante){
        double x1 = this.getX();
        double y1 = this.getY();
        double x2 = p_ptoDistante.getX();
        double y2 = p_ptoDistante.getY();
        return Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
    }
}