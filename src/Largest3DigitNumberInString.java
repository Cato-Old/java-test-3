package src;
/*
ZADANIE:
Dany jest string num zawierający same cyfry.
Integer nazywamy prawidłowym, jeśli spełnia następujące 2 warunki:
 a) jest substringiem stringu num o długości 3;
 b) wszystkie jego cyfry są takie same.
Zwróć największy prawidłowy integer dla danego stringu num jako string
lub pusty string, jeśli prawidłowy integer nie istnieje.

PRZYKŁAD:
Dla num="6777133339" istnieją 2 prawidłowe integery: 777 i 333.
Zwrócimy "777" ponieważ 777 > 333.
 */

public class Largest3DigitNumberInString {
    public static void main() {
        System.out.println(solution("6777133339"));
    }

    private static String solution(String num) {
        return "";
    }
}
