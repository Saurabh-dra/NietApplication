package capgemini.firstproject.welcome;

public class Lab1_First {
	int natural_numbers = 150;

	public static void main(String[] args) {
		Lab1_First ob = new Lab1_First();
		ob.calculateSum(ob.natural_numbers);
	}

	public void calculateSum(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		System.out.println("Sum of first 'N' natural numbers divisible by 3 or 5 is :" + sum);

	}

}
