import java.util.Scanner;
import java.util.Random;
public class MENU {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			Random ra0 = new Random();
			boolean S=true;
			while(true){
			String nivel;
			System.out.println("Binvenido a PRACTICA 1 IPC1 2015");
			System.out.println(" ");
			System.out.println("Seleccione el ejercicio que deseea ejecutar:");
			System.out.println("1. Ejercicio 1");
			System.out.println("2. Ejercicio 2");
			System.out.println("3. Ejercicio 3");
			System.out.println("4. Ejercicio 4");
			System.out.println("5. Ejercicio 5");
			System.out.println("6. Ejercicio 6");
			System.out.println("7. Ejercicio 7");
			System.out.println("8. Ejercicio 8");
			System.out.println("9. Ejercicio 9");
			System.out.println("10. Ejercicio 10");
			System.out.println("11. Ejercicio 11");
			System.out.println("12. Ejercicio 12");
			System.out.println("13. Ejercicio 13");
			System.out.println("14. Ejercicio 14");
			System.out.println("15. Ejercicio 15");
			System.out.println("16. Salir al menu");
			nivel =s.nextLine();
			switch(nivel){
				case "1":
					System.out.println("ROMBO DE ASTERISCOS");
					System.out.println("");
					for(int i=1; i<6; i++){
						for(int j=(6-i);j>0;j--){
							System.out.print(" ");
						}
						for(int a=1; a<(2*i);a++){
							System.out.print("*");
						}
						System.out.println(" ");
						}
					for(int i=4; i>0; i--){
						for(int j=(6-i);j>0;j--)
							System.out.print(" ");
						for(int a=1; a<(2*i);a++)
							System.out.print("*");
						System.out.println(" ");
					}
						System.out.println(" ");	
					break;	
				case "2":
					System.out.println("PROMEDIO DE NOTAS");
					System.out.println("");
					Scanner A = new Scanner(System.in);
					int n1;
					int n2;
					int n3;
					int n4;
					int n5;
					int n6;
					int n7;
					int n8;
					System.out.println("Ingrese primer nota");
					n1 = A.nextInt();
					System.out.println("Ingrese seguda nota");
					n2 = A.nextInt();
					System.out.println("Ingrese tercera nota");
					n3 = A.nextInt();
					System.out.println("Ingrese cuarta nota");
					n4 = A.nextInt();
					System.out.println("Ingrese quinta nota");
					n5 = A.nextInt();
					System.out.println("Ingrese sexta nota");
					n6 = A.nextInt();
					n7 = (n1 + n2 + n3 + n4 +n5 + n6);
					n8 = (n7/6);
					if(n8>=0)
						if(n8<60)
						System.out.println("El promedio del estudiante es:"+n8+" " +"Puntuacion E");
					if(n8>=60)
						if(n8<70)
						System.out.println("El promedio del estudiante es:"+n8+" "+"Puntuacion D");
					if(n8>=70)
						if(n8<80)
						System.out.println("El promedio del estudiante es:"+n8+" "+"Puntuacion C");
					if(n8>=80)
						if(n8<90)
						System.out.println("El promedio del estudiante es:"+n8+" "+"Puntuacion B");
					if(n8>=90)
						if(n8 <=100)
						System.out.println("El promedio del estudiante es:"+n8+" "+"Puntuacion A");
					break;
				case "3":
					System.out.println("CAMBIO DE FORMATO DE HORAS");
					System.out.println("");
					Scanner B=new Scanner(System.in);	
					String hora ;
					int nO1=0;
					int minuto=0;
					int tiempo=0;
							System.out.println("Ingrese hora en formato xx:xx");
						hora = B.nextLine();
						nO1=Integer.parseInt(hora.substring(0, hora.indexOf(":"))); 
						minuto=Integer.parseInt( hora.substring(hora.indexOf(":")+1,hora.length() )); 
						if (nO1 > 24 ){
							System.out.println("La hora no es valida");
							System.out.println(" ");
						}else{
						if(nO1 > 12 && nO1<25)			
							tiempo = nO1 - 12;
							else
							tiempo = nO1;
							hora = tiempo + ""+":"+"00";
						if(nO1 < 12)
							hora= tiempo + ":"; 
							if(nO1 > 12 && nO1<25)
							hora+= "pm ";
							else
							hora +=  "am";	
						System.out.println("la hora es:"+" "+hora );
						}
						System.out.println();
					break;
				case "4":
					System.out.println("FIGURAS BASICAS");
					System.out.println("");
					Scanner x = new Scanner(System.in);
					String variable;
					double r,arC,pC,X,arU,pU,xT,arT,pT,ht;
						System.out.println("Que figura desea calcular?");	
						System.out.println("C= Circulo");
						System.out.println("U= Cuadrado");
						System.out.println("T= Triangulo");
						variable = x.nextLine();
						switch(variable){
						case "C":
							System.out.println("Ingrese X");
							r= s.nextDouble();
							pC=2*Math.PI*r;
							arC= Math.PI*Math.pow(r, 2);
							System.out.println("El radio es "+r+"0"+"u");
							System.out.println("El perimetro es "+ pC+"0"+"u");
							System.out.println("El area es "+arC+"0"+"u^2");
							break;
						case "U":
							System.out.println("Ingrese X");
							X = x.nextDouble();
							arU = Math.pow(X,2);
							pU =4*X ;
							System.out.println("El area es "+arU+"0"+"u^2");
							System.out.println("El Perimetro  es "+pU+"0"+"u");
							break;
						case "T":
							System.out.println("Ingrese X");
							xT = x.nextDouble();
							ht = (Math.sqrt(3)/2)*xT;
							arT = (Math.sqrt(3)/4)*Math.pow(xT, 2);
							pT = 3*xT;
							System.out.println("La altura es "+ht+"0"+"u");
							System.out.println("El area es "+arT+"0"+"u^2");
							System.out.println("El Perimetro es "+pT+"0"+"u");
						}
					break;
				case "5":
					System.out.println("DIFERENCIA DE DIAS");
					System.out.println("");
					int dia=0 ;
					int mes=0 ;
					int aÒo=0 ;
					int diaf=0 ;
					int mesf=0;
					int aÒof=0 ;
					int diferenciadias ;
					int diferenciames ;
					int diferenciaaÒo ;
					int diastotal;
					System.out.println("Ingrese fecha de Inicio");
					System.out.println("dia");
					dia = s.nextInt();
					System.out.println("mes");
					mes = s.nextInt();
					System.out.println("aÒo");
					aÒo = s.nextInt();
					System.out.println("Ingrese fecha Final");
					System.out.println("dia");
					diaf = s.nextInt();
					System.out.println("mes");
					mesf = s.nextInt();
					System.out.println("aÒo");
					aÒof = s.nextInt();
					diferenciadias= diaf-dia;
					diferenciames= mesf-mes;
					diferenciaaÒo= aÒof-aÒo;
					diferenciadias= diferenciadias*1;
					diferenciames= diferenciames*30;
					diferenciaaÒo= diferenciaaÒo*360;
					diastotal=diferenciadias+diferenciames+ diferenciaaÒo ;
					System.out.println("La diferencia de Dias es"+" "+ diastotal);
					System.out.println(" ");

					break;
				case "6":
					System.out.println("OPERACIONES ARITMETICAS BASICAS");
					System.out.println("");
					Scanner z = new Scanner(System.in);
					Scanner q = new Scanner(System.in);
					String constante;
					int num,num2;
					System.out.println("Ingrese digitos");
					num = q.nextInt();
					num2 = q.nextInt();
					System.out.println("Seleccione variable");
					System.out.println("s= Suma");
					System.out.println("r= Diferencia");
					System.out.println("m= Producto");
					System.out.println("d= Cociente");
					constante = z.nextLine();
					switch(constante){
					case "s":
						System.out.println("La suma es"+" "+(num+num2));
						break;
					case "r":
						System.out.println("La diferencia es"+" "+(num-num2));
						break;
					case "m":
						System.out.println("El producto es"+" "+(num*num2));
						break;
					case "d":
						System.out.println("El cociente es"+" "+(num/num2));
						System.out.println();
					break;
					}
				case "7":
					System.out.println("TABLA DE MULTIPLICAR");
					System.out.println("");
					int nume;
					System.out.println("Ingrese el numero");
					nume = s.nextInt();
					System.out.println("Tabla del " + nume);
					for (int t=0; t<11; t++){
								System.out.print(nume+" "+"*"+" "+t+" "+"="+" "+nume*t);
								System.out.println("");
					}
					break;
				case "8":
					System.out.println("NUMERO ALEATORIO ENTRE RANGOS");
					System.out.println("");
						String[] unidades ={ "cero","un","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez" };
						String[] p ={ "once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve" };
						String[] decenas = {"veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
						int inferior;
						int superior;
						int resultado;
						int unidad;
						int decena;
						System.out.println("Ingrese Limite inferior");
						inferior = s.nextInt();
						System.out.println("Ingres Limite superior");
						superior = s.nextInt();
						resultado = (int)(ra0.nextDouble() * (superior-inferior+1)+inferior );
						if(resultado < 11){
							System.out.println(unidades[resultado]);
						}else if(resultado < 21){
							System.out.println(p[resultado-11]);
						}else if(resultado < 100){
							unidad=resultado%10;
							decena=resultado/10;
							if(unidad  == 0){
								System.out.println(decenas[decena-2]);
								System.out.println(" ");
							}else{
								System.out.println(decenas[decena-2]+" y "+unidades[unidad]);
								System.out.println(" ");
							}
							System.out.println(" ");
						}
					break;
				case "9":
					System.out.println("NUMEROS NATURALES A ROMANOS");
					System.out.println("");
					int nn,u,d,c,m;
					String variable1;
					String Unidad[]={"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
					String Decena[]={"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
				    String Centena[]={"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
				    String Milesima[]={"","M","MM", "MMM"};
					    System.out.println("Ingrese numero ");
					    variable1 = s.nextLine();
					    nn =Integer.parseInt(variable1);
					    u = (nn%10);
					    d = (((nn/10))%10);
					    c = ((nn/100)%10);
					    m=(nn/1000);
				    	if(nn > 999 ){
						    	System.out.println("El numero en romano es "+ Milesima[m] + Centena[c] + Decena[d] + Unidad[u]);
						    }else if(nn > 99){
						    	System.out.println("El numero en romano es "+ Centena[c] + Decena[d] + Unidad[u]);
						    }else if(nn > 9){
						    	System.out.println("El numero en romano es "+ Decena[d] + Unidad[u]);
						    }else if(nn < 10){
						    	System.out.println("El numero en romano es "+""+Unidad[u]);
						    	System.out.println();
						    }
					break;
				case "10":
					System.out.println("PIRAMIDE INVERSA DE NUMEROS");
					System.out.println("");
					int Ò;
					int l=1;
					System.out.println("Ingrese el numero");
					Ò = s.nextInt();
					for(int g=Ò; g>0; g--){
						for(int e=g;e<Ò;e++){
							System.out.print(" ");
						}
						for(int b=g;b>0;b--){
							System.out.print(l+" ");
					}
						System.out.println(" ");
						l=l+1;
						System.out.println();
					}
					break;
				case "12":
					System.out.println("CAMBIO DE LETRAS POR CARACTER *");
					System.out.println("");
					String palabra;
						System.out.println("Ingrese palabra");
						palabra = s.nextLine();
						for (int w = 0; w < palabra.length(); w++){
							if(w == 0)
								System.out.print("*");
							else
							System.out.print("*");
							System.out.println();
						}
					break;
				case "13":
					System.out.println("ADIVINA LA LETRA");
					System.out.println("");
					String opcion1,opcion2;	
					int n—0 = 0;
					int n—1=0;
					int n—2=0;
					String[]variable2={"a","b","c","d","e","f","g","h","i","j",
									  "k","l","m","n","Ò","o","p","q","r","s",
									  "t","u","v","w","x","y","z"};
						System.out.println("Ingrese la  letra a adivinar");
						opcion1 =s.nextLine();
						while(n—0==0){
							System.out.println("Ingrese letra");
							opcion2 =s.nextLine();
								for(int Z=0;Z<variable2.length;Z++){
									if(opcion1.equals(variable2[Z])){
										n—1 = Z;
									}
									if(opcion2.equals(variable2[Z])){					
										n—2 = Z;
									}
								}
								if(n—1 >n—2)
									System.out.println("La letra esta antes");
								else if(n—1 < n—2){
									System.out.println("La letra esta despues");
								}
								if(n—1 == n—2){
									System.out.println("A acertado");
									n—0++;
								}
									System.out.println();
							    }
								break;
				case "14":		
					System.out.println("CUADRO DE ASTERICOS");
					System.out.println("");
					Scanner kx=new Scanner(System.in);
					 System.out.print("Ingresa tamaÒo ");
				      System.out.println(" ");
				      int t = kx.nextInt();
				      for(int ck=1; ck<=t ;ck++){        
					       for (int dk=1; dk<=t; dk++){
					               if (dk == 1 || dk == t || ck == 1 || ck == t){
					                   System.out.print("* ");
					               }
					               else{
					                   System.out.print("  ");
					                   }
					            }
					            System.out.println();
				      }
					break;
					    
				case "15":
					System.out.println("NUMEROS PRIMOS ENTRE RANGOS");
					System.out.println("");
					int aP=0;
					int numP;
					int dP=2;
					boolean Pprimo;
						System.out.println("Ingrese numero");
						numP=s.nextInt();
						for(int iP=numP;iP>1;iP--){
							Pprimo=true;
							while(dP<=iP-1 && Pprimo==true){
								if(iP%dP==0)
									Pprimo=false;
							dP++;
						}
							if(Pprimo==true)
								aP++;	
						}
						System.out.println("Entre 1 y "+numP+" se tiene "+aP+" numero(s) primo(s)");
						System.out.println();
					break;
				case "16":
					System.out.println("FIN DE PROGRAMA");
					System.out.println("");
					System.exit(0);;
				}
								}
}
}
