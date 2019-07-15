package pac;

public class MainEmployee {
	public static void main(String[] args) {
		Empolyee e=new Empolyee(11,"prathiksha",600000.00);
		Empolyee e1=new Empolyee(11,"prathiksha",600000.00);
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e.hashCode());
		System.out.println(e1.id);
		System.out.println(e.equals(e1));
	}
}
