package com.rushduck.utils;

import java.security.MessageDigest;
import java.util.UUID;

public class PasswordEncryptor {

    private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
            "6", "!", "#", "@", "a", "b", "c", "d", "*", "f", "g", "F" };

    private Object salt;
    private String algorithm;

    public PasswordEncryptor(Object salt, String algorithm) {
        this.salt = salt;
        this.algorithm = algorithm;
    }

    public String encode(String rawPass) {
        String result = null;
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            // ���ܺ���ַ���
            result = byteArrayToHexString(md.digest(mergePasswordAndSalt(
                    rawPass).getBytes("utf-8")));
        } catch (Exception ex) {
        }
        return result;
    }

    public boolean isPasswordValid(String encPass, String rawPass) {
        String pass1 = "" + encPass;
        String pass2 = encode(rawPass);

        return pass1.equals(pass2);
    }

    private String mergePasswordAndSalt(String password) {
        if (password == null) {
            password = "";
        }

        if ((salt == null) || "".equals(salt)) {
            return password;
        } else {
            return password + "{" + salt.toString() + "}";
        }
    }

    /**
     * ת���ֽ�����Ϊ16�����ִ�
     * b�ֽ�����
     * 16�����ִ�
     */
    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n = 256 + n;
        int d1 = n / hexDigits.length;
        int d2 = n % hexDigits.length;
        return hexDigits[d1] + hexDigits[d2];
    }
    
    /*
    public static void main(String[] args) {
        String salt = UUID.randomUUID().toString();
        PasswordEncryptor encoderMd5 = new PasswordEncryptor(salt, "sha-256");
        String encodedPassword = encoderMd5.encode("root");
        System.out.println("���ܺ����룺" + encodedPassword + "\n���볤�ȣ�" + encodedPassword.length());
        encoderMd5 = new PasswordEncryptor(salt, "sha-256");
        encodedPassword = encoderMd5.encode("xiaochangwei's password");
        System.out.println("���ܺ����룺" + encodedPassword + "\n���볤�ȣ�" + encodedPassword.length());
        System.out.println("salt:" + salt);
    }
    */

}