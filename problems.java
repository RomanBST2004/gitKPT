public class tasks {
    public static void main(String[] args) // Функция для инпутов (x, y, z...)
    {
        System.out.println( );
    }
    public static int convert(int x) // 1) Напишите функцию, которая принимает целое число минут и преобразует его в секунды.
    {
       return x*60;
    }
    public static int points( int x, int y) // 2) Вы подсчитываете очки за баскетбольный матч, учитывая количество забитых 2-х и 3-х очков, находите окончательные очки для команды и возвращаете это значение.
    {
       return x*2 + y*3;
    }
    public static int footballPoints(int x, int y, int z) // 3) Создайте функцию, которая принимает количество побед, ничьих и поражений и вычисляет количество очков, набранных футбольной командой на данный момент.
    {
        return x*3 + y*1 + z*0;
    }
    public static boolean divisibleByFive(int x) // 4) Создайте функцию, которая возвращает true, если целое число равномерно делится на 5, и false в противном случае.
    {
      if (x % 5 == 0) {
            return true;
        }
        else {
            return false;
    }
    public static boolean and(boolean a, boolean b ) // 5) Создайте функцию с помощью оператора&&.
    {
       if ((a == false) && (b == false)) {
            return false;
        }
        if ((a == false) && (b == true)) {
            return false;
        }
        if ((a == true) && (b == false)) {
            return false;
        }
        else {
            return true;
        }
    }
    public static int howManyWalls(int n, int h, int w) // 6) У меня есть ведро с большим количеством темно-синей краски, и я хотел бы покрасить как можно больше стен. Создайте функцию, которая возвращает количество полных стен, которые я могу покрасить, прежде чем мне нужно будет отправиться в магазины, чтобы купить еще.
    {
       return n / (h*w);
    }
    public static int squaed(int a ) // 7) Исправьте код, чтобы решить эту задачу (только синтаксические ошибки). Посмотрите на приведенные ниже примеры, чтобы получить представление о том, что должна делать эта функция.
    {
       return a* a;
    }
    public static boolean profitableGamble(double prob, int prize, int pay) // 8) Создайте функцию, которая принимает три аргумента prob, prize, pay и возвращает true, если prob * prize > pay; в противном случае возвращает false.
    {
       if (prob * prize > pay) {
            return true; }
        else {
            return false; }
        }
    }
    public static int frames(int x, int y) // 9) Создайте метод, который возвращает количество кадров, показанных за заданное количество минут для определенного FPS.
    {
       return x * y * 60;
    }
    public static int mod(int x, int y) // 10) Создайте функцию, которая будет работать как оператор модуля % без использования оператора модуля. Оператор модуля-это способ определения остатка операции деления. Вместо того чтобы возвращать результат деления, операция по модулю возвращает остаток целого числа.
    {
       return x - x / y * y;
    } 
} // ALL DONE !!!

