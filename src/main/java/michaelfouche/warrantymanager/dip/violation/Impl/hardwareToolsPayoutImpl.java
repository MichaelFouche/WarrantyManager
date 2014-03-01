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
public class hardwareToolsPayoutImpl implements hardwareToolsPayout {
    private double payout;
    
    cellphonePayoutImpl cash1;

    public hardwareToolsPayoutImpl() {
        cash1 = new cellphonePayoutImpl();
        cash1.setPayout();
    }
    
    
    public double calculatePayout(){
        cellphonePayoutImpl c = cash1;
        payout=c.getPayout()+250;
        return payout;
    }
}
