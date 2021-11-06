import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang:");
		int n=sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=",i);
			array[i]=sc.nextInt();
		}
		Random rand = new Random();
		
		for (int i = 0; i < n; i++) {
			int randomIndexToSwap = rand.nextInt(n);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}