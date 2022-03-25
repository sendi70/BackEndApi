package com.company;

import java.sql.Array;

public class Ex2 {
    int [] CRC_TABLE=new int[256];
    public Ex2(){
        for (int i=0;i<256;++i){
            int code =  i;
            for (int j=0;j<8;++j){
                if ((code & 0x01)==0) code = 0xEDB88320 ^ (code >>> 1);
                else code = code >>> 1;
            }
            CRC_TABLE[i]=code;
        }
    }
    int convert(String text){
        int crc=-1;
        for (int i=0;i<text.length();++i){
            char code = text.charAt(i);
            crc= CRC_TABLE[(code^crc)&0xFF]^(crc>>>8);
        }
        return (-1^crc)>>>0;
    }
}
