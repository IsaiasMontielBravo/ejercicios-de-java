/** Muestra la tabla de multiplicar del numero introducido
*/

public class ejercicio8 {
	public static void main(String[] args) { 
	
	 
	 System.out.println("introduzca el numero");
	 int numero = Integer.parseInt(System.console().readLine());
	 
	 for (int i = 0; i <= 10; i++) {
		 System.out.println(numero + "x" + i + "=" + numero * i);
	 }
 }
}
	 
	 
 
 
 
