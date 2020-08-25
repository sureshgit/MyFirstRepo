package ExceptionConcept;

public class ConceptaboutException {
	String name ="tom";
	

	public static void main(String[] args) {
		ConceptaboutException ob=new ConceptaboutException();
		System.out.println("a");
		System.out.println("This is ");
		try {
			ob=null;
			System.out.println(ob.name);
			int c=9/0;
		}
		catch(ArithmeticException e){
			System.out.println("some exception coming pls tc");
			e.printStackTrace();
			System.out.println(e.getMessage()+"exception occured");
		}
		catch(NullPointerException e1) {
			
		}
		
		
		System.out.println("b");
		System.out.println("b");
		System.out.println("b");
 
	}

}
