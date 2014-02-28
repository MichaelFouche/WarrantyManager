/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.config;


import michaelfouche.warrantymanager.encapsulation.user;
import michaelfouche.warrantymanager.encapsulation.userImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author foosh
 */
@Configuration
public class appConfig {
    @Bean(name = "userEncapsulation")
            public user GetService()
            {
                return new userImpl();
            }
}
