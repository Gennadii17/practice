public interface Calculator {

    /**
     * Метод суммирования двух чисел
     *
     * @param x - операнд x
     * @param y - операнд y
     * @return double - возвращает сумму операндов
     */
    double add(double x, double y);

    /**
     * Метод умножения двух чисел
     *
     * @param x - операнд x
     * @param y - операнд y
     * @return double - возвращает результат умножения операндов
     */
    double multiply(double x, double y);

    /**
     * Метод деления двух чисел
     *
     * @param x - операнд x
     * @param y - операнд y
     * @return double - возвращает результат деления операндов
     */
    double divide(double x, double y);

    /**
     * Метод разницы двух чисел
     *
     * @param x - операнд x
     * @param y - операнд y
     * @return double - возвращает разницу операндов
     */
    double diff(double x, double y);

    /**
     * Метод нахождения остатка от деления двух чисел
     *
     * @param x - операнд x
     * @param y - операнд y
     * @return double - возвращает остаток от деления
     */
    double modulo(double x, double y);

    /**
     * Метод должен проверить является ли операнд чётным числом
     *
     * @param x - операнд x
     * @return boolean - возвращает значение булевого уравнения
     */
    boolean isOdd(int x);

    /**
     * Метод должен проверить является ли операнд чётным числом (но с использованием побитовых операторов)
     *
     * @param x - операнд x
     * @return boolean - возвращает значение булевого уравнения
     */
    boolean isOddBinary(int x);

    /**
     * Метод должен увеличить значения операнда на 1
     *
     * @param x - операнд x
     * @return int - возвращает значение
     */
    int increment(int x);

    /**
     * Метод должен уменьшить значения операнда на 1
     *
     * @param x - операнд x
     * @return int - возвращает значение
     */
    int decrement(int x);
}
