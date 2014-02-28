/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.inheritance.Impl;

import michaelfouche.warrantymanager.inheritance.retailer;

/**
 *
 * @author foosh
 */
public class retailerImpl implements retailer{
    String retailName = "";
    String retailCity = "";
    String retailProvince = "";
    public void setRetailName(String rName){
        retailName = rName;
    }
    public void setRetailCity(String rCity){
        retailCity = rCity;
    }
    public void setRetailProvince(String rProvince){
        retailProvince = rProvince;
    }
    public String getRetailName(){
        return retailName;
    }
    public String getRetailCity(){
        return retailProvince;
    }
    public String getRetailProvince(){
        return retailProvince;
    }
}
