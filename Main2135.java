package pac;

public class Main2135 {
public static void main(String[] args) {
	String s1="java";
	String s2="dev";
	String s3="java"+"dev";
	String s4="java"+s1;
	String s5=s1+"java";
	String s6=s1+s2;
	String s7="javadev";
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
	System.out.println(s5.hashCode());
	System.out.println(s6.hashCode());
	System.out.println(s7.hashCode());
}
}
