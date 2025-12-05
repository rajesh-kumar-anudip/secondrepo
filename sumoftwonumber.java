public class RangeSum {

	public static void main(String[] args) {
		int numberOne;
		int numberTwo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number one : ");
		numberOne=sc.nextInt();
		System.out.println("Enter number Two : ");
		numberTwo=sc.nextInt();
		int result=numberOne+numberTwo;
		if(result>=10 && result<=19){
			result=20;
		}
		System.out.println(result);
		sc.close();
	}

}
