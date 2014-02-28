/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaelfouche.warrantymanager;

import michaelfouche.warrantymanager.config.appConfig;
import michaelfouche.warrantymanager.encapsulation.user;
import michaelfouche.warrantymanager.inheritance.product;
import michaelfouche.warrantymanager.inheritance.retailer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author foosh
 */
public class WarrantyManagerTest {
    
    public static user userService;
    public static product productService;
    public static retailer retailerService;
    public WarrantyManagerTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test //1
    public void lastname() {
        userService.setLastName("Jack Daniels");
        Assert.assertEquals(userService.getLastName(),"Jack Daniels");        
    }
    //Inheritance
    @Test 
    public void productModel() {
        productService.setModel("S4");
        Assert.assertEquals(productService.getModel(),"S4");        
    }
    @Test 
    public void productSN() {
        productService.setSN("Ab123456");
        Assert.assertEquals(productService.getSN(),"Ab123456");        
    }
    @Test     
    public void productManufacturer() {
        productService.setManufacturer("Samsung");
        Assert.assertEquals(productService.getManufacturer(),"Samsung");        
    }
    @Test 
    public void productPurchaseDate() {
        productService.setPurchaseDate("11-02-2013");
        Assert.assertEquals(productService.getPurchaseDate(),"11-02-2013");        
    }
    @Test 
    public void productRetailName() {
        productService.productImplAssign(".", ".", ".", ".", "Vodacom", ".", ".");
        Assert.assertEquals(productService.toString(),"....Vodacom..");        
    }
    @Test 
    public void productRetailCity() {
        productService.productImplAssign(".", ".", ".", ".", ".", "Cape Town", ".");
        Assert.assertEquals(productService.toString(),".....Cape Town.");        
    }
    @Test 
    public void productRetailProvince() {
        productService.productImplAssign(".", ".", ".", ".", ".", ".", "Western Cape");
        Assert.assertEquals(productService.toString(),"......Western Cape");  
    }
    
    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfig.class);
        userService = (user)ctx.getBean("userEncapsulation");
        productService = (product)ctx.getBean("productInheritance");
        retailerService = (retailer)ctx.getBean("retailerInheritance");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}