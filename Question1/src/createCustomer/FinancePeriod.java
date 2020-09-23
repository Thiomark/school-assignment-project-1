package createCustomer;

import javax.swing.JOptionPane;

public class FinancePeriod extends Customer{
    
    private double monthlyRepaymentAmount;      // Variable for monthly repayment amount          
    private final double intrestRate;           // the 25% intrest on a product if number of months is greater than 3
    private double totalAmoutDue;               // The amount the customer will pay if number of months in greator that 3  
    private double intrestAmount;

    public FinancePeriod() {
        this.intrestRate = 0.25;
    }
    
    @Override
    public void calculateMonthlyRepaymentAmount(){
        
        if(getNumberOfMonths() > 3 && getNumberOfMonths() <=12){
            
            intrestAmount = (getProductPrise() / getNumberOfMonths()) * intrestRate;
            
            monthlyRepaymentAmount = (getProductPrise() / getNumberOfMonths()) + intrestAmount; 
            
            totalAmoutDue = (getProductPrise() * intrestRate) + getProductPrise();  

            JOptionPane.showMessageDialog(null, "Customer Name: " + getCustomerName() 
                                            + "\nCustomer Contact: 0" + getContactNumber() 
                                            + "\nProduct Amount: R" + getProductPrise()
                                            + "\nRepayement Months: " + getNumberOfMonths() 
                                            + "\nMonthly Repayment: R" + monthlyRepaymentAmount 
                                            + "\nTotal Due: R" + totalAmoutDue);
            
        }
        else if(getNumberOfMonths() <= 3){
            monthlyRepaymentAmount = getProductPrise() / getNumberOfMonths();
        
            JOptionPane.showMessageDialog(null, "Customer Name: " + getCustomerName() 
                                            + "\nCustomer Contact: 0" + getContactNumber() 
                                            + "\nProduct Amount: R" + getProductPrise()
                                            + "\nRepayement Months: " + getNumberOfMonths() 
                                            + "\nMonthly Repayment: R" + monthlyRepaymentAmount 
                                            + "\nTotal Due: R" + getProductPrise());
        }
        
        else if(getNumberOfMonths() > 12) {
            JOptionPane.showMessageDialog(null, "The maximum number of months to pay for the product is 12.");
        } 
    }   
}
