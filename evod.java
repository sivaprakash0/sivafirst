public class evod{
public static void main(String args[]) {
	int n=Integer.parseInt(args[0]);
        if(n>0&&n<=100000){
	  if(n%2==0) System.out.println("even");
	  else System.out.println("odd");
	 }
	else System.out.println("invalid");
   }
}