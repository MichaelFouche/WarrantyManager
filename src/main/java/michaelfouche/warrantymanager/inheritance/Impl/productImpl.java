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
    String sn = "";
    String manufacturer = "";
    String purchaseDate = "";

    public productImpl() {
    }

    public void productImplAssign(String m, String s, String man, String pd, String rn, String rc, String rp) {
        model = m;
        sn = s;
        manufacturer = man;
        purchaseDate = pd;
        retailName = rn;
        retailCity = rc;
        retailProvince = rp;
    }

    public String toString() {
        return model+sn+manufacturer+purchaseDate+retailName+retailCity+retailProvince;
    }

    public void setModel(String m) {
        model = m;
    }

    public void setSN(String s) {
        sn = s;
    }

    public void setManufacturer(String man) {
        manufacturer = man;
    }

    public void setPurchaseDate(String pd) {
        purchaseDate = pd;
    }

    public String getModel() {
        return model;
    }

    public String getSN() {
        return sn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }
}
