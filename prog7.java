import java.util.Scanner;
public class prog7{

	public static void main(String[] args){

		int no1;
		int no2;
		
		
		Scanner myscan = new Scanner(System.in);
		System.out.println("Enter No   :");
		no1=myscan.nextInt();
		
		System.out.println("Enter No2   :");
		no2=myscan.nextInt();
		
		int sum = no1+no2;
		double avg = ((double) no1+(double) no2) / 2;
		
		System.out.println("Sum    : "+sum+"\n"+"Avg   :"+avg);


	}

}