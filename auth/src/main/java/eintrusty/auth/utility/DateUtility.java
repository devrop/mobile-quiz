package eintrusty.auth.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {


    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    private static final String DATEFORMAT = "yyyy-MM-dd HH:mm:ss";
    
    public static String convertLocalDateToString(LocalDateTime date) {
    	 
    	return date.format(FORMATTER);
    }

    public static LocalDateTime convertStringToLocalDate(String source) {
    	return LocalDateTime.parse(source, FORMATTER);
    	
    }
    public static Date convertToDateViaSqlDate(LocalDate dateToConvert) {
        return java.sql.Date.valueOf(dateToConvert);
    }
    public static Date convertToDateViaInstant(LocalDate dateToConvert) {
        return java.util.Date.from(dateToConvert.atStartOfDay()
          .atZone(ZoneId.systemDefault())
          .toInstant());
    }
    public static Date convertToDateViaInstant(LocalDateTime dateToConvert) {
        return java.util.Date
          .from(dateToConvert.atZone(ZoneId.systemDefault())
          .toInstant());
    }
    
    public static Date convertToDateViaSqlTimestamp(LocalDateTime dateToConvert) {
        return java.sql.Timestamp.valueOf(dateToConvert);
    }
    public static LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
          .atZone(ZoneId.systemDefault())
          .toLocalDateTime();
    }
     
    public static LocalDateTime convertToLocalDateTimeViaMilisecond(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime())
          .atZone(ZoneId.systemDefault())
          .toLocalDateTime();
    }
    
    public static Date convertStringToDate(String dateString) {
    	try {
    		Date result = new SimpleDateFormat(DATEFORMAT).parse(dateString);
    		return  result; 
    	}catch(Exception e) {
    	    return null;	
    	}
    }
    
    public static String convertDateToString(Date date) {
    	try {
    		//Date date = Calendar.getInstance().getTime();  
            if(date ==null) {
            	return "";
            }
    		DateFormat dateFormat = new SimpleDateFormat(DATEFORMAT);  
            return dateFormat.format(date);  
    	}catch(Exception e) {
    		return "";
    	}
    }
}
