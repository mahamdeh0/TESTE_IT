/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.tast_it2;

/**
 *
 * @author Mohammad
 */
public class Product {
    private String RID;
    private String Pname;
    private String Pprice;
    private int Ammount=1;
    private String PID;
  
    public void setAmmount(int Ammount)
       {
           this.Ammount = Ammount;
                   
       }
     public void setRID(String RID)
       {
           this.RID = RID;
                   
       }
     public void setPname(String Pname)
       {
           this.Pname = Pname;
                   
       }
       void setPprice(String Pprice)
       {
           this.Pprice = Pprice;
                   
       }
       
           public void setPID(String PID)
       {
           this.PID = PID;
                   
       }
         String getPname()
         {
             return Pname;
         }
         String getPprice()
         {
             return Pprice;
         }
        
          String getPID()
         {
             return PID;
         }
           String getRID()
         {
             return RID;
         }
              int getAmmount()
         {
             return Ammount;
         }
}



