package com.education.utils;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

/**
 * @author: ruoniao@gmail.com
 * @date 2019/3/21 9:14
 * Explain:
 */
public class CodingUtilTest {

    @Autowired
    private CodingUtil codingUtil;

    @Test
    public void base64Decoding() throws UnsupportedEncodingException {
        System.out.print(CodingUtil.base64Encoding("kkop"));
    }

    @Test
    public void base64Encoding() throws UnsupportedEncodingException {
        System.out.print(CodingUtil.base64Decoding("a2tvcA=="));
    }

    @Test
    public void md5() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        System.out.print(CodingUtil.md5("kkop"));
    }
}