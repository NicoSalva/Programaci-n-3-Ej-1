
public class Nodo {
	private Nodo sig;
	private int valor; 
	
	public Nodo(){
		sig=null;
			
	}
	
	public Nodo(int v){
		valor=v;
		sig=null;
				
	}
	
	public int getValor(){
		return valor;
	}
	
	public Nodo getSig(){
		return sig;
	}
	
	public void setNext(Nodo s){
		sig=s;
	}
	
	public void modificar(int nuevo){
		valor=nuevo;
	}

}
