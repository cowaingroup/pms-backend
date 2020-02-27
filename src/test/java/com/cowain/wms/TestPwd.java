package com.cowain.pms;

import org.apache.shiro.crypto.hash.Sha256Hash;

public class TestPwd {

    public static void main(String[] args) {
       String pwd =  new Sha256Hash("admin", "bamiidCpAkKn6SdBFEZj").toHex();
       System.out.println(pwd);
    }
}
