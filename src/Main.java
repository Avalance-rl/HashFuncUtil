import java.io.IOException;
import java.security.MessageDigest;


public class Main {
    // Получение данных из консоли посредством системного потока ввода (Isystem.in)
    public static void main(String[] args) {
        int inChar;
        String string = "";
        /* Поскольку системный поток получает лишь числовые коды символов,
        можно прочитать лишь код одного символа, для это используем цикл
        */
        try {
            inChar = System.in.read();
            while (System.in.available() > 0) {
                string += (char) inChar;
                inChar = System.in.read();
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        String[] array = string.split(" ");
        String hashString = array[0]; // hash алгоритм
        String str = array[1]; // строка, которую надо зашифровать
        /*
        Класс Java MessageDigest представляет криптографическую хеш-функцию,
        которая может вычислять дайджест сообщения из двоичных данных.
         */
        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];
        /*
        getInstance(String algorithm): возвращает экземпляр класса MessageDigest,
        используя указанный алгоритм хэширования.
        update(byte[] input): добавляет данные для хэширования.
        digest(): завершает процесс хэширования и возвращает хэш-код в виде массива байтов.
        reset(): сбрасывает состояние объекта MessageDigest.
         */
        try {
            messageDigest = MessageDigest.getInstance(hashString);
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            digest = messageDigest.digest();
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Метод getHashCode класса WorkHash
        принимает строку и хэш-сумму(дайджест)
         */
        System.out.println("hash code = " + WorkHash.getHashCode(hashString, digest));
    }
}