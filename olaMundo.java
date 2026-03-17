import java.util.Scanner;

public class olaMundo
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite alguma coisa: ");
        String texto = scanner.next();
        
        System.out.println(texto);

        scanner.close();
    }
}