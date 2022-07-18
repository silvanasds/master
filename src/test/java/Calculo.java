import java.util.Scanner;

public class Calculo {
	
	private static Scanner scanner;

	public static void main(String[] args) {


    Operacoes o = new Operacoes();{
	
    scanner = new Scanner(System.in);
		System.out.println("Digite o 1° valor:");
		int v1 = scanner.nextInt();
		System.out.println("Digite o 2° valor");
		int v2 = scanner.nextInt();
		System.out.println("Digite o 3° valor");
		int v3 = scanner.nextInt();
		System.out.println("Digite o 4° valor");
		int v4 = scanner.nextInt();

		o.soma(v1, v2); 
        o.dividi(v3, v4); }

	
}

}
