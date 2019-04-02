import java.util.Scanner;

class apples{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		if(N %2 != 0 && N >= 0 && N <= 100){
            System.out.println("Weird");
        }else if(N %2 == 0 && N >= 0 && N <= 100){
            if(N >= 2 && N <= 5){
                System.out.println("Not Weird");
            }
            else if( N >= 6 && N <= 20){
                System.out.println("Weird");
            }else if(N >= 21){
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }

		
	}
}