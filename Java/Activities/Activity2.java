package activities;

public class Activity2 {

    public static void main (String[] args){
        int[] number= {10, 77, 10, 54, -11, 10};
        int search = 10;
        int sum = 30;
        System.out.println("Result: " + result(number, search, sum));
    }

    public static boolean result(int[] numbers, int search, int sum) {
        int temp = 0;
        for (int num : numbers) {
            if (num == search) {
                 temp += search;
            }

            if (temp > sum) {
                break;
            }
        }

        return temp == sum;
    }
}
