/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.inheritance.Impl;

import michaelfouche.warrantymanager.inheritance.product;

/**
 *
 * @author foosh
 */
public class productImpl extends retailerImpl implements product {
    String model = "";
    String sn= "";
    String manufacturer= "";
    String purchaseDate= "";    
    String placeOfPurchase= "";
    public void setModel(String m){
        model = m;
    }            
    public void setSN(String s){
        sn =s;
    }
    public void setManufacturer(String m){
        manufacturer = m;
    }
    public void setPurchaseDate(String pd){
        purchaseDate = pd;
    }
    public void setPlaceOfPurchase(String pop){
        placeOfPurchase = pop;
    }
    
    public String getModel(){
        return model;
    }
    public String getSN(){
        return sn;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getPurchaseDate(){
        return purchaseDate;
    }
    public String getPlaceOfPurchase(){
        return placeOfPurchase;
    }
    
}
