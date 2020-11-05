
public class Q3
{
		public static void main(String[] args)
		{
	   int n = 1000000;
			 
			long a = 0;
			long b = 0;
			long c;
			 
			for (int i = 2; i <= n; i++) {
			    int length = 1;
			    c = i;
			    while (c != 1) {
			        if ((c % 2) == 0) {
			            c = c / 2;
			        } else {
			            c = c * 3 + 1;
			        }
			        length++;
			    }
			 
			    
			    if (length > a) {
			        a = length;
			        b = i;
			    }
			}System.out.println(b);
	}
}