public class main {

    public static void main(String[] args) {

        int[] array = {3, 22, 1, 13, 4, 6, 16, 5};

        // Напишите программу, которая выводит (через пробел) те элементы массива,
        // которые являются чётными числами.

        for (int num: array) {

            if (num % 2 == 0)
                System.out.print(num + " ");
        }

        //Напишите программу, которая выводит все двузначные числа массива.
        System.out.println();

        for (int num : array){

            if (num > 10 && num <100)
                System.out.print(num + " ");
        }

//        Напишите программу, которая выводит на экран наибольшее целое число этого массива.
        System.out.println();

        int max = 0;

        if (array.length > 0) {
            max = array[0];
        }


        for (int i = 0;i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println(max);

//        Напишите программу, которая считает сумму элементов массива и выводит её на экран.
        int sum = 0;
        if (array.length > 0){
            sum = array[0];
        }
        for (int i = 1;i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

//        ***Напишите программу, которая переворачивает массив в обратном порядке.

        int[] arrayReverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayReverse[i] = array[array.length - 1 - i];
            System.out.print(arrayReverse[i] + " ");
        }
    }
}
