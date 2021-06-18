/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package total.expenses;
import java.util.Scanner;
public class TotalExpenses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        double price,quantity,result;
        while(t>0)
        {
            quantity=in.nextDouble();
            price=in.nextDouble();
            if(quantity>1000) 
             quantity=quantity/10*9;   
            result=price*quantity;
            System.out.format("%.6f",result);
            System.out.println();
        }
        t--;
    }
    
}
