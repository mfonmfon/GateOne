import java.util.Scanner;

public class TaskSeven{
	public static void main(String... args){
	Scanner scan = new Scanner(System.in);


	int scores = 0;
	int sum = 0;
	double average = 0;
	int index = 0;
	for(; index < 10; index++){
	System.out.print("Enter a number");
	scores = scan.nextInt();

	if(scores % 2 == 0){
		sum += scores;
		average = sum / scores;
	
	}
	
	}
	System.out.println(sum);
	System.out.println(average);
	
	
	}



}