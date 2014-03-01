/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.isp.correction;

/**
 *
 * @author foosh
 */
public class depImpl implements depreciate{
    private double total = 1000;
    
    @Override
    public double depreciateTotal(double p){
        total-=p;
        return total;
    }
}