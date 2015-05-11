import java.util.Scanner;


public class problema15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0;
		int num;
		int d=2;
		boolean primo;
			System.out.println("Ingrese numero");
			num=s.nextInt();
			for(int i=num;i>1;i--){
				primo=true;
				while(d<=i-1 && primo==true){
					if(i%d==0)
						primo=false;
				d++;
			}
				if(primo==true)
					a++;	
			}
			System.out.println("Entre 1 y "+num+" se tiene "+a+" numero(s) primo(s)");
		}
	}