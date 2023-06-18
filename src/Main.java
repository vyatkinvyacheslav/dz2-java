// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        double price = 408;//стоимость билета
        double rate = 0.05; //количество милей с 1 рубля

        double finalBonus = price * rate;//расчет колчества милей от суммы билета
        double result = Math.floor(finalBonus);
        System.out.println("С покупки вашего билета вы получите следующее количество милей:");

        System.out.println((result));


        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}