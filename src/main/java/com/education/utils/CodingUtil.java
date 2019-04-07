package com.education.utils;

/**
 * @author: ruoniao@gmail.com
 * @date 2019/3/18 9:15
 * Explain:
 */

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Base64;

public class CodingUtil
{
    private static final String UTF_8 = "UTF-8";
    private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

    public static String base64Decoding(String src)
            throws UnsupportedEncodingException
    {
        byte[] b = Base64.decodeBase64(src);
        return new String(b, "UTF-8");
    }

    public static String base64Encoding(String src)
            throws UnsupportedEncodingException
    {
        return Base64.encodeBase64String(src.getBytes("UTF-8"));
    }

    public static String md5(String src)
            throws UnsupportedEncodingException, NoSuchAlgorithmException
    {
        byte[] strTemp = src.getBytes("UTF-8");
        MessageDigest mdTemp = MessageDigest.getInstance("MD5");
        mdTemp.update(strTemp);
        byte[] md = mdTemp.digest();
        int j = md.length;
        char[] str = new char[j * 2];
        int k = 0;
        for (byte byte0 : md)
        {
            str[(k++)] = HEX_DIGITS[(byte0 >>> 4 & 0xF)];
            str[(k++)] = HEX_DIGITS[(byte0 & 0xF)];
        }
        return new String(str);
    }
}