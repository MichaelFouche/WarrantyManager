/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.dip.violation.Impl;

import michaelfouche.warrantymanager.dip.violation.hardwareToolsPayout;

/**
 *
 * @author foosh
 */
public class hardwareToolsPayoutImpl implements hardwareToolsPayout{
    private double payout;
    
    cellphonePayoutImpl cash1;
    
    public double calculateSalary(cellphonePayoutImpl c){
        payout=c.getPayout()+2500;
        return payout;
    }
}
