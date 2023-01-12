import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------");
        System.out.println("Duplicados Não!");
        System.out.println("------------------------------");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Entre com o primeiro array: ");
            List<String> primeiroArray = Arrays.asList(sc.nextLine().trim().split(", "));

            System.out.print("Entre com o segundo array: ");
            List<String> segundoArray = Arrays.asList(sc.nextLine().trim().split(", "));

            List<String> duplicados = new ArrayList<>();
            
            for (String itemLista1 : primeiroArray) {
                if (segundoArray.contains(itemLista1)) {
                    duplicados.add(itemLista1);
                }
            }

            System.out.println("Elementos duplicados: " + duplicados);

        } catch (InputMismatchException e) {
            System.out.println("Valores inválidos");
        } catch (Exception e) {
            System.out.println("Deu ruim =/");
        } finally {
            System.out.println("------------------------------");
            sc.close();
        }

    }
}
