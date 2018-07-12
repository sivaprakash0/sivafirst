import java.util.Scanner;
public class SumArrt {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int no=in.nextInt();
	int no1=in.nextInt();
	int num[]=new int[no];
	int ind=0;
	for(int i=0;i<no;i++){
		num[i]=in.nextInt();
		if(num[i]==no1){
		ind=i;
		}
	}
	int ad=num[0];
	for(int j=1;j<=ind;j++){
		ad=ad+num[j];
	}
	System.out.println(ad);
}
}