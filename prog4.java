public class prog4{

	public static void main(String[] args){
		
		int dateValue = 5;

		switch(dateValue){
			case 1:
				System.out.println("Value of the day  :"+dateValue+"Day of the Week  : Monday");
				break;

			case 2:
				System.out.println("Value of the day  :"+dateValue+"Day of the Week  : Tuesday");
				break;
			case 3:
				System.out.println("Value of the day  :"+dateValue+"Day of the Week  : Wednesday");
				break;
			case 4:
				System.out.println("Value of the day  :"+dateValue+"Day of the Week  : Thursday");
				break;
			case 5:
				System.out.println("Value of the day  :"+dateValue+"Day of the Week  : Friday");
				break;
			case 6:
				System.out.println("Value of the day  :"+dateValue+"Day of the Week  : Saturday");
				break;

			case 7:
				System.out.println("Value of the day  :"+dateValue+"Day of the Week  : Sunday");
				break;

			default:
				System.out.println("Enter the correct value ");
				break;


		}

	}

}