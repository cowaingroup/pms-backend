package com.cowain.pms;

import com.cowain.pms.common.utils.DateUtils;
import com.cowain.pms.common.utils.DocNoRuleUtils;
import com.google.common.base.Strings;
import org.apache.commons.lang.StringUtils;

import java.util.Calendar;

public class TestTime {
    public static void main(String[] args) {
//       long time =  System.currentTimeMillis();
//       System.out.println(time);
//        public static String left(String str, int len) {
        String date = StringUtils.right("2019",2);
//        System.out.println(DocNoRuleUtils.getEntryDocNo());


        String YEAR = StringUtils.right(DateUtils.getCurrentYear(),2);
        String MONTH =  Strings.padStart(DateUtils.getCurrentMonth(),2,'0');
        String DAY = Strings.padStart(DateUtils.getCurrentDay(),2,'0');

        System.out.println(YEAR);
        System.out.println(MONTH);
        System.out.println(DAY);



//        String padding = Strings.padEnd("123", 15, '0');
//        System.out.println(padding);
//        Calendar currentDate = Calendar.getInstance();
//        int year = currentDate.get(Calendar.DAY_OF_MONTH);
//        System.out.println(year);
        // Calendar.MONTH
    }
}
