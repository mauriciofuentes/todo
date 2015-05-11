package tareas1;
class Nodo{
	int elemento;
	Nodo siguiente;
	public Nodo(int elemento){
		this.elemento=elemento;
		siguiente=null;
	}
}
public class Lista {
	Nodo inicio=null;
	void agregar( int elemento){
		if (inicio == null)
		inicio = new Nodo(elemento);
		else{
			Nodo temp=inicio;
			inicio= new Nodo(elemento);
			inicio.siguiente=temp;
		}
	}
	void mostrar(){
		Nodo temp=inicio;
		if (inicio==null)
			System.out.println("lista vacia");
		else{
			System.out.print("[");
			while(temp!=null){
				System.out.print(temp.elemento + " ");
				temp=temp.siguiente;
			}
			System.out.print("]");
		}
	}
public static void maid(String [] args){
	Lista lista= new Lista();
	lista.agregar(10);
	lista.mostrar();
	lista.agregar(20);
	lista.mostrar();
	lista.agregar(5);
	lista.mostrar();
}
}
