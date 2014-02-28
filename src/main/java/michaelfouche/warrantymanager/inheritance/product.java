/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.inheritance;


/**
 *
 * @author foosh
 */
public interface product {
    void productImplAssign(String m, String s, String man, String pd, String rn, String rc, String rp);    
    void setModel(String model);
    void setSN(String sn);
    void setManufacturer(String manufacturer);
    void setPurchaseDate(String purchaseDate);
    
    String getModel();
    String getSN();
    String getManufacturer();
    String getPurchaseDate();
    String toString();
}
