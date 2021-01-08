import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Atividades {

	public static void main(String[] args) throws IOException{
		
		Locale.setDefault(new Locale("en", "US"));
	
		Scanner input = new Scanner(System.in);
		
		int num;
		
		do {
			
			num = input.nextInt();
			
			if(num == 0) {
				
				break;
				
			}
			
			for(int cont = 0; cont < num; cont++) {
				
				if(cont == num-1) {
					
					System.out.print(cont+1);
					
				} else {
				
					System.out.print(cont+1 + " ");
					
				}
				
			}
			
			System.out.println();
			
		} while (num != 0);
		
		input.close();
		
	}

}
