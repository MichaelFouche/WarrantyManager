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
    void setModel(String model);
    void setSN(String sn);
    void setManufacturer(String manufacturer);
    void setPurchaseDate(String purchaseDate);
    void setPlaceOfPurchase(String placeOfPurchase);
    
    String getModel();
    String getSN();
    String getManufacturer();
    String getPurchaseDate();
    String getPlaceOfPurchase();
}
