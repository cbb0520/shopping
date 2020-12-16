package com.huguigu.controller.pinyin;
 import net.sourceforge.pinyin4j.PinyinHelper;
 import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
 import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
 import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
 import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
public class Pinyin {


    /**
 48      * 汉字转为拼音
 49      * @param chinese
 50      * @return
 51      */
     public static String ToPinyin(String chinese){
                 String pinyinStr = "";
                 char[] newChar = chinese.toCharArray();
                 HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
                 defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
                 defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
                 for (int i = 0; i < newChar.length; i++) {
                         if (newChar[i] > 128) {
                                 try {
                                         pinyinStr += PinyinHelper.toHanyuPinyinStringArray(newChar[i], defaultFormat)[0];
                                     } catch (BadHanyuPinyinOutputFormatCombination e) {
                                         e.printStackTrace();
                                     }
                             }else{
                                 pinyinStr += newChar[i];
                             }
                     }
                 return pinyinStr;
             }

    public static void main(String[] args) {
                 System.out.println(ToPinyin("范冰冰"));
             }
}
