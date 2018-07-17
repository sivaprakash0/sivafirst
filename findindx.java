package player;

import java.util.Scanner;

public class findindx {
public static void main(String[] args) {
	Scanner rd=new Scanner(System.in);
	int sz=rd.nextInt();
	int arr[]=new int[sz];
	for(int i=0;i<sz;i++){
		arr[i]=rd.nextInt();
	}
	for(int j=0;j<sz;j++){
		if(arr[j]==j){
			System.out.print(arr[j]+" ");
		}
	}
}
}
