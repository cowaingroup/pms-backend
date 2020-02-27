package com.cowain.pms.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateCheckUtils {

    private static final String year = "年" ;
    private static final String month = "月" ;
    private static final String day = "日" ;

    private static final String hour = "时" ;
    private static final String min = "分" ;
    private static final String sec = "秒" ;

    private static final String eL = "(((^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._])(10|12|0?[13578])([-\\/\\._])(3[01]|[12][0-9]|0?[1-9]))|(^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._])(11|0?[469])([-\\/\\._])(30|[12][0-9]|0?[1-9]))|(^((1[8-9]\\d{2})|([2-9]\\d{3}))([-\\/\\._])(0?2)([-\\/\\._])(2[0-8]|1[0-9]|0?[1-9]))|(^([2468][048]00)([-\\/\\._])(0?2)([-\\/\\._])(29))|(^([3579][26]00)([-\\/\\._])(0?2)([-\\/\\._])(29))|(^([1][89][0][48])([-\\/\\._])(0?2)([-\\/\\._])(29))|(^([2-9][0-9][0][48])([-\\/\\._])(0?2)([-\\/\\._])(29))|(^([1][89][2468][048])([-\\/\\._])(0?2)([-\\/\\._])(29))|(^([2-9][0-9][2468][048])([-\\/\\._])(0?2)([-\\/\\._])(29))|(^([1][89][13579][26])([-\\/\\._])(0?2)([-\\/\\._])(29))|(^([2-9][0-9][13579][26])([-\\/\\._])(0?2)([-\\/\\._])(29)))((\\s+(0?[1-9]|1[012])(:[0-5]\\d){0,2}(\\s[AP]M))?$|(\\s+([01]\\d|2[0-3])(:[0-5]\\d){0,2})?$))" ;

    public static boolean checkDate(String dateValue){
        if(dateValue!=null||0<dateValue.length()){
            if(dateValue.contains(year)||dateValue.contains(month)||dateValue.contains(day)){
                dateValue = dateValue.replace(year, "-") ;
                dateValue = dateValue.replace(month, "-") ;
                dateValue = dateValue.replace(day, "") ;
            }
            if(dateValue.contains(hour)||dateValue.contains(min)||dateValue.contains(sec)){
                dateValue = dateValue.replace(hour, "-") ;
                dateValue = dateValue.replace(min, "-") ;
                dateValue = dateValue.replace(sec, "") ;
            }
            Pattern p = Pattern.compile(eL);
            Matcher m = p.matcher(dateValue);
            boolean b = m.matches();

            return b ;

        }else{
            return false ;
        }

    }

}
