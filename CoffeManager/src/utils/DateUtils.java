package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;

public class DateUtils {
    static     DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public static String dateToString(Date date){
      return formatter.format(date);
    }

    public static Date stringToDate(String stringDate){
        try {
            return  formatter.parse(stringDate);
        } catch (ParseException e) {
          throw  new DateTimeException("Cos van de");
        }
    }


}
