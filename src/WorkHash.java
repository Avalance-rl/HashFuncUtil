import java.math.BigInteger;
public class WorkHash {
    // метод для получения hash кода
    public static String getHashCode(String hash, byte[] digest) {
        switch (hash){
            case "MD5":
                BigInteger bigIntMD5 = new BigInteger(1, digest);
                // Хеш содержит 16 байт
                String md5HexMD5 = bigIntMD5.toString(16);
                /* 32 так как обычно хеш 16 байтов представляется
                 как последовательность из 32 шестнадцатеричных цифр
                */
                while( md5HexMD5.length() < 32 ){
                    md5HexMD5 = "0" + md5HexMD5;
                }
                return md5HexMD5;
            case "SHA1":
                BigInteger bigIntSHA1 = new BigInteger(1, digest);
                // Хеш содержит 20 байт
                String md5HexSHA1 = bigIntSHA1.toString(20);
                /* 40 так как обычно хеш 20 байтов представляется
                 как последовательность из 40 шестнадцатеричных цифр
                */
                while( md5HexSHA1.length() < 40 ){
                    md5HexSHA1 = "0" + md5HexSHA1;
                }
                return md5HexSHA1;
            case "SHA128":
                BigInteger bigIntSHA128 = new BigInteger(1, digest);
                // Хеш содержит 16 байт
                String md5HexSHA128 = bigIntSHA128.toString(16);
                /* 32 так как обычно хеш 16 байтов представляется
                 как последовательность из 32 шестнадцатеричных цифр
                */
                while( md5HexSHA128.length() < 32 ){
                    md5HexSHA128 = "0" + md5HexSHA128;
                }
                return md5HexSHA128;
            case "SHA512":
                BigInteger bigIntSHA512 = new BigInteger(1, digest);
                // Хеш содержит 64 байта
                String md5HexSHA512 = bigIntSHA512.toString(64);
                /* 128 так как обычно хеш 64 байтов представляется
                 как последовательность из 124 шестнадцатеричных цифр
                */
                while( md5HexSHA512.length() < 128 ){
                    md5HexSHA512 = "0" + md5HexSHA512;
                }
                return md5HexSHA512;
            default:
                return "Используйте верхний регистр";
        }
    }
}
