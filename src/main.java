import java.util.Scanner;
import estimators.LowerBound;

public class main {

	public static void main(String[] args) {
		
		/*Scanner in = new Scanner(System.in);
		
		System.out.println("Especifique quais simuladores voc� deseja utilizar: \n"
				+ "1 - Lower Bound \n"
				+ "2 -  Eom-Lee \n"
				+ "3 - Ambos");
		int protocolsChoosen = in.nextInt();
		System.out.println("Especifique o n�mero de inicial de etiquetas: ");
		int inicialNumberTags = in.nextInt();
		System.out.println("Especifique o n�mero de incremento de etiquetas: ");
		int incrementTagsBy = in.nextInt();
		System.out.println("Especifique o n�mero m�ximo de etiquetas: ");
		int maxNumberTags = in.nextInt();
		System.out.println("Especifique o n�mero de repeti��es por quantidade de etiquetas: ");
		int numberRepetitions = in.nextInt();
		System.out.println("Especifique o tamanho inicial do quadro: ");
		int inicialFrameSize = in.nextInt();*/
		
		LowerBound lb = new LowerBound(10,3);
		
		lb.simulate();
		
		System.out.println("heh");
		
		
		
		
		
		
		

	}

}



