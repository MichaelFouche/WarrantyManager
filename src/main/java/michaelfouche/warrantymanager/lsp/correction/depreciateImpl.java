/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.lsp.correction;

/**
 *
 * @author foosh
 */
public class depreciateImpl implements dep{
    private double total = 1000;
    
    @Override
    public double depreciateTotal(double p){
        total-=p;
        return total;
    }
}
