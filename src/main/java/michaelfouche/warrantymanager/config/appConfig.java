/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.config;

import michaelfouche.warrantymanager.encapsulation.Impl.encapsulationImpl;
import michaelfouche.warrantymanager.encapsulation.encapsulation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author foosh
 */
@Configuration
public class appConfig {
    @Bean(name = "calc")
            public encapsulation GetService()
            {
                return new encapsulationImpl();
            }
}
