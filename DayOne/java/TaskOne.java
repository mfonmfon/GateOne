import java.util.Scanner;
public class TaskOne{
	public static void main(String... args){
	Scanner scan = new Scanner(System.in);


	int scores = 0;
	int total = 0;
	for(int index = 0; index < 10; index++){
	System.out.print("Enter a number");
	scores = scan.nextInt();

	total = total + scores;
	

	}
	System.out.println("total: "  + total);

	
	}



}