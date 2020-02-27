package com.cowain.pms.common.utils;

import com.google.common.base.Strings;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 单据规则工具类
 */
public class DocNoRuleUtils {

    private static  Logger logger = LoggerFactory.getLogger(DocNoRuleUtils.class);

    private static final int SUFFIX_LENGTH = 6;
    private static final char PADDING_STRING = '0';

    public static AtomicInteger loadingInteger=new AtomicInteger(0);

    public static AtomicInteger palletInteger=new AtomicInteger(0);

    public static AtomicInteger streciveInteger=new AtomicInteger(0);

    public static AtomicInteger misreciveInteger=new AtomicInteger(0);

    public static AtomicInteger misInteger = new AtomicInteger(0);

    public static AtomicInteger stinInteger = new AtomicInteger(0);

    public static AtomicInteger transInteger = new AtomicInteger(0);

    public static AtomicInteger returnInteger = new AtomicInteger(0);

    public static AtomicInteger compInteger = new AtomicInteger(0);

    public static AtomicInteger materialInteger = new AtomicInteger(0);

    public static AtomicInteger mergeInteger = new AtomicInteger(0);

    public static AtomicInteger taskInteger = new AtomicInteger(0);

    public static AtomicInteger packInteger = new AtomicInteger(0);

    public static AtomicInteger bzOutInteger = new AtomicInteger(0);

    public static AtomicInteger matOutInteger = new AtomicInteger(0);

    public static AtomicInteger misOutInteger = new AtomicInteger(0);

    public static AtomicInteger tranOutInteger = new AtomicInteger(0);

    public static AtomicInteger pbtInteger = new AtomicInteger(0);

    /*      */
    public static  void setLoadingValue(AtomicInteger LoadingValue){
        loadingInteger = LoadingValue;
    }

    public static  void setPalletValue(AtomicInteger palletValue){
        palletInteger = palletValue;
    }

    public static  void setPbtValue(AtomicInteger pbtValue){
        pbtInteger = pbtValue;
    }

    public static  void setPackValue(AtomicInteger packValue){
        packInteger = packValue;
    }

    public static  void setStReciveValue(AtomicInteger streciveValue){
        streciveInteger = streciveValue;
    }

    public static  void setMisReciveValue(AtomicInteger misreciveValue){
        misreciveInteger = misreciveValue;
    }
    public static  void setMisValue(AtomicInteger misValue){
        misInteger = misValue;
    }

    public static  void setRtValue(AtomicInteger rtValue){
        returnInteger = rtValue;
    }

    public static  void setStValue(AtomicInteger stValue){
        stinInteger = stValue;
    }

    public static  void setTransValue(AtomicInteger transValue){
        transInteger = transValue;
    }

    public static  void setMatValue(AtomicInteger materialValue){
        materialInteger = materialValue;
    }

    public static  void setCompValue(AtomicInteger compValue){
        compInteger = compValue;
    }

    public static  void setMergeValue(AtomicInteger mergeValue){
        mergeInteger = mergeValue;
    }

    public static  void setTaskValue(AtomicInteger taskValue){ taskInteger =taskValue; }

    public static  void setBzOutValue(AtomicInteger bzOutValue){
        bzOutInteger = bzOutValue;
    }

    public static  void setMisOutValue(AtomicInteger misOutValue){
        misOutInteger = misOutValue;
    }

    public static  void setTranOutValue(AtomicInteger tranOutValue){
        tranOutInteger = tranOutValue;
    }

    public static  void setMatOutValue(AtomicInteger matOutValue){ matOutInteger =matOutValue; }
   /**
     * 获取入库单编号
     * @return
     */
    public static String getDocNo(String docNoType){

        logger.info("开始获取 docNoType = " + docNoType + "的序号");
        String  serialNo = getSerialNo(docNoType);
        logger.info("获取到 docNoType = " + docNoType + "的序号 = ["+serialNo+"]");
        String YEAR = StringUtils.right(DateUtils.getCurrentYear(),2);
        String MONTH =  Strings.padStart(DateUtils.getCurrentMonth(),2,'0');
        String DAY = Strings.padStart(DateUtils.getCurrentDay(),2,'0');

        return docNoType + YEAR + MONTH + DAY + serialNo;
    }


    /**
     * 获取流水号码
     * @return
     */
    public static String getSerialNo(String prefix) {
        String retValue = "";
        switch (prefix) {

            case LOADING_PREFIX:
                retValue = Strings.padStart(String.valueOf(loadingInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case PALLET_PREFIX:
                retValue = Strings.padStart(String.valueOf(palletInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case STRECIVE_PREFIX:
                retValue = Strings.padStart(String.valueOf(streciveInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case MISRECIV_PREFIX:
                retValue = Strings.padStart(String.valueOf(misreciveInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case STIN_PREFIX:
                retValue = Strings.padStart(String.valueOf(stinInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case MIS_PREFIX:
                retValue = Strings.padStart(String.valueOf(misInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case RETURN_PREFIX:
                retValue = Strings.padStart(String.valueOf(returnInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case TRANS_PREFIX:
                retValue = Strings.padStart(String.valueOf(transInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case MATERIAL_PREFIX:
                retValue = Strings.padStart(String.valueOf(materialInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case COMPLETE_PREFIX:
                retValue = Strings.padStart(String.valueOf(compInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case MERGE_PREFIX:
                retValue = Strings.padStart(String.valueOf(mergeInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case ZXDDOCNO_PREFIX:
                retValue = Strings.padStart(String.valueOf(packInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case TASK_PREFIX:
                retValue = Strings.padStart(String.valueOf(taskInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case BZOUT_PREFIX:
                retValue = Strings.padStart(String.valueOf(bzOutInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case MATOUT_PREFIX:
                retValue = Strings.padStart(String.valueOf(matOutInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case MISOUT_PREFIX:
                retValue = Strings.padStart(String.valueOf(misOutInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case TRANOUT_PREFIX:
                retValue = Strings.padStart(String.valueOf(tranOutInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            case PUBTASK_PREFIX:
                retValue = Strings.padStart(String.valueOf(pbtInteger.incrementAndGet()), SUFFIX_LENGTH, PADDING_STRING);
                break;
            default:
                break;
        }
        return retValue;
    }

    public static final String LOADING_PREFIX = "ZCD";//装车单
    public static final String PALLET_PREFIX = "ZBZXD";//栈板装箱单
    public static final String STRECIVE_PREFIX = "BZSH";//标准收货
    public static final String PUBTASK_PREFIX = "PBT";//发布任务
    public static final String MISRECIV_PREFIX = "ZSSH";//杂收
    public static final String STIN_PREFIX = "BZRK";
    public static final String MIS_PREFIX = "ZSRK";//杂收入库
    public static final String RETURN_PREFIX = "XTRK";
    public static final String TRANS_PREFIX = "DRRK";
    public static final String MATERIAL_PREFIX = "CLRK";
    public static final String COMPLETE_PREFIX = "WGRK";
    public static final String MERGE_PREFIX = "HZRK";
    public static final String BZOUT_PREFIX = "BZCH";
    public static final String MATOUT_PREFIX = "CRKD";
    public static final String MISOUT_PREFIX = "ZFCK";
    public static final String TRANOUT_PREFIX = "DCCK";
    public static final String TASK_PREFIX = "RMB";
    public static final String BC_PREFIX = "BC";
    public static final String ADJUSTDOCNO_PREFIX = "A";
    public static final String CHECKDOCNO_PREFIX = "C";
    public static final String MOVEDOCNO_PREFIX = "M";
    public static final String ZXDDOCNO_PREFIX = "ZXD";
}
