/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.srp.correction.Impl;

import michaelfouche.warrantymanager.srp.correction.warrantyDifValid;

/**
 *
 * @author foosh
 */
public class warrantyDifValidImpl implements warrantyDifValid{
    public boolean amountValid(int a, int b){
        return a<b;
    }
}
