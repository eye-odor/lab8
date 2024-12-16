public class Algorithms {

    // 1. Пошук мінімального елементу масиву позитивних чисел
    public int findMinPositive(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім або null");
        }

        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num <= 0) {
                throw new IllegalArgumentException("Масив повинен містити лише позитивні числа");
            }
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 2. Розрахунок суми елементів масиву від'ємних чисел
    public int sumOfNegativeNumbers(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Масив не може бути null");
        }

        int sum = 0;
        for (int num : numbers) {
            if (num >= 0) {
                throw new IllegalArgumentException("Масив повинен містити лише від'ємні числа");
            }
            sum += num;
        }
        return sum;
    }

    // 3. Алгоритм розрахунку N-го елемента послідовності Фібоначчі
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N не може бути від'ємним");
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    // 4. Алгоритм розрахунку сили струму (I = U / R)
    public double calculateCurrent(double voltage, double resistance) {
        if (resistance == 0) {
            throw new IllegalArgumentException("Опір не може бути 0");
        }
        return voltage / resistance;
    }
}

