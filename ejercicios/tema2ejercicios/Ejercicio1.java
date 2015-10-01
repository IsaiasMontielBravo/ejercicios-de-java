/**
 * Escribe un programa en el que se declaren las variables enteras x e y . Asignales los valores
144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable,
la suma, la resta, la división y la multiplicación.
 *
 * @author Isaias
 */
 
public class Ejercicio1 {
  public static void main(String[] args) {
    int x; // Se declara la variable x como entera
    int y; // se declara la variable Y como entera
    x = 144; // Se asigna el valor 144 a la variable x
    System.out.println("El valor actual de mi variable es " + x);

    y = 999; // Se asigna el valor 999 a la variable y
    System.out.println("y ahora es " + y);
  
    int sum = x + y;
    System.out.println("La suma de mis variables es " + sum);
    
    int mul = x * y;
    System.out.println("La multiplicación de mis variables es " + mul);
    
    int res = x - y;
    System.out.println("La resta de mis variables es " + res);  
    
    int div = x / y;
    System.out.println("la division de mis variables es" + div);
  }
}
