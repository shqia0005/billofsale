/*
 * To calculate taxes,total bill, and change.
 * Jessica Qiao
 * September 20th,2018.
 */

package billofsale;

/**
 *
 * @author shqia0005
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pu = 12.49;
        int pa = 20;
        double t = 0.13;
        double p = 0.0;
        double c = 0.0;
        double tax = 0.0;
        
        //The formula for p
        p = pu * (1+t);
        //The formula for c
        c = pa - p;
        //The formula for t
        tax = t * pu;
        System.out.println("Purchased price : $"+ pu);
        System.out.println("Tax : $"+ tax);
        System.out.println("Total : $"+ p);
        System.out.println("Change : $"+c);
    }
    
}
