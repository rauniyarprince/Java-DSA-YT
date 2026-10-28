
int[] numbers = {4, 7, 10, 13};
int target = 10;

int index = -1;
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        index = i;
        break;
    }
}

System.out.println(index); // 2, or -1 if not found