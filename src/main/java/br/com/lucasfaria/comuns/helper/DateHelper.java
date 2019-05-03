package br.com.lucasfaria.comuns.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static String dataAtual() {
        return sdf.format(System.currentTimeMillis());
    }

    public static String formatDateToString(Date date) {

        return sdf.format(date);
    }

    public static Date parseStringToDate(String stringDate) throws ParseException {
        return sdf.parse(stringDate);
    }

    public static String getYear(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        return sdf.format(date);
    }

    public static String getMonth(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        return sdf.format(date);
    }

    public static String getDay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        return sdf.format(date);
    }

}
