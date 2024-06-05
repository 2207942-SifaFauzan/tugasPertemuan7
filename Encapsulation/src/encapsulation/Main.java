package encapsulation;

public class Main {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        stopwatch.start();

        selectionSort.sort(array);

        stopwatch.stop();

        System.out.println("Waktu yang dibutuhkan untuk mengurutkan 100.000 angka: " + stopwatch.getElapsedTime() + " milidetik");
    }
}
