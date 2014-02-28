/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.encapsulation;

/**
 *
 * @author foosh
 */
public class userImpl implements user {

    String lastname = "";

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String ln) {
        lastname = ln;
    }
}
