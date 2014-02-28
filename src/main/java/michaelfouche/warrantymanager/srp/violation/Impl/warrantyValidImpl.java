/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.srp.violation.Impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author foosh
 */
public class warrantyValidImpl implements warrantyValid {

    
//This is a function that determines the amount of days between 2 days. and then whether it is less than a certain amount.
    public boolean amountDaysValid(String a, String b,int daysTest) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        //String inputString1 = "23 01 1997";
        // inputString2 = "27 04 1997";

        try {
            Date date1 = myFormat.parse(a);
            Date date2 = myFormat.parse(b);
            long diff = date2.getTime() - date1.getTime();
            long days = ( TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
            return (days<daysTest);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
}
