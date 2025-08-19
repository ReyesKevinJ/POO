
/**
 * Write a description of class LaboratorioEjecutar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaboratorioEjecutar
{
    public static void main(String args[]){
        Laboratorio Laboratorio1 = new Laboratorio("Laboratorio n1","Salta 3000","37411111",200,23);
        System.out.println(Laboratorio1.mostrar());
        Laboratorio Laboratorio2 = new Laboratorio("Laboratorio n2","Bolivar 3060","37421211");
        System.out.println(Laboratorio2.mostrar());
        Laboratorio2.nuevaCompraMinima(240);
        Laboratorio2.nuevoDiaEntrega(25);
        System.out.println("Valores agregados");
    }
}