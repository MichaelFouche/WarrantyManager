/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.dip.correction.Impl;

import michaelfouche.warrantymanager.dip.correction.cellphone;

/**
 *
 * @author foosh
 */
public class cellphoneImpl implements cellphone{
    private double pay;
    payoutImpl payout;
    public cellphoneImpl() {
        payout = new payoutImpl();
       
    }
    
    public double calculatePayout(){
        pay=payout.getPayout();
        return pay;
    }
}
