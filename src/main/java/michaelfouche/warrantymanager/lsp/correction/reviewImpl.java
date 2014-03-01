/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.lsp.correction;

/**
 *
 * @author foosh
 */
public class reviewImpl implements rev{
    private double price;
    
    @Override
    public double reviewProduct(String descrip){
        if("cellphone".equals(descrip))
            price=4000.00;
        
        return price;
    }
}
