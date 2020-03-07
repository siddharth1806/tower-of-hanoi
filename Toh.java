import java.util.Scanner;

public class Toh {

        public void solve(int n, String S, String A, String D) {
            if (n == 1) {
                System.out.println(S + "  " + D);
            } else {
                solve(n - 1, S, D, A);
                System.out.println(A + "  " + D);
                solve(n - 1, A, S, D);
            }
        }

        public static void main(String[] args) {
		int sum=0;
            Toh obj = new Toh();
            System.out.print("Enter number of discs: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            obj.solve(n, "S", "A", "D");

	for(int i=0;i<n;i++)
	{
		sum=sum+(2*n)+1;
		
	}
		System.out.println(sum);
        }
    }
