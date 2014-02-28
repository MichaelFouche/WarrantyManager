/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.inheritance;

/**
 *
 * @author foosh
 */
public interface retailer {
    void setRetailName(String rName);
    void setRetailCity(String rCity);
    void setRetailProvince(String rProvince);
    String getRetailName();
    String getRetailCity();
    String getRetailProvince();
}
