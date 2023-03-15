package MetodosStatic.copy;

public class TestEstatic {
	
	
	

		public static void main(String[] args) {
			MetodosStatic.metodo2();
			
			MetodosStatic.dato= "Cambio";
			
			MetodosStatic me = new MetodosStatic();
			me.metodo3();
			me.dato="ME";
			
			MetodosStatic me2 = new MetodosStatic();
			me2.dato="ME2";
			
			System.out.println(me.dato);
			System.out.println(me2.dato);
			System.out.println(MetodosStatic.dato);
			
		}
		
}


