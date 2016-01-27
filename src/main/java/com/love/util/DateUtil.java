package com.love.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;

public class DateUtil {


    /**
     * 获取当前时间 yyyy-MM-dd HH:mm:ss
     * @return yyyy-MM-dd HH:mm:ss 格式的日期
     */
    public static Date getDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        ParsePosition pos = new ParsePosition(8);
        Date currentTime_2 = formatter.parse(dateString, pos);

        return currentTime_2;
    }
    public static Date getDate(Date date,int days,int months,int years){
        return null;
    }
    /**
     * 获取当前时间 yyyy-MM-dd
     * @return yyyy-MM-dd 格式的日期
     */
    public static Date getShortDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);
        ParsePosition pos = new ParsePosition(0);
        Date currentTime_2 = formatter.parse(dateString, pos);

        return currentTime_2;
    }

    /**
     * 获取当前时间 yyyy-MM-dd HH:mm:ss
     * @return yyyy-MM-dd HH:mm:ss格式的日期字符串
     */
    public static String getDateString() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);

        return dateString;
    }

    /**
     * 获取当前时间 yyyy-MM-dd
     * @return yyyy-MM-dd格式的日期字符串
     */
    public static String getShortDateString() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);

        return dateString;
    }


    /**
     * 获取自定格式format的当前时间字符串
     * @return format格式的时间字符串 
     */
    public static String getDateString(String format) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        String dateString = formatter.format(currentTime);

        return dateString;
    }

    /**获取自定格式的当前日期
     * @param format 如：yyyy-MM-dd ; yyyy-MM-dd HH:mm:ss
     * @return format 格式的当前日期
     */
    public static Date getDate(String format){

        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        ParsePosition parsePosition=new ParsePosition(0);
        date=simpleDateFormat.parse(date.toString(),parsePosition);
        return date;


    }
    /**
     * 获取当前时间 HH:mm:ss 即当时分秒字符串
     * @return 当前时间的时分秒字符串
     */
    public static String getTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date currentTime = new Date();
        String dateString = formatter.format(currentTime);

        return dateString;
    }

    /**
     * 获取给定日期的时分秒字符串
     * @param dateString 日期型字符串
     * @param format     日期型字符串的日期格式
     * @return              给定日期的时分秒字符串
     */
    public static String getTime(String dateString,String format) {

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format);
        Date currentTime = simpleDateFormat.parse(dateString, new ParsePosition(0));
        String date = formatter.format(currentTime);

        return date;
    }

    /**
     * 获取给定日期的时分秒字符串
     * @param date           日期
     * @return              给定日期的时分秒字符串
     */
    public static String getTime(Date date) {

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String dateString = formatter.format(date);

        return dateString;
    }



    /**将给定日期转化为给定格式的字符串
     * @param date   日期
     * @param format 日期格式
     * @return         format格式的日期字符串
     */
    public static String getDateString(Date date,String format) {

        SimpleDateFormat formatter = new SimpleDateFormat(format);
        String dateString = formatter.format(date);

        return dateString;
    }

    /**将给定日期转化为yyyy-MM-dd HH:mm:ss格式的字符串
     * @param date   日期
     * @return         yyyy-MM-dd HH:mm:ss格式的日期字符串
     */
    public static String getDateString(Date date) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(date);

        return dateString;
    }

    /**
     * 字符串转日期型 yyyy-MM-dd
     */
    public static Date strToDate(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);

        return strtodate;
    }

    /**
     * 字符串转日期型
     */
    public static Date strToDate(String strDate, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);

        return strtodate;
    }

    /**
     * 日期型转字符串 yyyy-MM-dd HH:mm:ss
     */
    public static String dateToStrLong(java.util.Date dateDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(dateDate);

        return dateString;
    }

    /**
     * 日期型转字符串 yyyy-MM-dd
     */
    public static String dateToStr(java.util.Date dateDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(dateDate);

        return dateString;
    }

    /**
     * 获取当前时间
     */
    public static Date getNow() {
        Date currentTime = new Date();

        return currentTime;
    }

    /**
     * 获取最新时间
     */
    public static Date getLastDate(long day) {
        Date date = new Date();
        long date_3_hm = date.getTime() - 3600000 * 34 * day;
        Date date_3_hm_date = new Date(date_3_hm);

        return date_3_hm_date;
    }

    /**
     * 获取当前时间 yyyyMMdd HHmmss
     */
    public static String getStringToday() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss");
        String dateString = formatter.format(currentTime);

        return dateString;
    }

    /**
     * 获取当前时间小时
     */
    public static String getHour() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        String hour;
        hour = dateString.substring(11, 13);

        return hour;
    }


     public static String getUserDate(String sformat) {
      Date currentTime = new Date();
      SimpleDateFormat formatter = new SimpleDateFormat(sformat);
      String dateString = formatter.format(currentTime);
      return dateString;
     }


     public static String getTwoHour(String st1, String st2) {
      String[] kk = null;
      String[] jj = null;
      kk = st1.split(":");
      jj = st2.split(":");
      if (Integer.parseInt(kk[0]) < Integer.parseInt(jj[0]))
       return "0";
      else {
       double y = Double.parseDouble(kk[0]) + Double.parseDouble(kk[1]) / 60;
       double u = Double.parseDouble(jj[0]) + Double.parseDouble(jj[1]) / 60;
       if ((y - u) > 0)
        return y - u + "";
       else
        return "0";
      }
     }


     public static String getTwoDay(String sj1, String sj2) {
      SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
      long day = 0;
      try {
       java.util.Date date = myFormatter.parse(sj1);
       java.util.Date mydate = myFormatter.parse(sj2);
       day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
      } catch (Exception e) {
       return "";
      }
      return day + "";
     }

     public static String getPreTime(String sj1, String jj) {
      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String mydate1 = "";
      try {
       Date date1 = format.parse(sj1);
       long Time = (date1.getTime() / 1000) + Integer.parseInt(jj) * 60;
       date1.setTime(Time * 1000);
       mydate1 = format.format(date1);
      } catch (Exception e) {
      }
      return mydate1;
     }

     public static String getPreDay(Date nowdate, String delay) {
      try{
      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
      String mdate = "";
      long myTime = (nowdate.getTime() / 1000) - Integer.parseInt(delay) * 24 * 60 * 60;
      nowdate.setTime(myTime * 1000);
      mdate = format.format(nowdate);
      return mdate;
      }catch(Exception e){
       return "";
      }
     }


     public static String getNextDay(String nowdate, String delay) {
       return getNextDay(strToDate(nowdate), delay);
     }

     /**
      * 取未来日
      * @param nowdate 对象日期
      * @param delay 加算天数
      * @return 未来日
      */
     public static String getNextDay(Date nowdate, String delay) {
         try{
             SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
             String mdate = "";
             long myTime = (nowdate.getTime() / 1000) + Integer.parseInt(delay) * 24 * 60 * 60;
             nowdate.setTime(myTime * 1000);
             mdate = format.format(nowdate);
             return mdate;
         }catch(Exception e){
             return "";
         }
     }

     public static String getNextDay1(Date nowdate, String delay) {
         try{
             SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
             String mdate = "";
             long myTime = (nowdate.getTime() / 1000) + Integer.parseInt(delay) * 24 * 60 * 60;
             nowdate.setTime(myTime * 1000);
             mdate = format.format(nowdate);
             return mdate;
         }catch(Exception e){
             return "";
         }
     }

    /**
     * 取指定日期的月末日
     * 
     * @param _date 指定日期
     * @return 月末日
     */
    public static Date getMonthEndDay(Date _date) {

        if (_date == null) {
            throw new IllegalArgumentException();
        }

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(_date);
        int monthEndDay = calendar.getActualMaximum(Calendar.DATE);
        calendar.set(Calendar.DATE, monthEndDay);

        return calendar.getTime();
    }

    public static Date getMonthStartDay(Date _date) {

        return DateUtil.strToDate(DateUtil.dateToStr(_date).substring(0, 8).concat("01"));
    }

    /**
     * 取指定日期+指定月数后的日期
     * <p>
     * addMonths(2008/01/30, 2) = 2008/03/30<br>
     * addMonths(2008/01/30, 1) = 2008/02/29<br>
     * addMonths(2008/03/30, -1) = 2008/02/29
     * </p>
     * 
     * @param _date 指定日期
     * @param _amount 加算月数
     * @return 月数计算后的日期
     */
    public static Date addMonths(Date _date, int _amount) {
        return org.apache.commons.lang3.time.DateUtils.addMonths(_date, _amount);
    }

    /**
     * 指定日期+指定年数后的日期
     * 
     * @param _date 指定日期
     * @param _amount 加算年数
     * @return 年数计算后的日期
     */
    public static Date addYears(Date _date, int _amount) {
        return org.apache.commons.lang3.time.DateUtils.addYears(_date, _amount);
    }

    /**
     * 取得日期的指定格式
     * 
     * @param _date 日期
     * @param _format 指定格式
     * @return 格式化后的日期
     */
    public static String format(Date _date, String _format) {
        if (_date == null || _format == null || _format.isEmpty()) {
            throw new IllegalArgumentException();
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat(_format);
        return dateFormat.format(_date);
    }

     public static boolean isLeapYear(String ddate) {


      Date d = strToDate(ddate);
      GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
      gc.setTime(d);
      int year = gc.get(Calendar.YEAR);
      if ((year % 400) == 0)
       return true;
      else if ((year % 4) == 0) {
       if ((year % 100) == 0)
        return false;
       else
        return true;
      } else
       return false;
     }


     public static String getEDate(String str) {
      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
      ParsePosition pos = new ParsePosition(0);
      Date strtodate = formatter.parse(str, pos);
      String j = strtodate.toString();
      String[] k = j.split(" ");
      return k[2] + k[1].toUpperCase() + k[5].substring(2, 4);
     }


     public static String getEndDateOfMonth(String dat) {// yyyy-MM-dd
      String str = dat.substring(0, 8);
      String month = dat.substring(5, 7);
      int mon = Integer.parseInt(month);
      if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {
       str += "31";
      } else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
       str += "30";
      } else {
       if (isLeapYear(dat)) {
        str += "29";
       } else {
        str += "28";
       }
      }
      return str;
     }


     public static boolean isSameWeekDates(Date date1, Date date2) {
      Calendar cal1 = Calendar.getInstance();
      Calendar cal2 = Calendar.getInstance();
      cal1.setTime(date1);
      cal2.setTime(date2);
      int subYear = cal1.get(Calendar.YEAR) - cal2.get(Calendar.YEAR);
      if (0 == subYear) {
       if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
        return true;
      } else if (1 == subYear && 11 == cal2.get(Calendar.MONTH)) {
       // 如果12月的最后一周横跨来年第一周的话则最后一周即算做来年的第一周
       if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
        return true;
      } else if (-1 == subYear && 11 == cal1.get(Calendar.MONTH)) {
       if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
        return true;
      }
      return false;
     }


     public static String getSeqWeek() {
      Calendar c = Calendar.getInstance(Locale.CHINA);
      String week = Integer.toString(c.get(Calendar.WEEK_OF_YEAR));
      if (week.length() == 1)
       week = "0" + week;
      String year = Integer.toString(c.get(Calendar.YEAR));
      return year + week;
     }


     public static String getWeek(String sdate, String num) {
      // 再转换为时间
      Date dd = DateUtil.strToDate(sdate);
      Calendar c = Calendar.getInstance();
      c.setTime(dd);
      if (num.equals("1")) // 返回星期一所在的日期
       c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
      else if (num.equals("2")) // 返回星期二所在的日期
       c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
      else if (num.equals("3")) // 返回星期三所在的日期
       c.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
      else if (num.equals("4")) // 返回星期四所在的日期
       c.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
      else if (num.equals("5")) // 返回星期五所在的日期
       c.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
      else if (num.equals("6")) // 返回星期六所在的日期
       c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
      else if (num.equals("0")) // 返回星期日所在的日期
       c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
      return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
     }


     public static String getWeek(String sdate) {
      // 再转换为时间
      Date date = DateUtil.strToDate(sdate);
      Calendar c = Calendar.getInstance();
      c.setTime(date);
      // int hour=c.get(Calendar.DAY_OF_WEEK);
      // hour中存的就是星期几了，其范围 1~7
      // 1=星期日 7=星期六，其他类推
      return new SimpleDateFormat("EEEE").format(c.getTime());
     }
     public static String getWeekStr(String sdate){
      String str = "";
      str = DateUtil.getWeek(sdate);
      if("1".equals(str)){
       str = "星期日";
      }else if("2".equals(str)){
       str = "星期一";
      }else if("3".equals(str)){
       str = "星期二";
      }else if("4".equals(str)){
       str = "星期三";
      }else if("5".equals(str)){
       str = "星期四";
      }else if("6".equals(str)){
       str = "星期五";
      }else if("7".equals(str)){
       str = "星期六";
      }
      return str;
     }


     public static long getDays(String date1, String date2,String format) {
      if (date1 == null || date1.equals(""))
       return 0;
      if (date2 == null || date2.equals(""))
       return 0;
      // 转换为标准时间
      SimpleDateFormat myFormatter = new SimpleDateFormat(format);
      java.util.Date date = null;
      java.util.Date mydate = null;
      try {
       date = myFormatter.parse(date1);
       mydate = myFormatter.parse(date2);
      } catch (Exception e) {
      }
      long day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
      return day;
     }

     public static long getDays(java.util.Date date1, java.util.Date date2) {
          long day = (date1.getTime() - date2.getTime()) / (24 * 60 * 60 * 1000);
          return day;
     }


     public static String getNowMonth(String sdate) {
      // 取该时间所在月的一号
      sdate = sdate.substring(0, 8) + "01";

      // 得到这个月的1号是星期几
      Date date = DateUtil.strToDate(sdate);
      Calendar c = Calendar.getInstance();
      c.setTime(date);
      int u = c.get(Calendar.DAY_OF_WEEK);
      String newday = DateUtil.getNextDay(sdate, (1 - u) + "");
      return newday;
     }
     /**
      * 获取yyyyMMdd类型时间字符串的 yyyyMM
      * @param dateStr
      * @return
      */
     public static String getDateYM(String dateStr){
         if(dateStr.length()>=6){
             return dateStr.substring(0, 6);
         }else {
            return dateStr;
        }
     }

     public static String getNo(int k) {

      return getUserDate("yyyyMMddhhmmss") + getRandom(k);
     }


     public static String getRandom(int i) {
      Random jjj = new Random();
      // int suiJiShu = jjj.nextInt(9);
      if (i == 0)
       return "";
      String jj = "";
      for (int k = 0; k < i; k++) {
       jj = jj + jjj.nextInt(9);
      }
      return jj;
     }


     public static boolean RightDate(String date) {

      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      ;
      if (date == null)
       return false;
      if (date.length() > 10) {
       sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      } else {
       sdf = new SimpleDateFormat("yyyy-MM-dd");
      }
      try {
       sdf.parse(date);
      } catch (ParseException pe) {
       return false;
      }
      return true;
     }
     /**
      * 将yyyyMMdd 形式的时间字符串 转换为日期
      * @param formatStr yyyyMMdd形式的字符串
      * @return 日期
      */
     public static Date formatStrToDate(String formatStr){
         String first=formatStr.substring(0, 4);
         String second=formatStr.substring(4,6);
         String s3d=formatStr.substring(6);
         return strToDate(first.concat("-").concat(second).concat("-").concat(s3d));
     }

     /**
      * 将yyyyMMdd 形式的时间字符串 转换为yyyy-MM-dd形式的时间字符串
      * @param formatStr yyyyMMdd形式的字符串
      * @return yyyy-MM-dd形式的字符串
      */
     public static String formatStrToStr(String formatStr){
         String first=formatStr.substring(0, 4);
         String second=formatStr.substring(4,6);
         String s3d=formatStr.substring(6);
         return (first.concat("-").concat(second).concat("-").concat(s3d));
     }




}
