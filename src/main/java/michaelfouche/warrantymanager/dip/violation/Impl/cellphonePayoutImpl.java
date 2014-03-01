/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.dip.violation.Impl;

import michaelfouche.warrantymanager.dip.violation.cellphonePayout;

/**
 *
 * @author foosh
 */
public class cellphonePayoutImpl implements cellphonePayout{
    private double payout;
    
    public void setPayout(){
        payout=2500;
    }
    public double getPayout(){
        return payout;
    }
}
