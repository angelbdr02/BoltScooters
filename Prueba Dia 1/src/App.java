import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a la Primera Prueba del Curso!");
        System.out.println("Introduce un número para calcular la raiz digital:");
        int calculofinal = 0;
        int numero= 0;
        int suma= 0;
        numero=input.nextInt();
        String raiz = String.valueOf(numero);

        if (numero<=0) {
            System.out.println("El número debe de ser mayor que 0");
        } else {
            for (int i = 0; i <= raiz.length(); i--) {
                    calculofinal=numero/10;
                    System.out.println(calculofinal);              
                }
            
           
        }
    }
}
