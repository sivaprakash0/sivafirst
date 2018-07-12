public class pos {
public static void main(String args[]) {
	int n=Integer.parseInt(args[0]);
	if(n>0&&n<=100000)System.out.println("positive");
	  else if(n==0)System.out.println("zero");
	  else System.out.println("negative");
}
}
