import java.util.Scanner;
public class pow {
public static void main(String[] args) {
	Scanner p=new Scanner(System.in);
	int no=p.nextInt();
	int no2=p.nextInt();
	int ans=(int) Math.pow(no,no2);
	System.out.println(ans);
}
}