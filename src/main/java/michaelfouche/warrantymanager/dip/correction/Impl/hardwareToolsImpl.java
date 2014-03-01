/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.dip.correction.Impl;

import michaelfouche.warrantymanager.dip.correction.hardwareTools;

/**
 *
 * @author foosh
 */
public class hardwareToolsImpl implements hardwareTools{
    private double pay;
    payoutImpl payout;
    public hardwareToolsImpl() {
        payout = new payoutImpl();
       
    }
    
    public double calculatePayout(){
        pay=payout.getPayout()+250;
        return pay;
    }
}
