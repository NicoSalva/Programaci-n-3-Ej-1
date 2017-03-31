
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pila p1=new Pila();
		boolean v1=p1.estaVacia();
		System.out.println(v1);
		
		p1.apilar(1);		
		int i=p1.verTope();
		System.out.println(i);
		
		p1.apilar(2);
		int j=p1.verTope();
		System.out.println(j);
		
		p1.apilar(3);
		int g=p1.verTope();
		System.out.println(g);
		
		p1.apilar(4);
		int h=p1.verTope();
		System.out.println(h);
		
		boolean v3=p1.estaVacia();
		System.out.println(v3);
		
		
		p1.desapilar();
		int z=p1.verTope();
		System.out.println(z);
		

		p1.desapilar();
		int y=p1.verTope();
		System.out.println(y);
		

		p1.desapilar();
		int x=p1.verTope();
		System.out.println(x);
		
		p1.desapilar();
		boolean v4=p1.estaVacia();		
		System.out.println(v4);
		

				
	}
		
	
	

}
