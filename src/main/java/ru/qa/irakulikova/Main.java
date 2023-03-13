package ru.qa.irakulikova;

public class Main {
    public static int a = 3;
    public static int b = 100;
    public static int c = 25;
    public static double d = 1.5D;

    public static void main(String[] args) {
        System.out.println("Имея данные значения давайте поупражняемся с математическими и логическими операторами,");
        System.out.println("добьемся переполнения при вычислениях и попробуем вычисления комбинаций типов данных (int и double):");
        System.out.println("int a = 3;");
        System.out.println("int b = 100;");
        System.out.println("int c = 25;");
        System.out.println("d = 1.5D;");

//      Протестируем математические операторы
        System.out.println("### Протестируем математические операторы");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("b--   = " + (b--));
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));

//      Цикл while для понимания инкремента
        System.out.println(("### Цикл while для понимания инкремента: ") + ("while i++ = i"));
        int i = 5;
        while (i < 8)  {
            System.out.println("while i++ =" + i);
            i++;
        }

//      Цикл while для понимания декремента
        System.out.println(("### Цикл while для понимания декремента: ") + ("while ii-- = ii"));
        int ii = 8;
        while (ii > 5)  {
            System.out.println("while ii-- =" + ii);
            ii--;
        };

//      Протестируем операторы сравнения
        System.out.println("### Протестируем операторы сравнения");
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));

//      Протестируем логические операторы
        System.out.println("### Протестируем логические операторы");
        boolean v = true;
        System.out.println("boolean v = true;");
        boolean k = false;
        System.out.println("boolean k = false;");
        System.out.println("v & k = " + (v & k));
        System.out.println("v && k = " + (v && v));
        System.out.println("v && k = " + (v && k));
        System.out.println("v || k = " + (v || k) );
        System.out.println("!(v && k) = " + !(v && k));

//        Протестируем переполние при вычислениях
        System.out.println("### Протестируем переполние при вычислениях");

        //      Попытка переполнения, ведущая к ошибке:
        System.out.println("### Попытка переполнения, ведущая к ошибке:");
        System.out.println("int itsOkey = 1;");
        System.out.println("byte error = itsOkey;");
        System.out.println("### Решение:");
        int itsOkey = 1;
        System.out.println("int itsOkey = 1;");
        byte error = (byte) itsOkey;
        System.out.println("byte error = (byte) itsOkey;");
        System.out.println("error = " + error);

        System.out.println("### Переполние Byte");
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Максимальное значение Byte: " + maxByte);
        byte maxBytePlus1 = (byte) (maxByte + 1);
        System.out.println("Максимальное значение Byte + 1 = " + maxBytePlus1);

        System.out.println("### Переполние Short");
        short maxShort = Short.MAX_VALUE;
        System.out.println("Максимальное значение Short: " + maxShort);
        short maxShortPlus1 = (short) (maxShort + 1);
        System.out.println("Максимальное значение Short + 1 = " + maxShortPlus1);

        System.out.println("### Переполние Int");
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Максимальное значение Int: " + maxInt);
        int maxIntPlus1 = (maxInt + 1);
        System.out.println("Максимальное значение Int + 1 = " + maxIntPlus1);

        System.out.println("### Переполние Long");
        long maxLong = Long.MAX_VALUE;
        System.out.println("Максимальное значение Long: " + maxLong);
        long maxLongPlus1 = (maxLong + 1);
        System.out.println("Максимальное значение Long + 1 = " + maxLongPlus1);

        System.out.println("### Переполние Double");
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Максимальное значение Double: " + maxDouble);
        double maxDoublePlus1 =(double) (maxDouble + 1.1D);
        System.out.println("Максимальное значение Double + 1.1D = " + maxDoublePlus1);
        if (maxDouble == maxDoublePlus1) {
            System.out.println("Хозяйке на заметку: переполнение Double невозможно");
        }
        else {
            System.out.println("Произошло переполнение Double");
        }

//        Вычисления комбинаций типов данных (int и double)
        System.out.println("### Протестируем вычисления комбинаций типов данных int и double");
        System.out.println("int a = " + a);
        System.out.println("double d = " + d);
        System.out.println("a + d = " + (a + d));
        System.out.println("a / d = " + (a / d));
        System.out.println("a * d = " + (a * d));
    }
}