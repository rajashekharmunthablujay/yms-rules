package com.kewill.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;

import com.kewill.yms.domains.jaxb.appointmentoutbound.Trailer;

public class RulesUtil {

    public static BigDecimal convertToBigDecimal(String number) throws ParseException {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);

        // parse the string
        BigDecimal bigDecimal = null;
        if (number == null){
            bigDecimal = (BigDecimal) decimalFormat.parse("0");
            }
        else
            bigDecimal = (BigDecimal) decimalFormat.parse(number);
        return bigDecimal;

    }

    public static void main(String[] args) throws ParseException {
        BigDecimal weight = convertToBigDecimal(null);
        BigDecimal volume = convertToBigDecimal("123");
        Trailer $trailer = new Trailer();
        $trailer.getTotalVolume().compareTo(volume);
        if (weight.compareTo(volume) == 1) {
            System.out.println(weight);
        }
    }
}
