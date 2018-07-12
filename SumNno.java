public class SumNno {
public static void main(String[] args) {
	int sz=Integer.parseInt(args[0]);int sum=0;
	for(int i=1;i<=sz;i++){
		 sum=i+sum;
	} 
	System.out.println(sum);
}
}