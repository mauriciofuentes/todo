import java.util.Scanner;
public class problema13 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String opcion1,opcion2;	
		int n0 = 0;
		int n1=0;
		int n2=0;
		String[]variable={"a","b","c","d","e","f","g","h","i","j",
						  "k","l","m","n","ñ","o","p","q","r","s",
						  "t","u","v","w","x","y","z"};
			System.out.println("Ingrese la  letra a adivinar");
			opcion1 =x.nextLine();
			while(n0==0){
				System.out.println("Ingrese letra");
				opcion2 =x.nextLine();
					for(int i=0;i<variable.length;i++){
						if(opcion1.equals(variable[i])){
							n1 = i;
						}
						if(opcion2.equals(variable[i])){					
							n2 = i;
						}
					}
					if(n1 >n2)
						System.out.println("La letra esta antes");
					else if(n1 < n2){
						System.out.println("La letra esta despues");
					}
					if(n1 == n2){
						System.out.println("A acertado");
						n0++;
					}
				}
			}
	}
	