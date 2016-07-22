package aa;
import java.util.Scanner;

public class amstrongno {
	public static void main(String[] args){
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int sum;
		int digit=0;
		int temp=0;
		int temp1;
		temp1=num;
		int len=Integer.toString(num).length();
		System.out.println(len);
		while(num>0){
			sum=num%10;
			num=num/10;
			digit=digit+(int)Math.pow(sum, len);
			}
		System.out.println(digit);
	
	if(temp1==digit)
	{
		System.out.println("given no is amstrong number");
	}
	else{
		System.out.println("given no is not a amstong number");
	}

}
}