/**. 
 * 

*
*
*
*
*/

public class Ejercicio12 {
    public static void main(String[] args) {

    System.out.println("introduzca el numero");
    int n = Integer.parseInt(System.console().readLine());

 
 
 int contador = 0;
 int num1 = 0;
 int num2 = 1;
 int aux;
    if (n == 1){
        System.out.print(num1);
    }else if(n >= 2) {
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        for (int i = 2; i < n; i++) {
            aux = num2;
            num2 = num1 + num2;
            num1 = aux;
            System.out.print(num2 + " ");
        }
    }
 
}
}
    
