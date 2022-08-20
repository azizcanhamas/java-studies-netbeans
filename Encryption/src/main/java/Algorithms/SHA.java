package Algorithms;

import java.security.NoSuchAlgorithmException;  
import java.math.BigInteger;  
import java.security.MessageDigest;  
import java.nio.charset.StandardCharsets;  

public class SHA {

    //https://www.javatpoint.com/hashing-algorithm-in-java
    
    public static byte[] obtainSHA(String s) throws NoSuchAlgorithmException  
    {  
        MessageDigest msgDgst = MessageDigest.getInstance("SHA-256");    
        return msgDgst.digest(s.getBytes(StandardCharsets.UTF_8));  
    }  

    public static String toHexStr(byte[] hash)  
    {  
        BigInteger no = new BigInteger(1, hash);  
        StringBuilder hexStr = new StringBuilder(no.toString(16));   
        while (hexStr.length() < 32)  
        {  
            hexStr.insert(0, '0');  
        }  
        return hexStr.toString();  
    }  
    
    public static void main(String[] args) {
        try  
        {  
            String str = "kemal125lara";  
            String hash = toHexStr(obtainSHA(str));  
            System.out.println("\n" + str + " : " + hash);  
        }   
        catch (NoSuchAlgorithmException obj)   
        {  
            System.out.println("An exception is generated for the incorrect algorithm: " + obj);  
        }  
    }
    
}
