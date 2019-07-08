package com.springboot.until;

import org.apache.tomcat.util.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * <ul>
 * <li>项目名：个人学习中心</li>
 * <li>功能描述：MD5加密工具类</li>
 * <li>版本信息：ELP v1.0</li>
 * <li>日期：2016年5月25日-下午3:04:05</li>
 * <li>版权所有(C)2016广东轩辕网络科技股份有限公司-版权所有</li>
 * <li>创建人:周颂灵</li>
 * <li>创建时间：2016年5月25日-下午3:04:05</li>
 * <li>修改人1：</li>
 * <li>修改时间1：</li>
 * <li>修改内容1：</li>
 * </ul>
 */
public class MD5Util {
    private final static String SYSTEM_CODE = "0X000001"; //平台编码  确保来源
    // 全局数组
    private final static String[] strDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b",
            "c", "d", "e", "f"};

    // 返回形式为数字跟字符串
    private static String byteToArrayString(byte bByte) {
        int iRet = bByte;
        if (iRet < 0) {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return strDigits[iD1] + strDigits[iD2];
    }

    // 转换字节数组为16进制字串
    private static String byteToString(byte[] bByte) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++) {
            sBuffer.append(byteToArrayString(bByte[i]));
        }
        return sBuffer.toString();
    }

    /**
     * encrypt 方法
     *
     * @param strObj
     * @return String
     * @descript：加密
     * @author 周颂灵
     * @date 2016年5月25日-上午11:22:28
     */
    public static String encrypt(String strObj) {
        String resultString = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            try {
                resultString = byteToString(md.digest(strObj.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return resultString;
    }

    /**
     * @param bytes
     * @return
     */
    public static byte[] decode(final byte[] bytes) {
        return Base64.decodeBase64(bytes);
    }

    /**
     * 二进制数据编码为BASE64字符串
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    public static String encode(final byte[] bytes) {
        try {
            return new String(Base64.encodeBase64(bytes), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * base64Encrypt 方法
     *
     * @param str
     * @return String
     * @throws UnsupportedEncodingException
     * @descript：base64编码加密
     * @author 周颂灵
     * @date 2016年6月25日-上午9:36:25
     */
    public static String base64Encrypt(String str) {
        try {
            return encode((SYSTEM_CODE + str + SYSTEM_CODE).getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * base64decode 方法
     *
     * @param str
     * @return String
     * @descript：base64解密
     * @author 周颂灵
     * @date 2016年6月25日-上午9:40:29
     */
    public static String base64decode(String str) {
        try {
            String v = new String(decode(str.getBytes("utf-8")), "utf-8");
            return v.replace(SYSTEM_CODE, "");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

    }

}
