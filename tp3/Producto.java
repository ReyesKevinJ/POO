
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto
{
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, 
                int p_existMinima, Laboratorio p_laboratorio){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_laboratorio);
        this.setStock(0);
    }
    
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_laboratorio){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setLaboratorio(p_laboratorio);
        this.setStock(0);
    }
    
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }
    
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    
    private void setLaboratorio(Laboratorio p_laboratorio){
        this.laboratorio = p_laboratorio;
    }
    
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public int getExistMinima(){
        return this.existMinima;
    }
    
    public int getStock(){
        return this.stock;
    }
    
    public String getRubro(){
        return this.rubro;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public double getCosto(){
        return this.costo;
    }
    
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    
    public Laboratorio getLaboratorio(){
        return this.laboratorio;
    }
    
    public void ajuste(int p_cantidad){
        this.setStock(p_cantidad);
    }
    
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
    }
    
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
    
    public double precioLista(){
        return this.getCosto() +(this.getCosto()*0.12);
    }
    
    public double precioContado(){
        return this.precioLista() - (this.precioLista()*0.05);
    }
    
    public double stockValorizado(){
        double stockPrecio = this.getCosto()*(double)this.getStock();
        return stockPrecio +(stockPrecio * 0.12);
    }
    
    public String mostrarLinea(){
        return this.getDescripcion()+"\t"+this.precioLista()+"\t"+this.precioContado();
    }
    
    public void mostrar(){
        this.getLaboratorio().mostrar();
        System.out.println("Rubro: "+ this.getRubro());
        System.out.println("Descripcion: "+ this.getDescripcion());
        System.out.println("Precio Costo: "+ this.getCosto());
        System.out.println("Stock: "+this.getStock()+" - Stock Valorizado: $"+this.stockValorizado());
    }
}