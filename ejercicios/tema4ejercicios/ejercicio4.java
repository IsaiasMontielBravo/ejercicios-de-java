/**Escribe un programa que calcule el salario semanal de un empleado en base a las horas
trabajadas, a razón de 12 euros la hora.
 *
 * @author Isaias
 */
 
 public class ejercicio4 { 
  public static void main(String[] args) {
  String linea;

    System.out.print("Horas trabajadas: ");
    linea = System.console().readLine();
    int HorasTrabajadas;
    HorasTrabajadas = Integer.parseInt( linea );
    
    int total;
    
  
    if (HorasTrabajadas <=40);
    total = (HorasTrabajadas * 12);
    
    if (HorasTrabajadas >40);
    total = (40 * 12) + ((HorasTrabajadas - 40)* 16);
    
    System.out.print("El dinero total es " + total);
    
    
 }
}
