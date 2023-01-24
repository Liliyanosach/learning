package arrays;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //System.out.println(calculateWithFor(3));
        int[] array = {3, 4, 6, 2, 7};
        System.out.println(linearSearch(array, 1));

        int[] a = new int[15];
        System.out.println(a[0]);

    }

    public static void task1() {
        int[][] arr = new int[3][2];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = k++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void task2() {
        String[][] arr = new String[3][6];
        char symbol = 'a';
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = symbol + "" + (j + 1);
                System.out.print(arr[i][j] + " ");
            }
            symbol++;
            System.out.println("");
        }
    }

    /*
     * Создайте двухмерный массив типа char размером 4*2
     * Записать туда значение спомощью блока для инициализации
     * Распечатать значение
     */
    public static void task3() {
        char[][] arr = new char[4][2];
        char symbol = 'a';
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = symbol++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    /* Создайте двухмерный массив типа char размером 4*2
     * Записать туда значение спомощью блока для инициализации
     * Распечатать значение
     */
    public static void task4() {
        char[][] arr = new char[4][2];
        char symbol = 'a';
        for (char[] arrOne : arr) {
            for (char element : arrOne) {
                element = symbol++;
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    /*
     * Найти минимальное значение
     */
    public static void task5() {
        int[] arr = {51, 3, 2, 4, 6, 1};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное значение " + min);
    }

    /*
     * Найти среднеарифметическое
     */
    public static void task6() {
        double[] arr = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for (double d : arr) {
            result += d;
        }
        System.out.println("Среднее арифметическое " + result / arr.length);
    }

    /*
     * Число Фибоначчи
     */
    public static long calculateWithFor(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 0; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    /*
     * Линейный поиск элемента массива
     */
    public static int linearSearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

}

