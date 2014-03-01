/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.lsp.violation;

/**
 *
 * @author foosh
 */
public class warrantyVal implements computeWarranty{
    private double price = 1000;
    private double total;
    @Override
    public double reviewProduct(String descrip){
        if("cellphone".equals(descrip))
            price=4000.00;
        
        return price;
    }
    @Override
    public double depreciateTotal(double p){
        return total;
    }
}
