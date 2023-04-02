import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир! ");
        task1(generateRandomArray());
        task2(generateRandomArray());
        task3(generateRandomArray());
        task4(generateRandomArray());


    }

    private static void task4(int[] generateRandomArray) {
        System.out.println(" Задача 4 ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1 ; i >=0 ; i-- ){
            System.out.print(reverseFullName [i]);

        }
        System.out.println();
    }

    private static void task3(int[] generateRandomArray) {
        System.out.println(" задача 3 ");
        int sum = sum(generateRandomArray);
        int averageSum = sum / generateRandomArray.length;
        System.out.println("Средняя сумма трат за месяц составила "+ averageSum + " рублей ");


    }

    private static int sum(int[] generateRandomArray) {
        int sum = 0;
        for (int i : generateRandomArray) {
            sum += i;

        }
        return sum;
    }



    private static void task2(int[] generateRandomArray) {
        System.out.println(" Задача 2 ");
        int min = generateRandomArray[0];
        int max =generateRandomArray[0];
        for (int i: generateRandomArray){
            if (i < min ){
                min =i;
            }
            if (i>max){
                max=i;

            }
        }
        System.out.println(" Минимальная сумма трат за день составила "+ min + " рублей. Максимальная сумма трат за день составила " + max + " рублей ");



    }


    private static void task1(int[] ints) {
            System.out.println(" Задача 1");
            int Sum = 0;
            for (int i : generateRandomArray()){
                Sum += i;
            }
                System.out.println("Сумма трат за месяц составила " + Sum + " рублей ");

    }

    {

        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        for (int i :arr ){
            System.out.println(i);
        }
    }

    private static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }


    }

