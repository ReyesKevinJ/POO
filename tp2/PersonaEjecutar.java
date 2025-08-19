
/**
 * Write a description of class PersonaEjecutar here.
 * 
 * @author (Reyes Kevin) 
 * @version (2025-08-11)
 */
public class PersonaEjecutar
{
    public static void main(String args[]){
        Persona nuevaPersona=new Persona(45939556,"Kevin","Reyes",2004);
        nuevaPersona.mostrar();
        String apellidoNombre = nuevaPersona.apeYNom();
        System.out.println("Apellido y Nombre: "+apellidoNombre);
        
        Persona nuevaPersona2 = new Persona(42790791, "Cesia", "Torres", 2000);
        nuevaPersona2.mostrar();
        apellidoNombre= nuevaPersona2.apeYNom();
        System.out.println("Apellido y Nombre: "+apellidoNombre);
    }
    
}