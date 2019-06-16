package com.suixingpay.jooq.util;

import com.google.common.collect.ImmutableList;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.sql.Timestamp;
import java.util.List;

public class Times {

    private static List<String> weekDays = ImmutableList.of("周一", "周二", "周三", "周四", "周五",
            "周六", "周日");

    /**
     * 解析字符串时间为DateTime
     *
     * @param time
     * @param pattern
     * @return
     */
    public static DateTime parse(String time, String pattern) {

        return DateTime.parse(time, DateTimeFormat.forPattern(pattern));

    }

    /**
     * 解析字符串时间为DateTime
     *
     * @param time "YYYY-MM-dd"时间格式
     * @return
     */
    public static DateTime parse(String time) {
        return DateTime.parse(time, DateTimeFormat.forPattern("YYYY-MM-dd"));
    }

    /**
     * unix时间戳
     *
     * @param unixTime
     * @return
     */
    public static DateTime parse(int unixTime) {
        return new DateTime((long) unixTime * 1000);
    }

    /**
     * @param unixTime
     * @return MM-dd
     */
    public static String shortDate(int unixTime) {

        long time = (long) unixTime * 1000;
        return new DateTime(time).toString(DateTimeFormat.forPattern("MM-dd"));

    }

    /**
     * @param unixTime
     * @return MM-dd
     */
    public static String shortDate(int unixTime, String split) {

        System.out.println(unixTime);

        long time = (long) unixTime * 1000;
        return new DateTime(time)
                .toString(DateTimeFormat.forPattern("MM" + split + "dd"));

    }

    /**
     * @param unixTime
     * @return HH:mm
     */
    public static String shortTime(int unixTime) {

        long time = (long) unixTime * 1000;
        return new DateTime(time).toString(DateTimeFormat.forPattern("HH:mm"));

    }

    public static String shortSearchTime(int unixTime) {
        long time = (long) unixTime * 1000;
        return new DateTime(time).toString(DateTimeFormat.forPattern("MM.dd.YYYY"));
    }

    /**
     * @param unixTime
     * @return HH:mm
     */
    public static String AmPmTime(int unixTime) {

        long time = (long) unixTime * 1000;
        return new DateTime(time).toString(DateTimeFormat.forPattern("hh:mma"))
                .replace("上午", "AM").replace("下午", "PM");

    }

    /**
     * @param unixTime
     * @return 周X
     */
    public static String weekDay(int unixTime) {

        DateTime dateTime = new DateTime((long) unixTime * 1000);

        return weekDays.get(dateTime.getDayOfWeek() - 1);

    }

    public static int unixTime(String formatTime) {

        if (StringUtils.isBlank(formatTime)) {

            return 0;
        }

        DateTimeFormatter formatter = DateTimeFormat.forPattern("YYYY-MM-dd HH:mm:ss");

        long millons = formatter.parseDateTime(formatTime).getMillis() / 1000;

        return (int) millons;

    }

    public static DateTime getDateTime(String formatTime) {

        DateTimeFormatter formatter = DateTimeFormat.forPattern("YYYY-MM-dd HH:mm:ss");

        return formatter.parseDateTime(formatTime);
    }

    public static String formatUnixTime(long instant, String pattern) {

        DateTime time = new DateTime(instant * 1000);
        return time.toString(pattern);

    }

    public static String formatSystemTime(long instant, String pattern) {

        DateTime time = new DateTime(instant);
        return time.toString(pattern);

    }

    public static int unixTime(DateTime dateTime) {

        return (int) (dateTime.getMillis() / 1000);

    }

    public static int unixTime(Timestamp dateTime) {

        return (int) (dateTime.getTime() / 1000);

    }

    public static DateTime getDayTime(String formatTime) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("YYYY-MM-dd");

        return formatter.parseDateTime(formatTime);
    }

    public static int zeroUnixTimeToday() {

        DateTime now = DateTime.now();
        DateTime dateTime = new DateTime(now.getYear(), now.getMonthOfYear(),
                now.getDayOfMonth(), 0, 0, 0);

        return (int) (dateTime.getMillis() / 1000);

    }

    /**
     * Java毫秒时间
     *
     * @return
     */
    public static long zeroTimeToday() {

        DateTime now = DateTime.now();
        DateTime dateTime = new DateTime(now.getYear(), now.getMonthOfYear(),
                now.getDayOfMonth(), 0, 0, 0);

        return dateTime.getMillis();

    }

    public static int zeroUnixTimeTomorrow() {

        DateTime now = DateTime.now();
        DateTime tomorrow = now.plusDays(1);
        DateTime dateTime = new DateTime(tomorrow.getYear(), tomorrow.getMonthOfYear(),
                tomorrow.getDayOfMonth(), 0, 0, 0);

        return (int) (dateTime.getMillis() / 1000);
    }

    /**
     * Mills
     *
     * @return
     */
    public static long zeroTimeTomorrow() {

        DateTime now = DateTime.now();
        DateTime tomorrow = now.plusDays(1);
        DateTime dateTime = new DateTime(tomorrow.getYear(), tomorrow.getMonthOfYear(),
                tomorrow.getDayOfMonth(), 0, 0, 0);
        return dateTime.getMillis();

    }

    public static int zeroUnixTimeYesterday() {

        DateTime now = DateTime.now();
        DateTime yesterday = now.plusDays(-1);
        DateTime dateTime = new DateTime(yesterday.getYear(), yesterday.getMonthOfYear(),
                yesterday.getDayOfMonth(), 0, 0, 0);

        return (int) (dateTime.getMillis() / 1000);
    }

    /**
     * Mills
     *
     * @return
     */
    public static long zeroTimeYesterday() {
        DateTime now = DateTime.now();
        DateTime yesterday = now.plusDays(-1);
        DateTime dateTime = new DateTime(yesterday.getYear(), yesterday.getMonthOfYear(),
                yesterday.getDayOfMonth(), 0, 0, 0);
        return dateTime.getMillis();

    }

    public static int zeroUnixTime(int plusDay) {

        DateTime now = DateTime.now();
        DateTime time = now.plusDays(plusDay);
        DateTime dateTime = new DateTime(time.getYear(), time.getMonthOfYear(),
                time.getDayOfMonth(), 0, 0, 0);

        return (int) (dateTime.getMillis() / 1000);
    }

    /**
     * Mills
     *
     * @param plusDay
     * @return
     */
    public static long zeroTime(int plusDay) {
        DateTime now = DateTime.now();
        DateTime time = now.plusDays(plusDay);
        DateTime dateTime = new DateTime(time.getYear(), time.getMonthOfYear(),
                time.getDayOfMonth(), 0, 0, 0);
        return dateTime.getMillis();

    }

    public static int nowUnixTime() {

        DateTime now = DateTime.now();

        return (int) (now.getMillis() / 1000);

    }

    public static void main(String[] args) {

        int time = (int) (DateTime.now().getMillis() / 1000);
        System.out.println(shortTime(time));

    }

    public static DateTime fromUnixTime(int publishTime) {
        long time = (long) publishTime * 1000;
        return new DateTime(time);
    }

    public static Timestamp fromUnixTime2Timestamp(int publishTime) {
        long time = (long) publishTime * 1000;
        return new Timestamp(time);
    }

}
