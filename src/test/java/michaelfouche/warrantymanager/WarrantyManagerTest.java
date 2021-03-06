/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 */
package michaelfouche.warrantymanager;

import michaelfouche.warrantymanager.config.appConfig;
import michaelfouche.warrantymanager.dip.correction.cellphone;
import michaelfouche.warrantymanager.dip.correction.hardwareTools;
import michaelfouche.warrantymanager.dip.violation.cellphonePayout;
import michaelfouche.warrantymanager.dip.violation.hardwareToolsPayout;
import michaelfouche.warrantymanager.encapsulation.user;
import michaelfouche.warrantymanager.inheritance.product;
import michaelfouche.warrantymanager.inheritance.retailer;
import michaelfouche.warrantymanager.lsp.correction.dep;
import michaelfouche.warrantymanager.lsp.correction.rev;
import michaelfouche.warrantymanager.lsp.violation.computeWarranty;
import michaelfouche.warrantymanager.ocp.violation.address;
import michaelfouche.warrantymanager.polymorphism.repair;
import michaelfouche.warrantymanager.polymorphism.replace;
import michaelfouche.warrantymanager.srp.correction.warrantyDifValid;
import michaelfouche.warrantymanager.srp.correction.warrantyDifference;
import michaelfouche.warrantymanager.srp.violation.Impl.warrantyValid;

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
    public static replace replaceService;
    public static repair repairService;
    public static warrantyValid diffDayValidService;
    public static warrantyDifference warrantyDifferenceService;
    public static warrantyDifValid warrantyDifValidService;
    public static cellphonePayout cellphonePayoutService;
    public static hardwareToolsPayout hardwareToolsPayoutService;
    public static address addressService;
    public static hardwareTools hardwareToolsService;
    public static cellphone cellphoneService;
    public static computeWarranty warValueService; 
    public static computeWarranty depreciateService; 
    public static rev revService;
    public static dep depService;
    
    
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
    @Test 
    public void warrantyReplace() {        
        Assert.assertEquals(replaceService.getMessage(),"This product is under warranty.\nThe product will be replaced for a new one by the manufacturer");  
    }
    @Test 
    public void warrantyRepair() {        
        Assert.assertEquals(repairService.getMessage(),"This product is under warranty.\nThe product will be repaired by the manufacturer");  
    }
    @Test 
    public void warrantyDiffDayValidTrue() {        
        Assert.assertTrue(diffDayValidService.amountDaysValid("13 01 1997","23 01 1997",11));  
    }
    @Test 
    public void warrantyDiffDayValidFalse() {        
        Assert.assertFalse(diffDayValidService.amountDaysValid("13 01 1997","23 01 1997",9));  
    }
    
    @Test 
    public void warrantyDifference() {        
        Assert.assertEquals(warrantyDifferenceService.amountDays("13 01 1997","23 01 1997"),10);  
    }    
    @Test 
    public void warrantyDifValidFalse() {        
        Assert.assertFalse(warrantyDifValidService.amountValid(15,10));  //Is 15 smaller than 10
    }
    @Test 
    public void warrantyDifValidTrue() {        
        Assert.assertTrue(warrantyDifValidService.amountValid(10,15));  //Is 10 smaller than 15
    }
    @Test 
    public void warrantyDiffValidFalse() {        
        Assert.assertFalse(warrantyDifValidService.amountValid(200,10));  //Is 200 smaller than 10
    }
    @Test 
    public void warrantyDifferenceEqual() {        
        Assert.assertEquals(warrantyDifferenceService.amountDays("13 01 1998","28 01 1998"),15);  
    }
    @Test
    public void cellphonePayout(){
        cellphonePayoutService.setPayout();
        Assert.assertEquals(cellphonePayoutService.getPayout(), 2500.0);
    }
    @Test
    public void hardwareToolsPayout(){
        
        Assert.assertEquals(hardwareToolsPayoutService.calculatePayout(), 2750.0);
    }
    @Test
    public void cellphonePayoutC(){
        cellphonePayoutService.setPayout();
        Assert.assertEquals(cellphoneService.calculatePayout(), 2500.0);
    }
    @Test
    public void hardwareToolsPayoutC(){
        
        Assert.assertEquals(hardwareToolsService.calculatePayout(), 2750.0);
    }
    @Test
    public void reviewWarr(){
        
        Assert.assertEquals(warValueService.reviewProduct("cellphone"), 4000.0);
    }
    @Test
    public void depreciateWarranty(){
        
        Assert.assertEquals(depreciateService.depreciateTotal(500), 500.0);
    }
    @Test
    public void reviewWarrantyC(){
        
        Assert.assertEquals(revService.reviewProduct("cellphone"), 4000.0);
    }
    @Test
    public void depreciateWarrantyC(){
        
        Assert.assertEquals(depService.depreciateTotal(500), 500.0);
    }
    
    
    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfig.class);
        userService = (user)ctx.getBean("userEncapsulation");
        productService = (product)ctx.getBean("productInheritance");
        retailerService = (retailer)ctx.getBean("retailerInheritance");
        replaceService = (replace)ctx.getBean("warrantyReplacePolymorphism");
        repairService = (repair)ctx.getBean("warrantyRepairPolymorphism");
        diffDayValidService= (warrantyValid)ctx.getBean("daysDifferenceValid");
        warrantyDifferenceService= (warrantyDifference)ctx.getBean("daysDifference");
        warrantyDifValidService= (warrantyDifValid)ctx.getBean("warrantyValid");
        cellphonePayoutService = (cellphonePayout)ctx.getBean("cellphonePayout");
        hardwareToolsPayoutService = (hardwareToolsPayout)ctx.getBean("hardwareToolsPayout");
        addressService = (address)ctx.getBean("address");
        hardwareToolsService = (hardwareTools)ctx.getBean("hardwareToolsPayoutC");
        cellphoneService = (cellphone) ctx.getBean("cellphonePayoutC");
        warValueService = (computeWarranty) ctx.getBean("warValue");
        depreciateService = (computeWarranty) ctx.getBean("depreciate");
        revService = (rev)ctx.getBean("reviewC");
        depService =(dep)ctx.getBean("depreciateC");
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