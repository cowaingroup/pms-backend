package com.cowain.pms;

import com.cowain.pms.common.utils.DateUtils;
import com.cowain.pms.common.utils.DocNoRuleUtils;
import com.google.common.base.Strings;
import org.apache.commons.lang.StringUtils;

import java.util.concurrent.atomic.AtomicInteger;

public class TestInteger {

    private static final int THREADS_CONUT = 20;

    public static AtomicInteger count = new AtomicInteger(0);

    public static void increase() {
        count.incrementAndGet();
    }

    public static void main(String[] args) {
        AtomicInteger entryInteger = new AtomicInteger(10);
      //  DocNoRuleUtils.setEntryValue(entryInteger);
   //     System.out.println(DocNoRuleUtils.getSerialNo());
//        System.out.println(Strings.padStart("9",2,'0'));
//        String value = "190826100001";
//        int a = 1000101;
//       System.out.println(Long.parseLong(StringUtils.right(String.valueOf(value),6)));
//        System.out.println(Long.compare(3,1));
//
//       int  a  = 190803000000;
//        String maxValue = DateUtils.getDateString() + "000000";
//        long it = Long.valueOf(maxValue);
//        System.out.println(it);
//        for (int i = 0;i < 20 ;i++) {
//            increase();
//            System.out.println(count);
//        }

    }
}