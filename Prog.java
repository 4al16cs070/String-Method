package pac;

public class Prog {
	public static void main(String[] args) {
		Prog p=new Prog();
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(p.hashCode());
		
		Prog p1=new Prog();
		System.out.println(p1);
		System.out.println(p1.hashCode());
		System.out.println(p.equals(p1));
	}
}
