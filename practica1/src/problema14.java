import java.util.Scanner;
public class problema14 {
		public static void main(String[] args) {
	      Scanner x=new Scanner(System.in);
	      System.out.print("Ingresa tamaño ");
	      System.out.println(" ");
	      int t = x.nextInt();
	      for(int c=1; c<=t ;c++){        
		       for (int d=1; d <=t; d++){
		               if (d == 1 || d == t || c == 1 || c == t){
		                   System.out.print("* ");
		               }
		               else{
		                   System.out.print("  ");
		                   }
		            }
		            System.out.println();
		        }
		    }
	      
	    }
