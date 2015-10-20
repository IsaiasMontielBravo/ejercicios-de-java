/**. 
 * 
Puntuación entre 0 y 10:
¡Enhorabuena! tu pareja parece ser totalmente fiel.

Puntuación entre 11 y 22:
Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.

Puntuación entre 22 y 30
Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.
*
*
*
*
*/

public class ejercicio16 {

  public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("Test de infidelidad de tu pareja, Responde con si o no ");
    
    System.out.println("1. ¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.?");
    System.out.print("=> ");
    respuesta = (System.console().readLine()).toLowerCase();  
    if (respuesta.equals("si")) {
      puntos += 3;
    }

    System.out.println("2. ¿Ha aumentado sus gastos de vestuario");
    System.out.print("=> ");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("si")) {
     puntos += 3;
    }

    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    System.out.print("=> ");
    respuesta = (System.console().readLine()).toLowerCase(); 
    if (respuesta.equals("si")) {
      puntos += 3;
    }
    
    System.out.println("4. ¿Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?");
    System.out.print("=> ");
    respuesta = (System.console().readLine()).toLowerCase();  
    if (respuesta.equals("si")) {
      puntos += 3;
    }
    
    System.out.println("5. ¿No te deja que mires la agenda de su teléfono móvil?");
    System.out.print("=> ");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("si")) {
      puntos += 3;
    }
    
    System.out.println("6. ¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");
    System.out.print("=> ");
    respuesta = (System.console().readLine()).toLowerCase(); 
    if (respuesta.equals("si")) {
      puntos += 3;
    }
    
    System.out.println("7. ¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");
    System.out.print("=> ");
    respuesta = (System.console().readLine()).toLowerCase(); 
    if (respuesta.equals("si")) {
      puntos += 3;
    }
    
     System.out.println("8. ¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");
     System.out.print("=> ");
     respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("si")) {
      puntos += 3;
    }
    
    System.out.println("9. ¿Has notado que últimamente se perfuma más?");
    System.out.print("=> ");
    respuesta = (System.console().readLine()).toLowerCase();
    if (respuesta.equals("si")) {
      puntos += 3;
    }
    
    System.out.println("10. ¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
    System.out.print("=> ");
    respuesta = (System.console().readLine()).toLowerCase();  
    if (respuesta.equals("si")) {
     puntos += 3;
    }
    
    System.out.println("\nHa obtenido " + puntos + " puntos.");
  
    if (puntos <= 10){
        System.out.println("Enhorabuena tu pareja te es fiel");
        
    }
  
    if ((puntos > 10) && (puntos <= 22)){
        System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        
    }
    if ((puntos > 22) && (puntos <= 30)){
        System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        
    }
  }
}

