public class fndsmallest {
  int[] numbers = {7, 2, 9, -1, 4};

int smallest = numbers[0];
for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] < smallest) {
        smallest = numbers[i];
    }
}

System.out.println(smallest); // -1
}
