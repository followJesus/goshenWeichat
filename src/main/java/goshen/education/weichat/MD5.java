/**
 * 
 */
package goshen.education.weichat;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author cunli
 * 2016年8月23日 下午9:28:10
 */
public class MD5 {
	// 全局数组
    private final static String[] strDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    // 返回形式为数字跟字符串
    private static String byteToArrayString(byte bByte) {
        int n = bByte;
        if (n < 0) {
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return strDigits[d1] + strDigits[d2];
    }

    // 返回形式只为数字
    private static String byteToNum(byte bByte) {
        int n = bByte;

        if (n < 0) {
            n += 256;
        }
        return String.valueOf(n);
    }

    // 转换字节数组为16进制字串
    private static String byteToString(byte[] bByte) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++) {
            sBuffer.append(byteToArrayString(bByte[i]));
        }
        return sBuffer.toString();
    }

    public static String GetMD5Code(String strObj) {
        String resultString = null;
        try {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");
            // md.digest() 该函数返回值为存放哈希值结果的byte数组
            resultString = byteToString(md.digest(strObj.getBytes()));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return resultString;
    }

//    public static void main(String[] args) {
//
//        System.out.println(MD5.GetMD5Code("haliluya"));//01bd0ee9fb778a9a9e363e9699e3471f
//
//    }
}
