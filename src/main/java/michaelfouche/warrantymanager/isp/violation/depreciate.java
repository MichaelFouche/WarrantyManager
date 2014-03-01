/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.isp.violation;

/**
 *
 * @author foosh
 */
public class depreciate implements computeWarranty{
    private double total = 1000;
    private double price;
    
    @Override
    public double reviewProduct(String descrip){
        
        return price;
    }
    @Override
    public double depreciateTotal(double p){
        total-=p;
        return total;
    }
}
