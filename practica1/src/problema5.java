import java.util.Scanner;


public class problema5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		int a�o = 0;
		int diaf = 0;
		int mesf= 0;
		int a�of ;
		int diferenciadias ;
		int diferenciames ;
		int diferenciaa�o ;
		int diastotal;
		System.out.println("Ingrese fecha de Inicio");
		System.out.println("dia");
		dia = s.nextInt();
		System.out.println("mes");
		mes = s.nextInt();
		System.out.println("a�o");
		a�o = s.nextInt();
		System.out.println("Ingrese fecha Final");
		System.out.println("dia");
		diaf = s.nextInt();
		System.out.println("mes");
		mesf = s.nextInt();
		System.out.println("a�o");
		a�of = s.nextInt();
		diferenciadias= diaf-dia;
		diferenciames= mesf-mes;
		diferenciaa�o= a�of-a�o;
		diferenciadias= diferenciadias*1;
		diferenciames= diferenciames*30;
		diferenciaa�o= diferenciaa�o*360;
		diastotal=diferenciadias+diferenciames+ diferenciaa�o ;
		System.out.println("La diferencia de Dias es"+" "+ diastotal);
		System.out.println(" ");
				}		
	}		 

