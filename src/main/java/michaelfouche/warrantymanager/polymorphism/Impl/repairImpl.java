/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.polymorphism.Impl;

import michaelfouche.warrantymanager.polymorphism.repair;

/**
 *
 * @author foosh
 */
public class repairImpl extends warrantyImpl implements repair {
    public String getMessage(){
        return (super.getMessage()+("\nThe product will be repaired by the manufacturer"));
    }
}
