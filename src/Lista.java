
public class Lista {
	protected Nodo raiz;
	private int contador;
	
	public Lista(){
		raiz=null;
		contador=0;
	}
	
	public int getTamaño(){
		return contador;
	}
	
	public void addElemento(int n){
		if(raiz==null){
			raiz=new Nodo(n);
		}
		else
		{
			Nodo nuevo=new Nodo(n);
			nuevo.setNext(raiz);
			raiz=nuevo;			
		}
		contador++;			
	}
	
	public Integer at(int pos){
		int i=0;
		Nodo puntero=raiz;
		while(i<this.getTamaño()){
			if(pos==i)
				return puntero.getValor();
			else{
				puntero=puntero.getSig();
				i++;			
			}			
		}return null;
	}
	
		public void Eliminar(){
			raiz=raiz.getSig();
			contador--;
			}
			
		}
			
	
	
	
	


