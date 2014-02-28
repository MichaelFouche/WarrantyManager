/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.polymorphism.Impl;

import michaelfouche.warrantymanager.polymorphism.replace;

/**
 *
 * @author foosh
 */
public class replaceImpl extends warrantyImpl implements replace{
    public String getMessage(){
        return (super.getMessage()+("\nThe product will be replaced for a new one by the manufacturer"));
    }
}
