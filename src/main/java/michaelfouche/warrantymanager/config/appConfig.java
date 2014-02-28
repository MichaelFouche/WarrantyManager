/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.config;


import michaelfouche.warrantymanager.encapsulation.user;
import michaelfouche.warrantymanager.encapsulation.Impl.userImpl;
import michaelfouche.warrantymanager.inheritance.Impl.productImpl;
import michaelfouche.warrantymanager.inheritance.Impl.retailerImpl;
import michaelfouche.warrantymanager.inheritance.product;
import michaelfouche.warrantymanager.inheritance.retailer;
import michaelfouche.warrantymanager.polymorphism.Impl.repairImpl;
import michaelfouche.warrantymanager.polymorphism.Impl.replaceImpl;
import michaelfouche.warrantymanager.polymorphism.repair;
import michaelfouche.warrantymanager.polymorphism.replace;
import michaelfouche.warrantymanager.srp.violation.Impl.warrantyValid;
import michaelfouche.warrantymanager.srp.violation.Impl.warrantyValidImpl;
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
    @Bean(name = "retailerInheritance")
            public retailer GetServiceRetail() 
            {
                return new retailerImpl();
            }
    @Bean(name = "warrantyRepairPolymorphism")
            public repair GetServiceRepair() 
            {
                return new repairImpl();
            }
    @Bean(name = "warrantyReplacePolymorphism")
            public replace GetServiceReplace() 
            {
                return new replaceImpl();
            }
    @Bean(name = "daysDifferenceValid")
            public warrantyValid GetServiceDaysDiffValid() 
            {
                return new warrantyValidImpl();
            }
}
