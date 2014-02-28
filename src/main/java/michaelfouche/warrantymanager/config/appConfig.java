/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.config;


import michaelfouche.warrantymanager.encapsulation.user;
import michaelfouche.warrantymanager.encapsulation.Impl.userImpl;
import michaelfouche.warrantymanager.inheritance.Impl.productImpl;
import michaelfouche.warrantymanager.inheritance.product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author foosh
 */
@Configuration
public class appConfig {
    @Bean(name = "userEncapsulation")
            public user GetServiceUser()
            {
                return new userImpl();
            }
    @Bean(name = "productInheritance")
            public product GetServiceProduct()
            {
                return new productImpl();
            }
}
