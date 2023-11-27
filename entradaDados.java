import java.util.Scanner;
public class entradaDados {
    public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Digite uma distância: ");
double distanciaPercorrida=sc.nextDouble();
System.out.println("A distância digitada foi "+distanciaPercorrida+" Km.");
sc.close();
    }
}
