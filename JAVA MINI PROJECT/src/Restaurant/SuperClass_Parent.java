
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shruti
 */
public class SuperClass_Parent {
    
     public double FrenchDip;
     public double CheesyMargheritaPizza;
     public double ToastSandwich;
     public double VegSpicyBurger;
     public double ChickenSpicyCheeseBurger;
     public double GarlicBread;
     
     public double Coffee;
     public double Tea;
     public double Smoothie;
     public double CafeLatte;
     public double ColdCoffee;
     public double CocaCola;
     
     public double Meals;
     public double Drinks;
     public double TotalofMD;
     
     public double AllTotalofMD;
     
     public double GetAmount()
     {
         Meals = FrenchDip + CheesyMargheritaPizza + ToastSandwich + VegSpicyBurger + ChickenSpicyCheeseBurger + GarlicBread;
         Drinks = Coffee + Tea + Smoothie + CafeLatte + ColdCoffee + CocaCola;
         TotalofMD = Meals + Drinks;
         AllTotalofMD = TotalofMD ;
         return AllTotalofMD;
         
     }
     
     private JFrame frame;
     
     public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Restaurant Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
     }
     
     //******************************************************Price******************************************************************************
     
     public double pFrenchDip = 250;
     public double pCheesyMargheritaPizza = 399;
     public double pToastSandwich = 245;
     public double pVegSpicyBurger = 255;
     public double pChickenSpicyCheeseBurger = 289;
     public double pGarlicBread = 199;
     
     public double pCoffee = 90;
     public double pTea = 90;
     public double pSmoothie = 110;
     public double pCafeLatte = 150;
     public double pColdCoffee = 120;
     public double pCocaCola = 100;
     
     //**********************************************************************************
     public double mcTax = 0.90;
     
     public Double cFindTax(double cAmount)
     {
         double FindTax = cAmount - (cAmount * mcTax);
         return FindTax;
     }
     //**********************************************************************
}
     
      
              
              
         
          
             
         
         
         
         
     
     
    

