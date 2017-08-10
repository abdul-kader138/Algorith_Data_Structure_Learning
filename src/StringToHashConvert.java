/**
 * Developer: Abdul Kader
 * Date- 8/10/2017.
 */

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.util.Scanner;


public class StringToHashConvert {

    public static void main(String[] args) throws Exception{
        Scanner sn = new Scanner(System.in);
        String data = sn.nextLine();

        String hash = getMD5Hash(data);
        System.out.println(hash.toLowerCase());
    }

    /**
     * Returns a hexadecimal encoded MD5 hash for the input String.
     * @param data
     * @return
     */
    private static String getMD5Hash(String data) {
        String result = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");  // for SHA-256
//            MessageDigest digest = MessageDigest.getInstance("MD5");    // for MD5
            byte[] hash = digest.digest(data.getBytes("UTF-8"));
            return bytesToHex(hash); // make it printable
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    /**
     * Use javax.xml.bind.DatatypeConverter class in JDK to convert byte array
     * to a hexadecimal string. Note that this generates hexadecimal in upper case.
     * @param hash
     * @return
     */
    private static String  bytesToHex(byte[] hash) {
        return DatatypeConverter.printHexBinary(hash);
    }
}
