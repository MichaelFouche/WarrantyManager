/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager.config;


import michaelfouche.warrantymanager.dip.correction.Impl.cellphoneImpl;
import michaelfouche.warrantymanager.dip.correction.Impl.hardwareToolsImpl;
import michaelfouche.warrantymanager.dip.correction.cellphone;
import michaelfouche.warrantymanager.dip.correction.hardwareTools;
import michaelfouche.warrantymanager.dip.violation.Impl.cellphonePayoutImpl;
import michaelfouche.warrantymanager.dip.violation.Impl.hardwareToolsPayoutImpl;
import michaelfouche.warrantymanager.dip.violation.cellphonePayout;
import michaelfouche.warrantymanager.dip.violation.hardwareToolsPayout;
import michaelfouche.warrantymanager.encapsulation.user;
import michaelfouche.warrantymanager.encapsulation.Impl.userImpl;
import michaelfouche.warrantymanager.inheritance.Impl.productImpl;
import michaelfouche.warrantymanager.inheritance.Impl.retailerImpl;
import michaelfouche.warrantymanager.inheritance.product;
import michaelfouche.warrantymanager.inheritance.retailer;
import michaelfouche.warrantymanager.lsp.correction.dep;
import michaelfouche.warrantymanager.lsp.correction.depreciateImpl;
import michaelfouche.warrantymanager.lsp.correction.rev;
import michaelfouche.warrantymanager.lsp.correction.reviewImpl;
import michaelfouche.warrantymanager.lsp.violation.computeWarranty;
import michaelfouche.warrantymanager.lsp.violation.depreciate;
import michaelfouche.warrantymanager.lsp.violation.warrantyVal;
import michaelfouche.warrantymanager.ocp.violation.Impl.addressImpl;
import michaelfouche.warrantymanager.ocp.violation.address;
import michaelfouche.warrantymanager.polymorphism.Impl.repairImpl;
import michaelfouche.warrantymanager.polymorphism.Impl.replaceImpl;
import michaelfouche.warrantymanager.polymorphism.repair;
import michaelfouche.warrantymanager.polymorphism.replace;
import michaelfouche.warrantymanager.srp.correction.Impl.warrantyDifValidImpl;
import michaelfouche.warrantymanager.srp.correction.Impl.warrantyDifferenceImpl;
import michaelfouche.warrantymanager.srp.correction.warrantyDifValid;
import michaelfouche.warrantymanager.srp.correction.warrantyDifference;
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
    @Bean(name = "daysDifference")
            public warrantyDifference GetServiceDaysDiff() 
            {
                return new warrantyDifferenceImpl();
            }
    @Bean(name = "warrantyValid")
            public warrantyDifValid GetServiceDaysValid() 
            {
                return new warrantyDifValidImpl();
            }
    @Bean(name = "hardwareToolsPayout")
            public hardwareToolsPayout GetServiceHardwarePayout() 
            {
                return new hardwareToolsPayoutImpl();
            }
    @Bean(name = "cellphonePayout")
            public cellphonePayout GetServiceCellphonePayout() 
            {
                return new cellphonePayoutImpl();
            }
    @Bean(name = "address")
            public address GetServiceAddress() 
            {
                return new addressImpl();
            }
    @Bean(name = "hardwareToolsPayoutC")
            public hardwareTools GetServiceHardwarePayoutC() 
            {
                return new hardwareToolsImpl();
            }
    @Bean(name = "cellphonePayoutC")
            public cellphone GetServiceCellphoneC() 
            {
                return new cellphoneImpl();
            }
    @Bean(name = "warValue")
            public computeWarranty GetServiceCompW() 
            {
                return new warrantyVal();
            }
    @Bean(name = "depreciate")
            public computeWarranty GetServiceDep() 
            {
                return new depreciate();
            }
    @Bean(name = "depreciateC")
            public dep GetServiceDepC() 
            {
                return new depreciateImpl();
            }
    @Bean(name = "reviewC")
            public rev GetServiceRevC() 
            {
                return new reviewImpl();
            }
   
    
}
