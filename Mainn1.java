package pac;

public class Mainn1 {
	public static void main(String[] args) {
		Mainn n=new Mainn(11,"pooja",90.2);
		Mainn n1=new Mainn(11,"pooja",90.2);
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n.hashCode());
		System.out.println(n1.hashCode());
		System.out.println(n.equals(n1));
	}
}
