import java.util.Scanner;
/**
 * La clase Producto representa un producto comercializado por una drogueria.
 * Un producto tiene asociado un laboratorio, un costo, rubro, 
 * stock y otros datos relacionados a su reposición.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Producto {
  private static int contadorProductos = 0; //variable de clase
  
  //Atributos
  private int codigo;
  private String rubro;
  private String descripcion;
  private double costo;
  private int stock;
  private double porcPtoRepo;
  private int existMinima;
  private Laboratorio laboratorio;
    
  /**
     * Constructor completo.
     * El stock siempre se inicializa en 0 al dar de alta un producto.
     * 
     * @param p_codigo codigo identificador del producto
     * @param p_rubro rubro del producto
     * @param p_descripcion descripción del producto
     * @param p_costo precio de costo del producto
     * @param p_porcPtoRepo porcentaje de punto de reposición
     * @param p_existMinima existencia minima del producto
     * @param p_laboratorio laboratorio asociado al producto
     */
  public Producto (int p_codigo, String p_rubro, String p_descripcion,
                    double p_costo, double p_porcPtoRepo,
                    int p_existMinima, Laboratorio p_laboratorio) {
    this.setCodigo(p_codigo);
    this.setRubro(p_rubro);
    this.setDescripcion(p_descripcion);
    this.setCosto(p_costo);
    this.setPorcPtoRepo(p_porcPtoRepo);
    this.setExistMinima(p_existMinima);
    this.setLaboratorio(p_laboratorio);
    this.setStock(0); //Se inicializa en 0
  }
  
  /**
    * Constructor parcial.
    * El stock siempre se inicializa en 0 al dar de alta un producto.
    * Se cargan los datos escenciales y luego si es necesario se ajusta ajustarPtoRepo() y ajustarExistMin() con setters.
    */
  public Producto (int p_codigo, String p_rubro, String p_descripcion,
                    double p_costo, Laboratorio p_laboratorio) {
    this.setCodigo(p_codigo);
    this.setRubro(p_rubro);
    this.setDescripcion(p_descripcion);
    this.setCosto(p_costo); 
    this.setLaboratorio(p_laboratorio);
    this.setStock(0); //Se inicializa en 0
  }
  
  //Setters
  public void setCodigo(int p_codigo) {
    this.codigo = p_codigo;
  }
  public void setRubro(String p_rubro) {
    this.rubro = p_rubro;
  }
  public void setDescripcion(String p_descripcion) {
    this.descripcion = p_descripcion;
  }
  public void setCosto(double p_costo) {
    this.costo = p_costo;
  }
  public void setStock(int p_stock) {
    this.stock = p_stock;
  }
  public void setPorcPtoRepo(double p_porcPtoRepo) {
    this.porcPtoRepo = p_porcPtoRepo;
  }
  public void setExistMinima(int p_existMinima) {
    this.existMinima = p_existMinima;
  }
  public void setLaboratorio(Laboratorio p_laboratorio) {
    this.laboratorio = p_laboratorio;
  }
  
  //Getters
  public int getCodigo() {
    return this.codigo;
  }
  public String getRubro() {
    return this.rubro;
  }
  public String getDescripcion() {
    return this.descripcion;
  }
  public double getCosto() {
    return this.costo;
  }
  public int getStock() {
    return this.stock;
  }
  public double getPorcPtoRepo() {
    return this.porcPtoRepo;
  }
  public int getExistMinima() {
    return this.existMinima;
  }
  public Laboratorio getLaboratorio() {
    return this.laboratorio;
  }
  
  //Metodos de comportamiento
  /**
    * Muestra los datos completos del producto y su laboratorio
    */
  public void mostrar() {
    System.out.println(this.getLaboratorio().mostrar());
    System.out.println("Rubro: " + this.getRubro() + "\n" + "Descripcion: " +
                       this.getDescripcion() + "\n" + "Precio Costo: " +
                       this.getCosto() + "\n" + "Stock: " + this.getStock() +
                       " - " + "Stock Valorizado: $" + stockValorizado());
  }
  
  /**
     * Ajusta el stock sumando o restando la cantidad indicada
     * 
     * @param p_cantidad cantidad a modificar (positiva para aumentar, negativa para disminuir)
     */
  public void ajuste (int p_cantidad) {
    this.setStock(getStock() + p_cantidad); //Si p_cantidad es negativa, automaticamente resta stock
  }
  
  /**
     * Calcula el valor total del stock, incluyendo una rentabilidad del 12%
     * 
     * @return valor del stock valorizado
     */
  public double stockValorizado() {
      double costoTotal = this.getStock() * this.getCosto();
      return costoTotal + (costoTotal * 0.12);
  }
  
  /**
     * Calcula el precio de lista (costo + 12%)
     * 
     * @return precio de lista
     */
  public double precioLista() {
      return this.getCosto() + (this.getCosto() * 0.12);
  }
  
  /**
     * Calcula el precio al contado (precio lista - 5%)
     * 
     * @return precio de contado
     */
  public double precioContado() {
      return precioLista() - (precioLista() * 0.05);
  }
  
  /**
     * Devuelve una linea con descripcion, precio de lista y precio contado
     * 
     * @return String con la informacion en formato: "Descripcion   PrecioLista   PrecioContado"
     */
  public String mostrarLinea() {
      return this.getDescripcion() + "\t $" + precioLista() +  "\t $" + precioContado();
  }
  
  /**
     * Ajusta el porcentaje de punto de reposición del producto
     * 
     * @param p_porce nuevo porcentaje
     */
  public void ajustarPtoRepo (double p_porce) {
      this.setPorcPtoRepo(p_porce);
  }
  
  /**
     * Ajusta la existencia minima del producto
     * 
     * @param p_cantidad nueva cantidad minima
     */
  public void ajustarExistMin(int p_cantidad) {
      this.setExistMinima(p_cantidad);
  }
}