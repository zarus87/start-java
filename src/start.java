import java.io.IOException;

public class start {

    int nub = 12; // public чтобы видеть переменную в других файлах(классах) static чтобы видеть переменную только в classe в котором она обьявлена

    final int mks =23; // final делает переменную константой той есть её нельзя изменить
    public static void main (String [] args) {
        byte num = 100; // здесь может храниться 8 бит информации так как тип данных мы написали byte здесь могут
        // быть цифры от -128 до +127
        short num1 = 131; // в этом типе данных (short) может храниться 16 бит информации
        // диапозон чисел от -32768 до +32767
        int num2 = 141; // 32 бита может хранится, от - 2147483648 до +2147483647
        long num3 = 1213; // 64 бита

        float num4 = 123.2f; //  32 бита в конце числа нужно написать f для подтвержения типа данных
        double num5 = 12.23d; // 64 бита   d  в конце числа можно не писать

        char sym = '4'; // здесь можно хранить любой символ из юникода  16 бит

        boolean isTrue = true; // либо true либо false 1 бит

        int nu = 3;
        int numbe = 3;
        int nu4 = 7;
        int nu5 = 5;

        int result = nu + numbe;

        if(nu == numbe || nu4 < nu5) {
            System.out.println("Переменные равны");
        } else {
            System.out.println("Переменные не равны");
        }
        System.out.println("Результат:" + result);
    }
    public static void mai (String [] args) throws IOException {
        char ch, answer = 'B';

        System.out.println("Какую букву я загадал?");
        System.out.print("Отгадай её!");

        ch = (char)System.in.read();

        if(ch == answer) {
            System.out.println("Правильно!");
        } else if (ch > answer) {
            System.out.println("Ответ выше по алфавиту");
        } else {
            System.out.println("Ответ ниже по алфавиту");
        }

    }
}
