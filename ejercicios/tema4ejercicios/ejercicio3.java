/**
* Dia de la semana y resultado la clase a primera
*
* @author Isaias Montiel
*/

public class ejercicio3 {
  public static void main(String[] args) {
    
    System.out.println("¿Introduce un numero del 1-7 para saber que dia respectivo tiene ");
    
    String dia = System.console().readLine().toLowerCase();
        
    switch(dia) {
        case "1":
        System.out.println("Lunes");
        break;
        
        case "2":
        System.out.println("Martes");
        break;
        
        case "3":
        System.out.println("Miercoles");
        break;
        
        case "4":
        System.out.println("Jueves");
        break;
        
        case "5":
        System.out.println("viernes");
        break;
        
        case "6": 
        System.out.println("sabado");
        break;
        
        case "7": 
        System.out.println("Domingo");
        break;
        }
        
    }
   }
