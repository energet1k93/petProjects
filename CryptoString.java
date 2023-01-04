import java.sql.SQLOutput;
import java.util.Scanner;

public class CryptoString {
    static Scanner scanner = new Scanner(System.in);
    private static String msg = scanner.nextLine();
    private static String encmsg = "";
    private static String decmsg = "";
    private static int key = 999;  //Зная этот ключ и при этом не зная исходное сообщение, можно
    // провести дешифровку!))

    public static String getMsg() {
        return msg;
    }
    public static int getKey() {
        return key;
    }


    public static void endDecodingMsg() {
        for (int i = 0; i < getMsg().length(); i++) {              // Проходим циклом по всему тексту, которое нужно зашифровать.
            encmsg = encmsg + (char) (getMsg().charAt(i) ^ getKey());   // Вызываем метод charAt(i), который возвращает символы из нашего текста
        }                                                     // которое преобразуется в двоичное и с помощью оператора ^ и ключа 88 изменяется.
        System.out.println("Зашифрованное сообщение:");
        System.out.println(encmsg+"\n");
    }

    public static void decodingVsg() {
        for (int i = 0; i < msg.length(); i++) {                // Проделываем те же манипуляции, что и с шифровкой пользуясь правилом,
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ getKey());  // "Если выполнить сначала над некоторыми значениями X(msg) и Y(key), а затем над ее
        }                                                       // "результатом(encmsg) и значением Y(88), то мы снова вернем Х(msg)"
        System.out.println("Дешифрованное сообщение:");
        System.out.println(decmsg);
    }
    public static void main(String[] args) {
        System.out.println(getMsg() + "\n");
        endDecodingMsg();
        decodingVsg();
    }
}