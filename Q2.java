import java.util.Random;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		char[] m = {'R','P','S'};
		int u = 0,c = 0;
		
		for(int i = 0; i<=2;i++) {
			System.out.println("Enter User's Choice: ");
			char m1 = sc.next().charAt(0);
			if(m1!='R' && m1!='P'&& m1!='S') {
				System.out.println("Enter correct choice stupid");
				System.exit(0);
			}
			else {
				System.out.println("Computer's Chioice(Randomly generated)");
				char comp = m[random.nextInt(3)];
				System.out.println(comp);
				if(comp == m1)
				{
					System.out.println("Tie of round");
					continue;
				}
				switch(m1)
				{
				case 'R':
					if(comp == 'P')
					{
						c+=1;
						System.out.println("Computer won the round");
					}
					
					else {
						u+=1;
						System.out.println("User won the round");
					}
					
				break;
				
				case 'P':
					if(comp == 'S')
					{
						c+=1;
						System.out.println("Computer won the round");
					}
					else {
						u+=1;
						System.out.println("User won the round");
					}
					break;
				case 'S':
					if(comp == 'R')
					{
						c+=1;
						System.out.println("Computer won the round");
					}
					else {
						u+=1;
						System.out.println("User won the round");
					}
					break;
				}
			}}
		if(u == c)
		{
			System.out.println("3 rounds over, User Scored "+u+",Tie of Game");
		}
		else if(u > c)
		System.out.println("3 rounds over, User Scored "+u+",User won the game");
		else {
			System.out.println("3 rounds over, User Scored "+u+",Computer won the game");
		}
	}

}