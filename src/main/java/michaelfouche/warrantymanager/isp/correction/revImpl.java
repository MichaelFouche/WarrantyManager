/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.isp.correction;

/**
 *
 * @author foosh
 */
public class revImpl implements review{
    private double price;
    
    @Override
    public double reviewProduct(String descrip){
        if("cellphone".equals(descrip))
            price=4000.00;
        
        return price;
    }
}
