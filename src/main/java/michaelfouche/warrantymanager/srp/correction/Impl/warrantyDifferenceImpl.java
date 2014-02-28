/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.srp.correction.Impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import michaelfouche.warrantymanager.srp.correction.warrantyDifference;

/**
 *
 * @author foosh
 */
public class warrantyDifferenceImpl implements warrantyDifference{

    public int amountDays(String a, String b) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");

        try {
            Date date1 = myFormat.parse(a);
            Date date2 = myFormat.parse(b);
            long diff = date2.getTime() - date1.getTime();
            long days = (TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
            return (int) (days);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
