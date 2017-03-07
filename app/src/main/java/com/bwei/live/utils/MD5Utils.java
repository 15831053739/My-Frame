package com.bwei.live.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/**
 * Created by zhang on 2017/3/7.
 * MD5加密类
 */

public class MD5Utils {
    /**
     * 计算字符串MD5值
     * @param str
     * @return
     */
    public static String md5Str(String str){
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bs = digest.digest(str.getBytes());
            StringBuffer sb = new StringBuffer();
            for(byte b: bs){
                int number  = b & 0xff;
                String string  = Integer.toHexString(number);
                if(string.length() == 1){
                    sb.append("0");
                }
                sb.append(number);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 计算文件的MD5值
     */
    public static String md5File(File file){
        if(file == null ||!file.isFile()||!file.exists()){
            return "";
        }
        FileInputStream in = null;
        String result = "";
        byte buffer[] = new byte[1024];
        int len;
        StringBuffer sb = new StringBuffer();
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            in = new FileInputStream(file);
            while((len = in.read(buffer))!=-1){
                digest.update(buffer,0,len);
            }
            byte [] bytes = digest.digest();
            for(byte b:bytes){
                int number = b &0xff;
                String string  = Integer.toHexString(number);
                if(string.length() == 1) {
                    sb.append("0");
                }
                sb.append(number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(null!=in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}
